package functional;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomSortingQ3 {
    public static void main(String[] args) {
        /*
        Question: Given a list of Person objects, sort them by age in ascending order using streams.
         */
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35),
                new Person("Adair", 20)
        );

        people.stream()
                .sorted(Comparator.comparingInt(p -> p.age))
                .collect(Collectors.toList())
                .stream()
                .forEach(person -> System.out.println(person.toString()));
    }

    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return name + " (" + age + ")";
        }
    }
}
