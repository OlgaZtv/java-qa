package ru.yandex.lesson8.writer;

public class ConsoleWriter implements Writer {

    @Override
    public void write(String data) {
        System.out.println(data);
    }
}
