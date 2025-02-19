package com.hakancivelek.lambdaExpressions.myPractices;

public class Person implements Comparable {
    String name;
    String surname;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public int compareTo(Object o) {
        Person person = (Person) o;
        return name.compareTo(person.getName());
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
