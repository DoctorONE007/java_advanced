package task_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTests {

    @Test
    public void divideByZero() {
        Calculator calculator = new Calculator("/", 1.58, 0.0);
        Exception exception = Assertions.assertThrows(NullPointerException.class, () -> {
            calculator.calculate(calculator.getA(), calculator.getB(), calculator.getOperation());
        });
        Assertions.assertTrue(exception.getMessage().contains("Вторым аргументом указан 0 - не надо так"));
    }

    @Test
    public void checkAdd() throws Exception {
        Calculator calculator = new Calculator("+", 256.087, 15.1);
        Assertions.assertEquals(271.187, calculator.calculate(calculator.getA(), calculator.getB(), calculator.getOperation()));
    }

    @Test
    public void checkSubtract() throws Exception {
        Calculator calculator = new Calculator("-", 256.087, 15.1);
        Assertions.assertEquals(240.987, calculator.calculate(calculator.getA(), calculator.getB(), calculator.getOperation()));
    }

    @Test
    public void checkMultiply() throws Exception {
        Calculator calculator = new Calculator("*", 256, 15.1);
        Assertions.assertEquals(3865.6, calculator.calculate(calculator.getA(), calculator.getB(), calculator.getOperation()));
    }

    @Test
    public void checkDivide() throws Exception {
        Calculator calculator = new Calculator("/", 256, 2);
        Assertions.assertEquals(128, calculator.calculate(calculator.getA(), calculator.getB(), calculator.getOperation()));
    }
}