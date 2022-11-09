package designpatterns.aufgaben.aufgabe6;

public class App {
    public static void main(String[] args) {
        Context context;
        // Three contexts following different calculation methods
        context = new Context(new Add());
        int resultA = context.executeCalculation(3, 4);
        context = new Context(new Subtract());
        int resultB = context.executeCalculation(3, 4);
        context = new Context(new Multiply());
        int resultC = context.executeCalculation(3, 4);
        System.out.println("Result A : " + resultA);
        System.out.println("Result B : " + resultB);
        System.out.println("Result C : " + resultC);
    }
}
