package com.company.producerconsumer;

public class Consumer implements Runnable{
    private DataStore dataStore;

    Consumer(DataStore dataStore){
        this.dataStore=dataStore;
    }

    public void run() {
        while(true) {
            int message = dataStore.getMessage();
            System.out.println("Got number: " + message);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

class WaitNotifyExample{
    public static void main(String[] args) {
        DataStore dataStore = new DataStore(5);

        Producer producer = new Producer(dataStore);
        new Thread(producer).start();

        Consumer consumer = new Consumer(dataStore);
        new Thread(consumer).start();
    }

}
