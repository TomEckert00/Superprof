package designpatterns.aufgaben.aufgabe5;

import java.util.ArrayList;
import java.util.List;

public class Weather {
    private WeatherType currentWeather;
    private final List<WeatherMonitor> watchers;
    public Weather() {
        watchers = new ArrayList<>();
        currentWeather = WeatherType.SUNNY;
    }
    public void addWatchers(WeatherMonitor obs) {
        watchers.add(obs);
    }
    public void removeMonitors(WeatherMonitor obs) {
        watchers.remove(obs);
    }
    public void timePasses() {
        switch (currentWeather) {
            case COLD:
                currentWeather = WeatherType.SUNNY;
                break;
            case RAINY:
                currentWeather = WeatherType.WINDY;
                break;
            case SUNNY:
                currentWeather = WeatherType.RAINY;
                break;
            case WINDY:
                currentWeather = WeatherType.COLD;
                break;
            default:
                break;
        }
        System.out.println("The weather now changes to " + currentWeather);
        notifyWatchers();
    }
    private void notifyWatchers() {
        for (WeatherMonitor watcher : watchers) {
            watcher.update(currentWeather);
        }
    }
}
