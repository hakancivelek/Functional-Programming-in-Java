package com.hakancivelek.lambdaExpressions.myPractices;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BuiltinExamples {
    public static void main(String[] args) {
        Consumer<String> lowerCaseConsumer = s -> System.out.println(s.toLowerCase());
        lowerCaseConsumer.accept("TestasSDDWvcxfsdErLdw");

        Consumer<String> printer = System.out::println;
        printer.accept("I love Java!");

        BiConsumer<String,String> concat =(str1, str2) -> System.out.println(str1 + str2);
        concat.accept("Hakan ",  "Civelek");
    }
}
