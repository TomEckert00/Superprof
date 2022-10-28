package designpatterns.creational.builder;

public final class Car {
    private int wheels;
    private String color;
    public String getColor() {
        return this.color;
    }
    public void setColor(final String color) {
        this.color = color;
    }
    public int getWheels() {
        return this.wheels;
    }
    public void setWheels(final int wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + wheels +
                ", color='" + color + '\'' +
                '}';
    }
}
