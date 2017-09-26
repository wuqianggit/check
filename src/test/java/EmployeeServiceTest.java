import com.check.service.EmployeeService;
import com.check.vo.EmployeeVO;
import com.check.vo.SEX;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 销售管理系统
 * PACKAGE_NAME
 *
 * 2017/9/26-15:36
 * 2017科达科技股份有限公司-版权所有
 * Created by wuqiang on 2017/9/26.
 */
@RunWith(SpringJUnit4ClassRunner.class) @ContextConfiguration(locations = "/config/srping-config.xml") public class EmployeeServiceTest {
    @Autowired private EmployeeService employeeService;

    /**
     * 测试保存 员工信息
     */
    @Test public void testAddEmployee() {
        try {
            for (int i = 0; i < 10; i++) {
                EmployeeVO vo = new EmployeeVO();
                vo.setEmployeeName("吴强" + i);
                vo.setSex(SEX.MAN);
                vo.setAddress("江苏睢宁官山" + i);
                employeeService.add(vo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 测试查询员工信息
     */
    @Test public void testFindEmployee() {
        try {
            //List<EmployeeVO> voList = employeeService.getAll();
            //System.out.println(voList);
            //测试分页
            Pageable p=new PageRequest(0,2);
            Page<EmployeeVO> page=employeeService.getAll(p);
            System.out.println(page.getContent());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
