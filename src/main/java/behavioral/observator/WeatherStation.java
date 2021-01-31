package behavioral.observator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherStation {

    private int temp = 5;
    private WeatherType type = WeatherType.RAIN;

    private List<WeatherListener> listeners = new ArrayList<>();

    public void changeWeather() {
        Random random = new Random();
        temp += random.nextInt(7)-1; // -3  -  +3
        type = WeatherType.values()[random.nextInt(3)];
        if (temp > 50) {
            temp = 50;
        }
        valuesChanged();
    }

    public void addListener(WeatherListener listener) {
        listeners.add(listener);
    }

    public void valuesChanged() {
        for (WeatherListener listener : listeners) {
            listener.reactToWeatherChanged(temp,type);
        }
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
