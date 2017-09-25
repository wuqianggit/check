package com.check.service;

import com.check.domain.Admin;

/**
 *
 * com.check.service
 *
 * 2017/9/21-21:25
 * 2017
 * Created by wuqiang on 2017/9/21.
 */
public interface AdminService {

    Admin checkAdmin(String username,String password) throws Exception;
}
