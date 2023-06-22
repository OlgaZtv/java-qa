package ru.yandex.lesson2;

public class PointBuilder {

    private double x;
    private double y;

    public static PointBuilder builder() {
        return new PointBuilder();
    }

    public PointBuilder withX(double x) {
        this.x = x;
        return this;
    }

    public PointBuilder withY(double y) {
        this.y = y;
        return this;
    }

    public Point build() {
        return new Point(x, y);
    }

}
