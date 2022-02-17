package functional_interface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {

        //Using traditional method calling
        int increment = incrementByOne(1);
        System.out.println(increment+" Using regular method calling");

        //But using the Function interface
        Function<Integer,Integer> incrementByOneFunction = number -> number+1;

        Integer incrementByFunction = incrementByOneFunction.apply(1);
        System.out.println(incrementByFunction+" Using Function interface");

        //Function inside a Function
        int multiply = multiplyBy10Function.apply(incrementByFunction);
        System.out.println(multiply+" Using func inside func");

        //Or combining functions together using .andThen
        Function<Integer, Integer>
                addByOneAndThenMultiplyBy10 = incrementByOneFunction.andThen(multiplyBy10Function);
        System.out.println(addByOneAndThenMultiplyBy10.apply(1)+" Using .andThen method");
        
        //BiFunction: two inputs, one output
        int addAndMultiply = addAndMultiplyByBiFunction.apply(4,100);
        System.out.println(addAndMultiply+" Using bi function");

    }

    static Function<Integer,Integer> multiplyBy10Function = number -> number*10;

    static BiFunction<Integer,Integer,Integer>
            addAndMultiplyByBiFunction = (number,multiple)->(number+1)*multiple;

    static int incrementByOne(int number){
        return number+1;

    }


}
