/*
HarmonicSum
Mateo Tavera
1/17/2022
 */
package decision_and_loop;
/** Write a program called HarmonicSum to compute the sum of a harmonic series,
 *  as shown below, where n=50000. The program shall compute the sum from left-to-right
 *  as well as from the right-to-left. Are the two sums the same? Obtain
 *  the absolute difference between these two sums and explain the difference.
 *  Which sum is more accurate?
 */
public class HarmonicSum {

    public static void main(String[] args) {
       // Input
        final int MAX_DENOMINATOR = 50000;  // Use a more meaningful name instead of n
        double sumL2R = 0.0;         // Sum from left-to-right
        double sumR2L = 0.0;         // Sum from right-to-left
        double absDiff;              // Absolute difference between the two sums

        //Calculating sum form left to right
        for (int denominator = 1; denominator <= MAX_DENOMINATOR; ++denominator) {
            sumL2R += 1/(float)denominator;

        }


        //Calculating sum form right to left
        for (int denominator = MAX_DENOMINATOR; denominator>=1 ;--denominator) {
            sumR2L += 1/(float)denominator;

        }

        //Output
        System.out.println("The sum from left-to-right is:  " + sumL2R);
        System.out.println("The sum from right-to-left is:  " + sumR2L);

        // Find the absolute difference and display
        if (sumL2R > sumR2L){
            absDiff = sumL2R - sumR2L;
        }
        else{
            absDiff = sumR2L - sumL2R;
        }
        System.out.println("The absolute difference is:  " + absDiff);
    }
}
