package com.check.controller;

import com.check.service.AdminService;
import com.check.utils.DirectRenderUtil;
import com.check.vo.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.UUID;

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
     * 跳转到登录页面
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String toLoginView(){
        return "login";
    }
    /**
     * 登录的逻辑
     * @param username
     * @param password
     * @param response
     * @param session
     */
    @RequestMapping(value = "login",method = RequestMethod.POST)
    public void login(HttpServletResponse response,HttpSession session,String username,String password){
        Message<String> msg=new Message<String>(false,"用户名或密码不正确!");
        try {
            if(adminService.checkAdmin(username, password)){
                msg.setSuccess(true);
                session.setAttribute("loginKey", UUID.randomUUID().toString());
                msg.setDescription(session.getAttribute("loginKey").toString());
            }
        } catch (Exception e) {
            msg.setSuccess(false);
            msg.setDescription("服务内部错误："+e.getMessage());
        }
        DirectRenderUtil.renderJson(response,msg);
    }

    /**
     * 登录成功调用的方法
     * @param loginKey 登录密码
     * @return
     */
    @RequestMapping(value = "login/{loginKey}",method =RequestMethod.GET)
    public String toIndexView(@PathVariable String loginKey,HttpSession session){
        if(loginKey.equals(session.getAttribute("loginKey"))){
            return "index";
        }
        return "redirect:/";
    }

}
