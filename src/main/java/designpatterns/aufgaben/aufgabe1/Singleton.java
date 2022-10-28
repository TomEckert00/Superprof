package designpatterns.aufgaben.aufgabe1;

public class Singleton {
    //Was stimmt mit der Implementierung nicht

    public Singleton() {}
    public static Singleton getInstance() {
        return new Singleton();
    }
}

