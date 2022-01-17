package getting_started;

public class CheckPassFaill {

    public static void main(String[] args) {
        // Write a program called CheckPassFail which prints "PASS"
        // if the int variable "mark" is more than or equal to 50; or prints "FAIL" otherwise.
        // The program shall always print “DONE” before exiting
        int mark = 0; //Try mark = 0, 49, 50, 51, 100

        if (mark >=50)
            System.out.println("PASS");
        else
            System.out.println("FAIL");

        System.out.println("DONE");
    }


    }
