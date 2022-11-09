package designpatterns.behavioral.observer;

public class Demo {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        Subscriber subscriber = new ConcreteSubscriber();
        publisher.subscribe(subscriber);
        publisher.novitfySubscribers();
    }
}
