package designpatterns.creational.factory;

public class Demo {
    public static void main(String[] args) {
        Logistics logistics = new RoadLogistics();
        Transport transport = logistics.createTransport();
        logistics.planDelivery();
    }
}
