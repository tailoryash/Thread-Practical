package com.yash.thread;

public class OS extends Thread {
    private String taskName;

    public OS(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        switch (taskName.toLowerCase()) {
            case "terminal":
                Terminal ter = new Terminal();
                ter.start();
                break;

            case "chrome":
                Chrome chrome = new Chrome();
                Chrome chrome1 = new Chrome();
                Chrome chrome2 = new Chrome();
                chrome1.start();
                chrome2.start();
                chrome.start();
                break;

            case "vscode":
                VsCode vs = new VsCode();
                VsCode vs1 = new VsCode();
                vs1.start();
                vs.start();
                break;

            default:
                System.err.println("Re-start windows...");
        }
    }
}
