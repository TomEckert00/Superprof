package designpatterns.creational.abstractfactory;

import designpatterns.creational.abstractfactory.domain.Chair;
import designpatterns.creational.abstractfactory.domain.Sofa;

public class Client {

    private FurnitureFactory factory;

    public Client(FurnitureFactory factory){
        this.factory = factory;
    }

    public Chair constructChair(){
        return factory.createChair();
    }

    public Sofa constructSofa(){
        return factory.createSofa();
    }

}
