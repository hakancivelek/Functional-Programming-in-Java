package com.hakancivelek.lambdaExpressions.myPractices;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class CollectionUtil {

    private static Set<String> set;

    static {
        set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("five");
        set.add("sixty one");
    }

    public static Collection<String> getCollection() {
        return set;
    }
}
