package FunctionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = increment(0);
        System.out.println(increment);
        int increment2 = increamentByOneFunction.apply(3);
        System.out.println(increment2);
        int mul = multilpyBy10Function.apply(increment2);
        System.out.println(mul);

        Function<Integer, Integer> storeTheFun = increamentByOneFunction.andThen(multilpyBy10Function);
        System.out.println(storeTheFun.apply(5));
        System.out.println(incrementByOneAndMultiply(1,4));
        System.out.println(incrementByOneAndMultiplyByFunction.apply(1,4));
    }

    static Function<Integer, Integer> increamentByOneFunction =
            number -> number + 1;
    static Function<Integer, Integer> multilpyBy10Function =
            number -> number * 10;
    static int increment(int number) {
        return number + 1;
    }

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyByFunction =
            (numberToIncrement, numberToMultiply)
                    -> (numberToIncrement + 1) * numberToMultiply;

    static int incrementByOneAndMultiply(int number, int numToMultiply) {
        return (number + 1) * numToMultiply;
    }
}