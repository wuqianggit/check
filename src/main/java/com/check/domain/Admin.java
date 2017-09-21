package com.check.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * com.check.domain
 *
 * 2017/9/21-21:20
 * 2017
 * Created by wuqiang on 2017/9/21.
 */
@Entity
@Table(name = "admin")
public class Admin extends IdEntity{
    private String username;
    private String password;

    @Column(name = "user_name",length = 20)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    @Column(name = "pass_word",length = 20)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
