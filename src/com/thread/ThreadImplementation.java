package com.thread;

public class ThreadImplementation extends Thread{
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName());
            // Returns this thread's name.
            try {
                Thread.sleep(10);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
