package sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableImpl {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person(30, "Alice"),
                new Person(25, "Bob"),
                new Person(35, "Charlie"),
                new Person(20, "Adair")
        );

        Collections.sort(personList);

        personList.stream().forEach(person -> System.out.println(person.age + "=" + person.name));
    }

    static class Person implements Comparable<Person> {
        int age;
        String name;
        public Person() {
        }
        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }
        @Override
        public int compareTo(Person p) {
            return this.age - p.age;
        }
    }
}
