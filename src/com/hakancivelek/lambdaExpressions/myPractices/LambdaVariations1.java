package com.hakancivelek.lambdaExpressions.myPractices;

import java.util.Date;

public class LambdaVariations1 {
    public static void main(String[] args) {
        System.out.println("Interface1 Examples:\n");
        Interface1 interface1 = () -> System.out.println("Hi I'm interface1 :)");
        interface1.f();
        Interface1 interface2 = () -> System.out.println("Date: " + new Date());
        interface2.f();
        Interface1 interface3 = () -> {
        };
        interface3.f();
//        interface3.f1();
        Interface1.f1();

        System.out.println();

        System.out.println("Interface2 Examples:\n");
        Interface2 interface4 = (arg1, arg2) -> {
            return arg1 + arg2;
        };
        System.out.println(interface4.f(4, 3));
        interface4.f1();

        Interface2 interface5 = (double arg1, double arg2) -> {
            return arg1 * arg2;
        };
        System.out.println(interface5.f(4, 3));

        System.out.println();

        System.out.println("Interface3 Examples:\n");
        Interface3 interface6 = (arg1) -> {
            return (int) Math.pow(arg1, 3);
        };
        System.out.println(interface6.f(4));

        Interface3 interface7 = (arg1) -> (int) Math.sqrt(arg1);
        System.out.println(interface7.f(4));

        System.out.println();

        System.out.println("Interface4 Examples:\n");
        Interface4 interface8 = (arg1, arg2) -> {
            if (arg1 < arg2) {
                return -1;
            } else if (arg1 > arg2) {
                return 1;
            } else return 0;
        };
        System.out.println(interface8.f(4, 7));

        System.out.println();

        System.out.println("Interface5 Examples:\n");
        System.out.println(new Interface5() {
            @Override
            public String f(String name) {
                return "I love " + name;
            }
        }.f("JAVA!"));
        Interface5 interface9 = (name) -> "My name is " + name;
        System.out.println(interface9.f("Hakan!"));
    }
}

@FunctionalInterface
interface Interface1 {
    void f();

    static void f1() {
        System.out.println("I'm a static method in @FunctionalInterface :)");
    }
}

//@FunctionalInterface
interface Interface2 {
    double f(double arg1, double arg2);

    default void f1(){
        System.out.println("I'm a default method in @FunctionalInterface :)");
    }
}

@FunctionalInterface
interface Interface3 {
    int f(int arg);
}

@FunctionalInterface
interface Interface4 {
    int f(int arg1, int arg2);
}

@FunctionalInterface
interface Interface5 {
    String f(String name);
}

