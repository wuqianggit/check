package com.check.controller;

import com.check.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * com.check.controller
 *
 * 2017/9/21-21:15
 * 2017
 * Created by wuqiang on 2017/9/21.
 */
@Controller
@RequestMapping("/")
public class LoginController {
    @Autowired
    private AdminService adminService;
    /**
     * 登录的逻辑
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(value = "login")
    public String login(String username,String password){
        try {
            if(adminService.checkAdmin(username, password)){
                return "login";
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
        return "aaa";
    }
}
