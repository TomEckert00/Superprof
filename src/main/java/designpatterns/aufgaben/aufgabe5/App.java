package designpatterns.aufgaben.aufgabe5;

public class App {
    public static void main(String[] args) {
        Weather weather = new Weather();
        weather.addWatchers(new Orcs());
        weather.addWatchers(new Hobbits());
        weather.timePasses();
        weather.timePasses();
        weather.timePasses();
        weather.timePasses();
    }
}
