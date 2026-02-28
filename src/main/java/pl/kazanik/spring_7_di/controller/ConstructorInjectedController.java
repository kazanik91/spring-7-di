/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.kazanik.spring_7_di.controller;

import pl.kazanik.spring_7_di.service.GreetingService;

/**
 *
 * @author miron.maksymiuk
 */
public class ConstructorInjectedController {
    
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    
    public String sayHello() {
        return this.greetingService.sayHello();
    }
}
