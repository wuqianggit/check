package com.check.reponsitory;

import com.check.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * 销售管理系统
 * com.check.reponsitory
 *
 * 2017/9/26-15:08
 * 2017科达科技股份有限公司-版权所有
 * Created by wuqiang on 2017/9/26.
 */
public interface EmployeeReponsitory
        extends JpaSpecificationExecutor<Employee>, PagingAndSortingRepository<Employee, Integer>,
        JpaRepository<Employee, Integer> {
    List<Employee> findByEmployeeName(String employeeName);
}
