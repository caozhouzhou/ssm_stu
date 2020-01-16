package com.jdwa.service;

import java.util.List;
import com.jdwa.pojo.User;

/**
 * Created by czz on 2020/1/2.
 */
public interface UserService {
    List<User> findAllUsers();
    User findUserByName(String username);
}
