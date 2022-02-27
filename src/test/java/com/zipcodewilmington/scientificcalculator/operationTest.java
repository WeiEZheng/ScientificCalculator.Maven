package com.zipcodewilmington.scientificcalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class operationTest {

    @Test
    void additionTest1() {

        double expectedResult = 19;
        int a = 10;
        int b = 9;

        double actualResult = operation.addition(a,b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void additionTest2() {

        double expectedResult = 24;
        int a = -35;
        int b = 59;

        double actualResult = operation.addition(a,b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @org.junit.jupiter.api.Test
    void subtractionTest1() {

        double expectedResult = 30;
        int a = 45;
        int b = 15;

        double actualResult = operation.subtraction(a,b);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @org.junit.jupiter.api.Test
    void subtractionTest2() {

        double expectedResult = -5;
        int a = 8;
        int b = 13;

        double actualResult = operation.subtraction(a,b);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @org.junit.jupiter.api.Test
    void multiplicationTest1() {

        double expectedResult = 90;
        int a = 10;
        int b = 9;

        double actualResult = operation.multiplication(a,b);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @org.junit.jupiter.api.Test
    void multiplicationTest2() {

        double expectedResult = -7;
        int a = -1;
        int b = 7;

        double actualResult = operation.multiplication(a,b);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @org.junit.jupiter.api.Test
    void divison() {

        double expectedResult = 5;
        int a = 10;
        int b = 2;

        double actualResult = operation.divison(a,b);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @org.junit.jupiter.api.Test
    void square() {

        double expectedResult = 25;
        int a = 5;

        double actualResult = operation.square(a);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @org.junit.jupiter.api.Test
    void squareRoot() {

        double expectedResult = 10;
        int a = 100;

        double actualResult = operation.squareRoot(a);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @org.junit.jupiter.api.Test
    void exponents() {

        double expectedResult = 117649;
        int a = 7;
        int b = 6;

        double actualResult = operation.exponents(a,b);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @org.junit.jupiter.api.Test
    void inverseNumber() {

        double expectedResult = 0.2;
        int a = 5;

        double actualResult = operation.inverseNumber(a);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @org.junit.jupiter.api.Test
    void inverseSign() {

        double expectedResult = 7;
        int a = -7;

        double actualResult = operation.inverseSign(a);

        Assertions.assertEquals(expectedResult, actualResult);

    }
}