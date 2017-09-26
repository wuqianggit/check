package com.check.utils;

import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 销售管理系统
 * com.check.utils
 * po与VO之间的转换 公用类
 * 2017/9/26-15:58
 * 2017科达科技股份有限公司-版权所有
 * Created by wuqiang on 2017/9/26.
 */
public class PoVoUtil{
    /**
     * 将POPage转化为VOpage
     * @param poPage poPage
     * @param <P>
     * @param <V>
     * @return
     */
    public static <P extends ToVOable<V>,V> Page<V> PagePO2VO(Page<P> poPage){
        List<P> pList=poPage.getContent();
        List<V> vList=new ArrayList<V>();
        if(!CollectionUtils.isEmpty(pList)){
            for(P p:pList){
                vList.add(p.toVO());
            }
        }
        Page<V> vPage=new PageImpl<V>(vList);
        BeanUtils.copyProperties(poPage,vPage,new String[]{"content"});
        return vPage;
    }

    /**
     * VO转化为VO
     * @param vo
     * @param <P>
     * @param <V>
     * @return
     */
    public static <P,V extends ToPOable<P>> P vo2po(V vo){
        P p=vo.toPO();
        return p;
    }

    /**
     * PO 转化为VO
     * @param po
     * @param <P>
     * @param <V>
     * @return
     */
    public static <P extends ToVOable<V>,V> V po2vo(P po){
        V v=po.toVO();
        return v;
    }
}
