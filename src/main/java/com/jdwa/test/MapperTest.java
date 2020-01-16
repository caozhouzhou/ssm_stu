package com.jdwa.test;

import com.jdwa.controller.UserController;
import com.jdwa.dao.UserMapper;
import com.jdwa.pojo.User;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


/**
 * Created by czz on 2019/12/31.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MapperTest {

    @Autowired
    private UserMapper userMapper;

//    @Autowired
//    private UserController controller;
    @Test
    public void testUsers(){
        List<User> users = userMapper.findAllUsers();
//        List<User> users = controller.findAllUsers();
        System.out.println(users.size());
        for (User user:users){
            System.out.println(user);
        }
    }
}
