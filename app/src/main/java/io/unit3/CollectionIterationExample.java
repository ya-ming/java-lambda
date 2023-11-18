package io.unit3;

import java.util.Arrays;
import java.util.List;

import io.lambda.common.Person;

public class CollectionIterationExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39));

        System.out.println("Using for loop");
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }

        System.out.println("Using for each loop");
        for (Person person : people) {
            System.out.println(person);
        }

        System.out.println("Using iterable forEach");
        people.forEach(System.out::println);

        System.out.println("Using stream");
        people.stream().filter(p -> p.getFirstName().startsWith("C")).forEach(System.out::println);
    }

}
