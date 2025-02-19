package com.hakancivelek.lambdaExpressions.myPractices;

import java.util.function.Predicate;

public class PredicateComposition {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 11;
        int num3 = -10;
        int num4 = -11;

        Predicate<Integer> isEven = num -> num % 2 == 0;
        Predicate<Integer> isPositive = num -> num > 0;
        Predicate<Integer> isNegative = num -> num < 0;

        System.out.println(isEven.and(isPositive).test(10));
        System.out.println(isEven.and(isPositive).test(11));
        System.out.println(isEven.and(isPositive).test(-10));
        System.out.println(isEven.and(isPositive).test(-11));

        System.out.println();

        System.out.println(isEven.and(isNegative).test(10));
        System.out.println(isEven.and(isNegative).test(11));
        System.out.println(isEven.and(isNegative).test(-10));
        System.out.println(isEven.and(isNegative).test(-11));

        System.out.println();

        System.out.println(isEven.or(isPositive).test(10));
        System.out.println(isEven.or(isPositive).test(11));
        System.out.println(isEven.or(isPositive).test(-10));
        System.out.println(isEven.or(isPositive).test(-11));

        System.out.println();

        System.out.println(isEven.or(isNegative).test(10));
        System.out.println(isEven.or(isNegative).test(11));
        System.out.println(isEven.or(isNegative).test(-10));
        System.out.println(isEven.or(isNegative).test(-11));
    }
}
