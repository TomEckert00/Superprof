package designpatterns.creational.abstractfactory;

import designpatterns.creational.abstractfactory.domain.Chair;
import designpatterns.creational.abstractfactory.domain.ClassicChair;
import designpatterns.creational.abstractfactory.domain.ClassicSofa;
import designpatterns.creational.abstractfactory.domain.Sofa;

public class ClassicFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ClassicChair();
    }

    @Override
    public Sofa createSofa() {
        return new ClassicSofa();
    }
}
