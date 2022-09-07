package task_3.SweetBox;

public class Candy extends Sweet {
    String taste;

    public Candy(String name, double weight, double price, String taste) {
        super(name, weight, price);
        this.taste = taste;
    }
    @Override
    public String toString() {
        return super.toString() + " Вкус: " + taste;
    }
}
