package ru.yandex.lesson7;

public class TimeMeasurer {

    public void printInvokeTime(Invoker invoker) {
        long start = System.currentTimeMillis();
        invoker.invoke();
        long end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start) + " ms.");
    }

}
