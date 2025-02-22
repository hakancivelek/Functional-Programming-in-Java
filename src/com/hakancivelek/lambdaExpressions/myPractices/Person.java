package com.hakancivelek.lambdaExpressions.myPractices;

public class Person implements Comparable {
    int id;
    String name;
    String surname;
    Integer age;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Person(Integer id, String name, String surname, Integer age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void printInfo() {
        System.out.println(name + " " + surname + " " + age);
    }

    @Override
    public String toString() {
        return name + " " + surname + ". Age: " + age + " Id: " + id;
    }

    @Override
    public int compareTo(Object o) {
        Person other = (Person) o;
        int result = 0;
        if (id == other.id){
            return 0;
        }
        else result = age.compareTo(other.age);
        return result;
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode() on Person with id: " + id);
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("equals() on Person with id: " + id);
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        System.out.println("equals() on Employee with no: " + this + " other Employee with no: " + obj);
        Person other = (Person) obj;
        return id == other.id;
    }
}
