import controller.UserController;
import domain.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KubernetesTest {

    @Test
    public void test01() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        UserController userController = ac.getBean("UserController", UserController.class);
        User user = new User();
        userController.use(user);
    }
}
