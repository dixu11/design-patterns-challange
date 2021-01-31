package behavioral.observator;

public class MailWeatherNotifier implements WeatherListener{


    public MailWeatherNotifier() {
    }

    public void sendWeatherInfo(int temp, WeatherType type) {
        System.out.printf("Aktualna pogoda: %d stopni i jest: %s\n", temp,type);
    }


    @Override
    public void reactToWeatherChanged(int temp, WeatherType type) {
        sendWeatherInfo(temp,type);
    }
}
