package com.hakancivelek.lambdaExpressions.myPractices;

import java.util.function.Predicate;

public class PredicateComposition {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 11;
        int num3 = -10;
        int num4 = -11;

        Predicate<Integer> isEven = num -> {
            System.out.println("isEven");
            return num % 2 == 0;
        };

        Predicate<Integer> isPositive = num -> {
            System.out.println("isPositive");
            return num > 0;
        };

        Predicate<Integer> isNegative = num -> {
            System.out.println("isNegative");
            return num < 0;
        };

        System.out.println(isEven.and(isPositive).test(10));
        System.out.println();
        System.out.println(isEven.and(isPositive).test(11));
        System.out.println();
        System.out.println(isEven.and(isPositive).test(-10));
        System.out.println();
        System.out.println(isEven.and(isPositive).test(-11));

        System.out.println("\n-----------------\n");

        System.out.println(isEven.and(isNegative).test(10));
        System.out.println();
        System.out.println(isEven.and(isNegative).test(11));
        System.out.println();
        System.out.println(isEven.and(isNegative).test(-10));
        System.out.println();
        System.out.println(isEven.and(isNegative).test(-11));

        System.out.println("\n-----------------\n");

        System.out.println("isEvenOrIsPositive:\n");
        Predicate<Integer> isEvenOrIsPositive = isEven.or(isPositive);
        System.out.println(isEvenOrIsPositive.test(10));
        System.out.println();
        System.out.println(isEvenOrIsPositive.test(11));
        System.out.println();
        System.out.println(isEvenOrIsPositive.test(-10));
        System.out.println();
        System.out.println(isEvenOrIsPositive.test(-11));

        System.out.println("\n-----------------\n");

        System.out.println(isEven.or(isNegative).test(10));
        System.out.println();
        System.out.println(isEven.or(isNegative).test(11));
        System.out.println();
        System.out.println(isEven.or(isNegative).test(-10));
        System.out.println();
        System.out.println(isEven.or(isNegative).test(-11));
    }
}
