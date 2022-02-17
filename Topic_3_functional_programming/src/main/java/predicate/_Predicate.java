package predicate;

import java.util.function.Predicate;

/**
 *  Boolean valid function of one argument
 */
public class _Predicate {
    public static void main(String[] args) {

        System.out.println(isNumberValidByPredicate.test("07000000000"));
        System.out.println(isNumberValidByPredicate.test("070000003000"));

        //Using two predicates
        System.out.println(
                "Number is valid and contains number 3 = "+
                isNumberValidByPredicate.and(containsNumber3).test("07000000003")
        );

    }

    static Predicate<String> isNumberValidByPredicate = number ->
        number.startsWith("07") && number.length()==11;
    static Predicate<String> containsNumber3 = number ->
            number.contains("3");

}
