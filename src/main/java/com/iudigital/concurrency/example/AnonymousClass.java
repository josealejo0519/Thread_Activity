package com.iudigital.concurrency.example;

public class AnonymousClass {
    public static void main(String[] args) {
        Thread hilo = new Thread(new Runnable() {
            public void run() {
              for (int i = 0; i < 10; i++) {
                  System.out.println("Hello Dear Alejo " + i);

              }
            }
        });
        System.out.println("********************************************************");
        hilo.start();
        System.out.println("Hello, I'm a thread and success");
        System.out.println("Finish");


    }
}
