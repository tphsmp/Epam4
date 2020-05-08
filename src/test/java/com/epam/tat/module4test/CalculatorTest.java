package com.epam.tat.module4test;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    // long sum testing
    public void sumTest() {
        long res = calc.sum(12345678L, 9876543L);
        Assert.assertEquals(res, 6587699876L);
    }

    @Test
    //double sum testing
    public void doubleSumTest() {
       double res = calc.sum(1.99d, 9.02d);
       Assert.assertEquals(res, 11.01d);
    }

    @Test
    //sub long testing
    public void longSubTest() {
        long res = calc.sub(-45454545L, 43434343L);
        Assert.assertEquals(res, -88888888L);
    }

    @Test
    // sub double testing
    public void doubleSubTesting() {
        double res = calc.sub(2.21d, -1.21d);
        Assert.assertEquals(res, 3.42d);
    }

    @Test
    // long mult testing
    public void longMultTest() {
        long res = calc.mult(12345678L, 654322222L);
        Assert.assertEquals(res, 8078051461056516L);
    }

    @Test
    //double mult testing
    public void doubleMultTest() {
        double res = calc.mult(33.23d, 11.22d);
        Assert.assertEquals(res, 372.8406d);
    }

    @Test
    // long div testing
    public  void longDivTest() {
        long res = calc.div(123456789L, 12345678L);
        Assert.assertEquals(res, 10);
    }

    @Test
    // double div test
            public void doubleDivTest() {
        double res = calc.div(3.22d, 0.2d);
        Assert.assertEquals(res, 16.1d);
    }

    @Test
    // double pow test
    public void doublePowTest() {
        double res = calc.pow(7.77d, 3.89d);
        Assert.assertEquals(res, 469.09d);
    }

    @Test
    // double sqrt testing
    public void doubleSqrtTest() {
        double res = calc.sqrt(7.77d);
        Assert.assertEquals(res, 2.8d);
    }

    @Test
    // double tg testing
    public void doubleTgTest() {
        double res = calc.tg(99.1d);
        Assert.assertEquals(res, 1.0d);
    }

    @Test
    // double ctg testing
    public void doubleCtgTest() {
        double res = calc.ctg(99.89d);
        Assert.assertEquals(res, 2.11d);
    }

    @Test
    // double cos testing
    public void doubleCosTest() {
        double res = calc.cos(33.32d);
        Assert.assertEquals(res,0.9449753318643853d);
    }

    @Test
    // double sin testing
    public void doublSinTest() {
        double res = calc.sin(45.789d);
        Assert.assertEquals(res, 1.33d);
    }

    @Test
    // long isPositive testing
    public void isPositiveLong() {
        boolean res = calc.isPositive(-12348348280L);
        Assert.assertEquals(res, false);
    }

    @Test
    // long isNegative testing
    public void isNegativeLong() {
        boolean res = calc.isNegative(984028421084L);
        Assert.assertEquals(res, true);
    }
    
}
