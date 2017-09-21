package com.check.service;

/**
 *
 * com.check.service
 *
 * 2017/9/21-21:25
 * 2017
 * Created by wuqiang on 2017/9/21.
 */
public interface AdminService {

    Boolean checkAdmin(String username,String password) throws Exception;
}
