package multithreading.synchronization;

import java.util.concurrent.atomic.AtomicInteger;

public class IncrementMe implements Runnable {

    private AtomicInteger number = new AtomicInteger(0);

    private Thread thread1 = new Thread(this);
    private Thread thread2 = new Thread(this);

    public void start() {
        thread1.start();
        thread2.start();
    }

    public void join() {
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 1_000; i++) {
           increment();
        }
    }

    public void increment() {
       /* int oldNumber = number;
        int newNumber = oldNumber + 1;
        number = newNumber;*/
        number.getAndIncrement();
    }


    public static void main(String[] args) {
        IncrementMe incrementMe = new IncrementMe();
        incrementMe.start();
        incrementMe.join();
        System.out.println(incrementMe.number);
    }
}
