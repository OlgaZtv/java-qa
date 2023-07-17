package ru.yandex.lesson8.expression;

public class Plus implements Function {
    @Override
    public int apply(int x, int y) {
        return x + y;
    }

    @Override
    public char operationKey() {
        return '+';
    }
}
