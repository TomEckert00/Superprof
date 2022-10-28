package designpatterns.aufgaben.aufgabe2.Elfen;

import designpatterns.aufgaben.aufgabe2.Schmied;
import designpatterns.aufgaben.aufgabe2.Waffe;
import designpatterns.aufgaben.aufgabe2.WaffenTyp;

public class ElfenSchmied implements Schmied {
    @Override
    public Waffe manufactureWeapon(WaffenTyp weaponType) {
        return new ElfenWaffe(weaponType);
    }
}
