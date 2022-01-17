/*
SumAverageRunningInt
Mateo Tavera
1/17/2022
 */
package decision_and_loop;
/** Write a program called SumAverageRunningInt to produce the sum of 1, 2, 3, ..., to n.
 */
public class SumAverageRunningInt {

    public static void main(String[] args) {

        //Input
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 5;
        int sumFor = 0;
        int sumSquareFor = 0;
        float average = 0;
        int sumOdd = 0;
        int sumEven = 0;
        int absDiff = 0;
        int count = 0; //For the average calculation

        //Using a For Loop to calculate sum from LOWERBOUND to UPPERBOUND
        for (int i = LOWERBOUND; i <= UPPERBOUND; i++) {
            sumFor = sumFor + i;
            sumSquareFor += Math.pow(i,i);
            count++;
            //Calculate de Odd sum
            if (i % 2 == 0){
                sumEven += i;
            }
            else{
                sumOdd += i;
            }
        }
        //Calculate average
        average = (float) sumFor / (float)(count);

        //Calculate absolute difference
        if (sumOdd < sumEven ){
            absDiff = sumEven - sumOdd;
        }
        else
            absDiff = sumOdd - sumEven;

        //Output
        System.out.println("Using For Loop:");
        System.out.println("The sum of " + LOWERBOUND + " to " + UPPERBOUND + " is " + sumFor);
        System.out.println("The sum of the even numbers is " + sumEven);
        System.out.println("The sum of the odd numbers is " + sumOdd);
        System.out.println("The average is " + average);

        System.out.println("The sum of the squares is " + sumSquareFor + "\n");


        //Using a While Loop to calculate sum from LOWERBOUND to UPPERBOUND
        int i = LOWERBOUND; //Set index for the while loop
        int sumWhile = 0;
        int sumSquaresWhile = 0;
        count = 0; //Reset counter

        while (i <= UPPERBOUND) {
            sumWhile = sumWhile + i;
            sumSquaresWhile += Math.pow(i,i);
            count++;
            i++;
        }

        //Calculate average
        average = (float) sumWhile / (float) count;

        //Output
        System.out.println("Using While Loop:");
        System.out.println("The sum of " + LOWERBOUND + " to " + UPPERBOUND + " is " + sumWhile);
        System.out.println("The average is " + average);
        System.out.println("The sum of the squares is " + sumSquaresWhile + "\n");



    //Using a Do-While Loop to calculate sum from LOWERBOUND to UPPERBOUND
     i = LOWERBOUND; //Set index for the do-while loop
    int sumDoWhile = 0;
    int sumSquaresDoWhile = 0;
    count = 0; //Reset counter

    do {
        sumDoWhile += i;
        sumSquaresDoWhile += Math.pow(i,i);
        count++;
        ++i;
    } while (i <= UPPERBOUND);

    //Calculate average
    average =(float)sumDoWhile /(float)(count);

    //Output
        System.out.println("Using Do-While Loop:");
        System.out.println("The sum of "+LOWERBOUND +" to "+UPPERBOUND +" is "+sumDoWhile);
        System.out.println("The average is " + average);
        System.out.println("The sum of the squares is " + sumSquaresDoWhile + "\n");
    }

    /** What is the difference between "for" and "while-do" loops?
     *
     * answer: For loops we know the number of iteretions te programs should do,
     * but in While loops, the iterations are done according to a boolean parameter and we
     * usually don't know how many times
     *
     * What is the difference between "while-do" and "do-while" loops?
     *
     * answer: A while-do loop may not do any iteration, but with the do-while,
     * we make at least one iteration
     */
}


