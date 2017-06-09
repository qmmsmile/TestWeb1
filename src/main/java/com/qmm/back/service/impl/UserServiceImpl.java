package com.qmm.back.service.impl;

import com.qmm.back.dao.UserMapper;
import com.qmm.back.entity.User;
import com.qmm.back.service.UserService;
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
