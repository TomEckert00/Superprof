package designpatterns.structural.Facade;

public class Client{
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.doStuff("Hallo");
    }
}
