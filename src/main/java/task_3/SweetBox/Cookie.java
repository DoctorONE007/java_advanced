package task_3.SweetBox;

public class Cookie extends Sweet{
    int calories;
    public Cookie(String name, double weight, double price, int calories) {
        super(name, weight, price);
        this.calories =calories;
    }
    @Override
    public String toString() {
        return super.toString() + " Калорийность: " + calories;
    }
}
