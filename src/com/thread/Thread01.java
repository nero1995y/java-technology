package com.thread;

public class Thread01 {
    public static void main(String[] args){
        ThreadImplementation thread1 = new ThreadImplementation();
        Thread thread2 = new Thread(new ThreadWithRunnable());

        thread1.start();
        thread2.start();
    }
}
