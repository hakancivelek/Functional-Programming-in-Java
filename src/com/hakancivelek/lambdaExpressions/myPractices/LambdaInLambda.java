package com.hakancivelek.lambdaExpressions.myPractices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.UnaryOperator;

public class LambdaInLambda {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Işıl");
        names.add("Zeynep");
        names.add("Nil");
        names.add("Mahmut");
        names.add("Gül");
        names.add("Şenay");
        names.add("Itır");
        names.add("Ülkü");
        names.add("Su");
        names.add("Ayşe");
        names.add("İbrahim");

        System.out.println("Before sorting:");
        System.out.println(names);

        System.out.println();

        System.out.println("After sorting:");
//        Comparator<String> comparator = String::compareTo;
        Comparator<String> comparator = (name1, name2) -> name1.compareTo(name2);
        Collections.sort(names, comparator);
        System.out.println(names);

        Comparator<String> comparator1 = (s1, s2) -> {
            UnaryOperator<String> operator = str -> str.toLowerCase();
            s1 = operator.apply(s1);
            s2 = operator.apply(s2);

            return s1.compareTo(s2);
        };

        Collections.sort(names,comparator1);
        System.out.println("After toLowerCase sorting:");
        System.out.println(names);
    }
}
