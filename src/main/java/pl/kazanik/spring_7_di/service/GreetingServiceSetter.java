/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.kazanik.spring_7_di.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author miron.maksymiuk
 */
@Qualifier("greetingSetter")
@Service
public class GreetingServiceSetter implements GreetingService {

    @Override
    public String sayHello() {
        return "Welcome from setter service.";
    }
    
}
