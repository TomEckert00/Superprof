package designpatterns.creational.abstractfactory;

import designpatterns.creational.abstractfactory.domain.Chair;
import designpatterns.creational.abstractfactory.domain.ModernChair;
import designpatterns.creational.abstractfactory.domain.ModernSofa;
import designpatterns.creational.abstractfactory.domain.Sofa;

public class ModernFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
