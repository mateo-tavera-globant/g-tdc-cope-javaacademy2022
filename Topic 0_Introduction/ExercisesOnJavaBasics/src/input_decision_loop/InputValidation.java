/*
InputValidation
Mateo Tavera
1/18/2022
 */
package input_decision_loop;

import java.util.Scanner;

/** Write a program that prompts user for an integer between 0-10 or 90-100.
 *  The program shall read the input as int;
 *  and repeat until the user enters a valid input
 */

public class InputValidation {
    public static void main(String[] args) {

        //Input
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean isValid = false; //Assuming input is wrong

        //Using a Do-While loop to calculate:
        do {
            System.out.print("Enter a number between 0-10 or 90-100: ");
            number = scanner.nextInt();

            //Validating the number:
            if (((number >= 0) && (number < 11))
            || ((number >= 90) && (number < 101))){
                isValid = true;
                System.out.println("You have entered: " + number);
                scanner.close();
            }
            else{
                System.out.println("Invalid input, try again...\n");
            }
        } while (!isValid);





    }



}
