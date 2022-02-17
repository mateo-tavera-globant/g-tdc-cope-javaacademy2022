package combinator_pattern;

import com.sun.net.httpserver.Authenticator;

import java.time.LocalDate;

import static combinator_pattern.CustomerRegistrationValidator.ValidationResult.SUCCESS;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("Alice",
                                         "alice@gmail.com",
                                         "1233456",
                                         LocalDate.of(2000,1,1)) ;

        //Using combinator pattern
        CustomerRegistrationValidator result = CustomerRegistrationValidator
                .isEmailValid()
                .and(CustomerRegistrationValidator.isPhoneNumberValid())
                .and(CustomerRegistrationValidator.isAdult())
                .and((CustomerRegistrationValidator) customer);

        System.out.println(result);

    }
}
