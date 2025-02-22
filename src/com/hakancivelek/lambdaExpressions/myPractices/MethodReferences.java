package com.hakancivelek.lambdaExpressions.myPractices;

import java.util.Date;
import java.util.function.*;

public class MethodReferences {
    public static void main(String[] args) {
        examples();
        examples2();
    }

    private static void examples() {
        Consumer<String> printer1 = s1 -> System.out.print(s1);
        printer1.accept("Hello Shorty. ");

        Consumer<String> printer2 = System.out::println;
        printer2.accept("What are you doing?.");

        System.out.println();

        Supplier<Long> now = System::currentTimeMillis;
        System.out.println("Current millis: " + now.get());
        System.out.println("Current date: " + new Date(now.get()));

        System.out.println();

        Person hakan = new Person(7, "Hakan", "Civelek", 32);
        Consumer<Person> printInfoPerson1 = book -> book.printInfo();
        printInfoPerson1.accept(hakan);

        Consumer<Person> printInfoPerson2 = Person::printInfo;
        printInfoPerson2.accept(hakan);

        System.out.println();

        Supplier<Date> date1 = () -> new Date();
        System.out.println(date1.get());

        Supplier<Date> date2 = Date::new;
        System.out.println(date2.get());

        System.out.println();

        UnaryOperator<String> concat = "Hello "::concat;
        System.out.println(concat.apply("Shorty"));
        System.out.println();
    }

    private static void examples2() {
//        Supplier<A> a = A::new(5);

        Function<Integer, A> aFunction = A::new;
        System.out.println(aFunction.apply(7).i);

        A a = new A(5);
        Consumer<Boolean> booleanConsumer = a::f1;
        booleanConsumer.accept(true);

//        Consumer<Boolean> aConsumer2 = a::f2;
//        aConsumer2.accept(true);

        Consumer<Boolean> aStaticConsumer1 = A::ff1;
        aStaticConsumer1.accept(true);

//		Consumer<Boolean> aStaticConsumer2 = A::ff2;
//		aStaticConsumer2.accept(true);

        BiConsumer<Boolean, String> aStaticConsumer2 = A::ff2;
        aStaticConsumer2.accept(true, "selam");
    }
}

class A {
    int i;

    public A(int i) {
        this.i = i;
    }

    public void f1(boolean b) {

    }

    public void f2(boolean b, String s) {

    }

    static void ff1(boolean b) {

    }

    static void ff2(boolean b, String s) {

    }
}
