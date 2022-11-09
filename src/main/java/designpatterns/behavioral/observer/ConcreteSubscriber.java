package designpatterns.behavioral.observer;

public class ConcreteSubscriber implements Subscriber{
    @Override
    public void update() {
        System.out.println("Ich wurde geupdatet");
    }
}
