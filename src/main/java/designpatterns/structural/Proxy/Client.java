package designpatterns.structural.Proxy;

public class Client {

    public static void main(String[] args) {
        Service realService = new Service();
        Proxy serviceProxy = new Proxy(realService);
        serviceProxy.operation("Hallo");
        serviceProxy.operation("Hallo Welt");


    }
}
