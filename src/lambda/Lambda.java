package lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambda {
    public static void main(String[] args) {
        Service service = new Service();
        System.out.println(service.fun.apply("Azmi"));
        System.out.println(service.funV2.apply("Abdur",20));
    }

    static class Service {

        Function<String,String> fun = name -> {
            if (name.isBlank()) throw new IllegalStateException("please input name");
            return name.toUpperCase();
        };
        BiFunction<String,Integer,String> funV2 = (name,age) -> {
            if (name.isBlank()) throw new IllegalStateException("please input name");
            System.out.println(age);
            return name.toUpperCase();
        };
    }
}
