package behavioral.observator;

public class MailWeatherNotifier {


    private WeatherStation weatherStation;


    public MailWeatherNotifier(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    public void sendWeatherInfo() {
        System.out.printf("Aktualna pogoda: ... stopni i jest: ...");
    }


}
