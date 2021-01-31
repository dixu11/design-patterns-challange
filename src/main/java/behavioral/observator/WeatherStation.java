package behavioral.observator;

import java.util.Random;

public class WeatherStation {

    private int temp = 5;
    private WeatherType type = WeatherType.RAIN;

    public void changeWeather() {
        Random random = new Random();
        temp += random.nextInt(7)-3; // -3  -  +3
        type = WeatherType.values()[random.nextInt(3)];
        valuesChanged();
    }

    public void valuesChanged() {

    }

    @Override
    public String toString() {
        return "WeatherStation{" +
                "temp=" + temp +
                ", type=" + type +
                '}';
    }
}


enum WeatherType{
    SUNNY, CLOUDY, RAIN
}
