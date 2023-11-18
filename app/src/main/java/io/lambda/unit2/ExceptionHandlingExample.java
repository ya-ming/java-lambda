package io.lambda.unit2;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        int[] someNumbers = { 1, 2, 3, 4 };
        int key = 0;

        try {
            process(someNumbers, key, wrapperLambda((v, k) -> System.out.println(v / k)));
        } catch (ArithmeticException e) {
            System.out.println("An Arithmetic exception happend");
        }

    }

    private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
        for (int i : someNumbers) {
            consumer.accept(i, key);
        }
    }

    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
        return (v, k) -> {
            try {
                consumer.accept(v, k);
            } catch (ArithmeticException e) {
                System.out.println("An Arithmetic exception happend");
            }
        };
    }
}
