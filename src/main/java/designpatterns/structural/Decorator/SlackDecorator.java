package designpatterns.structural.Decorator;

public class SlackDecorator extends BaseDecorator{

    public SlackDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void sendMessage(String message) {
        super.sendMessage(message + "Slack ging raus\n");
    }
}
