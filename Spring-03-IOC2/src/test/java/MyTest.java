import com.tfy.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //无参方式构造
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        User user = (User)context.getBean("user");
        user.show();
    }

    @Test
    public void testT(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("user");
        user.show();
    }
}
