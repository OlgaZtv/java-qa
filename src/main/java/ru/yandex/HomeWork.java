package ru.yandex;

public class HomeWork {

    /**
     * Функция получает на вход 4-х значное число
     * Функция должна вернуть число в обратном порядке
     * Например дано 1234, тогда необходимо вывести 4321
     * <p>
     * Необходимо написать реализацию, а так же написать
     * тесты (подумайте над кейсами)
     * <p>
     * 1000 -> 1 (это называется не значащие нули)
     * */
    public static int reverse(int value) {
        // todo
        int n1 = (value / 1000); //первая цифра
        int n2 = ((value / 100) % 10); //вторая цифра
        int n3 = ((value / 10) % 10); //третья цифра
        int n4 = (value % 10); //четвертая цифра
        int reversedNumber = n4 * 1000 + n3 * 100 + n2 * 10 + n1;
        System.out.println(reversedNumber);
        return reversedNumber;
    }

    /**
     * Функция должна возвращать разность между
     * числом из двух первых цифр и числом из двух
     * последних. Вам дано число от 10 до 9999
     * Пример: 4412 -> 44 - 12 = 32
     * Написать полное решение, написать тесты,
     * подумать над кейсами
     * */
    public static int difference(int value) {
        int firstTwoDigits = value / 100;
        System.out.println(firstTwoDigits);
        int lastTwoDigits = value % 100;
        System.out.println(lastTwoDigits);
        int result = firstTwoDigits - lastTwoDigits;
        return result;
    }

}