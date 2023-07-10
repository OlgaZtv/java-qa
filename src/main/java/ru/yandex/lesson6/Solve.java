package ru.yandex.lesson6;

import java.util.Arrays;

public class Solve {

    public static int min(int[] array) {
        return Arrays.stream(array)
                .min()
                .orElseThrow();
    }

}
