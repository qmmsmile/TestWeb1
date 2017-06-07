package service;


import com.alibaba.fastjson.JSON;
import com.qmm.entity.User;
import com.qmm.service.UserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2017/6/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:conf/spring-mybatis.xml"})
public class UserServiceTest {

    private static Logger logger = Logger.getLogger(UserServiceTest.class);

    @Autowired
    private UserService userService;

    @Test
    public void getUserByIdTest(){
        User user = userService.getUserById(1);
        System.out.print("=================>"+JSON.toJSONString(user));
        logger.info("=================>"+JSON.toJSONString(user));
    }
}
