package com.hakancivelek.lambdaExamples.clock;

import java.util.Date;

public class ClockTest {
    public static void main(String[] args) {
        Clock clock = () -> System.out.println(new Date());
//        clock.showClock();

        System.out.println();
        Clock clock2 = () -> {
            Thread thread = new Thread(){
                @Override
                public void run(){
                    while (true){
                        System.out.println(new Date());
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            };
            thread.start();
        };
//        clock2.showClock();

        System.out.println();
        Clock clock3 = () -> {
            Runnable runnable = () -> {
                while (true){
                    System.out.println(new Date());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            };
            Thread thread = new Thread(runnable);
            thread.start();
        };
        clock3.showClock();
    }
}
