package com.check.utils;

/**
 * 销售管理系统
 * com.check.utils
 * 将PO转化为VO的接口
 * 2017/9/26-15:30
 * 2017科达科技股份有限公司-版权所有
 * Created by wuqiang on 2017/9/26.
 */
public interface ToVOable<T> {
    T toVO();
}
