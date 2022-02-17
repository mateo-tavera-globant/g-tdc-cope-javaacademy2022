package optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        Optional.ofNullable("mateo.tavera@gmail.com")
                .ifPresentOrElse(
                        email-> System.out.println("Sending email to "+email),
                        ()-> System.out.println("Cannot sent email")
                );



    }
}
