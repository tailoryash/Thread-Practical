package com.yash.thread;

public class VsCode extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "-VSCode is Started");
    }
}
