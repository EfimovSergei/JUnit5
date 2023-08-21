package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    @Test
    public void sumTest() {
        var calculator = new Calculator();
        int result = calculator.plus.apply(2, 3);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void minusTest() {
        var calculator = new Calculator();
        int result = calculator.minus.apply(5, 5);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void multiplyTest() {
        var calculator = new Calculator();
        int result = calculator.multiply.apply(2, 3);
        Assertions.assertEquals(6, result);

    }

    @Test
    public void devideByZeroTest() {
        var calculator = new Calculator();
        int result = calculator.devide.apply(8, 0);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void positiveNumberTest() {
        var calculator = new Calculator();
        boolean result = calculator.isPositive.test(3);
        Assertions.assertTrue(result);
    }
}