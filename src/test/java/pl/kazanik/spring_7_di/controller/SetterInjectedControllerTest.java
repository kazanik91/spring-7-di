/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package pl.kazanik.spring_7_di.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

/**
 *
 * @author miron.maksymiuk
 */
@ActiveProfiles({"ES", "DEV"})
@SpringBootTest
public class SetterInjectedControllerTest {
    
    @Autowired
    private SetterInjectedController setterController;
    
//    @BeforeEach
//    public void setUp() {
//        this.setterController = new SetterInjectedController();
//        this.setterController.setGreetingService(new GreetingServiceImpl());
//    }

    /**
     * Test of sayHello method, of class SetterInjectedController.
     */
    @Test
    public void testSayHello() {
        System.out.println(this.setterController.sayHello());
    }
    
}
