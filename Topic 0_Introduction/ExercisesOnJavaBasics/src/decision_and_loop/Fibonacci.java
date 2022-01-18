/*
Fibonacci
Mateo Tavera
1/17/2022
 */
package decision_and_loop;
/** Write a program called Fibonacci to print the first 20 Fibonacci numbers F(n),
 * where F(n)=F(n–1)+F(n–2) and F(1)=F(2)=1. Also compute their average.
 */

public class Fibonacci {

    public static void main(String[] args) {

        //Input
        int fn;             // F(n) to be computed
        int fnMinus1 = 1;   // F(n-1), init to F(2)
        int fnMinus2 = 1;   // F(n-2), init to F(1)
        int nMax = 20;      // maximum n, inclusive
        int sum = fnMinus1 + fnMinus2;  // Need sum to compute average
        double average;

        //Initiating the output
        System.out.println("The first 20 Fibonacci numbers are: ");
        System.out.print(fnMinus1 + ", " + fnMinus2 + ", ");

        //Using for loop to calculate the sequence
        for (int n = 3;n <= nMax; n++){
            fn = fnMinus1 + fnMinus2;
            fnMinus2 = fnMinus1;
            fnMinus1 = fn;
            sum += fn;
            System.out.print(fn + ", " );
        }

        // Calculating the average
        average = (float)sum/nMax;

        //Output
        System.out.println("\n" + "The average is: " + average);
    }
}
