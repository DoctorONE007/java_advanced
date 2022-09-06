package task_4;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setOperation();
        calculator.setA();
        calculator.setB();
        double res = calculator.calculate(calculator.getA(), calculator.getB(), calculator.getOperation());

        System.out.printf(calculator.getA() + " " + calculator.getOperation() + " " + calculator.getB() + " = " + "%.4f" + "\n", res);
    }
}
