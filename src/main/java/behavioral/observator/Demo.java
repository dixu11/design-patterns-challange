package behavioral.observator;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        MailWeatherNotifier notifier = new MailWeatherNotifier();
        FireWarningNotifier notifier2 = new FireWarningNotifier();
        WeatherStation station = new WeatherStation();

        station.addListener(notifier);
        station.addListener(notifier2);


        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    Random random = new Random();
                    try {
                        Thread.sleep(random.nextInt(1000)+1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    station.changeWeather();
                   // System.out.println(station);
                }
            }
        });

       thread.start();
    }
}
