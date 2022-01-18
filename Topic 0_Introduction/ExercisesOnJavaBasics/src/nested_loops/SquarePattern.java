/*
SquarePattern
Mateo Tavera
1/17/2022
 */
package nested_loops;

import java.util.Scanner;

/** Write a program called SquarePattern that prompts user for the size
 * (a non-negative integer in int); and prints the following
 * square pattern using two nested for-loops.
 */
public class SquarePattern {

    public static void main(String[] args) {

        //Input
        Scanner scanner = new Scanner(System.in);
        int size = 0;
        boolean isValid = false;

        //Validating the number:
        do{
            System.out.print("Input the size of the (nxn) square pattern: ");
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
        for (int row = 0; row < size; row++){ //Printing in the x axis

            for (int col = 0; col < size; col++) { //Printing in the y axis
                System.out.print("#");
            }
            System.out.print("\n");
        }



    }
}
