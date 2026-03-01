/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package pl.kazanik.spring_7_di.task4.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

/**
 *
 * @author miron.maksymiuk
 */
@ActiveProfiles({"PROD", "ES"})
@SpringBootTest
public class EnvControllerProdTest {
    
    @Autowired
    private EnvController controller;

    /**
     * Test of getEnvironment method, of class EnvController.
     */
    @Test
    public void testGetEnvironment() {
        System.out.println("prod test");
        String expResult = "prod";
        String result = this.controller.getEnvironment();
        assertEquals(expResult, result);
    }
    
}
