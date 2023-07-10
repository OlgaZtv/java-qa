package ru.yandex.lesson5;

public class StringUtils {

    public static void concat(int n) {
        long start = System.currentTimeMillis();
        String s = "a";
        for (int i = 0; i < n; i++) {
            s += "a";
        }
        long end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start) + " ms.");
    }

    public static void append(int n) {
        long start = System.currentTimeMillis();
        StringBuilder s = new StringBuilder("a");
        for (int i = 0; i < n; i++) {
            s.append("a");
        }
        long end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start) + " ms.");
    }

    // %d - целые числа
    // %f - дробные числа
    // %c - один символ
    // %s - строки
    public static String buildQuery(int p1, String p2) {
        // kotlin
        // "select * from table where id = $p1 and string_field = $p2"
        // java
        return String.format("select * from table where id = %d and string_field = %s", p1, p2);
    }


    public static void main(String[] args) {
        String s = "a1&.";
        // 2b -> 65536
        // s.length();
        // s.charAt(1);
        StringBuilder sb = new StringBuilder();
        s = s + s;
        System.out.println(s);
        // concat(1000000);
        append(1000000);
        // String.format()
        // s.toLowerCase(); AsA => asa
        // s.toUpperCase(); AsA => ASA
        // s.equalsIgnoreCase("asdaf"); aaB = Aab

        // match - делит строку по регулярному выражению
        // регулярки придуманы в перле
        // регулярное выражение - шаблон строки
        // ^ - not, [a-zA-Z0-9.,!#], +, {3}, {1,5}
        // +7-911-234-32-21
        // regex special symbols [ ( { + . * ?
        s = "+7-911-234-32-21";
        System.out.println(s.matches("\\+7-[0-9]{3}-[0-9]{3}-[0-9]{2}-[0-9]{2}"));
        String email = "1.k.levin23@yandex.ru"; // 1tv.com ...123.com
        // (w+\\.w+)|(w+)
        boolean res = email.matches("[a-zA-Z0-9][a-zA-Z0-9.\\-_]+@[a-z0-9]+\\.[a-z]{2,3}");
        System.out.println(res);

        // split
        String input =  "dag adg a sha sd h     ad h a d jda j j  j";
        String[] words = input.split(" +");
        for (String word : words) {
            System.out.print(word + "-");
        }
        System.out.println();

        // replace
        String replaced = input.replaceAll(" +", "-");
        System.out.println(replaced);
        String bad = "sdfga, adjkj5^%%&^";
        String good = bad.replaceAll("[^a-zA-Z ]+", "");
        System.out.println(good);

        String withSpace = "     Good weather \n";
        System.out.println(withSpace.trim());

    }

}
