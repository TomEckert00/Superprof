package designpatterns.aufgaben.aufgabe3decorator;

public class SmartTroll implements Hostile{
    private Hostile hostile;
    public SmartTroll(Hostile hostile) {
        this.hostile = hostile;
    }
    @Override
    public void attack() {
        System.out.println("The troll throws a rock at you!");
        hostile.attack();
    }
    @Override
    public void fleeBattle() {
        System.out.println("The troll calls for help!");
        hostile.fleeBattle();
    }
}
