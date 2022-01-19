/*
GradesStatistics
Mateo Tavera
1/18/2022
 */
package array;

import java.util.Arrays;
import java.util.Scanner;

/** Write a program which prompts user for the number of students in a class
 *  (a non-negative integer), and saves it in an int variable called numStudents.
 *  It then prompts user for the grade of each of the students
 *  (integer between 0 to 100) and saves them in an int array called grades.
 *  The program shall then compute and print the average (in double rounded to 2 decimal places)
 *  and minimum/maximum (in int).
 */

public class GradesStatistics {
    public static void main(String[] args) {

        //Input
        Scanner scanner = new Scanner(System.in);
        int numStudents = 0;
        double average = 0;
        int minimum = 0;
        int maximum = 0;
        System.out.print("Enter the number of students: ");
        numStudents = scanner.nextInt();
        int [] grades = new int[numStudents];

        for (int grade = 0; grade < grades.length;grade++){
            System.out.print("Enter the grade for student " + (grade+1) + ": ");
            grades[grade] = scanner.nextInt();
        }

        Arrays.sort(grades);
        minimum = grades[0];
        maximum = grades[numStudents-1];
        average = Arrays.stream(grades).average().getAsDouble();//Calculating average
        average = (double) Math.round(average*100)/100; //Rounding to 2 decimals

        System.out.println("The average is: " + average);
        System.out.println("The minimum is: " + minimum);
        System.out.println("The maximum is: " + maximum);






    }
}
