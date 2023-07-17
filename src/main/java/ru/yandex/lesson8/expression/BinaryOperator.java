package ru.yandex.lesson8.expression;

public class BinaryOperator implements Expression {

    private final Expression left;
    private final Expression right;
    private final Function operation;

    public BinaryOperator(Expression left, Expression right, Function operation) {
        this.left = left;
        this.right = right;
        this.operation = operation;
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }

    @Override
    public int eval() {
        return operation.apply(left.eval(), right.eval());
    }

    @Override
    public String toStr() {
        return "(" + left.toStr() + operation.operationKey() + right.toStr() + ")";
    }

    @Override
    public void print() {
        System.out.println(toStr() + "=" + eval());
    }
}
