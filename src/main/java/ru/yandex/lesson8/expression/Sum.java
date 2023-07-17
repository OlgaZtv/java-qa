package ru.yandex.lesson8.expression;

public class Sum extends BinaryOperator {

    public Sum(Expression left, Expression right) {
        super(left, right, new Function() {
            @Override
            public int apply(int x, int y) {
                return x + y;
            }

            @Override
            public char operationKey() {
                return '+';
            }
        });
    }
}
