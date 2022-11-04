package designpatterns.structural.Composite;

public class Item implements Component{

    int price = 20;

    @Override
    public int execute() {
        return price;
    }
}
