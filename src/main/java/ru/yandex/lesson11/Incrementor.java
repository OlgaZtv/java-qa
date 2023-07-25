package ru.yandex.lesson11;

public class Incrementor implements Runnable {

    private final CommonResource resource;

    public Incrementor(CommonResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        synchronized (resource) {
            for (int i = 0; i < 10000; i++) {
                resource.inc();
            }
        }
    }
}
