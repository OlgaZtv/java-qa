package ru.yandex.lesson7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

    /**
     * Digits from 1 to 100
     * only even, sum digits > 8
     */
    public static void printGeneratedValues() {
        IntStream.rangeClosed(1, 100)
                .filter(x -> x % 2 == 0)
                .filter(x -> sumDigits(x) > 8)
                .forEach(x -> System.out.print(x + " "));
    }

    /**
     * digits from 1 to 10
     * if even + 2
     * if odd + 1
     * (x + 1) + (x + 1) % 2
     */
    public static List<Integer> onlyOdd() {
        return Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .map(x -> (x + 1) + (x + 1) % 2)
                .collect(Collectors.toList());
    }

    /**
     * 1 2 3 4
     * 5 6
     * 7 8 9 10 11
     * 12
     */
    public static Integer[][] data = new Integer[][]{
            {1, 2, 3, 4},
            {5, 6}
    }; // 21

    public static String flatMap(Integer[][] array) {
        return Arrays.stream(array)
                .flatMap(Stream::of)
                .reduce(
                        "",
                        (x, y) -> x + y + " ",
                        (x, y) -> x
                );
    }

    public static int sumDigits(int value) {
        int sum = 0;
        while (value > 0) {
            sum += value % 10;
            value /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        printGeneratedValues();
        System.out.println();
        System.out.println(onlyOdd());
        System.out.println(flatMap(data));
    }
}
