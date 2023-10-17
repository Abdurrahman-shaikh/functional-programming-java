package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static imperative.Main.Gender.FEMALE;
import static imperative.Main.Gender.MALE;

public class Main {
    public static void main(String[] args) {
        List<Person> people =  List.of(
            new Person("John", MALE),
            new Person("Alexa", FEMALE),
            new Person("Smail", MALE),
            new Person("Alisha", FEMALE)
        );

        //Imperative approach
        System.out.println("Imperative approach");
        List<Person> females = new ArrayList<>();
        for (Person person : people) {
            if (FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }
        for (Person female : females) {
            System.out.println(female);
        }

        //Declarative approach
        System.out.println("Declarative approach");
        List<Person> li = people.stream()
                .filter(person -> FEMALE.equals(person.gender))
                .collect(Collectors.toList());

        li.forEach(System.out::println);
    }
    static class Person {
        private final String name;
        private final Gender gender;

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }
    }
    enum Gender {
        MALE, FEMALE
    }
}