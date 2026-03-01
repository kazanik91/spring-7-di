/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.kazanik.spring_7_di.task4.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import pl.kazanik.spring_7_di.task4.service.EnvService;

/**
 *
 * @author miron.maksymiuk
 */
@Profile({"PROD"})
@Service("envService")
public class ProdEnvService implements EnvService {

    @Override
    public String getEnvironment() {
        return "prod";
    }
    
}
