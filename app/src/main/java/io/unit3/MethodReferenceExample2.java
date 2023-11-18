package io.unit3;

import java.util.Arrays;
import java.util.List;

import java.util.function.Predicate;
import java.util.function.Consumer;

import io.lambda.common.Person;

public class MethodReferenceExample2 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39));

        performConditionally(people, p -> true, p -> System.out.println(p));

        performConditionally(people, p -> true, System.out::println);
    }

    private static void performConditionally(List<Person> people, Predicate<Person> predicate,
            Consumer<Person> consumer) {
        for (Person person : people) {
            if (predicate.test(person)) {
                consumer.accept(person);
            }
        }
    }
}