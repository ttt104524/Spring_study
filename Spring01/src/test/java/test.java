import com.tfy.dao.UserDaoMySqlImpl;
import com.tfy.dao.UserDaoOracleImpl;
import com.tfy.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test(){
        //得到context上下文容器
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        //根据id得到对象 context.getBean（"id"）;
        UserServiceImpl userServiceImpl = (UserServiceImpl)context.getBean("UserServiceImpl");
        userServiceImpl.getUser();
    }
}
