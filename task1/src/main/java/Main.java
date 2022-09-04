import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operation;
        double a;
        double b;
        double res;

        System.out.println("Калькулятор. \n" +
                "для сложения введите +\n" +
                "для вычитания введите -\n" +
                "для умножения введите *\n" +
                "для деления введите /");

        //Ввод операции пользователем, с проверкой допустимых значений / * - +
        do {
            System.out.println("Введите операцию:");
            operation = scanner.nextLine();
        } while (!operation.matches("^[+*\\/\\-]$"));

        a = checkDouble("первое", scanner);
        b = checkDouble("второе", scanner);

        try {
            res = makeOperation(a, b, operation);
        } catch (Exception e) {
            res = 0;
        }

        System.out.printf(a + " " + operation + " " + b + " = " + "%.4f", res);
    }

    /**
     * @param message - сообщение для общения с пользователем
     * @param scanner - для считывания текста с консоли
     * @return - строка переведенная в double формат
     */
    private static double checkDouble(String message, Scanner scanner) {
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

    /**
     * @param a         - первая переменная
     * @param b         - вторая переменная
     * @param operation - операция между двумя переменными
     * @return - возвращает резулятат операции между двумя переменными
     * @throws Exception - исключительная ситуация
     */
    private static double makeOperation(double a, double b, String operation) throws Exception {
        switch (operation) {
            case ("+"):
                return a + b;
            case ("-"):
                return a - b;
            case ("*"):
                return a * b;
            case ("/"):
                return a / b;
            default:
                throw new Exception("Ошибочка");
        }
    }
}
