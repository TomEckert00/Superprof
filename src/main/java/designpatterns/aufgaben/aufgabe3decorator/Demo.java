package designpatterns.aufgaben.aufgabe3decorator;

public class Demo {

    public static void main(String[] args) {
        System.out.println("A simple looking troll approaches.");
        Hostile troll = new Troll();
        troll.attack();
        troll.fleeBattle();
        System.out.println("\nA smart looking troll surprises you.");
        Hostile smart = new SmartTroll(new Troll());
        smart.attack();
        smart.fleeBattle();
    }

}
