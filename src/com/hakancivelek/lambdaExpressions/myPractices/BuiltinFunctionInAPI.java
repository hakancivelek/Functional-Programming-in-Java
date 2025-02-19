package com.hakancivelek.lambdaExpressions.myPractices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BuiltinFunctionInAPI {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Hakan");
        names.add("Merve");
        names.add("Esat");
        names.add("Cemile");

        System.out.println("Before sorting");
        System.out.println(names);

        System.out.println();

        Collections.sort(names);
        System.out.println("After sorting");
        System.out.println(names);

        System.out.println();

        names.removeIf(name -> name.length() > 5);
        Collections.sort(names);
        System.out.println("After removeIf");
        System.out.println(names);

        System.out.println();

        names.replaceAll(name -> name.toUpperCase());
        System.out.println("After toUpperCase");
        System.out.println(names);
    }
}
