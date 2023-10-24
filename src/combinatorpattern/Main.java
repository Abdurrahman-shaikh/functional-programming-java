package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Azmi",
                "azmi@mail.com",
                "r914567890",
                LocalDate.of(2000,12,12)
        );
//        CustomerValidatorService customerValidatorService = new CustomerValidatorService();
//        System.out.println(customerValidatorService.isValid(customer));
        ValidationResult result = isEmailValid()
                .and(isValidPhone())
                .and(isAdult())
                .apply(customer);

        System.out.println(result);
        if (result != ValidationResult.SUCCESS) {
            throw new IllegalStateException(result.name());
        }
    }
}
