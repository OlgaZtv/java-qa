package ru.yandex.lesson7;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    // Lambda function () -> {} x -> x

    static int sum(int a, int b) {
        return a + b;
    }

    static int calculateWith(int x, int y, Operation operation) {
        return operation.apply(x, y);
    }

    static int min(int a, int b) {
        return Math.min(a, b);
    }

    public static void main(String[] args) {

        Operation operation = (p1, p2) -> p1 * p2;
        Operation op1 = Integer::sum;
        int a = Integer.sum(1, 2);
        Operation o1 = Main::sum;
        System.out.println(
                calculateWith(3, 5, Main::min)
        );

        // forEach - действие над каждым элементом стрима (терминальная операция)
        // peek - действие над каждым элементом стрима (не терминальная операция)
        Consumer<String> consumer = arg -> System.out.println(arg + " ");
        consumer.accept("Hello");
        consumer = System.out::println;

        // filter, allMatch, anyMatch, noneMatch
        Predicate<Integer> isOdd = x -> x % 2 == 1;
        isOdd.and(x -> x > 7).test(5);

        // map, flatMap
        Function<String, Integer> function = str -> str.length();
        System.out.println(function.apply("Hello   "));

        // collect
        Supplier<ArrayList<Integer>> supplier = ArrayList::new;
        supplier.get();
    }

}
