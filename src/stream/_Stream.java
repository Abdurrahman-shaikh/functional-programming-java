package stream;

import imperative.DeclarativeExample;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

import static stream._Stream.Gender.FEMALE;
import static stream._Stream.Gender.MALE;


public class _Stream {
    public static void main(String[] args) {
        List<Person> people =  List.of(
                new Person("John", MALE),
                new Person("Alexa", FEMALE),
                new Person("Smail", MALE),
                new Person("Alisha", FEMALE)
        );

//        people.stream()
//                .map(person -> person.name)
//                .mapToInt(String::length)
//                .forEach(System.out::println);

        boolean containsOnlyFemales = people.stream()
                .anyMatch(person -> FEMALE.equals(person.gender));
        System.out.println(containsOnlyFemales);

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
