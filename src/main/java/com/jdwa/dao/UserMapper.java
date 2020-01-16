package com.jdwa.dao;

import com.jdwa.pojo.User;

import java.util.List;

/**
 * Created by czz on 2019/12/31.
 */
public interface UserMapper {
    List<User> findAllUsers();
    User findUserByName(String username);
}
