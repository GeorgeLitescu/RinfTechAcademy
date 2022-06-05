package com.company;

class Sum {
    public static int sum = 0;
}

class SumLoop implements Runnable {
    public void run() {
        for (int x = 0; x < 10; x++) {
            Sum.sum += x;
            System.out.println("Thread : " + Thread.currentThread().getName()
                    + " - value : " + x);
        }
        System.out.println("Thread : " + Thread.currentThread().getName()
                + " - sum : " + Sum.sum);
    }
}

class demo {
    public static void main(String[] args) {
        SumLoop runnable = new SumLoop();
        Thread a = new Thread(runnable);
        a.setName("A");
        Thread b = new Thread(runnable);
        b.setName("B");
        Thread c = new Thread(runnable);
        c.setName("C");
        Thread d = new Thread(runnable);
        d.setName("D");

        a.start();
        b.start();
        c.start();
        d.start();
    }
}


