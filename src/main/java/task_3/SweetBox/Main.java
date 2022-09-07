package task_3.SweetBox;

public class Main {

    public static void main(String[] args) {
        Sweet chocolate = new Chocolate("Марс", 110, 54, "Марокко");
        Sweet cake = new Cake("Чизкейк", 1000, 1200, 15);
        Sweet candy = new Candy("Скитлз", 32, 85, "Яблочный");
        Sweet cookie = new Cookie("Вафли", 157, 68, 126);

        Box box = new Box();
        box.addSweet(chocolate);
        box.addSweet(cake);
        box.addSweet(candy);
        box.addSweet(cookie);

        box.printAllInfo();

    }
}