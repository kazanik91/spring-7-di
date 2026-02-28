/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.kazanik.spring_7_di.controller;

import org.springframework.stereotype.Controller;
import pl.kazanik.spring_7_di.service.GreetingService;
import pl.kazanik.spring_7_di.service.GreetingServiceImpl;

/**
 *
 * @author miron.maksymiuk
 */
@Controller
public class MyController {
    
    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }
    
    public String sayHello() {
        System.out.println("I am in controller.");
        return this.greetingService.sayHello();
    }
}
