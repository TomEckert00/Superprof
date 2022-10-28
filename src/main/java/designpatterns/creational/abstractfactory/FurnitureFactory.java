package designpatterns.creational.abstractfactory;

import designpatterns.creational.abstractfactory.domain.Chair;
import designpatterns.creational.abstractfactory.domain.Sofa;

public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
}
