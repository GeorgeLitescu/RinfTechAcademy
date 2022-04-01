package com.company;

import java.util.concurrent.Semaphore;

public class DemoSemaphore {

    static Semaphore semaphore = new Semaphore(5);

    static class DemoThread extends Thread {
        String name = "";

        DemoThread(String name) {
            this.name = name;
        }

        public void run() {
            try {
                System.out.println("Car " + name + " : Looks at the traffic light...");
                semaphore.acquire();

                System.out.println("Car " + name + " : got a green light!");
                try {
                    System.out.println("Car " + name + " : entered the intersection ");
                    Thread.sleep(5000);
                } finally {
                    System.out.println("Car " + name + " : passed the intersection ");
                    semaphore.release();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("Only " + semaphore.availablePermits() + " cars can enter the intersection at the same time");

        DemoThread t1 = new DemoThread("A");
        t1.start();

        DemoThread t2 = new DemoThread("B");
        t2.start();

        DemoThread t3 = new DemoThread("C");
        t3.start();

        DemoThread t4 = new DemoThread("D");
        t4.start();

        DemoThread t5 = new DemoThread("E");
        t5.start();

        DemoThread t6 = new DemoThread("F");
        t6.start();

        DemoThread t7 = new DemoThread("G");
        t7.start();

        DemoThread t8 = new DemoThread("H");
        t8.start();
    }
}
