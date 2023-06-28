package ru.yandex.lesson3;

public class ClassWork {

    // может ли ладья сходить из х1 у1 в х2 у2
    // ------->        <---
    public static boolean canRook(int x1, int y1, int x2, int y2) {
        return (x1 == x2 || y1 == y2) && !((x1 == x2 && y1 == y2));
    }

    public static boolean canBishop(int x1, int y1, int x2, int y2) {
        //           4 - 2 = 2
        //           Math.abs(2 - 4 = -2) = 2
        return Math.abs(x2 - x1) == Math.abs(y2 - y1);
    }

    // 12345 -> 5
    // 222 -> 3
    public static int length(int value) {
        int counter = 0;
        while (value > 0) {
            value /= 10;
            counter++;
        }
        return counter;
    }

    public static void printRectangle(int width, int length) {
//        while (length > 0) {
//            int w = width;
//            while (w > 0) {
//                System.out.print("* ");
//                w--;
//            }
//            System.out.println();
//            length--;
//        }

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // size = 4
    // *
    // **
    // ***
    // ****
    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printN(i);
        }
    }

    public static void printN(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    //       *
    //      ***
    //     *****
    //    *******
    public static void printTriangle2(int size, int h) {
        // todo *
        // x % 2 == 0
        // x & 1 == 0 - четное
    }

    public static void main(String[] args) {
        printTriangle(4);
    }

}
