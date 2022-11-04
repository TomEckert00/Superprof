package designpatterns.structural.Decorator;

public class Demo {
    public static void main(String[] args) {
        Notifier notifier = new Notifier();
        notifier = new SMSDecorator(notifier);
        notifier = new FacebookDecorator(notifier);
        notifier = new SlackDecorator(notifier);
        notifier.sendMessage("Hallo\n");
    }
}
