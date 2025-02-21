package com.hakancivelek.lambdaExpressions.myPractices;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorPractices {
    public static void main(String[] args) {
        Collection<String> set = new HashSet<>();
        set.add("one");
        set.add("seven");
        set.add("eleven");
        set.add("twenty six");

        System.out.println("Before removing");
        System.out.println(set);

        Iterator<String> iterator = set.iterator();

//        set.add("fifty four"); // throws java.util.ConcurrentModificationException on next iterator using.
//        set.remove("fifty four"); // throws java.util.ConcurrentModificationException on next iterator using.

        while (iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
            if (str.startsWith("t")){
                iterator.remove();
            }
        }

        System.out.println("\nAfter removing");
        System.out.println(set);

        set.add("fifty four");

        iterator = set.iterator();

        System.out.println("\nAfter Correct adding");
        while (iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
            if (str.startsWith("t")){
                iterator.remove();
            }
        }
        System.out.println(set);

    }
}
