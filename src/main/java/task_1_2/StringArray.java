package task_1_2;

import java.util.ArrayList;

public class StringArray {
    public static void start() {
        String line;
        int n;
        String[] arr;
        ArrayList<String> maxList;
        do {
            System.out.println("Введите размерность массива:");
            line = Main.scanner.nextLine();
        } while (!line.matches("^\\d*$"));
        n = Integer.parseInt(line);
        arr = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите слово " + (i + 1));
            arr[i] = Main.scanner.nextLine();
        }
        maxList = longestWord(arr);
        System.out.println(maxList.size() > 1 ? "Сымые длинные слова:" : "Самое длинное слово:");
        maxList.forEach(System.out::println);
    }

    private static ArrayList<String> longestWord(String[] arr) {
        ArrayList<String> list = new ArrayList<>();
        int max = 0;
        for (String value : arr) {
            if (value.length() > max)
                max = value.length();
        }
        for (String s : arr) {
            if (s.length() == max)
                list.add(s);
        }
        return list;
    }
}
