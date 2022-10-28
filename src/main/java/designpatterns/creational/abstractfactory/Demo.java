package designpatterns.creational.abstractfactory;

import designpatterns.creational.abstractfactory.domain.Chair;
import designpatterns.creational.abstractfactory.domain.Sofa;

public class Demo {
    public static void main(String[] args) {
        Client client = new Client(new ModernFactory());
        Chair chair = client.constructChair();
        Sofa sofa = client.constructSofa();
    }
}
