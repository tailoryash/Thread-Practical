package com.yash.thread;

public class Terminal extends Thread{
    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName() + "-terminal is Started....");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Tasks Completed..");
    }
}
