package ru.yandex;

import java.io.InputStream;

public class IoUtils {
    public static String readAsString(String name, Class cl) {
        try (InputStream resource = cl.getResourceAsStream(name)) {
            return new String(resource.readAllBytes());
        } catch (Exception e) {
            return null;
        }
    }
}
