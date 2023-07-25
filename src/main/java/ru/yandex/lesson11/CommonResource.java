package ru.yandex.lesson11;

public class CommonResource {
    private int value;

    public CommonResource(int value) {
        this.value = value;
    }

    public void inc() {
        value++; // value ++ 1
                 // 0 ++ 1
    }

    public int getValue() {
        return value;
    }

}
