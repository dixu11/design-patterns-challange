package behavioral.observator;

public class FireWarningNotifier implements WeatherListener {

    public void checkWarning(int temp) {
        if (temp>35) {
            System.out.println("Alarm przeciwpożarowy!");
        }
    }

    @Override
    public void reactToWeatherChanged(int temp, WeatherType type) {
        checkWarning(temp);
    }
}
