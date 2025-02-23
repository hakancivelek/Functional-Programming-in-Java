package com.hakancivelek.lambdaExpressions.myPractices.map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class MapPractices {
    public static void main(String[] args) {
        Map<String, String> city = new HashMap<>();
        city.put("54", "Sakarya");
        city.put("61", "Trabzon");
        city.put("26", "Eskişehir");
        city.put("34", "İstanbul");
        city.put("06", "Ankara");

        System.out.println(city);
        System.out.println("\ncity.isEmpty(): " + city.isEmpty());
        System.out.println("\ncity.remove(): " + city.remove("34"));
        System.out.println("\nAfter removing: " + city);
        System.out.println("\ncity.getOrDefault(): " + city.getOrDefault("77", "No Found!"));
        System.out.println("\ncity.computeIfAbsent(): " + city.computeIfAbsent("54", s -> "new" + s));
        System.out.println("\ncity.computeIfAbsent(): " + city.computeIfAbsent("test", String::toUpperCase));
        BiFunction<String, String, String> toUpper = (arg1, arg2) -> arg2.toUpperCase();
        System.out.println("\ncity.computeIfPresent(): " + city.computeIfPresent("54", toUpper));
        System.out.println("\nAfter computeIfAbsent: " + city);
    }
}
