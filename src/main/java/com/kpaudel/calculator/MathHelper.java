package com.kpaudel.calculator;

/**
 * Helper class for mathematics
 */
public class MathHelper {

    /**
     * Gets the factorial of a number
     * @param a Number
     * @return Factorial
     */
    public static Long getFactorial(Integer a){
        return fact(a);
    }

    /**
     * Recursive function to calculate factorial
     * @param b number
     * @return factorial
     */
    private static Long fact(Integer b){
        if(b==1)
            return 1L;
        else
            return b*fact(b-1);
    }
    public static Boolean isPrime(Integer a){
      if(a==0||a==1){
          return false;
      }
      for(int i=2;i<=a/2;i++){
          if(a%i==0) return false;
      }
      return true;
    }
}
