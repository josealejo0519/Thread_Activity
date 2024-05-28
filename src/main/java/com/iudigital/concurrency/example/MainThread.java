package com.iudigital.concurrency.example;

public class MainThread {
    public static void main(String[] args) {
        ThreadClass tc = new ThreadClass();
        tc.start();
        System.out.println("Main thread started");
        System.out.println("Main thread finished");
        System.out.println("**********************************************************************");
    }
}
