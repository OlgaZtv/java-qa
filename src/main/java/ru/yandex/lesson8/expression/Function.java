package ru.yandex.lesson8.expression;

public interface Function {

    int apply(int x, int y);

    char operationKey();

    default void print() {
        System.out.print(operationKey());
    }
}
