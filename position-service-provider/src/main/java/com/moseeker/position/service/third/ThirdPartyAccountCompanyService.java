package com.moseeker.position.service.third;

import com.moseeker.baseorm.dao.thirdpartydb.ThirdpartyAccountCompanyDao;
import com.moseeker.thrift.gen.dao.struct.thirdpartydb.ThirdpartyAccountCompanyDO;
import com.moseeker.thrift.gen.thirdpart.struct.ThirdPartyAccountInfoCompany;
import org.apache.thrift.TException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ThirdPartyAccountCompanyService {
    private static Logger logger= LoggerFactory.getLogger(ThirdPartyAccountCompanyService.class);
    @Autowired
    ThirdpartyAccountCompanyDao companyDao;

    //把ThirdpartyAccountCompanyDO转换成传给前台的类型ThirdPartyAccountInfoCompany
    public List<ThirdPartyAccountInfoCompany> getCompanyByAccountId(int accountId) throws TException {
        List<ThirdpartyAccountCompanyDO> companyList=companyDao.getCompanyByAccountId(accountId);
        List<ThirdPartyAccountInfoCompany> infoCompanyList=new ArrayList<>();

        companyList.forEach(c-> {
            ThirdPartyAccountInfoCompany company=new ThirdPartyAccountInfoCompany();
            company.setId(c.getId());
            company.setName(c.getCompanyName());
            infoCompanyList.add(company);
        });

        logger.info("infoCompanyList : {}",infoCompanyList);
        return infoCompanyList;
    }

}
