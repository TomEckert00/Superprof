package designpatterns.aufgaben.aufgabe2.Elfen;

import designpatterns.aufgaben.aufgabe2.Waffe;
import designpatterns.aufgaben.aufgabe2.WaffenTyp;

public class ElfenWaffe implements Waffe {

    private WaffenTyp weaponType;

    public ElfenWaffe(WaffenTyp weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public String toString() {
        return "Elven " + weaponType;
    }
}
