package com.moseeker.position.service.position.job51;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.moseeker.baseorm.base.EmptyExtThirdPartyPosition;
import com.moseeker.baseorm.dao.dictdb.Dict51OccupationDao;
import com.moseeker.baseorm.dao.thirdpartydb.ThirdpartyAccountCompanyAddressDao;
import com.moseeker.baseorm.db.thirdpartydb.tables.pojos.ThirdpartyAccountCompanyAddress;
import com.moseeker.common.constants.ChannelType;
import com.moseeker.common.constants.PositionSync;
import com.moseeker.common.util.StringUtils;
import com.moseeker.common.util.query.Condition;
import com.moseeker.common.util.query.Query;
import com.moseeker.common.util.query.ValueOp;
import com.moseeker.position.service.position.DegreeChangeUtil;
import com.moseeker.position.service.position.ExperienceChangeUtil;
import com.moseeker.position.service.position.WorkTypeChangeUtil;
import com.moseeker.position.service.position.base.sync.AbstractPositionTransfer;
import com.moseeker.position.service.position.base.sync.PositionTransferHelper;
import com.moseeker.position.service.position.job51.pojo.Position51;
import com.moseeker.position.service.position.job51.pojo.Position51Form;
import com.moseeker.position.service.position.job51.pojo.Position51WithAccount;
import com.moseeker.position.service.position.qianxun.Degree;
import com.moseeker.common.constants.WorkType;
import com.moseeker.thrift.gen.dao.struct.dictdb.Dict51jobOccupationDO;
import com.moseeker.thrift.gen.dao.struct.hrdb.HrThirdPartyAccountDO;
import com.moseeker.thrift.gen.dao.struct.hrdb.HrThirdPartyPositionDO;
import com.moseeker.thrift.gen.dao.struct.jobdb.JobPositionDO;
import com.moseeker.thrift.gen.dao.struct.thirdpartydb.ThirdpartyAccountCompanyAddressDO;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class Job51PositionTransfer extends AbstractPositionTransfer<Position51Form, Position51WithAccount, Position51, EmptyExtThirdPartyPosition> {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    private static final int TITLE_LIMT = 50;

    @Autowired
    private ThirdpartyAccountCompanyAddressDao addressDao;

    @Autowired
    private Dict51OccupationDao dict51OccupationDao;

    @Override
    public Position51WithAccount changeToThirdPartyPosition(Position51Form positionForm, JobPositionDO positionDB, HrThirdPartyAccountDO account) throws Exception {
        Position51WithAccount positionWithAccount = createAndInitAccountInfo(positionForm, positionDB, account);

        Position51 position = createAndInitPositionInfo(positionForm, positionDB);
        positionWithAccount.setPosition_info(position);

        return positionWithAccount;
    }

    @Override
    protected Position51WithAccount createAndInitAccountInfo(Position51Form positionForm, JobPositionDO positionDB, HrThirdPartyAccountDO account) {
        Position51WithAccount positionWithAccount = new Position51WithAccount();
        positionWithAccount.setUser_name(account.getUsername());
        positionWithAccount.setPassword(account.getPassword());
        positionWithAccount.setMember_name(account.getExt());
        positionWithAccount.setPosition_id(String.valueOf(positionDB.getId()));
        positionWithAccount.setChannel(String.valueOf(positionForm.getChannel()));
        positionWithAccount.setAccount_id(String.valueOf(account.getId()));

        return positionWithAccount;
    }

    @Override
    protected Position51 createAndInitPositionInfo(Position51Form positionForm, JobPositionDO positionDB) throws Exception {
        Position51 position = new Position51();
        if(positionForm.isLimitTitle()) {
            position.setTitle(PositionTransferHelper.limitTitle(positionDB.getTitle(), TITLE_LIMT));
        } else{
            position.setTitle(positionDB.getTitle());
        }

        setOccupation(positionForm, position);

        int quantity = getQuantity(positionForm.getCount(), (int) positionDB.getCount());
        position.setQuantity(quantity + "");

        setDegree((int) positionDB.getDegree(), position);

        //工作经验要求
        int experience = experienceToInt(positionDB.getExperience());
        position.setExperience(ExperienceChangeUtil.getJob51Experience(experience).getValue());

        //薪资要求
        int salaryBottom = getSalaryBottom(positionForm.getSalaryBottom());
        position.setSalary_low(String.valueOf(salaryBottom));

        int salaryTop = getSalaryTop(positionForm.getSalaryTop());
        position.setSalary_high(String.valueOf(salaryTop));

        position.setDepartment(positionForm.getDepartmentName());   //ATS会传部门，页面端不需要

        //职位详情
        String description = getDescription(positionDB.getAccountabilities(), positionDB.getRequirement());
        position.setDescription(description);

        position.setCities(getCities(positionDB));

        position.setEmail(getEmail(positionDB));

        setEmployeeType((byte) positionDB.getEmploymentType(), position);

        position.setCompany(positionForm.getCompanyName());

        setAddress(position, positionForm);

        position.setInternship(positionForm.isInternship());

        return position;
    }

    public void setOccupation(Position51Form positionForm, Position51 position) {
        List<List<String>> list = new ArrayList<>();
        List<List<String>> occupationList = positionForm.getOccupation().stream()
                .filter(StringUtils::isNotNullOrEmpty)
                .map(o->JSON.parseArray(o).toJavaList(String.class))
                .collect(Collectors.toList());

        List<String> codes = new ArrayList<>();
        occupationList.forEach(codes::addAll);

        Query query = new Query.QueryBuilder().
                where(new Condition("code_other", codes, ValueOp.IN))
                .and(new Condition("code_other", 0, ValueOp.NEQ)).buildQuery();

        List<Dict51jobOccupationDO> dbOccupations = dict51OccupationDao.getDatas(query);

        if (positionForm.getOccupation() != null) {
            for (List<String> occupations : occupationList) {
                List<String> sonList = new ArrayList<>();
                for (int i=0;i<occupations.size();i++) {
                    String code = occupations.get(i);
                    Optional<Dict51jobOccupationDO> optional = dbOccupations.stream().filter(o->o.getCodeOther().equals(code)).findFirst();
                    optional.ifPresent(dict51jobOccupationDO -> sonList.add(dict51jobOccupationDO.getName()));
                }
                list.add(sonList);
            }
        }
        position.setOccupation(list);
    }

    /**
     * 当addressId为空时，认为addressName是个json(包含city和address)，如果不是json则只传输addressName
     * 当addressId不为空时，取数据库查询出city和address
     *
     * @param position
     * @param form
     */
    public void setAddress(Position51 position, Position51Form form) {
        ThirdpartyAccountCompanyAddress address = new ThirdpartyAccountCompanyAddress();
        if (form.getAddressId() == 0) {
            //这个对于json的判断很粗糙，但是我不想使用try catch来控制流程，暂时先这么写
            if (form.getAddressName().startsWith("{") && form.getAddressName().endsWith("}")) {
                JSONObject jsonAddress = JSON.parseObject(form.getAddressName());
                address.setCity(jsonAddress.getString("city"));
                address.setAddress(jsonAddress.getString("address"));
            } else {
                address.setAddress(form.getAddressName());
            }
        } else {
            Query query = new Query.QueryBuilder().where("id", form.getAddressId()).buildQuery();
            ThirdpartyAccountCompanyAddressDO addressDO = addressDao.getData(query);

            if (addressDO == null || addressDO.getId() == 0) {
                address.setAddress(form.getAddressName());
            } else {
                address.setCity(addressDO.getCity());
                address.setAddress(addressDO.getAddress());
            }
        }


        position.setAddress(address);
    }

    protected void setDegree(int degreeInt, Position51 position) {
        Degree degree = Degree.instanceFromCode(String.valueOf(degreeInt));
        position.setDegree(DegreeChangeUtil.getJob51Degree(degree).getValue());
    }


    protected void setEmployeeType(byte employment_type, Position51 position51) {
        WorkType workType = WorkType.instanceFromInt(employment_type);
        position51.setType_code(WorkTypeChangeUtil.getJob51EmployeeType(workType).getValue());
    }

    @Override
    public ChannelType getChannel() {
        return ChannelType.JOB51;
    }

    @Override
    public Class<Position51Form> getFormClass() {
        return Position51Form.class;
    }

    @Override
    public HrThirdPartyPositionDO toThirdPartyPosition(Position51Form position, Position51WithAccount pwa) {
        HrThirdPartyPositionDO data = new HrThirdPartyPositionDO();

        Position51 p = pwa.getPosition_info();

        String syncTime = (new DateTime()).toString("yyyy-MM-dd HH:mm:ss");
        data.setSyncTime(syncTime);
        data.setUpdateTime(syncTime);
        data.setPositionId(Integer.parseInt(pwa.getPosition_id()));
        data.setThirdPartyAccountId(Integer.parseInt(pwa.getAccount_id()));
        data.setChannel(getChannel().getValue());
        data.setIsSynchronization((byte) PositionSync.binding.getValue());


        //将最后一个职能的Code存到数据库
        if (!StringUtils.isEmptyList(position.getOccupation())) {
            List<String> occupation = position.getOccupation().stream().filter(StringUtils::isNotNullOrEmpty).map(o->{
                if(o.startsWith("[")){
                    JSONArray array = JSON.parseArray(o);
                    return array.getString(array.size()-1);
                }else{
                    return o;
                }
            }).collect(Collectors.toList());
            data.setOccupation(String.join(",",occupation));
        }
        data.setCompanyName(position.getCompanyName());
        data.setCompanyId(position.getCompanyId());
        if (!StringUtils.isNullOrEmpty(p.getSalary_low())) {
            data.setSalaryBottom(Integer.parseInt(p.getSalary_low()));
        }
        if (!StringUtils.isNullOrEmpty(p.getSalary_high())) {
            data.setSalaryTop(Integer.parseInt(p.getSalary_high()));
        }
        data.setAddressId(position.getAddressId());

        data.setAddressName(position.getAddressName());

        data.setInternship(position.isInternship());
        logger.info("回写到第三方职位对象:{}", data);
        return data;
    }

    @Override
    public EmptyExtThirdPartyPosition toExtThirdPartyPosition(Position51Form position, Position51WithAccount position51WithAccount) {
        return EmptyExtThirdPartyPosition.EMPTY;
    }

    @Override
    public EmptyExtThirdPartyPosition toExtThirdPartyPosition(Map<String, String> data) {
        return EmptyExtThirdPartyPosition.EMPTY;
    }

    @Override
    public JSONObject toThirdPartyPositionForm(HrThirdPartyPositionDO thirdPartyPosition, EmptyExtThirdPartyPosition extPosition) {
        JSONObject positionForm = JSONObject.parseObject(JSON.toJSONString(thirdPartyPosition));
        String occupation = positionForm.getString("occupation");
        if(StringUtils.isNotNullOrEmpty(occupation)){
            positionForm.put("occupation", Arrays.asList(occupation.split(",")));
        }
        return positionForm;
    }

}
