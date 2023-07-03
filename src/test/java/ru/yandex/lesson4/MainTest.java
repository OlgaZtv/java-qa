package ru.yandex.lesson4;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    public static Stream<Arguments> randomData() {
        int [] data = Main.generateRandomArray(30, 0, 100);
        return Stream.of(Arguments.of(
                data, Main.findMinimum(data)
        ));
    }

    @ParameterizedTest
    @MethodSource("randomData")
    void findMinimum(int[] data, int expected) {
        int actually = Main.findMinimum(data);
        System.out.println(actually);
        assertEquals(expected, actually);
    }

    @ParameterizedTest
    @CsvSource("1234,'1 2 3 4'")
    void toArrayTest(int value, String array) {
        int[] expected = toIntArray(array);
        int[] actually = Main.toArray(value);
        assertArrayEquals(expected, actually);
    }

    // 1 2 3 4
    public int[] toIntArray(String str) {
        String[] strings = str.split(" ");
        int[] array = new int[strings.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(strings[i]);
        }
        return array;
    }
}