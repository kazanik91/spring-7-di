/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package pl.kazanik.spring_7_di.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.kazanik.spring_7_di.service.GreetingServiceImpl;

/**
 *
 * @author miron.maksymiuk
 */
public class ConstructorInjectedControllerTest {
    
    private ConstructorInjectedController constructorController;
    
    @BeforeEach
    public void setUp() {
        this.constructorController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    /**
     * Test of sayHello method, of class ConstructorInjectedController.
     */
    @Test
    public void testSayHello() {
        System.out.println(this.constructorController.sayHello());
    }
    
}
