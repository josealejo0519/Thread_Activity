package com.iudigital.concurrency.example;

public class PrincipalRunnable {
    public static void main(String[] args) {
        RunnableClass runnableClass = new RunnableClass();
        Thread hilo = new Thread(runnableClass);
        hilo.start();
        System.out.println("*********************************************");
        System.out.println("I'm principal main Thread ");
        System.out.println("Finish ");

    }
}
