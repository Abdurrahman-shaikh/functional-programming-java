package FunctionalInterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        //Using normal java function
        System.out.println(_Supplier.getDbConnection());
        //Using Functional Interface
        System.out.println(getDbConnection.get());

    }

    static String getDbConnection() {
        return "jdbc://localhost:5432/users";
    }

    static Supplier<List<String>> getDbConnection = () ->
            List.of(
                    "jdbc://localhost:5432/users",
                    "jdbc://localhost:5432/customers"
            );
}
