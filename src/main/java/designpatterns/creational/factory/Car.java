package designpatterns.creational.factory;

public class Car implements Transport{
    @Override
    public void deliver() {
        System.out.println("Deliver on the Road");
    }
}
