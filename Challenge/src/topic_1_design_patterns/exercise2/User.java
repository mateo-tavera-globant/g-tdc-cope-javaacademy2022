package topic_1_design_patterns.exercise2;


//Observer object
public class User implements Observer{

    private Product product;

     User(Product product) {
        this.product = product;
    }


    @Override
    public void update() {
        System.out.println(product.getName() + " price has changed to " + product.getPrice());
    }

}
