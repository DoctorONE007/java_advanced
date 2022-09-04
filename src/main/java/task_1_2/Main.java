package task_1_2;

import java.util.Scanner;

public class Main {
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String line;
        do {
            System.out.println("Enter number of task: (1 - calculator, 2 - string array, other - exit)");
            line = scanner.nextLine();
            if (line.equals("1"))
                Calculator.start();
            if (line.equals("2"))
                StringArray.start();
        } while (line.matches("^[12]$"));

    }
}
