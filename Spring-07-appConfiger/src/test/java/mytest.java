import com.tfy.config.tfyConfig;
import com.tfy.pojo.Dog;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class mytest {
    @Test
    public void test2(){
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(tfyConfig.class);
        Dog dog = (Dog) applicationContext.getBean("dog");
        System.out.println(dog.name);
    }
}
