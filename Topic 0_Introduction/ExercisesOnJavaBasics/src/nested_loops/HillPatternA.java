/*
HillPatternA
Mateo Tavera
1/18/2022
 */
package nested_loops;

import java.util.Scanner;

/** Write a program that prompts user for the size (a non-negative integer in int);
 * and prints the pattern as shown:
 *           #
 *         # # #
 *       # # # # #
 *     # # # # # # #
 *   # # # # # # # # #
 * # # # # # # # # # # #
 *
 */
public class HillPatternA {

    public static void main(String[] args) {
        //Input
        Scanner scanner = new Scanner(System.in);
        int height = 0;
        int sum = 0;
        boolean isValid = false;

        //Validating the number:
        do{
            System.out.print("Input the height of the hill pattern: ");
            height = scanner.nextInt();
            if (height > 0) {
                isValid = true;
                scanner.close();
            }
            else{
                System.out.println("Invalid input, try again...\n");
            }
        } while (!isValid);

        for (int row = 0; row < height; row++){

            int numCol = (height*2) - 1;

            for (int col = 0; col < numCol; col++) { //col = 0, 1 ,2 ... numCol
                if ((col + row >= height-1) && (col<height)){ //First half of the hill
                    System.out.print("#");
                }
                else if ((col-row <= height-1) && (col >= height)){ //Seconf half of the hill
                    System.out.print("#");
                }
                else{
                    System.out.print(" ");
                }
            }
                 System.out.print("\n");

        }

    }
}
