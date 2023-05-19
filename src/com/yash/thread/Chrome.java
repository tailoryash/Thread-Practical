package com.yash.thread;

public class Chrome extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "-Chrome is started");
    }
}
