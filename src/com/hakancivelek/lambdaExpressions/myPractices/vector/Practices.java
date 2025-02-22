package com.hakancivelek.lambdaExpressions.myPractices.vector;

import java.util.*;

public class Practices {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        System.out.println(vector.capacity());

        Vector<Integer> vector1 = new Vector<>(2, 3);
        System.out.println("\nBefore adding:" + vector1.capacity());
//        vector1.add(1);
//        vector1.add(2);
//        vector1.add(3);
        vector1.addAll(Arrays.asList(1, 2, 3));
        System.out.println("After adding:" + vector1.capacity());

        System.out.println("\nEnumeration");
        Enumeration<Integer> enumeration = vector1.elements();
        while (enumeration.hasMoreElements()) {
            int i = enumeration.nextElement();
            System.out.println(i + " ");
        }

        System.out.println("\nIterator");
        Iterator<Integer> iterator = vector1.iterator();
        while (iterator.hasNext()) {
            int i = iterator.next();
            System.out.println(i + " ");
        }

        System.out.println("\nForeach");
        for (int i : vector1) {
            System.out.println(i);
        }

        System.out.println("\nForeach with consumer");
        vector1.forEach(System.out::println);
//        vector1.forEach(s -> System.out.println(s));

        vector1.addAll(Arrays.asList(7, 6, 5, 4));
        System.out.println("\nAfter adding 7, 6, 5, 4");
        vector1.forEach(System.out::println);

        vector1.removeIf(i -> i % 2 == 0);
        System.out.println("\nAfter removeIf");
        vector1.forEach(System.out::println);

        System.out.println("\nAfter sorting");
        vector1.sort(Integer::compareTo);
        vector1.forEach(System.out::println);

        System.out.println("\nvector1.size(): " + vector1.size());
        System.out.println("vector1.isEmpty(): " + vector1.isEmpty());
        System.out.println("vector1.containsAll: " + vector1.containsAll(Arrays.asList(1, 2)));
    }
}
