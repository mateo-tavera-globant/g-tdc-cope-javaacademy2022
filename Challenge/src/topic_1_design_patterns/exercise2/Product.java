package topic_1_design_patterns.exercise2;

public class Product extends Subject {
    private int price;
    private String name;
    private int id;
    private static int count = 1;

    public Product(){
        this.setID(count);
        count++;
        name = "Product "+this.getID();
    }

    //ID Getter
    public int getID() {
        return id;
    }

    //ID Setter
    public void setID(int id){
        this.id = id;
    }


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
