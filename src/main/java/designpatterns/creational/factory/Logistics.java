package designpatterns.creational.factory;

public abstract class Logistics {

    public Transport planDelivery(){
        return createTransport();
    }
    public abstract Transport createTransport();
}
