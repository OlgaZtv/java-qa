package ru.yandex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeWorkTests {

    @Test
    void testReverse1() {
        //actual = HomeWork.reverse(1234);
        int value = 1234;
        int expectedResult = 4321;
        Assertions.assertEquals(expectedResult, value);
    }

    @Test
    void testReverse2() {
        // Тест с числом, содержащим нули в начале
        int value = 1000;
        int expectedResult = 1;
        //actual = HomeWork.reverse(1234);
        Assertions.assertEquals(expectedResult, value);
    }

    @Test
    void testReverse3() {
        // Тест с числом, содержащим одну цифру
        int value = 5;
        int expectedResult = 5;
        //actual = HomeWork.reverse(value);
        Assertions.assertEquals(expectedResult, value);
    }

    @Test
    void testReverse4() {
        // Тест с числом, содержащим одинаковые цифры
        int value = 1111;
        int expectedResult = 1111;
        //actual = HomeWork.reverse(value);
        Assertions.assertEquals(expectedResult, value);
    }

    @Test
    void testDiff() {
        HomeWork.difference(4412);
        // Тест с обычным числом
        int number = 4412;
        int expected = 44 - 12;
        int actual = HomeWork.difference(number);
        System.out.println(expected);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testDiff2() {
        HomeWork.difference(1111);
        // Тест с числом, где первые две цифры равны последним двум цифрам
        int number = 1111;
        int expected = 11 - 11;
        System.out.println(expected);
        int actual = HomeWork.difference(number);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testDiff3() {
        HomeWork.difference(5432);
        // Тест с числом, где первые две цифры больше последних двух цифр
        int number = 5432;
        int expected = 54 - 32;
        System.out.println(expected);
        int actual = HomeWork.difference(number);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testDiff4() {
        HomeWork.difference(1234);
        // Тест с числом, где первые две цифры меньше последних двух цифр
        int number = 1234;
        int expected = 12 - 34;
        System.out.println(expected);
        int actual = HomeWork.difference(number);
        Assertions.assertEquals(expected, actual);
    }
}