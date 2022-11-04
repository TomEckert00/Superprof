package designpatterns.structural.Decorator;

public class FacebookDecorator extends BaseDecorator{

    public FacebookDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void sendMessage(String message) {
        super.sendMessage(message + "FB ging raus\n");
    }
}
