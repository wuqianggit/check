package com.check.service.impl;

import com.check.domain.Admin;
import com.check.reponsitory.AdminReponsitory;
import com.check.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

/**
 *
 * com.check.service
 *
 * 2017/9/21-21:25
 * 2017
 * Created by wuqiang on 2017/9/21.
 */
@Service("adminService")
@Transactional
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminReponsitory adminReponsitory;
    /**
     * 根据用户名和密码判断登录用户
     * @param username 用户名
     * @param password 密码
     * @return 是否可以登录
     */
    @Override public Boolean checkAdmin(String username, String password) throws Exception{
        Admin admin = adminReponsitory.findByUsernameAndPassword(username, password);
        if(admin==null){
            return false;
        }
        return true;
    }
}
