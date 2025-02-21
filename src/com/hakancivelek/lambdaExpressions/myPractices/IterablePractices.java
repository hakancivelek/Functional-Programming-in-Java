package com.hakancivelek.lambdaExpressions.myPractices;

import java.util.Collection;
import java.util.Iterator;

public class IterablePractices {
    public static void main(String[] args) {
        Collection<String> strings = CollectionUtil.getCollection();

        System.out.println("Elements");
        for (String str : strings) {
            System.out.println(str);
        }

        iterate(strings);
        forEach(strings);
    }

    public static void iterate(Iterable<String>  iterable) {
        System.out.println("\niterate():");
        Iterator<String> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str + " has " + str.length() + " character!");
        }
    }

    public static void forEach(Iterable<String> iterable) {
        System.out.println("\nforEach():");
        iterable.forEach(str ->
                System.out.println(str + " has " + str.length() + " character!"));
    }
}
