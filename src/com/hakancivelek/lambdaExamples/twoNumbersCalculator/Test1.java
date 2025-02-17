package com.hakancivelek.lambdaExamples.twoNumbersCalculator;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        EvenNumberOperation printer = (arg) -> {
            for(int i = 2; i <= arg; i+=2){
                System.out.print(i + " ");
            }
            System.out.println();
        };
        printer.operate(10);

        EvenNumberOperation printer2 = (arg) -> {
            int sum = 0;
            for(int i = 2; i <= arg; i+=2){
                sum += i;
            }
            System.out.println(sum);
        };
        printer2.operate(10);

        EvenNumberOperation printer3 = (arg) -> {
            int product = 1;
            for(int i = 2; i <= arg; i+=2){
                product *= i;
            }
            System.out.println(product);
        };
        printer3.operate(10);

        EvenNumberOperation printer4 = (arg) -> {
            List<Integer> list = new ArrayList<>(arg / 2);
            for(int i = 2; i <= arg; i+=2){
                list.add(i);
            }
            System.out.println(list);
        };
        printer4.operate(10);
    }
}
