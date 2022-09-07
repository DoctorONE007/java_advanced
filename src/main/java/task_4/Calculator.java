package task_4;

public class Calculator {

    private String operation;
    private double a;
    private double b;

    public Calculator(String operation, double a, double b) {
        this.operation = operation;
        this.a = a;
        this.b = b;
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

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double calculate(double a, double b, String operation) throws Exception {

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
        if (b == 0)
            throw new NullPointerException("Вторым аргументом указан 0 - не надо так");
        return a / b;
    }
}
