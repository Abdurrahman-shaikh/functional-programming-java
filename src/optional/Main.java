package optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Object value = Optional.ofNullable("Hello")
                .orElseThrow(() -> new IllegalStateException("exception"));
        System.out.println(value);
        Optional.ofNullable(null)
                .ifPresentOrElse(email -> System.out.println("Sending email to " + email),
                        () -> System.out.println("can not send the email "));
    }
}
