package com.check.vo;

import com.check.domain.Employee;
import com.check.utils.ToPOable;
import org.springframework.beans.BeanUtils;

/**
 * 销售管理系统
 * com.check.vo
 *
 * 2017/9/26-15:20
 * 2017科达科技股份有限公司-版权所有
 * Created by wuqiang on 2017/9/26.
 */
public class EmployeeVO implements ToPOable<Employee>{
    private Integer id;

    private String employeeName; //姓名
    private SEX sex=SEX.MAN; //性别，默认为男
    private String address; //家庭住址
    private String phoneNum; //电话号码

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public SEX getSex() {
        return sex;
    }

    public void setSex(SEX sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override public String toString() {
        return "EmployeeVO{" + "id=" + id + ", employeeName='" + employeeName + '\'' + ", sex=" + sex + ", address='"
                + address + '\'' + ", phoneNum='" + phoneNum + '\'' + '}';
    }

    @Override public Employee toPO() {
        Employee po=new Employee();
        BeanUtils.copyProperties(this,po);
        return po;
    }
}
