package com.qmm.controller;

import com.qmm.common.ResponseMessage;
import com.qmm.back.entity.User;
import com.qmm.front.entity.Score;
import com.qmm.back.service.UserService;
import com.qmm.front.service.ScoreService;
import com.qmm.vo.MyUser;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/6/7.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private static Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService;
    @Autowired
    private ScoreService ScoreService;

    //前后端不分离
    @RequestMapping(value = "/showUser",method = RequestMethod.GET)
    public String toIndex(HttpServletRequest request, Model model){
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = this.userService.getUserById(userId);
        model.addAttribute("user", user);
        logger.info("user==================>"+user);
        return "showUser";
    }

    //前后端分离
    @RequestMapping(value = "/show",method = RequestMethod.GET)
    @ResponseBody
    public ResponseMessage showUser(Integer id){
        User user = this.userService.getUserById(id);
        MyUser myUser = new MyUser();
        myUser.setId(user.getId());
        myUser.setName(user.getUserName());
        myUser.setAge(user.getAge());
        logger.info("myUser==================>"+myUser.getName());
        return new ResponseMessage().success().packageData("list",myUser);
    }

    //多数据源
    @RequestMapping(value = "/score",method = RequestMethod.GET)
    @ResponseBody
    public ResponseMessage showScore(Integer id){
        Score score = this.ScoreService.getScore(id);
        return new ResponseMessage().success(score);
    }
}
