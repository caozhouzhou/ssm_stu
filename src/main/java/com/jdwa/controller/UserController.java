package com.jdwa.controller;

import com.jdwa.pojo.User;
import com.jdwa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by czz on 2020/1/2.
 */
@Controller
@RequestMapping("/jdwa/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public @ResponseBody List<User> findAllUsers(HttpSession session){
        System.out.println("122121");
        System.out.println(session.getAttribute("currentUser"));
        return userService.findAllUsers();
    }

    @RequestMapping(value = "/auth",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,String> login(@RequestBody User user, HttpSession session){
        Map<String,String> msg = new HashMap<>();
        String uName = user.getUserName();
        String passwd = user.getPassword();
        System.out.println(uName);
        System.out.println(passwd);
        if (uName == null || "".equals(uName) || passwd == null || "".equals(passwd)){
            msg.put("ERROR","用户名或密码不能为空！");
            return msg;
        }
        User usr = userService.findUserByName(uName);
        if (uName.equals(usr.getUserName()) && passwd.equals(usr.getPassword())){
            session.setAttribute("currentUser",usr);
            msg.put("SUCCESS","登陆成功！");
            return msg;
        } else {
            msg.put("ERROR","用户名或密码错误！");
            return msg;
        }

    }


}
