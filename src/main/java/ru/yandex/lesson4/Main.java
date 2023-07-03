package ru.yandex.lesson4;

import java.util.Random;

// arrays
public class Main {


    public static int findMinimum(int[] array) {
        // array.length
        // fori
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
        // iter
        for (int item : array) {
            System.out.print(item + " ");
        }
        int min = array[0];
        for (int item : array) {
            if (item < min) {
                min = item;
            }
        }
        System.out.println();
        return min;
    }

    public static int[] generateRandomArray(int n, int from, int to) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = getRnd(from, to);
        }
        return array;
    }

    // 0 .. 1 (0.18517296593145)
    // 100 .. 500
    // 100 + 0.999999999 * 400
    public static int getRnd(int from, int to) {
        int d = to - from;
//        Random rnd = new Random();
//        rnd.nextInt(from, to);
        return (int) (from + Math.random() * d);
    }

    // 1 2 3 4
    public static int[] toArray(int value) {
        int length = 0;
        int copy = value;
        while (copy > 0) {
            copy /= 10;
            length++;
        }
        // 1234
        int[] result = new int[length];
        // 0 0 0 0
        // 0 1 2 3
        copy = value;
        // 1234
        int idx = length - 1;
        // 3
        while (copy > 0) {
            int digit = copy % 10;
            // 4
            copy /= 10;
            // 123
            result[idx] = digit;
            // result[3] = 4
            // result[2] = 3
            // result[1] = 2
            // result[0] = 1
            idx--;
            // 2
        }
        return result;
    }

    // 10 X 10
    static int[][] getMultiplyMatrix(int bound) {
        int[][] matrix = new int[bound][bound];
        for (int i = 0; i < bound; i++) {
            for (int j = 0; j < bound; j++) {
                matrix[i][j] = (i + 1) * (j + 1);
                // 1 2 3 4 5 6 7 8 9
                // 2 4 6
            }
        }
        return matrix;
    }

    static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // findMinimum(new int[]{1, 2, 3});

//        int result = findMinimum(generateRandomArray(10, 0, 100));
//        System.out.println(result);

//        int[][] m = getMultiplyMatrix(10);
//        for (int i = 0; i < m.length; i++) {
//            for (int j = 0; j < m[i].length; j++) {
//                System.out.printf("%4d ", m[i][j]);
//            }
//            System.out.println();
//        }

        // Strings
        String s = "i6d87g566fa^%^$ED%S^EF^*AD";
        // s.length();
        // s.charAt(0);

        for (int i = 'A'; i <= 'Z'; i++) {
            System.out.println(i);
        }

        String eng = "Helloo";
        String kir = "Привет";

        byte[] engB = eng.getBytes();
        byte[] kirB = kir.getBytes();
        System.out.println();

        eng.matches("[A-Za-z]+");

        for (int i = 0; i < 256; i++) {
            System.out.print((char) i + " ");
            if (i % 20 == 0) {
                System.out.println();
            }
        }
    }
}
