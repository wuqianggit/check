package com.check.domain;

import javax.persistence.*;

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
public class Admin{
    private Integer id; //主键
    private String username;
    private String password;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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
