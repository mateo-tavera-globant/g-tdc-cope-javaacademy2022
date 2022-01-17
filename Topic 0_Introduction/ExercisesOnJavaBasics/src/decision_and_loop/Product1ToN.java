/*
Product1ToN
Mateo Tavera
1/17/2022
 */
package decision_and_loop;
/** Write a program called Product1ToN to compute the product of integers from 1 to 10
 *  (i.e., 1×2×3×...×10), as an int. Take note that It is the same as factorial of N
 */

public class Product1ToN {

    public static void main(String[] args) {

        // Input
        long product = 1;      // The accumulated product, init to 1
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 14;

        // Usinf For Loop to calculate the factorial
        for (int i = LOWERBOUND; i <= UPPERBOUND; i++) {
            product *= i;
        }
        System.out.println(UPPERBOUND + "! = " + product);

    }


}
