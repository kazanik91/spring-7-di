/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.kazanik.spring_7_di.task4.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import pl.kazanik.spring_7_di.task4.service.EnvService;

/**
 *
 * @author miron.maksymiuk
 */
@Controller
public class EnvController {
    
    private final EnvService envService;

    public EnvController(@Qualifier("envService") EnvService envService) {
        this.envService = envService;
    }
    
    public String getEnvironment() {
        return this.envService.getEnvironment();
    }
}
