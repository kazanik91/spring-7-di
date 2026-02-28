/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package pl.kazanik.spring_7_di.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author miron.maksymiuk
 */
@SpringBootTest
public class PropertyInjectedControllerTest {
    
    @Autowired
    private PropertyInjectedController propertyController;
    
//    @BeforeEach
//    public void setUp() {
//        this.propertyController = new PropertyInjectedController();
//        this.propertyController.greetingService = new GreetingServiceImpl();
//    }

    /**
     * Test of sayHello method, of class PropertyInjectedController.
     */
    @Test
    public void testSayHello() {
        System.out.println(this.propertyController.sayHello());
    }
    
}
