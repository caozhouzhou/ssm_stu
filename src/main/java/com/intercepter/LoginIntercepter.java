package com.intercepter;

import com.jdwa.pojo.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by czz on 2020/1/17.
 */
public class LoginIntercepter implements HandlerInterceptor {


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //在拦截点执行前拦截，如果返回true则不执行拦截点后的操作（拦截成功）
        //返回false则不执行拦截
        User usr = (User) request.getSession().getAttribute("currentUser");
        System.out.println("LoginInterceter... ..."+usr);
        if(usr == null) {
            //登录失败，跳转到登录页
            System.out.println("跳转。。。");
            throw new Exception("未登录");
//            response.sendRedirect(request.getContextPath());
//            return false;
        }else{
            //登陆成功，不拦截
            return true;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
