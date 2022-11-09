package designpatterns.behavioral.command;

public class ConreteCommand implements Command{
    @Override
    public void execute() {
        System.out.println("Execute");
    }
}
