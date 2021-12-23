package com.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    public UserController() {
        System.out.println("userController");
    }
    @GetMapping("/login")
    @ResponseBody
    @CrossOrigin
    public String toLogin(String username,String password){
        if (username.equals("111")&&password.equals("111")){
            return "1";
        }
        return "0";
    }

}
