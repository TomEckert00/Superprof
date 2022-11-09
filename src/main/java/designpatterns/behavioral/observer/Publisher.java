package designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private List<Subscriber> subscribers = new ArrayList<>();

    void subscribe(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    void removeSubscriber(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

    void novitfySubscribers(){
        subscribers.forEach(subscriber -> subscriber.update());
    }
}
