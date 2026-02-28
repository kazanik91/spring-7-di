/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package pl.kazanik.spring_7_di.controller.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

/**
 *
 * @author miron.maksymiuk
 */
//@ActiveProfiles("ES")
@SpringBootTest
public class MyI18NControllerESTest {
    
    @Autowired
    private MyI18NController controller;

    /**
     * Test of sayHello method, of class MyI18NController.
     */
    @Test
    public void testSayHello() {
        System.out.println(this.controller.sayHello());
    }
    
}
