package ru.yandex.lesson3;

import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        // if(boolean) else
        boolean flag = true;
        // > >= < <=
        // 1 == 1, !=

        // логические выражения:
        // И  ИЛИ НЕ XOR (исключающее ИЛИ)
        // &  |   !   ^
        // && ||

        // вес меньше 20кг и высота меньше 60 см
        // X Y | X & Y
        // 0 0 |   0
        // 0 1 |   0
        // 1 0 |   0
        // 1 1 |   1

        int a = 3, b = 4;
        boolean x1 = a < 2 && ++b < 7;
        System.out.println(b);

        // ИЛИ
        // На полку можем положить гигиену или аптека

        // Путь есть переменная х, и вводятся два значения а и б
        // ___1____а_____2_____б_______3_____
        int x = 7;
        // 1.
        if (x <= a) {
            System.out.println(1);
        } else if (x <= b) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }
        // 2.
        if (x <= a) {
            System.out.println(1);
        }
        if (x > a && x <= b) {
            System.out.println(2);
        }
        if (x > b) {
            System.out.println(3);
        }

        // Циклы
        // Цикл с предусловием
        // while(condition) { action }
        x = 0;
        while (x < 10){
            System.out.println(x);
            x++;
        }

        // * * *
        // * * *
        // * * *

    }
}
