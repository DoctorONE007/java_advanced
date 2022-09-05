package task_3;

import java.util.Arrays;

public class ArrayTask {
    public static void main(String[] args) {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++)
            arr[i] = (int) (Math.random() * 21 - 10);

        System.out.println(Arrays.toString(arr));
        System.out.println("Максимальный отрицательный элемент: ");
        Arrays.stream(arr).filter(i -> i < 0).max().ifPresentOrElse(System.out::println, ()->System.out.println("Нет элемента"));
        System.out.println("Минимальный положительный элемент: ");
        Arrays.stream(arr).filter(i -> i>=0).min().ifPresentOrElse(System.out::println, ()->System.out.println("Нет элемента"));
    }
}
