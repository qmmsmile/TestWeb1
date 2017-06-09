package com.qmm.back.dao;

import com.qmm.common.BaseMapper;
import com.qmm.back.entity.User;
import org.springframework.stereotype.Repository;

@Repository("userMapper")
public interface UserMapper extends BaseMapper<User,Integer>{

}