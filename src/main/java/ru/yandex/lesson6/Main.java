package ru.yandex.lesson6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Main {


    public static void writeStringLn(String data, String filePath) {
        try (FileOutputStream fos = new FileOutputStream(filePath, true)) {
            //PrintWriter pr = new PrintWriter("file.txt");
            fos.write(data.getBytes());
            fos.write('\n');
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void fillFile(String name) {
        long start = System.currentTimeMillis();
//        byte[] array = new byte[1024];
//        for (int i = 0; i < 1024; i++) {
//            array[i] = 'a';
//        }
        try(BufferedWriter fos = new BufferedWriter(new FileWriter(name))) {
            for (int i = 0; i < 1000000; i++) {
                fos.append('a');
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start) + " ms.");
    }

    public static void main(String[] args) {
        fillFile("bigfile.txt");
        //writeStringLn("Hello world", "hello.png");
//        try (FileInputStream is = new FileInputStream("file.txt")) {
////            String s = new String(is.readAllBytes());
////            System.out.println(s);
////        } catch (Exception e) {
////            e.printStackTrace();
////        }

        try (Scanner in = new Scanner(new File("file.txt"))) {
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                int current = in.nextInt();
                System.out.println(current);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
