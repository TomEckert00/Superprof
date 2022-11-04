package designpatterns.structural.Decorator;

public class BaseDecorator extends Notifier{
    Notifier wrappee;

    public BaseDecorator(Notifier notifier) {
        this.wrappee = notifier;
    }

    public void sendMessage(String message){
        wrappee.sendMessage(message);
    }
}
