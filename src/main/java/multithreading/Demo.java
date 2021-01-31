package multithreading;

import java.time.LocalDate;

public class Demo {


    public static void main(String[] args) throws InterruptedException {

        //Runnable // zadanie - > kod do wykonania na osobny wątku
        //Thread // pracownik - > wykonuje przekazane zadanie
        Task task = new Task();
        Thread thread = new Thread(task);
        thread.start();
        Runnable runnable = () -> {
            for (int i = 0; i < 1_000; i++) {
                System.out.println("Wątek 2 wykonuje zadanie");
            }
        };
        Thread thread2 = new Thread(runnable);
        thread2.start();
        System.out.println("hello");
        thread.join();
        System.out.println("PIERWSZY WATEK SKONCZYL!");
        thread2.join();
        System.out.println("Koniec programu!");
    }
}
