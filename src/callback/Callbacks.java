package callback;

import java.util.function.Consumer;

public class Callbacks {
    public static void main(String[] args) {
        hello(
                "Abdur",null,value ->
                        System.out.println("No lastName provided for " + value));
        helloV2(
                "Abdur",null,() ->
                        System.out.println("No lastName provided"));

    }

    static void hello(String firstName, String lastName, Consumer<String> callBack) {
        System.out.println(firstName);
        if(lastName != null) System.out.println(lastName);
        else callBack.accept(firstName);
    }
    static void helloV2(String firstName, String lastName, Runnable callBack) {
        System.out.println(firstName);
        if(lastName != null) System.out.println(lastName);
        else callBack.run();
    }

//    function hello(firstName,lastName,callBack) {
//        console.log(firstname);
//        if (lastName) {
//            console.log(lastName)
//        } else {
//            callback();
//        }
//    }
//    hello("Azmi",null,function() {console.log("no lastName provided")});

}
