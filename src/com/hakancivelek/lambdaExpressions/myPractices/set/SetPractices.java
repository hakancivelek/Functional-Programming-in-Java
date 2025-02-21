package com.hakancivelek.lambdaExpressions.myPractices.set;

import com.hakancivelek.lambdaExpressions.myPractices.CollectionUtil;
import com.hakancivelek.lambdaExpressions.myPractices.Person;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetPractices {
    public static void main(String[] args) {
        Set<Person> peoples = CollectionUtil.returnUniquePeople();

        peoples.forEach(System.out::println);
    }
}
