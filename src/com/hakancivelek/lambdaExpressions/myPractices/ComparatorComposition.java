package com.hakancivelek.lambdaExpressions.myPractices;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;

public class ComparatorComposition {
    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person(1, "Ali", "Yılmaz", 27));
        people.add(new Person(2, "Ali", "Aydın", 37));
        people.add(new Person(3, "Ayşe", "Kaya", 12));
        people.add(new Person(4, "Aysel", "Duman", 19));
        people.add(new Person(5, "Mehmet", "Demir", 43));
        people.add(new Person(6, "Fatma", "Çelik", 26));
        people.add(new Person(7, "Fatma", "Murat", 19));
        people.add(new Person(8, "Ahmet", "Şahin", 65));
        people.add(new Person(9, "Ahmet", "Zafer", 27));
        people.add(new Person(10, "Aytaç", "Ferah", 33));

        Collator collator = Collator.getInstance(new Locale("TR"));

        Comparator<Person> nameComparator = (person1, person2) -> collator.compare(person1.getName(), person2.getName());
        Comparator<Person> surnameComparator = (person1, person2) -> collator.compare(person1.getSurname(), person2.getSurname());

        System.out.println("Before sorting");
        System.out.println(people);

        Collections.sort(people, nameComparator);
        System.out.println("\nAfter name sorting");
        System.out.println(people);

        people.sort(surnameComparator);
        System.out.println("\nAfter surname sorting");
        System.out.println(people);

        Collections.sort(people, nameComparator.thenComparing(surnameComparator));
        System.out.println("\nAfter before name after surname sorting");
        System.out.println(people);
    }
}
