package multithreading;

public class Timer implements Runnable {

    private Thread thread;
    private int startTime;
    private int timeLeft;
    private boolean running;


    public Timer(int startTime) {
        this.startTime = startTime;
        timeLeft = startTime;
        thread = new Thread(this);
        //thread.stop(); // metoda powoduje problemy z pracą JVM i jest depracated
    }

    public void startCounting() {
        running = true;
        thread.start();
    }

    public void abort() {
        running = false;
    }


    @Override
    public void run() {
        System.out.printf("Minutnik uruchomiony na: %d sekund\n", startTime);
        while (timeLeft != 0) {
            System.out.printf("Zostało: %d sekund\n",timeLeft);
            if (!running) {
                System.out.println("AWARYJNIE WYLACZONO MINUTNIK!!");
                return;
            }
            try {
                Thread.sleep(1000);// zatrzymaj wątek na x milisekund
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            timeLeft--;
        }
        System.out.println("DRYN DRYN!!!");
    }
}
