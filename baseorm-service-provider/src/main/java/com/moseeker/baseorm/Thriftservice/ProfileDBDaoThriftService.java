package com.moseeker.baseorm.Thriftservice;

import com.moseeker.baseorm.dao.profiledb.ProfileBasicDao;
import com.moseeker.baseorm.dao.profiledb.ProfileOtherDao;
import com.moseeker.thrift.gen.common.struct.CURDException;
import com.moseeker.thrift.gen.common.struct.CommonQuery;
import com.moseeker.thrift.gen.dao.service.ProfileDBDao;
import com.moseeker.thrift.gen.dao.struct.ProfileOtherDO;
import com.moseeker.thrift.gen.dao.struct.profiledb.ProfileBasicDO;
import org.apache.thrift.TException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jack on 15/03/2017.
 */
@Service
public class ProfileDBDaoThriftService implements ProfileDBDao.Iface {

    @Autowired
    private ProfileOtherDao profileOtherDao;

    @Autowired
    private ProfileBasicDao profileBasicDao;

    @Override
    public List<ProfileOtherDO> listProfileOther(CommonQuery query) throws CURDException, TException {
        return profileOtherDao.listResources(query);
    }

    @Override
    public ProfileOtherDO getProfileOther(CommonQuery query) throws CURDException, TException {
        return profileOtherDao.findResource(query);
    }

    @Override
    public ProfileOtherDO updateProfileOther(ProfileOtherDO profileOther) throws CURDException, TException {
        return profileOtherDao.updateResource(profileOther);
    }

    @Override
    public ProfileOtherDO saveProfileOther(ProfileOtherDO profileOther) throws CURDException, TException {
        return profileOtherDao.saveResource(profileOther);
    }

    @Override
    public int deleteProfileOther(ProfileOtherDO profileOther) throws CURDException, TException {
        return profileOtherDao.deleteResource(profileOther);
    }

    @Override
    public ProfileBasicDO getProfileBasic(CommonQuery query) throws CURDException, TException {
        return profileBasicDao.findResource(query);
    }
}
