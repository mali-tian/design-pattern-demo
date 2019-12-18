package observer_pattern.display;

import observer_pattern.observer.Observer;
import observer_pattern.subject.Subject;

public class StatisticsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public StatisticsDisplay(Subject wd) {
        this.weatherData = wd;
        weatherData.registerObserver(this);
    }

    @Override
    public String display() {
        return "Statistics conditions: " + temperature + "F degrees and " + humidity + "% humidity and " + pressure + " pressure";
    }

    @Override
    public String update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        return display();
    }
}
