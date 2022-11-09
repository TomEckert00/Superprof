package designpatterns.aufgaben.aufgabe7;

public class Order implements OrderInterface{
    private Inventory inventory = new Inventory();
    private Payment payment = new Payment();

    public void placeOrder(String orderId) {
        String step1 = inventory.checkInventory(orderId);
        String step2 = payment.deductPayment(orderId);
        System.out.println("Following steps completed:" + step1 + " & "
                + step2);
    }
}
