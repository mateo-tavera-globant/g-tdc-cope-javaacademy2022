package topic_1_design_patterns.exercise2;

public class Product1 extends Subject {

    private int price;
    private String name = "Product 1";


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
        notifyObservers();
    }

    public String getName() {
        return name;
    }

}
