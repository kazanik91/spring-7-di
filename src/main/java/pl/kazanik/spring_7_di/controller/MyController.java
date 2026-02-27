/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.kazanik.spring_7_di.controller;

import org.springframework.stereotype.Controller;

/**
 *
 * @author miron.maksymiuk
 */
@Controller
public class MyController {
    
    public String sayHello() {
        System.out.println("I am in controller.");
        return "Hello World!";
    }
}
