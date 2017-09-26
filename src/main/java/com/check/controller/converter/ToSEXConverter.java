package com.check.controller.converter;

import com.check.vo.SEX;
import org.springframework.core.convert.converter.Converter;

/**
 * 销售管理系统
 * com.check.controller.converter
 * 枚举类型绑定
 * 2017/9/26-18:47
 * 2017科达科技股份有限公司-版权所有
 * Created by wuqiang on 2017/9/26.
 */
public class ToSEXConverter implements Converter<String,SEX>{
    /**
     * 性别转换器
     * @param s
     * @return
     */
    @Override public SEX convert(String s) {
        if("WOMAN".equals(s)){
            return SEX.WOMAN;
        }
        return SEX.MAN;
    }
}
