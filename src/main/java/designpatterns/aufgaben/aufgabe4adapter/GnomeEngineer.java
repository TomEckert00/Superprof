package designpatterns.aufgaben.aufgabe4adapter;

public class GnomeEngineer implements Engineer{

    private GoblinGlider glider;
    public GnomeEngineer() {
        glider = new GoblinGlider();
    }
    @Override
    public void operateDevice() {
        glider.attachGlider();
        glider.gainSpeed();
        glider.takeOff();
    }

}
