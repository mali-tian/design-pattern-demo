package observer_pattern.display;

import static org.junit.Assert.*;

import observer_pattern.subject.WeatherData;
import org.junit.Test;

public class StatisticsDisplayTest {

    WeatherData weatherData = new WeatherData();
    StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);


    @Test
    public void should_display_40_temperature_and_34_humidity_and_2000_pressure_when_weatherdata_change_to_40_temp_and_34_humidity_and_2000_pressure() {

        assertEquals("Statistics conditions: 0.0F degrees and 0.0% humidity and 0.0 pressure", statisticsDisplay.display());

        weatherData.setMeasurements(40, 34, 2000);
        assertEquals("Statistics conditions: 40.0F degrees and 34.0% humidity and 2000.0 pressure", statisticsDisplay.display());
    }

    @Test
    public void should_display_60_temperature_and_45_humidity_and_20000_pressure_when_weatherdata_change_to_60_temp_and_45_humidity_and_3000_pressure() {

        assertEquals("Statistics conditions: 0.0F degrees and 0.0% humidity and 0.0 pressure", statisticsDisplay.display());

        weatherData.setMeasurements(60, 45, 3000);
        assertEquals("Statistics conditions: 60.0F degrees and 45.0% humidity and 3000.0 pressure", statisticsDisplay.display());
    }
}