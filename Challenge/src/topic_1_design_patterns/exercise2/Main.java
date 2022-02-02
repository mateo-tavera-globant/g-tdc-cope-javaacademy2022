package topic_1_design_patterns.exercise2;

public class Main {
    public static void main(String[] args) {

        //Input
    final int NEW_PRICE_1 = 20;
        Product1 product1 = new Product1();
        User user1 = new User(product1);
        User user2 = new User(product1);
        User user3 = new User(product1);

        //For the given users, add each one to the notification list
        product1.addObserver(user1);
        product1.addObserver(user2);
        product1.addObserver(user3);

        //Output: change price and notify each subscriber
        product1.setPrice(NEW_PRICE_1);



    }
}
