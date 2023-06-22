package ru.yandex.lesson2;

public class Point {

    private static long counter = 0;

    private final long id;
    private double x;
    private double y;

    public static Point of(double x, double y) {
        return new Point(x, y);
    }

    public Point() {
        // System.out.println(this);
        counter++;
        this.id = counter;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
        counter++;
        this.id = counter;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public long getId() {
        return id;
    }

    public static long getCounter() {
        return counter;
    }
}
