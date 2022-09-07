package task_4;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Калькулятор. \n" +
                "для сложения введите +\n" +
                "для вычитания введите -\n" +
                "для умножения введите *\n" +
                "для деления введите /");

        Calculator calculator = new Calculator(readOperation(), checkDouble("первое"), checkDouble("второе"));
        try {
            double res = calculator.calculate(calculator.getA(), calculator.getB(), calculator.getOperation());
            System.out.printf(calculator.getA() + " " + calculator.getOperation() + " " + calculator.getB() + " = " + "%.4f" + "\n", res);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Exception");
            e.printStackTrace();
        }
    }

    public static String readOperation() {
        String operation;
        do {
            System.out.println("Введите операцию:");
            operation = scanner.nextLine();
        } while (!operation.matches("^[+*\\/\\-]$"));
        return operation;
    }

    private static double checkDouble(String message) {
        boolean repeat;
        double res = 0;
        do {
            repeat = false;
            System.out.println("Введите " + message + " число:");
            try {
                res = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                repeat = true;
            }
        } while (repeat);
        return res;
    }

}
