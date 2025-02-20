package com.hakancivelek.lambdaExpressions.myPractices;

public class Person implements Comparable {
    String name;
    String surname;
    Integer age;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Person(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
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

    public void printInfo() {
        System.out.println(name + " " + surname + " " + age);
    }
}
