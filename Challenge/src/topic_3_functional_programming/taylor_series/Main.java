package topic_3_functional_programming.taylor_series;

import java.util.Scanner;
import java.util.function.BiFunction;

/**
 * This program represents the Taylor Series for function e^x:
 * X_VALUE = value which the function would be evaluated
 * N_TERMS = n first terms of the Taylor Series
 */
public class Main {


    public static void main(String[] args) {
        //Input
        Scanner scanner = new Scanner(System.in);

        System.out.println("\ne^x = 1 + x/1! + x^2/2! + x^3/3! +...+ x^n/n!");
        System.out.print("Input x value: ");
        final int X_VALUE = scanner.nextInt();
        System.out.print("Input n value: ");
        final int N_TERMS=scanner.nextInt();

        //Output
        Double result = expTaylor.apply(N_TERMS,X_VALUE,nFactorial, expTaylor);
        System.out.format("e^%d = %.4f",X_VALUE,result);//Round to 4 decimals

    }
    //Calculate Factorial using BiFunction interface and recursion
    static BiFunction<Integer,BiFunction,Double> nFactorial =
            (num,function) -> {
                return (num > 0) ?
                        (num * (Double) function.apply(num - 1, function)) : 1;
            };

    //Implementing QuadFunction interface and recursion to execute the Taylor series
    static QuadFunction<Integer,Integer,BiFunction,QuadFunction,Double> expTaylor = (n, x, factorial, exp)
            -> {
        return (n > 0) ? (Math.pow(x, n) /
                (Double) factorial.apply(n, factorial))
                + (Double) (exp.apply(n - 1, x,factorial, exp)) : 1;
    };

}
