package designpatterns.aufgaben.aufgabe2;

public enum WaffenTyp {
    SHORT_SWORD, SPEAR, AXE;

    @Override
    public String toString() {
        String s = "";
        switch(this) {
            case SHORT_SWORD:
                s = "short sword";
                break;
            case SPEAR:
                s = "spear";
                break;
            case AXE:
                s = "axe";
                break;
        }
        return s;
    }
}
