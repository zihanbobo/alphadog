package com.moseeker.position.dao.impl;

import com.moseeker.common.dbutils.DBConnHelper;
import com.moseeker.common.providerutils.daoutils.BaseDaoImpl;
import com.moseeker.db.dictdb.tables.DictConstant;
import com.moseeker.db.dictdb.tables.records.DictConstantRecord;
import com.moseeker.position.dao.DictConstantDao;
import com.moseeker.position.pojo.DictConstantPojo;
import org.jooq.Condition;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class DictConstantDaoImpl extends BaseDaoImpl<DictConstantRecord, DictConstant> implements DictConstantDao {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    protected void initJOOQEntity() {
        this.tableLike = DictConstant.DICT_CONSTANT;
    }

    /**
     * 获取常量字典
     *
     * @param parentCodeList 类型code集合
     * @return
     * @throws Exception
     */
    public Map<Integer, List<DictConstantPojo>> getDictConstantJsonByParentCode(List<Integer> parentCodeList) throws Exception{

        Connection conn = null;
        Condition condition = null;
        Map<Integer, List<DictConstantPojo>> map = new HashMap<Integer, List<DictConstantPojo>>();

        try {
            initJOOQEntity();
            conn = DBConnHelper.DBConn.getConn();
            DSLContext create = DBConnHelper.DBConn.getJooqDSL(conn);

            // parentCodeList 为空时, 返回所有字典常量
            if(parentCodeList == null){
                condition = DictConstant.DICT_CONSTANT.PARENT_CODE.equal(0);
                List<DictConstantPojo> dictConstantPOJOList1 = create.select().from(DictConstant.DICT_CONSTANT).
                        where(condition).fetchInto(DictConstantPojo.class);

                for (DictConstantPojo dictConstantPOJO: dictConstantPOJOList1) {
                    condition = DictConstant.DICT_CONSTANT.PARENT_CODE.equal(dictConstantPOJO.getCode());
                    List<DictConstantPojo> dictConstantPOJOList2 = create.select().from(DictConstant.DICT_CONSTANT).
                            where(condition).orderBy(DictConstant.DICT_CONSTANT.PRIORITY.asc()).fetchInto(DictConstantPojo.class);
                    map.put(dictConstantPOJO.getCode(), dictConstantPOJOList2);
                }
                // 单个parent_code
            }else if(parentCodeList.size() == 1){
                condition = DictConstant.DICT_CONSTANT.PARENT_CODE.equal(parentCodeList.get(0));
                List<DictConstantPojo> dictConstantPOJOList1 = create.select().from(DictConstant.DICT_CONSTANT).
                        where(condition).orderBy(DictConstant.DICT_CONSTANT.PRIORITY.asc()).fetchInto(DictConstantPojo.class);
                map.put(parentCodeList.get(0), dictConstantPOJOList1);
                // 多个parent_code
            }else{
                for (Integer parentCode: parentCodeList) {
                    condition = DictConstant.DICT_CONSTANT.PARENT_CODE.equal(parentCode);
                    List<DictConstantPojo> dictConstantPOJOList1 = create.select().from(DictConstant.DICT_CONSTANT).
                            where(condition).orderBy(DictConstant.DICT_CONSTANT.PRIORITY.asc()).fetchInto(DictConstantPojo.class);
                    map.put(parentCode, dictConstantPOJOList1);
                }
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        } finally {
            if(conn != null && !conn.isClosed()) {
                conn.close();
            }
        }
        return map;
    }

    /**
     * 根据parentCode和code获取唯一一条常量的描述
     * <p></p>
     *
     * @param parentCode 父类编码
     * @param code 常量编码
     * @return
     * @throws Exception
     */
    @Override
    public DictConstantPojo getDictConstantJson(Integer parentCode, Integer code) throws Exception {
        Connection conn = null;
        Condition condition = null;

        try {
            initJOOQEntity();
            conn = DBConnHelper.DBConn.getConn();
            DSLContext create = DBConnHelper.DBConn.getJooqDSL(conn);

            condition = DictConstant.DICT_CONSTANT.PARENT_CODE.equal(parentCode)
                    .and(DictConstant.DICT_CONSTANT.CODE.equal(code));

            Record record = create.selectCount().from(DictConstant.DICT_CONSTANT).where(condition).fetchOne();
            int count = (Integer) record.getValue(0);
            if (count > 0 ){
                List<DictConstantPojo> dictConstantPOJOList = create.select().from(DictConstant.DICT_CONSTANT).
                        where(condition).fetchInto(DictConstantPojo.class);

                return dictConstantPOJOList != null && dictConstantPOJOList.size() > 0 ? dictConstantPOJOList.get(0):null;
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        } finally {
            if(conn != null && !conn.isClosed()) {
                conn.close();
            }
        }
        return null;
    }

}