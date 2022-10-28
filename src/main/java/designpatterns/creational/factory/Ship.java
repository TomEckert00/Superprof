package designpatterns.creational.factory;

public class Ship implements Transport{
    @Override
    public void deliver() {
        System.out.println("Deliver on the Sea");
    }
}
