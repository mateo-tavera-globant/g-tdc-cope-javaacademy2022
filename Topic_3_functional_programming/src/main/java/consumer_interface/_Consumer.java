package consumer_interface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * A consumer is an operation which takes values and returns no result
 */
public class _Consumer {
    public static void main(String[] args) {
        //Using traditional method
        Customer maria = new Customer("Maria","786-3034-91");
        System.out.println("Using regular void method");
        greetCustomer(maria);

        //Using Consumer interface
        System.out.println("Using Consumer  interface");
        greetCustomerConsumer.accept(maria);

        //Using BiConsumer
        System.out.println("Using BiConsumer  interface");
        greetCustomerConsumer2.accept(maria,false);

    }

    static BiConsumer<Customer,Boolean>
            greetCustomerConsumer2 = (customer,showPhoneNumber) -> System.out.println("Hello "
            +customer.name+", thx for registering phone number "
            +(showPhoneNumber ? customer.phoneNumber : "*********")+"\n");

    static Consumer<Customer>
            greetCustomerConsumer = customer -> System.out.println("Hello "
            +customer.name+", thx for registering phone number "+customer.phoneNumber+"\n");


    static void greetCustomer(Customer customer){
        System.out.println("Hello "
                +customer.name+", thx for registering phone number "+customer.phoneNumber+"\n");
    }

}
