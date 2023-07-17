package ru.yandex.lesson8.writer;

import java.io.FileOutputStream;

public class FileWriter implements Writer {

    private final String resourcePath;

    public FileWriter(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public String getResourcePath() {
        return resourcePath;
    }

    @Override
    public void write(String data) {
        try (FileOutputStream fos = new FileOutputStream(resourcePath, true)) {
            data = data + "\n";
            fos.write(data.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
