package FunctionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

import static FunctionalInterface._Consumer.Customer.greet;

public class _Consumer {
    public static void main(String[] args) {
        //using normal java function
        Customer azmi = new Customer("Azmi","34567");
        greet(azmi);
        //using functional interface
        greetCustomer.accept(azmi);
        greetCustomerV2.accept(azmi,false);
    }

    static Consumer<Customer> greetCustomer = customer -> System.out.println(
            "Hello " + customer.customerName
                    + " Thanks for registering "
                    + customer.customerPhoneNumber
    );static BiConsumer<Customer,Boolean> greetCustomerV2 = (customer,showPhoneNumber) -> System.out.println(
            "Hello " + customer.customerName
                    + " Thanks for registering "
                    + (showPhoneNumber ? customer.customerPhoneNumber : "**********")
    );

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;
        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }

        public static void greet(Customer customer) {
            System.out.println(
                    "Hello " + customer.customerName
                            + " Thanks for registering "
                            + customer.customerPhoneNumber
            );
        }
    }
}
