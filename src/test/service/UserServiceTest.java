package service;


import com.alibaba.fastjson.JSON;
import com.qmm.entity.back.User;
import com.qmm.service.back.UserService;
import common.BaseTest;
import common.JunitTest;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2017/6/7.
 */
@RunWith(JunitTest.class)
public class UserServiceTest extends BaseTest {

    private static Logger logger = Logger.getLogger(UserServiceTest.class);

    @Autowired
    private UserService userService;

    @Test
    public void getUserByIdTest(){
        User user = userService.getUserById(1);
        //System.out.print("=================>"+JSON.toJSONString(user));
        logger.info("=================>"+JSON.toJSONString(user));
    }
}
