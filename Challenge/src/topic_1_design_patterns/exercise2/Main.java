package topic_1_design_patterns.exercise2;

import java.util.Scanner;
/**
 * Using Observer pattern
 */
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
        Scanner scanner = new Scanner(System.in);//Create prompt input
        String menu = "";
        User user;

          while (!menu.equals("0")){
              System.out.println("Select the product you would like to subscribe to:");
              System.out.println("""
                    1. Product 1
                    2. Product 2
                    3. Product 3
                    0. Finish
                    """);
              menu = scanner.next();

              //Create a user
              //For the given users, add each one to the notification list
              switch (menu) {
                  case "1":
                      user = new User(product1);
                      product1.addObserver(user);//User has subscribed to product1
                      break;
                  case "2":
                      user = new User(product2);
                      product2.addObserver(user);//User has subscribed to product2
                      break;
                  case "3":
                      user = new User(product3);
                      product3.addObserver(user);//User has subscribed to product3
                      break;

                  default:
                      System.out.println("invalid option...");
                      break;
              }
           }

        //Output: change price and notify each subscriber
        product1.setPrice(NEW_PRICE_1);
        product2.setPrice(NEW_PRICE_2);
        product3.setPrice(NEW_PRICE_3);
    }
}
