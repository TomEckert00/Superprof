package solid.Aufgabe2;

public class AnimalFeeder {

    //Open Closed Principle

    public enum AnimalType {
        CAT,
        DOG;
    }

    public void feed(AnimalType animalType) {
        switch (animalType) {
            case CAT:
                System.out.println("Feed fish.");
                break;
            case DOG:
                System.out.println("Feed meat.");
                break;
            default:
                throw new IllegalArgumentException();
        }
    }
}
