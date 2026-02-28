/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package pl.kazanik.spring_7_di.controller;

import org.junit.jupiter.api.Test;

/**
 *
 * @author miron.maksymiuk
 */
public class MyControllerTest {
    
    private final MyController myController;
    
    public MyControllerTest() {
        this.myController = new MyController();
    }

    /**
     * Test of sayHello method, of class MyController.
     */
    @Test
    public void testSayHello() {
        System.out.println(this.myController.sayHello());
    }
    
}
