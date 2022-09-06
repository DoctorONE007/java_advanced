package task_4;

import java.util.Scanner;

public class Calculator {
    private final Scanner scanner = new Scanner(System.in);
    private String operation;
    private double a;
    private double b;

    public Calculator() {
        System.out.println("Калькулятор. \n" +
                "для сложения введите +\n" +
                "для вычитания введите -\n" +
                "для умножения введите *\n" +
                "для деления введите /");
    }

    public String getOperation() {
        return operation;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }


    public void setOperation() {
        do {
            System.out.println("Введите операцию:");
            operation = scanner.nextLine();
        } while (!operation.matches("^[+*\\/\\-]$"));
    }

    public void setA() {
        a = checkDouble("первое", scanner);
    }

    public void setB() {
        b = checkDouble("второе", scanner);
    }

    public double calculate(double a, double b, String operation) {
        try {
            switch (operation) {
                case ("+"):
                    return add(a, b);
                case ("-"):
                    return subtract(a, b);
                case ("*"):
                    return multiply(a, b);
                case ("/"):
                    return divide(a, b);
                default:
                    throw new Exception("Ошибочка");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

    private double checkDouble(String message, Scanner scanner) {
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

    private double add(double a, double b) {
        return a + b;
    }

    private double subtract(double a, double b) {
        return a - b;
    }

    private double multiply(double a, double b) {
        return a * b;
    }

    private double divide(double a, double b) {
        return a / b;
    }
}
