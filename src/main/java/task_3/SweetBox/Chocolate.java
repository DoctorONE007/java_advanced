package task_3.SweetBox;

public class Chocolate extends Sweet {
    String country;
    public Chocolate(String name, double weight, double price, String country) {
        super(name, weight, price);
        this.country = country;
    }
    @Override
    public String toString() {
        return super.toString() + " Страна производства: " + country;
    }
}