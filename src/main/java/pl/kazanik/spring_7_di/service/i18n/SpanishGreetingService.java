/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.kazanik.spring_7_di.service.i18n;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import pl.kazanik.spring_7_di.service.GreetingService;

/**
 *
 * @author miron.maksymiuk
 */
@Profile("ES")
@Service("i18NService")
public class SpanishGreetingService implements GreetingService {

    @Override
    public String sayHello() {
        return "Hola Mundo - ES";
    }
    
}
