package com.juaracoding.testng;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCalculator {

    @Test
    @Parameters({"angkaPertama","angkaKedua"})
    public void testAdd(int angkaPertama, int angkaKedua){
        Calculator calculator = new Calculator();
        int actual = calculator.add(angkaPertama, angkaKedua);
        int expect = 15;
        Assert.assertEquals(actual, expect);
    }

    @Test
    @Parameters({"angkaPertama","angkaKedua"})
    public void testSubstract(int angkaPertama, int angkaKedua){
        Calculator calculator = new Calculator();
        int actual = calculator.substract(angkaPertama, angkaKedua);
        int expect = 5;
        Assert.assertEquals(actual, expect);
    }

    // Jenis result testing yang passes
    @Test
    @Parameters("text")
    public void testAssertTrue(String text){
//        boolean angka = 16>16;
//        Assert.assertTrue(angka);
        String actual = "Data berhasil disimpan";
        String expect = "Data berhasil disimpan";
        System.out.println(text);
        // Validasi
        Assert.assertTrue(actual.equals(expect));
    }



}
