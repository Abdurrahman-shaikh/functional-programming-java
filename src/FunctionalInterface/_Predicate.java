package FunctionalInterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        //Without predicate
        System.out.println(isPhoneNoValid("9134567800"));
        //With predicate
        System.out.println(isValidPhoneNumber.test("9134567800"));
    }

    static boolean isPhoneNoValid(String phoneNumber) {
        return phoneNumber.startsWith("91") && phoneNumber.length() == 10;
    }

    static Predicate<String> isValidPhoneNumber = phoneNumber -> phoneNumber.startsWith("91") && phoneNumber.length() == 10;
}
