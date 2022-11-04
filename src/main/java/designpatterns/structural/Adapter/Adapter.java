package designpatterns.structural.Adapter;

public class Adapter implements ClientInterface{

    Service service = new Service();


    @Override
    public void method(String amount) {
        if(amount!=null){
            int amountNumber = Integer.parseInt(amount);
            service.serviceMethod(amountNumber);
        }
    }
}
