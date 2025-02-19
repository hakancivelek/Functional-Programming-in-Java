package com.hakancivelek.lambdaExpressions.myPractices;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiFunctionExamples {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Double> converter = (arg1, arg2) -> Double.parseDouble(arg1.toString() + "." + arg2.toString());
        System.out.println(converter.apply(123, 77));
        System.out.println(converter.apply(0, 54));
        System.out.println(converter.apply(0, 54) + converter.apply(0, 7));

        System.out.println();

        BiFunction<Integer, Integer, String> concat = (arg1, arg2) -> arg1.toString() + arg2.toString();
        System.out.println(concat.apply(43, 65));

        System.out.println();

        BiFunction<Integer, Integer, Boolean> ratherThan = (arg1, arg2) -> arg1 > arg2;
        System.out.println(ratherThan.apply(43, 65));
        System.out.println(ratherThan.apply(65, 43));

//        BiPredicate<Integer, Integer> ratherThanBiPredicate = (arg1, arg2) -> arg1 > arg2;
//        System.out.println(ratherThanBiPredicate.test(43, 65));
//        System.out.println(ratherThanBiPredicate.test(65, 43));

        System.out.println();

        BiFunction<Integer, Integer, Boolean> isEqual = (arg1, arg2) -> arg1 == arg2;
        System.out.println(isEqual.apply(43, 65));
        System.out.println(isEqual.apply(43, 43));

        System.out.println();

        BiFunction<Integer, Integer, Integer> power = (arg1, arg2) -> (int) Math.pow(arg1, arg2);
        System.out.println(power.apply(3, 4));
    }
}
