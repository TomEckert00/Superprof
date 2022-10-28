package designpatterns.creational.prototype;

public class Demo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";

        Circle anotherCircle = (Circle) circle.clone();

        System.out.println(anotherCircle.x);
        System.out.println(anotherCircle.y);
        System.out.println(anotherCircle.radius);
        System.out.println(anotherCircle.color);
        System.out.println(anotherCircle.equals(circle));
    }

}