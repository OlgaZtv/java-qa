package ru.yandex.lesson5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    //list
    public static void main(String[] args) {
        int[] a = new int[12];
        List<Integer> aList = new ArrayList<>();
        List<Integer> data = new ArrayList<>(List.of(1, 2, 3, 4));
        var iList = List.of(1, 2, 3, 4);
        // iList.set(1, 2);
        // 1 2 3 4 <- 5
        // 1 2 3 4 5 _ _ _ _ _ _
        // List<Integer> lList = new LinkedList<>();
        // ~~ -> ~~ -> ~~
        // 1 -> 2 -> 3 ->
        // _ <- 5
        aList.add(5); // вставка в конец
        // 5 _
        aList.add(0, 7); // вставка по индексу
        //   5 _
        // 7     -> 7 5
        System.out.println(aList);
//        var immutable = Collections.unmodifiableList(aList);
//        immutable.size(); // size = 2
//        immutable.get(1); // 5
//        immutable.set(1, 9); // 7 5 -> 7 9
//        immutable.indexOf(9); // 1
//        immutable.remove(0); // 7 9 -> 9
//        System.out.println(immutable);
//        immutable.remove(new Integer(9)); // []
//        System.out.println(immutable);

        // 1 2 3 4 5 6 7 8 9
        // _ _ _ _
        // 3 4 5 6
        LinkedList<Integer> list = new LinkedList<>();
        List<Integer> d = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        for (Integer value : d) {
            if (list.size() < 4) {
                list.add(value);
            } else {
                list.removeFirst();
                list.add(value);
            }
        }
        System.out.println(list);
    }
}
