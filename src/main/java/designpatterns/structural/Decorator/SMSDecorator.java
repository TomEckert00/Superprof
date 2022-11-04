package designpatterns.structural.Decorator;

public class SMSDecorator extends BaseDecorator{

    public SMSDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void sendMessage(String message) {
        super.sendMessage(message + "SMS ging raus\n");
    }
}
