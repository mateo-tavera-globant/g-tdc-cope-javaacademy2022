package streams;

import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class _Stream {
    public static void main(String[] args) {

        List<People> people = List.of(
                new People("Gus","Male"),
                new People("Luis","Male"),
                new People("Natalia","Female"),
                new People("Mercedes","Female"),
                new People("Fito","Male")
        );

        people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet()).forEach(System.out::println);
        //First it maps or transforms the list only into gender field. Then we
        //collect the values into a set, removing duplicates, and finally we print

        Function<People, String> peopleStringFunction = person -> person.name;
        ToIntFunction<String> length = String::length;
        IntConsumer println = System.out::println;

        people.stream()
                .map(peopleStringFunction)
                .mapToInt(length)
                .forEach(println);

        //Another method
        Predicate<People> female = person -> person.gender.equals("Female");
        boolean containsOnlyFemales = people.stream()
                .anyMatch(female);
        System.out.println(containsOnlyFemales);



    }



}
