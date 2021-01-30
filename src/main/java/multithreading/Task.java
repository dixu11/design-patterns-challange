package multithreading;

public class Task implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1_000; i++) {
            System.out.println("Pozdrowienia z osobnego wątku!!!");
        }
    }




}
