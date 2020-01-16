package com.jdwa.service.impl;

import com.jdwa.dao.UserMapper;
import com.jdwa.pojo.User;
import com.jdwa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by czz on 2020/1/2.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAllUsers(){
        return userMapper.findAllUsers();
    }

    @Override
    public User findUserByName(String username){
        System.out.println("service... ...");
        return userMapper.findUserByName(username);
    }
}
