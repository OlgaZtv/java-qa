package ru.yandex.lesson11.order;

import java.util.concurrent.atomic.AtomicInteger;

public class OrderTest {

    // wait - после вызова этого метода поток ждет в вейтсет
    // notify - оживляет один ждущий поток (любой)
    // notifyAll - оживляет все потоки
    public static void main(String[] args) {
        int limit = 10;
        Thread[] threads = new Thread[limit];
        AtomicInteger counter = new AtomicInteger(1);
        // (counter - value) % 3 = 0
        // 1 4 7 10 -> 1 ? counter % 3 = value % 3
        // 2 5 8 11 -> 2 ? counter % 3 = value % 3
        // 3 6 9 12 -> 3 ? counter % 3 = value % 3
        for (int i = 0; i < limit; i++) {
            threads[i] = new Thread(new ValuePrinter(i + 1, limit, counter));
            threads[i].start();
        }
    }

}
