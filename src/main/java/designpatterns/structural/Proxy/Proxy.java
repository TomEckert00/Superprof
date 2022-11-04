package designpatterns.structural.Proxy;

public class Proxy implements ServiceInterface{

    private Service realService;

    public Proxy(Service realService) {
        this.realService = realService;
    }

    @Override
    public void operation(String message) {
        if(message == "Hallo Welt"){
            realService.operation(message);
        }
    }
}
