package getting_started;

public class CheckOddEven {

    public static void main(String[] args) {
        //Write a program called CheckOddEven which prints "Odd Number"
        // if the int variable “number” is odd, or “Even Number” otherwise.
        // The program shall always print “bye!” before exiting.

        int number = 5; // Try number = 0, 1, 88, 99, -1, -2

        if (number%2==0)
            System.out.println(number + " is an even number");
        else
            System.out.println(number + " is an odd number");

        System.out.println("bye!");

    }



}
