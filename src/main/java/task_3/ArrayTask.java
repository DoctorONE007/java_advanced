package task_3;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class ArrayTask {
    public static void main(String[] args) {
        AtomicInteger max = new AtomicInteger(-1);
        AtomicInteger min = new AtomicInteger(-1);
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++)
            arr[i] = (int) (Math.random() * 21 - 10);
        System.out.println(Arrays.toString(arr));
        System.out.println("Максимальный отрицательный элемент: ");
        Arrays.stream(arr).filter(i -> i < 0).max().ifPresentOrElse((value -> {
            System.out.println(value);
            max.set(IntStream.range(0, arr.length).filter(i -> value == arr[i]).findFirst().orElse(-1));
        }), () -> System.out.println("Нет элемента"));

        System.out.println("Минимальный положительный элемент: ");
        Arrays.stream(arr).filter(i -> i > 0).min().ifPresentOrElse((value -> {
            System.out.println(value);
            min.set(IntStream.range(0, arr.length).filter(i -> value == arr[i]).findFirst().orElse(-1));
        }), () -> System.out.println("Нет элемента"));

        if (max.get() != -1 && min.get() != -1) {
            int tmp = arr[max.get()];
            arr[max.get()] = arr[min.get()];
            arr[min.get()] = tmp;
            System.out.println("Массив после перестановки:\n" + Arrays.toString(arr));
        } else
            System.out.println("Массив не изменен");
    }
}
