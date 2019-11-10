package com.kpaudel.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Rest controller for calculator
 */
@RestController
public class RestCalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @RequestMapping(value = "/add/{a}/{b}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public Double add(@PathVariable("a") Double a, @PathVariable("b") Double b) {
        return this.calculatorService.add(a, b);
    }

    @RequestMapping(value = "/subtract/{a}/{b}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Double subtract(@PathVariable("a") Double a, @PathVariable("b") Double b) {
        return this.calculatorService.subtract(a, b);
    }

    @RequestMapping(value = "/multiply/{a}/{b}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Double multiply(@PathVariable("a") Double a, @PathVariable("b") Double b) {
        return this.calculatorService.multiply(a, b);
    }

    @RequestMapping(value = "/divide/{a}/{b}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Double divide(@PathVariable("a") Double a, @PathVariable("b") Double b) {
        return this.calculatorService.divide(a, b);
    }

    @RequestMapping(value = "/square/{a}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Double square(@PathVariable("a") Double a) {
        return this.calculatorService.square(a);
    }

    @RequestMapping(value = "/factorial/{a}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Long factorial(@PathVariable("a") Integer a) {
        return this.calculatorService.factorial(a);
    }

    @RequestMapping(value = "/prime/{a}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Boolean isPrime(@PathVariable("a") Integer a) {
        return this.calculatorService.isPrime(a);
    }

    @RequestMapping(value={"","/","/*","/*/*"})
    public String unknown() {
        return "Invalid Operation";
    }

}
