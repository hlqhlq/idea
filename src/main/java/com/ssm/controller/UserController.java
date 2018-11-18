package com.ssm.controller;

import com.ssm.model.User;
import com.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private IUserService userService;

    
    @RequestMapping("/hello")
    @ResponseBody
    public  String hello(){
        return "hello";
    }

    /*
       获取用户信息
     */

    @RequestMapping("/getUser")
    @ResponseBody
    public List<User> getUser(){
        return userService.findAll();


    }

}
