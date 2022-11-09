package designpatterns.aufgaben.aufgabe5;

public enum WeatherType {
    SUNNY, RAINY, WINDY, COLD;
    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
