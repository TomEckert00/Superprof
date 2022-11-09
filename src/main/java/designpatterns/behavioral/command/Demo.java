package designpatterns.behavioral.command;

public class Demo {
    public static void main(String[] args) {
        Command command = new ConreteCommand();
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.executeCommand();
    }
}
