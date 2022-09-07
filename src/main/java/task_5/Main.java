package task_5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, Files.readString(Path.of("src/main/java/task_5/text.txt")).split(" "));
        System.out.println("Исходный набор слов:\n" + list);
        Collections.sort(list);
        System.out.println("Отсортированный набор слов:\n" + list);
        Map<String, Integer> map = new TreeMap<>();
        list.forEach(s -> {
            if ((map.containsKey(s))) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        });
        System.out.println("Подсчет слов в файле в формате слово = количестов вхождений:\n" + map);
        int max = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getValue();
        System.out.println("Слова с максимальным количеством повторений:");
        map.forEach((key, value) -> {
            if (value == max)
                System.out.println("\"" + key + "\"" + " встречается в количестве " + max);
        });
    }
}
