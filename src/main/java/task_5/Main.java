package task_5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
Set<Integer> set = new TreeSet<>(new Comparator<Integer>() {
    @Override
    public int compare(Integer o1, Integer o2) {
        return -1;
    }
});
set.add(1);
set.add(2);
set.add(1);
        System.out.println(set);

    }
}
class Main2 {

}