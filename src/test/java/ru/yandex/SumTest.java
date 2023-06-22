package ru.yandex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SumTest {

    @Test
    @DisplayName("Name of test")
    void testSum() {
        int actually = Func.sum(1, 2);
        int expected = 3;
        Assertions.assertEquals(expected, actually);
    }

    // @DisplayName("Тест суммы двух чисел")
    @ParameterizedTest(
            name = "{index}) {0} + {1} = {2}"
    )
    @CsvSource({
            "1,2,3",
            "5,5,10",
    })
    void testSumWithParams(int x, int y, int expected) {
        Assertions.assertEquals(expected, Func.sum(x, y));
    }
}
