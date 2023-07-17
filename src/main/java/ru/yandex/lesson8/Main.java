package ru.yandex.lesson8;

import java.util.Arrays;

import ru.yandex.lesson8.expression.Constant;
import ru.yandex.lesson8.expression.Multiply;
import ru.yandex.lesson8.expression.Plus;
import ru.yandex.lesson8.expression.Sum;
import ru.yandex.lesson8.writer.ConsoleWriter;
import ru.yandex.lesson8.writer.FileWriter;
import ru.yandex.lesson8.writer.Writer;

public class Main {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sum(int a, float b) {
        return (int) (a + b);
    }

    public static int sum(int... values) {
        return Arrays.stream(values)
                .sum();
    }

    public static void writeTo(Writer writer, String data) {
        writer.write(data);
    }

    public static void main(String[] args) {
//        System.out.println(sum(1, 2f));
//        // new Scanner()
//
//        Animal cat = new Cat();
//        cat.setName("Vaska");
//        cat.setAge(12);
//        cat.say();

        // Object o = new Cat();
        // Animal a = new Cat();

//        Animal animal = new Animal() {
//            @Override
//            public void say() {
//
//            }
//        };
//        System.out.println(animal.getClass());

        // writeTo(new FileWriter("hello.txt"), "Hello world");
        // (2 + 4) + (2 + 4) = 12
        new Multiply(
                new Sum(new Constant(2), new Constant(4)),
                new Sum(new Constant(2), new Constant(4))
        ).print();
    }
}
