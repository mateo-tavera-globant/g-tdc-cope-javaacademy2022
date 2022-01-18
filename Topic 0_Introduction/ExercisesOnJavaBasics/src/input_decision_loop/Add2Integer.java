/*
Add2Integer
Mateo Tavera
1/17/2022
 */
package input_decision_loop;

import java.util.Scanner;

/** Write a program called Add2Integers that prompts user to enter two integers.
 * The program shall read the two integers as int; compute their sum; and print the result.
 */
public class Add2Integer {
    public static void main(String[] args) {

       //Input
        Scanner scanner = new Scanner(System.in); // initiate the input keyboard
        System.out.print("Enter first integer: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int number2 = scanner.nextInt();
        int sum = number1 + number2;
        scanner.close();

        //Output
        System.out.println("The sum is: " + sum);




    }
}
