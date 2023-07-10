package ru.yandex.lesson6;

public class TestUtils {

    /**
     * Функция должна создавать filesCount файлов
     * <p>
     * Файл не должен иметь формат, файлы должны назваться по номерам,
     * например filesCount = 3, должно быть сгенерировано три файла с именами 1 2 3
     * <p>
     * Каждый файл должен содержать данные в формате:
     * Первая строка отдельное целое число N
     * Со следующей строки N целых чисел через пробел
     * Данные заполняем случайным способом используя Math.random() / new Random()
     * @param filesCount - количество тестовых файлов, которые мы хотим сгенерировать
     */
    public static void generateTestData(int filesCount) {
        // создаем filesCount файлов с исходными данными
    }

    public static void generateAnswer(String inputFilePath) {
        // читаем из файла, находим минимум, создаем файл .а
        // и пишем в него результат Solve.min
    }

}
