package designpatterns.aufgaben.aufgabe7;

public class App {
    public static void main(String args[]) {
        OrderInterface orderInterface = new Order();
        orderInterface.placeOrder("OR123456");
        System.out.println("Order processing completed");
    }
}
