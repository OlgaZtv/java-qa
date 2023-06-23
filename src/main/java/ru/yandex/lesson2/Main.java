package ru.yandex.lesson2;

import ru.yandex.lesson2.homework.hw2.*;

public class Main {
    public static void main(String[] args) {

        Point p = new Point();
        System.out.println(p);
        Point p1 = new Point(1, 3);
        System.out.println(p1.getX());
        System.out.println(p1.getY());
        System.out.println(p.getId());
        System.out.println(p1.getId());
        System.out.println(Point.getCounter());
        Point p3 = Point.of(5, 5);

        Point point = PointBuilder.builder()
                .withX(12)
                .withY(7)
                .build();

        Line line = Line.of(1, 3, 1, 5);

        //Homework2 - с Lombok все быстрее - но специально создавала с билдером

        SerialInventory serialInventory = SerialInventoryBuilder.builder()
                .withSerialKey(12354)
                .withLoc(new Loc(12345, "Loc", 12, 11, 10, 152, 110, 111, "Zone"))
                .withLot(new Lot(124, 1, new Sku(15, 14,"Товар")))
                .withQuantity(12)
                .withSku(new Sku(15, 14,"Товар"))
                .build();
    }
}
