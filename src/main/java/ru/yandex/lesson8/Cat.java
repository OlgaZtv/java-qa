package ru.yandex.lesson8;

import java.io.Closeable;
import java.io.IOException;
import java.nio.CharBuffer;

public class Cat extends Animal implements Cloneable, Closeable, Readable {

    // protected
    public Cat() {
        System.out.println(this + " created");
    }

    @Override
    public void say() {
        // super.say();
        System.out.println("MEOW");
    }

    @Override
    public void close() throws IOException {

    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        return 0;
    }
}
