package ru.yandex.lesson11;

public class Main {


    public static void main(String[] args) {

        Thread t1 = new Thread(
                () -> {
                    try {
                        while (true) {
                            System.out.print("[");
                            Thread.sleep(200); // 0.3 sec
                        }
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
        );

        Thread t2 = new Thread(
                () -> {
                    try {
                        while (true) {
                            System.out.print("]");
                            Thread.sleep(200);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
        );
//        t1.setDaemon(true); // service thread
//        t2.setDaemon(true);
        t1.setPriority(1);
        t2.setPriority(10);
        t1.start();
        t2.start();
        System.out.println(1);
    }
}
