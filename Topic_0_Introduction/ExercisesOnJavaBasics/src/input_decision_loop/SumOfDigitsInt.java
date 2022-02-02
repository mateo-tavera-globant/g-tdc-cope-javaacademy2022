/*
SumOfDigitsInt
Mateo Tavera
1/17/2022
 */
package input_decision_loop;

import java.util.Scanner;

/** Write a program that prompts user for a positive integer.
 * The program shall read the input as int; compute and print the sum of all its digits
 */
public class SumOfDigitsInt {

    public static void main(String[] args) {

        //Input
        System.out.print("Input a positive integer: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int digit = 0;
        int sum = 0;
        scanner.close();

        //Calculating the sum with a While loop
        while (number>0){
            digit = number % 10;//Get the less significant digit
            sum += digit;
            number /= 10;// reduce the number
        }
        System.out.println("The sum of the digits is: " + sum);

    }
}
