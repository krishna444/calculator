package com.kpaudel.calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Test class for Calculator Service
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {CalculatorService.class, CalculatorConfiguration.class})
public class CalculatorServiceTest {
    private double a;
    private double b;

    @Autowired
    private CalculatorService calculatorService;

    @Before
    public void init() {
        this.a = 16.45;
        this.b = 9.98;
    }

    @Test
    public void testAddition() {
        double expected = this.calculatorService.add(this.a, this.b);
        Assert.assertEquals(expected, 26.43, 0.01);
    }

    @Test
    public void testSubtraction() {
        double expected = this.calculatorService.subtract(this.a, this.b);
        Assert.assertEquals(expected, 6.47, 0.01);
    }

    @Test
    public void testMulitplication() {
        double expected = this.calculatorService.multiply(a, b);
        Assert.assertEquals(expected, 164.171, 0.01);
    }

    @Test
    public void testDivision() {
        double expected = this.calculatorService.divide(a, b);
        Assert.assertEquals(expected, 1.6482966, 0.01);
    }

    @Test
    public void testFactorial() {
        Integer a = 5;
        Long expected = this.calculatorService.factorial(a);
        Assert.assertEquals(expected, 120L, 0);
    }

    @Test
    public void testSquare() {
        double expected = this.calculatorService.square(a);
        Assert.assertEquals(expected, 270.6025, 0.01);
    }

    @Test
    public void testPrime() {
        Integer a = 25;
        Integer b = 23;
        Boolean expected = this.calculatorService.isPrime(a);
        Assert.assertFalse(expected);

        expected = this.calculatorService.isPrime(b);
        Assert.assertTrue(expected);
    }
}
