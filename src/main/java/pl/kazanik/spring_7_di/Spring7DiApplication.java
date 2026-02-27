package pl.kazanik.spring_7_di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import pl.kazanik.spring_7_di.controller.MyController;

@SpringBootApplication
public class Spring7DiApplication {

    public static void main(String[] args) {
        System.out.println("I am in Main method.");
        ApplicationContext ctx = SpringApplication.run(Spring7DiApplication.class, args);
        MyController controller = ctx.getBean(MyController.class);
        System.out.println(controller.sayHello());
    }

}
