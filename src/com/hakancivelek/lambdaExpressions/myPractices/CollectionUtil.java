package com.hakancivelek.lambdaExpressions.myPractices;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

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

    public static Set<Person> returnUniquePeoples() {
        Set<Person> people = new TreeSet<>();

        people.add(new Person(8, "Ahmet", "Şahin", 65));
        people.add(new Person(7, "Fatma", "Murat", 19));
        people.add(new Person(2, "Ali", "Aydın", 37));
        people.add(new Person(3, "Ayşe", "Kaya", 12));
        people.add(new Person(10, "Aytaç", "Ferah", 33));
        people.add(new Person(4, "Aysel", "Duman", 19));
        people.add(new Person(1, "Ali", "Yılmaz", 27));
        people.add(new Person(9, "Ahmet", "Zafer", 27));
        people.add(new Person(5, "Mehmet", "Demir", 43));
        people.add(new Person(6, "Fatma", "Çelik", 26));

        return people;
    }
}
