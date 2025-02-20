package com.hakancivelek.lambdaExpressions.myPractices;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;

public class ComparatorComposition {
    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person("Ali", "Yılmaz",27));
        people.add(new Person("Ali", "Aydın",37));
        people.add(new Person("Ayşe", "Kaya",12));
        people.add(new Person("Aysel", "Duman",19));
        people.add(new Person("Mehmet", "Demir",43));
        people.add(new Person("Fatma", "Çelik",26));
        people.add(new Person("Fatma", "Murat",19));
        people.add(new Person("Ahmet", "Şahin",65));
        people.add(new Person("Ahmet", "Zafer",27));
        people.add(new Person("Aytaç", "Ferah",33));

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
