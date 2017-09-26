package com.check.vo;

/**
 * 销售管理系统
 * com.check.vo
 * 性别枚举
 * 2017/9/26-15:03
 * 2017科达科技股份有限公司-版权所有
 * Created by wuqiang on 2017/9/26.
 */
public enum SEX {
    MAN("男"),WOMAN("女");

    private String name;

    SEX(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
