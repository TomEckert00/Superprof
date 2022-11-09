package designpatterns.aufgaben.aufgabe6;

public class Context {
    private CalculationMethod calculationMethod;

    public Context(CalculationMethod calculationMethod) {
        this.calculationMethod = calculationMethod;
    }
    public int executeCalculation(int a, int b) {
        return this.calculationMethod.execute(a, b);
    }
}
