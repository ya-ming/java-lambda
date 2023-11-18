package io.lambda.unit1;

import java.util.List;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Predicate;

import io.lambda.common.Person;

public class Unit1ExerciseSolutionJava8 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39));

        // Step 1: Sort list by last name
        Collections.sort(people, (Person p1, Person p2) -> p1.getLastName().compareTo(p2.getLastName()));

        // Step 2: Create a method that prints all elements in the list
        printConditionally(people, (Person p) -> true);

        // Step 3: Create a method that prints all people that have last name beginning
        // with C
        printConditionally(people, (Person p) -> p.getLastName().startsWith("C"));

        printConditionally(people, (Person p) -> p.getFirstName().startsWith("C"));

        printConditionallyPredicate(people, (Person p) -> p.getFirstName().startsWith("C"));
    }

    private static void printConditionally(List<Person> people, Condition condition) {
        for (Person person : people) {
            if (condition.test(person)) {
                System.out.println(person);
            }
        }
    }

    private static void printConditionallyPredicate(List<Person> people, Predicate<Person> predicate) {
        for (Person person : people) {
            if (predicate.test(person)) {
                System.out.println(person);
            }
        }
    }
}