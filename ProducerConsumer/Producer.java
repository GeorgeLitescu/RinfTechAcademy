package com.company.producerconsumer;

import java.util.*;

class DataStore {
    protected final int THREADHOLD;
    protected LinkedList<Integer> messages = new LinkedList<>();

    DataStore(int THREADHOLD) {
        this.THREADHOLD = THREADHOLD;
    }

    protected synchronized void putMessage() {
        while (messages.size() >= THREADHOLD) try {
            wait();
        } catch (InterruptedException e) {
            System.out.println("LinkedList is full");
        }
        messages.add((int) (Math.random() * 100));
        notify();
    }

    public synchronized int getMessage() {
        while (messages.size() == 0) {
            try {
                notify();
                wait();
            } catch (InterruptedException e) {
                System.out.println("LinkedList is empty");
            }
        }
        int message = messages.remove(0);
        notify();
        return message;
    }
}


public class Producer implements Runnable {
    private DataStore dataStore;

    Producer(DataStore dataStore) {
        this.dataStore = dataStore;
    }

    public void run() {
        while (true) {
            dataStore.putMessage();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
