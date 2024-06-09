package sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorImpl {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person(30, "Alice"),
                new Person(25, "Bob"),
                new Person(35, "Charlie"),
                new Person(20, "Adair")
        );
        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.age - p2.age;
            }
        });
        System.out.println("~~~~~ Sorting according to person's age ~~~~~");
        personList.stream().forEach(person -> System.out.println(person.age + "=" + person.name));
        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.name.compareTo(p2.name);
            }
        });
        System.out.println("~~~~~ Sorting according to person's name ~~~~~");
        personList.stream().forEach(person -> System.out.println(person.name + "=" + person.age));
    }

    static class Person {
        int age;
        String name;
        public Person() {
        }
        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }
}
