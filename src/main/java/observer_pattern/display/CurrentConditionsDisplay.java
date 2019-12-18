package observer_pattern.display;

import observer_pattern.observer.Observer;
import observer_pattern.subject.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject wd) {
        this.weatherData = wd;
        weatherData.registerObserver(this);
    }

    public String update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        return display();
    }

    public String display() {
        return "Current conditions: " + temperature + "F degrees and " + humidity + "% humidity";
    }
}
