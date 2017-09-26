package com.check.service.impl;

import com.check.domain.Employee;
import com.check.reponsitory.EmployeeReponsitory;
import com.check.service.EmployeeService;
import com.check.utils.PoVoUtil;
import com.check.vo.EmployeeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 销售管理系统
 * com.check.service.impl
 *
 * 2017/9/26-15:17
 * 2017科达科技股份有限公司-版权所有
 * Created by wuqiang on 2017/9/26.
 */
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeReponsitory employeeReponsitory;

    /**
     * 新增 员工信息
     * @param employeeVO 员工的VO
     * @throws Exception
     */
    @Override public void add(EmployeeVO employeeVO) throws Exception {
        Employee po=PoVoUtil.vo2po(employeeVO);
        employeeReponsitory.save(po);
    }

    /**
     * 获取所有employee信息
     * @return
     * @throws Exception
     */
    @Override public List<EmployeeVO> getAll() throws Exception {
        List<Employee> poList=employeeReponsitory.findAll();
        if(CollectionUtils.isEmpty(poList)){
            return null;
        }
        List<EmployeeVO> voList=new ArrayList<EmployeeVO>();
        for(Employee po:poList){
            EmployeeVO vo=po.toVO();
            voList.add(vo);
        }
        return voList;
    }

    @Override public List<EmployeeVO> getByEmployeeName(String employeeName) throws Exception {
        return null;
    }

    /**
     * 分页查询
     * @param pageable
     * @return
     * @throws Exception
     */
    @Override public Page<EmployeeVO> getAll(Pageable pageable) throws Exception {
        Page<Employee> page=employeeReponsitory.findAll(pageable);

        Page<EmployeeVO> voPage=PoVoUtil.PagePO2VO(page);

        return voPage;
    }
}
