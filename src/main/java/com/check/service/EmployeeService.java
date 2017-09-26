package com.check.service;

import com.check.vo.EmployeeVO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 销售管理系统
 * com.check.service
 *
 * 2017/9/26-15:13
 * 2017科达科技股份有限公司-版权所有
 * Created by wuqiang on 2017/9/26.
 */
public interface EmployeeService {
    /**
     * 新增员工信息
     * @param employeeVO
     * @throws Exception
     */
    void add(EmployeeVO employeeVO)throws Exception;

    /**
     * 获取所有员工信息
     * @return
     * @throws Exception
     */
    List<EmployeeVO> getAll()throws Exception;
    /**
     * 根据姓名获取员工信息
     * @param employeeName
     * @return
     * @throws Exception
     */
    List<EmployeeVO> getByEmployeeName(String employeeName)throws Exception;

    /**
     * 分页查询
     * @param pageable
     * @return
     * @throws Exception
     */
    Page<EmployeeVO> getAll(Pageable pageable)throws Exception;
}
