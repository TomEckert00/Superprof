package designpatterns.structural.Facade;

public class Facade {
    Subsystem subsystem = new Subsystem();

    public void doStuff(String message){
        subsystem.outprint(message);
    }
}
