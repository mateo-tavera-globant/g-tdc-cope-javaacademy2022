package topic_1_design_patterns.exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Input
        final int NEW_PRICE_1 = 10;//New product1 price
        final int NEW_PRICE_2 = 20;//New product2 price
        final int NEW_PRICE_3 = 30;//New product3 price
        //Create the three products
        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();
        //Create the users
 //       Scanner scanner = new Scanner(System.in);//Create prompt input
//        String menu = "0";

//        while (!menu.equals("-1")){
//            User user = new User(product1);
//            System.out.println("Press 1 to user or press enter to end");
//            menu = scanner.next();
//        }



        User user1 = new User(product1);
        User user2 = new User(product2);
        User user3 = new User(product2);
        User user4 = new User(product3);
        //...and so on

        //For the given users, add each one to the notification list
        product1.addObserver(user1);//User1 has subscribed to product1
        product2.addObserver(user2);//User2 has subscribed to product2
        product2.addObserver(user3);//User3 has subscribed to product2
        product3.addObserver(user4);//User3 has subscribed to product2

        //Output: change price and notify each subscriber
        product1.setPrice(NEW_PRICE_1);
        product2.setPrice(NEW_PRICE_2);
        product3.setPrice(NEW_PRICE_3);





    }
}
