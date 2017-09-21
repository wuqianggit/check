package com.check.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * com.check.domain
 *
 * Id 基类
 * 2017/9/21-21:20
 * 2017
 * Created by wuqiang on 2017/9/21.
 */
@Entity
public class IdEntity {
    private Integer id;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
