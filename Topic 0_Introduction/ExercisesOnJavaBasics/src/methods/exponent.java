/*
exponent
Mateo Tavera
1/18/2022
 */
package methods;

import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

/** Write a method called exponent(int base, int exp) that returns
 * an int value of base raises to the power of exp.
 */

public class exponent {
    public static void main(String[] args) {

        //Input
        int exp = 0;
        int base = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write the base: ");
        base = scanner.nextInt();
        System.out.print("Write the exponent: ");
        exp = scanner.nextInt();
        scanner.close();

        //Output calling the method
        System.out.println(base + "^" + exp + " = " + exponent(base,exp));
        System.out.println(Integer.MAX_VALUE);
    }

    public static int exponent(int base, int exp) {
        int product = 1; //Create variable
        product = (int)Math.pow(base,exp); //Calculate
        return product; //Output
    }


}
