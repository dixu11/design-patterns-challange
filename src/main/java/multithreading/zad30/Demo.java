package multithreading.zad30;

public class Demo {

    public static void main(String[] args) {
//        Stwórz klasę ConcatenationTask w której będziemy X razy kopiować ten sam tekst (wykorzystaj ‘+=’).
//        Tzn. tworząc i uruchamiając ConcatenationTask z parametrami: 3 oraz “D” wynikiem pracy wątku powinno
//        być “DDD” zapisane w polu result.
//        Zadanie powinno być możliwe do rozpoczęcia po wywołaniu metody startTask()
//        Zadbaj o to, aby zadanie można było przerwać za pomocą metody abort()
//        w mainie za pomocą anonimowej klasy stwórz i uruchom inny wątek który przerwie zadanie z
//        poprzedniego wątku po sekundzie
//        W mainie na koniec zaprezentuj ile znaków ma wynik konkatenacji. Przetestuj scenariusz w
//        którym ustawiasz tyle razy doklejanie tekstu aby trwało to dłużej niż sekundę i upewnij się,
//        że Twoja metoda abort() działa poprawnie.
        ConcatenationTask task = new ConcatenationTask(100_000, "D");
        task.startTask();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                task.abort();
            }
        });
        thread.start();


        task.waitForTaskEnd();
        System.out.println(task.getResult().length());

    }
}

class ConcatenationTask implements Runnable{

    private int count;
    private String text;
    private String result = "";
    private Thread thread;
    private boolean running;


    public ConcatenationTask(int count, String text) {
        this.count = count;
        this.text = text;
        thread = new Thread(this);
    }

    public void startTask() {
        running = true;
        thread.start();
    }

    public void waitForTaskEnd() {
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void abort() {
        running = false;
    }

    @Override
    public void run() {
        //text += text;// źle -> DD, DDDD, DDDDDDDD,
        for (int i = 0; i < count; i++) {
            result += text; // dobrze -> DD, DDD, DDDD, DDDDD
            if (!running) {
                System.out.println("Awaryjnie przerwane przy: "+ i );
                return;
            }
        }
    }

    public String getResult() {
        return result;
    }
}
