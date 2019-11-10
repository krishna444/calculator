package com.kpaudel.calculator;

/**
 * Calculator Service
 */
public interface CalculatorService {
    /**
     * Adds a and b
     * @param a First number
     * @param b Second number
     * @return a + b
     */
    public Double add(Double a, Double b);
    /**
     * Subtracts b from b
     * @param a First number
     * @param b Second number
     * @return a - b
     */
    public Double subtract(Double a, Double b);
    /**
     * Multiplies a and b
     * @param a First number
     * @param b Second number
     * @return a * b
     */
    public Double multiply(Double a, Double b);

    /**
     * Divides a by b
     * @param a First number
     * @param b Second number
     * @return a/b
     */
    public Double divide(Double a, Double b);

    /**
     * Get the square of a number
     * @param a A number
     * @return Square of the number
     */
    public Double square(Double a);

    /**
     * Calculates the factorial of a number
     * @param a A number
     * @return Factorial of the number
     */
    public Long factorial(Integer a);

    /**
     * Checks if the number is prime
     * @param a A number
     * @return True if the number if prime
     */
    public Boolean isPrime(Integer a);

}
