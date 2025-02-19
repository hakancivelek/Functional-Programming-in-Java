package com.hakancivelek.lambdaExpressions.myPractices;

import java.util.function.Function;

public class FunctionComposition {
    public static void main(String[] args) {
        int i = 5;

        System.out.println("Before andThen");
        Function<Integer, Integer> twice = arg -> arg * 2;
        Function<Integer, Integer> square = arg -> arg * arg;
        int result = twice.apply(i);
        result = square.apply(result);
        System.out.println("Result: " + result);

        System.out.println("\nAfter andThen");

        Function<Integer, Integer> twiceThenSquare = twice.andThen(square);
        System.out.println(twiceThenSquare.apply(i));
    }
}
