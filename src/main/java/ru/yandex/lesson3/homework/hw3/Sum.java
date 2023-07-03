package ru.yandex.lesson3.homework.hw3;

public class Sum {

    public static int calculateDigitsSum (long number) {
        while (number > 9) {
            long sum = 0;
            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }
            number = sum;
        }
        return (int) number;
    }
}
