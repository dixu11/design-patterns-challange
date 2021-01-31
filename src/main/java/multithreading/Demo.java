package multithreading;

import java.time.LocalDate;

public abstract class Demo {


    public static void main(String[] args) {

        //Runnable // zadanie - > kod do wykonania na osobny wątku
        //Thread // pracownik - > wykonuje przekazane zadanie
        Task task = new Task();
        Thread thread = new Thread(task);
        thread.start();

        Runnable runnable = new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 1_000; i++) {
                    System.out.println("Wątek 2 wykonuje zadanie");
                }
            }
        };
        Thread thread2 = new Thread(runnable);
        thread2.start();

        System.out.println("Koniec programu!");
    }
}
