/*
NumberPatternD
Mateo Tavera
1/18/2022
 */
package nested_loops;

import java.util.Scanner;

/** Program that prompts user for the size (a non-negative integer in int);
 * and prints the pattern as shown:
 * 8 7 6 5 4 3 2 1
 * 7 6 5 4 3 2 1
 * 5 4 3 2 1
 * 4 3 2 1
 * 3 2 1
 * 2 1
 * 1
 */

public class NumberPatternD {
    public static void main(String[] args) {
        //Input
        Scanner scanner = new Scanner(System.in);
        int size = 0;
        boolean isValid = false;

        //Validating the number:
        do{
            System.out.print("Input the size of the number pattern: ");
            size = scanner.nextInt();
            if (size > 0) {
                isValid = true;
                scanner.close();
            }
            else{
                System.out.println("Invalid input, try again...\n");
            }
        } while (!isValid);

        //Using two for loops
        for (int row = size; row > 0; row--){ //row = n,n-1,n-2...2,1

            for (int col = size; col > 0; col--) { ////col = n,n-1,n-2...2,1
                System.out.print(col + " ");
            }
            System.out.print("\n");
            size -= 1; //To reduce in one each iteration
        }
    }
}
