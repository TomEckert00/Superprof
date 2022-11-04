package designpatterns.structural.Adapter;

public class Client {

    public static void main(String[] args) {
        ClientInterface clientInterface = new Adapter();
        clientInterface.method("1");

    }
}
