package multithreading;

public class Demo {
    public static void main(String[] args) {
        //Runnable // zadanie - > kod do wykonania na osobny wątku
        //Thread // pracownik - > wykonuje przekazane zadanie
        Task task = new Task();
       Thread thread = new Thread(task);
        thread.start();
        for (int i = 0; i < 1_000; i++) {
            System.out.println("Main sam wykonuje prace");
        }
        System.out.println("Koniec programu!");
    }
}
