package com.qmm.service.back.impl;

import com.qmm.dao.back.UserMapper;
import com.qmm.entity.back.User;
import com.qmm.service.back.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/6/7.
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    public User getUserById(Integer id) {
        return this.userMapper.selectByPrimaryKey(id);
    }
}
