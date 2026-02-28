/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.kazanik.spring_7_di.controller.i18n;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import pl.kazanik.spring_7_di.service.GreetingService;

/**
 *
 * @author miron.maksymiuk
 */
@Controller
public class MyI18NController {
    
    private final GreetingService greetingService;

    public MyI18NController(@Qualifier("i18NService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    
    public String sayHello() {
        return this.greetingService.sayHello();
    }
}
