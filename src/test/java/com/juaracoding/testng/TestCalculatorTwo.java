package com.juaracoding.testng;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCalculatorTwo {

    Calculator calculator;
    int a, b;

    @BeforeMethod
    public void setUp(){
        calculator = new Calculator();
        a = 10;
        b = 5;
    }

    @Test
    public void testAdd(){
        int actual = calculator.add(a, b);
        int expect = 15;
        Assert.assertEquals(actual, expect);
    }

    @Test
    public void testSubstract(){
        Assert.assertEquals(calculator.substract(a, b), 5);
    }

}
