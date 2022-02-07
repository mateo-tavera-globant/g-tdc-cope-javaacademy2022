package topic_1_design_patterns.exercise2;


//Observer object
public class User implements Observer{

    private Product product;
    private int id;
    private static int count = 1;

     User(Product product) {
        this.product = product;
        this.setId(count);
         count++;
         //name = "Product "+this.getID();
    }


    @Override
    public void update() {
        System.out.println("Hey user"+getId()+"! the "+product.getName() + " costs now only $" + product.getPrice());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
