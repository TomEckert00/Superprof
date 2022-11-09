package designpatterns.aufgaben.aufgabe6;

public class Subtract implements CalculationMethod{

    @Override
    public int execute(int a, int b) {
        System.out.println("Called Subtract's execute()");
        return a - b; // Do a subtraction with a and b
    }
}
