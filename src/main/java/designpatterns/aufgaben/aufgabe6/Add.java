package designpatterns.aufgaben.aufgabe6;

public class Add implements CalculationMethod{
    @Override
    public int execute(int a, int b) {
        System.out.println("Called Add's execute()");
        return a + b; // Do an addition with a and b
    }
}
