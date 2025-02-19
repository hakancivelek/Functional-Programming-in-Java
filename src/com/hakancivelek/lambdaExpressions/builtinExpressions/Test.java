package com.hakancivelek.lambdaExpressions.builtinExpressions;

import java.util.function.Function;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        Function<Integer, String> converter = num -> Integer.toString(num);
        System.out.println("Length of 157689974: " + converter.apply(157689974).length());

        Function<Integer, Integer> square = arg -> arg * arg;
        System.out.println(square.apply(7));
        System.out.println();

        Function<Integer, Double> sqrt = arg -> Math.sqrt(arg);
//        Function<Double, Double> sqrt = arg -> Math.sqrt(arg);
//        Function<Integer, Double> sqrt = Math::sqrt;
        System.out.println(sqrt.apply(81));
        System.out.println();

        Function<Integer, Boolean> isEven = arg -> arg % 2 == 0;
        System.out.println(isEven.apply(7));
        System.out.println(isEven.apply(8));

        Predicate<Integer> isEvenPredicate = arg -> arg % 2 == 0;
        System.out.println(isEvenPredicate.test(7));
        System.out.println(isEvenPredicate.test(8));
        System.out.println();

        Predicate<Integer> predicate = arg -> arg.equals(10);
        System.out.println(predicate.test(10));


    }
}
