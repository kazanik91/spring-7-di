/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.kazanik.spring_7_di.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 *
 * @author miron.maksymiuk
 */
@Primary
@Service
public class GreetingServicePrimary implements GreetingService {

    @Override
    public String sayHello() {
        return "Hello from primary bean.";
    }
    
}
