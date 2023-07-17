package ru.yandex.lesson8;

import org.junit.jupiter.api.Test;

import ru.yandex.BaseTest;

class MyTest extends BaseTest {

    @Test
    void test() {
        String res = readResourceAsString("data.txt");
        System.out.println(res);
    }

}
