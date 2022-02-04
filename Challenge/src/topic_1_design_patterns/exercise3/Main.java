/*
Mateo Tavera
02/03/2022
HotDogDecorator
 */
package topic_1_design_patterns.exercise3;

import java.util.Scanner;

/**
 * Using Decorator to write a program which customizes a hot dog sale with different toppings.
 * There is a basic Hot dog, and we add an undetermined number of toppings
 * Finally is printed all toppings added in the respective order
 */
public class Main {
    public static void main(String[] args) {

        //Input
        Scanner scanner = new Scanner(System.in);
        HotDog hotDog = new BasicHotDog();
        String menu = "";

        //Using while loop to create a menu
        while (!(menu.equals("0"))){
            System.out.println("Select the option:");
            System.out.println("""
                    1. Add extra bacon
                    2. Add extra chips
                    3. Add extra sauce
                    4. Add extra pineapple
                    0. Finish
                    """);
            menu = scanner.next();
            switch (menu) {
                case "1" -> hotDog = new ExtraBacon(hotDog);
                case "2" -> hotDog = new ExtraChips(hotDog);
                case "3" -> hotDog = new ExtraSauce(hotDog);
                case "4" -> hotDog = new ExtraPineapple(hotDog);
                default -> System.out.println("invalid option...");
            }

        }

        //Output layout
        System.out.println("\nYour order is: " + hotDog.getIngredients());
        System.out.println("\nYour ticket is \nBun and sausage with:");
        int totalToppings = ToppingDecorator.toppings.size()-1;
        //Using an id statement print results
        if (totalToppings>0) {
            //Using reverse for loop to print toppings in order
            for (int topping = totalToppings; topping >= 0; topping--) {
                System.out.println("-" + ToppingDecorator.toppings.get(topping));
            }
        }
        else
            System.out.println("-No adds");
    }
}
