package com.hakancivelek.lambdaExpressions.myPractices;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;

public class ComparatorComposition {
    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person("Ali", "Yılmaz"));
        people.add(new Person("Ali", "Aydın"));
        people.add(new Person("Ayşe", "Kaya"));
        people.add(new Person("Aysel", "Duman"));
        people.add(new Person("Mehmet", "Demir"));
        people.add(new Person("Fatma", "Çelik"));
        people.add(new Person("Fatma", "Murat"));
        people.add(new Person("Ahmet", "Şahin"));
        people.add(new Person("Ahmet", "Zafer"));
        people.add(new Person("Aytaç", "Ferah"));

        Collator collator = Collator.getInstance(new Locale("TR"));

        Comparator<Person> nameComparator = (person1, person2) -> collator.compare(person1.getName(),person2.getName());
        Comparator<Person> surnameComparator = (person1, person2) -> collator.compare(person1.getSurname(),person2.getSurname());

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
