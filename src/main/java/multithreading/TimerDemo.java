package multithreading;

import java.util.Scanner;

public class TimerDemo {
    public static void main(String[] args) {
        Timer timer = new Timer(5);
        timer.startCounting();
        System.out.println("A main nie ma nic do roboty już...");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Naciśnij enter aby przerwać");
        scanner.nextLine();
        timer.abort();
        System.out.println("Zatrzymuję minutnik");

    }
}
