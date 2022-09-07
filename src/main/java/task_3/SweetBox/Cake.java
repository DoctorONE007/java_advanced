package task_3.SweetBox;

public class Cake extends Sweet {
    int radius;

    public Cake(String name, double weight, double price, int radius) {
        super(name, weight, price);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() + " Радиус: " + radius;
    }
}