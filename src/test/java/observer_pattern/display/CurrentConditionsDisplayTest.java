package observer_pattern.display;

import static org.junit.Assert.*;

import observer_pattern.subject.WeatherData;
import org.junit.Test;

public class CurrentConditionsDisplayTest {

    @Test
    public void should_display_40_temperature_and_34_humidity_when_weatherdata_change_to_40_temp_and_34_humidity() {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        assertEquals("Current conditions: 0.0F degrees and 0.0% humidity", currentConditionsDisplay.display());

        weatherData.setMeasurements(40, 34, 1);
        assertEquals("Current conditions: 40.0F degrees and 34.0% humidity", currentConditionsDisplay.display());
    }

    @Test
    public void shoud_display_60_temperature_and_45_humidity_when_weatherdata_change_to_60_temp_and_45_humidity() {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        assertEquals("Current conditions: 0.0F degrees and 0.0% humidity", currentConditionsDisplay.display());

        weatherData.setMeasurements(60, 45, 1);
        assertEquals("Current conditions: 60.0F degrees and 45.0% humidity", currentConditionsDisplay.display());
    }
}