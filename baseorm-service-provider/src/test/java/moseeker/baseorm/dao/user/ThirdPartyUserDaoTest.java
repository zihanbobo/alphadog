package moseeker.baseorm.dao.user;

import com.moseeker.baseorm.Thriftservice.ThirdPartyUserDaoThriftService;
import com.moseeker.thrift.gen.common.struct.Response;
import com.moseeker.thrift.gen.useraccounts.struct.ThirdPartyUser;
import org.apache.thrift.TException;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by eddie on 2017/3/8.
 */
public class ThirdPartyUserDaoTest {

//    private ThirdPartyUserDaoThriftService service;
//
//    public void init() {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//        context.scan("com.moseeker.baseorm");
//        context.refresh();
//        service = context.getBean(ThirdPartyUserDaoThriftService.class);
//    }
//
//    @Test
//    public void testUpdateUser() throws TException {
//        init();
//        ThirdPartyUser user = new ThirdPartyUser();
//        user.setUser_id(1);
//        user.setSource_id(3);
//        user.setUsername("abcd");
//        user.setPassword("ppppp");
//        Response response = service.putThirdPartyUser(user);
//        System.out.println(response);
//        Assert.assertEquals(response.getData(),"1");
//    }
}
