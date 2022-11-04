package designpatterns.aufgaben.aufgabe3decorator;

public class Troll implements Hostile{
    @Override
    public void attack() {
        System.out.println("The troll swings at you with a club!");
    }
    @Override
    public void fleeBattle() {
        System.out.println("The troll shrieks in horror and runs away!");
    }
}
