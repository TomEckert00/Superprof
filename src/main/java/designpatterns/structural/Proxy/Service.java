package designpatterns.structural.Proxy;

public class Service implements ServiceInterface{
    @Override
    public void operation(String message) {
        System.out.println(message);
    }
}
