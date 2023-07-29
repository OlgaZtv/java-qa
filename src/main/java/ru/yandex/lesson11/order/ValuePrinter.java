package ru.yandex.lesson11.order;

import java.util.concurrent.atomic.AtomicInteger;

public class ValuePrinter implements Runnable {

    private final int value;
    private final int limit;

    private final AtomicInteger inc;

    public ValuePrinter(int value, int limit, AtomicInteger inc) {
        this.value = value;
        this.limit = limit;
        this.inc = inc;
    }


    @Override
    public void run() {
        try {
            while (true) {
                synchronized (inc) {
                    if (inc.get() % limit == value % limit) {
                        System.out.print(value + " ");
                        inc.incrementAndGet();
                        inc.notifyAll();
                    } else {
                        inc.wait();
                    }
                }
                Thread.sleep(300);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
