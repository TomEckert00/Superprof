package designpatterns.aufgaben.aufgabe2.Orc;

import designpatterns.aufgaben.aufgabe2.Waffe;
import designpatterns.aufgaben.aufgabe2.WaffenTyp;

public class OrcWaffe implements Waffe {

    private WaffenTyp weaponType;
    public OrcWaffe(WaffenTyp weaponType) {

        this.weaponType = weaponType;
    }

    @Override
    public String toString() {
        return "Orcish " + weaponType;
    }
}
