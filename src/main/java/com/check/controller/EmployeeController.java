package com.check.controller;

import com.check.service.EmployeeService;
import com.check.utils.DirectRenderUtil;
import com.check.vo.EmployeeVO;
import com.check.vo.Message;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 销售管理系统
 * com.check.controller
 * 员工管理类
 * 2017/9/26-16:23
 * 2017科达科技股份有限公司-版权所有
 * Created by wuqiang on 2017/9/26.
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /**
     * 跳转到添加员工的JSP页面
     * @return
     */
    @RequestMapping("/toAddEmployeeView")
    public String toAddEmployeeView(){
        return "employee/addEmployee";
    }

    /**
     * 跳转到员工信息列表的jsp页面
     * @return
     */
    @RequestMapping("/toListEmployeeView")
    public String toListEmployeeView(){
        return "employee/listEmployee";
    }

    /**
     * 添加员工信息
     * @param response
     * @param employeeVO
     */
    @RequestMapping(value="/addEmployee",method = {RequestMethod.GET,RequestMethod.POST})
    public void addEmployee(HttpServletResponse response,EmployeeVO employeeVO){
        Message<String> msg=new Message<String>(true,"添加成功");
        try {
            if(StringUtils.isBlank(employeeVO.getEmployeeName())){
                throw new RuntimeException("员工名称不能为空！");
            }
            employeeService.add(employeeVO);
        } catch (Exception e) {
            msg.setSuccess(false);
            msg.setDescription(e.getMessage());
        }
        DirectRenderUtil.renderJson(response,msg);
    }

    /**
     * 查询所有员工信息
     * @param response
     * @param page
     * @param size
     */
    @RequestMapping("/listEmployee")
    public void listEmployee(HttpServletResponse response,@RequestParam(value = "page",defaultValue = "0") Integer page,
            @RequestParam(value = "size",defaultValue = "20") Integer size){
        try {
            PageRequest pageable=new PageRequest(page,size);
            //Page<EmployeeVO> resultPage=employeeService.getAll(pageable);
            List<EmployeeVO> all = employeeService.getAll();
            DirectRenderUtil.renderJson(response,all);
        } catch (Exception e) {
            throw new RuntimeException("查询所有员工信息出错！"+e);
        }
    }
}
