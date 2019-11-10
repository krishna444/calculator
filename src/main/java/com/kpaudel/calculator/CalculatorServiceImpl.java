package com.kpaudel.calculator;

import org.springframework.stereotype.Component;

/**
 * Calculator service
 */
public class CalculatorServiceImpl implements CalculatorService {

    public Double add(Double a, Double b){
        return a+b;
    }

    public Double subtract(Double a, Double b){
        return a-b;
    }

    public Double multiply(Double a, Double b){
        return a*b;
    }
    public Double divide(Double a, Double b){
        return a/b;
    }
    public Double square(Double a){
        return a*a;
    }
    public Long factorial(Integer a){
        return MathHelper.getFactorial(a);
    }
    public Boolean isPrime(Integer a){
        return MathHelper.isPrime(a);
    }

}
