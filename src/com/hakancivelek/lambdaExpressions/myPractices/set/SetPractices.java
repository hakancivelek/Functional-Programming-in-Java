package com.hakancivelek.lambdaExpressions.myPractices.set;

import com.hakancivelek.lambdaExpressions.myPractices.CollectionUtil;
import com.hakancivelek.lambdaExpressions.myPractices.Person;

import java.util.Set;

public class SetPractices {
    public static void main(String[] args) {
        Set<Person> people = CollectionUtil.returnUniquePeoples();

        people.forEach(System.out::println);

        System.out.println("\nTesting:");
        System.out.println(people.add(new Person(7, "Murat", "Kaya", 13)));
        people.forEach(System.out::println);
        System.out.println("-----------------");
        System.out.println(people.add(new Person(11, "Samet", "Çil", 13)));
        people.forEach(System.out::println);
    }
}
