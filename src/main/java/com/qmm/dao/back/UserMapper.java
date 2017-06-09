package com.qmm.dao.back;

import com.qmm.common.BaseMapper;
import com.qmm.entity.back.User;
import org.springframework.stereotype.Repository;

@Repository("userMapper")
public interface UserMapper extends BaseMapper<User,Integer>{

}