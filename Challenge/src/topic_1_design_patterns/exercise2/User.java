package topic_1_design_patterns.exercise2;
//Observer object
public class User implements Observer{

    private Product1 product1;
    public User(Product1 product1) {
        this.product1 = product1;
    }

    @Override
    public void update() {
        System.out.println("Price has changed to " + product1.getPrice());


    }
}
