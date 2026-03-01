package pl.kazanik.spring_7_di;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import pl.kazanik.spring_7_di.controller.MyController;

@ActiveProfiles({"ES", "DEV"})
@SpringBootTest
class Spring7DiApplicationTests {

    @Autowired
    private ApplicationContext ctx;
    
    @Autowired
    private MyController myController;
    
    @Test
    void contextLoads() {
    }
    
    @Test
    void testControllerFromAppCtx() {
        MyController controller = ctx.getBean(MyController.class);
        System.out.println(controller.sayHello());
    }
    
    @Test
    void testControllerAutowired() {
        System.out.println(this.myController.sayHello());
    }

}
