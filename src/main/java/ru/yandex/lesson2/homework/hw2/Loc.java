package ru.yandex.lesson2.homework.hw2;

public class Loc {
    private long serialKey;
    private String name;
    private double length;
    private double width;
    private double height;
    private int x;
    private int y;
    private int z;
    private String zone;

    public long getSerialKey() {
        return serialKey;
    }

    public void setSerialKey(long serialKey) {
        this.serialKey = serialKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public Loc(long serialKey, String name, double length, double width, double height, int x, int y, int z, String zone) {
        this.serialKey = serialKey;
        this.name = name;
        this.length = length;
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
        this.z = z;
        this.zone = zone;
    }
}
