import com.check.domain.Admin;
import com.check.service.AdminService;
import com.check.service.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 销售管理系统
 * PACKAGE_NAME
 * 测试服务的类
 * 2017/9/26-14:51
 * 2017科达科技股份有限公司-版权所有
 * Created by wuqiang on 2017/9/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/config/srping-config.xml")
public class serviceTest {
    @Autowired
    private AdminService adminService;
    @Autowired
    private EmployeeService employeeService;
    @Test
    public void testLogin(){
        try {
            Admin admin=adminService.checkAdmin("123","123");
            System.out.println(admin);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
