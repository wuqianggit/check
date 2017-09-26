package com.check.domain;

import com.check.utils.ToVOable;
import com.check.vo.EmployeeVO;
import com.check.vo.SEX;
import org.springframework.beans.BeanUtils;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 销售管理系统
 * com.check.domain
 * 员工信息
 * 2017/9/26-14:59
 * 2017科达科技股份有限公司-版权所有
 * Created by wuqiang on 2017/9/26.
 */
@Entity
@Table(name = "employee")
public class Employee implements ToVOable<EmployeeVO>{
    private Integer id;

    private String employeeName; //姓名
    private SEX sex=SEX.MAN; //性别，默认为男
    private String address; //家庭住址
    private String phoneNum; //电话号码

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    @Column(name = "employee_name",length = 20,nullable = true)
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @Column(name = "sex",length = 5)
    @Enumerated(EnumType.STRING)
    public SEX getSex() {
        return sex;
    }

    public void setSex(SEX sex) {
        this.sex = sex;
    }
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Column(name = "phone_num",length = 20)
    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override public EmployeeVO toVO() {
        EmployeeVO vo=new EmployeeVO();
        BeanUtils.copyProperties(this,vo);
        return vo;
    }
}
