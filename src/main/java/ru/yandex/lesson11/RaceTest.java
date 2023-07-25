package ru.yandex.lesson11;

public class RaceTest {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            CommonResource commonResource = new CommonResource(0);
            Thread thread = new Thread(new Incrementor(commonResource));
            Thread thread1 = new Thread(new Incrementor(commonResource));
            thread.start();
            thread1.start();
            synchronized (commonResource) {
                System.out.println(commonResource.getValue());
            }
        }
    }
}
