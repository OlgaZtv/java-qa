package ru.yandex.lesson8.expression;

public class Constant implements Expression {

    private final int value;

    public Constant(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int eval() {
        return value;
    }

    @Override
    public String toStr() {
        return String.valueOf(value);
    }

    @Override
    public void print() {
        System.out.print(value);
    }
}
