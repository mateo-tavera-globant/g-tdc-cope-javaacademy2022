package introduction;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<People> people = List.of(
                new People("Gus","Male"),
                new People("Luis","Male"),
                new People("Natalia","Female"),
                new People("Mercedes","Female"),
                new People("Fito","Male")
                );

        //Using declarative approach

        Predicate<People> femalePredicate = person -> person.getGender().equals("Female");
        //Predicate is a boolean function  with one input
        people.stream()
                .filter(femalePredicate)
                .collect((Collectors.toList()))
                .forEach(System.out::println);
        }

    }

