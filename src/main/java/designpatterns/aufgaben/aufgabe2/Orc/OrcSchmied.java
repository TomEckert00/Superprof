package designpatterns.aufgaben.aufgabe2.Orc;

import designpatterns.aufgaben.aufgabe2.Orc.OrcWaffe;
import designpatterns.aufgaben.aufgabe2.Schmied;
import designpatterns.aufgaben.aufgabe2.Waffe;
import designpatterns.aufgaben.aufgabe2.WaffenTyp;

public class OrcSchmied implements Schmied {

    public Waffe manufactureWeapon(WaffenTyp weaponType) {
        return new OrcWaffe(weaponType);
    }
}
