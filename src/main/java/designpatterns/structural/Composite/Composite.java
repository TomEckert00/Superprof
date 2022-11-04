package designpatterns.structural.Composite;

import java.util.List;

public class Composite implements Component{

    private List<Component> children;


    public void add(Component c){
        children.add(c);
    }

    public void remove(Component c){
        children.remove(c);
    }

    public List<Component> getChildren() {
        return children;
    }

    @Override
    public int execute() {
        int amount = children.stream().map(Component::execute).mapToInt(price -> price).sum();
        return amount;
    }
}
