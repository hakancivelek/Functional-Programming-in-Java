package com.hakancivelek.lambdaExamples.twoNumbersCalculator;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    private static int total = 0;
    private static int product = 1;
    private static List<Integer> squares = new ArrayList<>(5);

    public static void main(String[] args) {
        EvenNumberOperation printer = (arg) -> {
            System.out.print(arg + " ");
        };
        pickEvenNumber(10, printer);

        System.out.println();

        pickEvenNumber(10, (arg) -> total += arg);
        System.out.println("Total : " + total);

        pickEvenNumber(10, (arg) -> product *= arg);
        System.out.println("Product : " + product);

        pickEvenNumber(10, (arg) -> {
            squares.add(arg * arg);
        });
        System.out.println("Squares : " + squares);
    }

    public static void pickEvenNumber(int arg, EvenNumberOperation operation) {
        for (int i = 2; i <= arg; i += 2) {
            operation.operate(i);
        }
    }
}
