package com.hakancivelek.lambdaExpressions.myPractices.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPerformance {
    static int n = 100_000;

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        arrayList = createArrayList();
        linkedList = createLinkedList();
    }

    private static List<Integer> createArrayList() {
        List<Integer> resultList = new ArrayList<>();
        double start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            resultList.add(0, i);
//            resultList.add(i);
        }
        double end = System.currentTimeMillis();
        System.out.println("createArrayList: " + (end - start));
        return resultList;
    }

    private static List<Integer> createLinkedList() {
        List<Integer> resultList = new LinkedList<>();
        double start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            resultList.add(0, i);
//            resultList.add(i);
        }
        double end = System.currentTimeMillis();
        System.out.println("createLinkedList: " + (end - start));
        return resultList;
    }
}
