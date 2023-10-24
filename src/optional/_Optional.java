package optional;

import java.util.Optional;

public class _Optional {
    public static void main(String[] args) {
        Optional<String> empty = Optional.ofNullable("Hello");
        System.out.println(empty.isPresent());
        System.out.println(empty.isEmpty());
        System.out.println(empty
                .map(String::toUpperCase)
                .orElseGet(() -> "Azmi"));
    }

}
