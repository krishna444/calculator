package com.kpaudel.calculator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CalculatorConfiguration {
    @Bean
    public CalculatorService calculatorService(){
        return new CalculatorServiceImpl();
    }
}
