package ru.yandex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.yandex.lesson3.homework.hw3.Sum;

class HomeWorkThreeTests {

    @Test
    @DisplayName("Тест проверки числа типа int")
    void testSumInt () {
        long l = 12345;
        int actual = Sum.calculateDigitsSum(l);
        int expectedResult = 6;
        Assertions.assertEquals(expectedResult, actual);
    }

    @Test
    @DisplayName("Тест проверки числа ноль")
    void testSumZero () {
        long l = 0;
        int actual = Sum.calculateDigitsSum(l);
        int expectedResult = 0;
        Assertions.assertEquals(expectedResult, actual);
    }

    @Test
    @DisplayName("Тест проверки числа 123")
    void testSumIntTwo() {
        long l = 123;
        int actual = Sum.calculateDigitsSum(l);
        int expectedResult = 6;
        Assertions.assertEquals(expectedResult, actual);
    }

    @Test
    @DisplayName("Тест проверки числа 1")
    void testSumOne() {
        long l = 1;
        int actual = Sum.calculateDigitsSum(l);
        int expectedResult = 1;
        Assertions.assertEquals(expectedResult, actual);
    }

    @Test
    @DisplayName("Тест проверки числа 9999999")
    void testSumLong() {
        long l = 9999999;
        int actual = Sum.calculateDigitsSum(l);
        int expectedResult = 9;
        Assertions.assertEquals(expectedResult, actual);
    }
}
