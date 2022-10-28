package designpatterns.creational.builder;

public class CarBuilderImpl implements CarBuilder {

    private Car car;

    public CarBuilderImpl() {
        this.car = new Car();
    }
    @Override
    public Car build() {
        final Car car = new Car();
        car.setColor(this.car.getColor());
        car.setWheels(this.car.getWheels());
        return car;
    }

    @Override
    public CarBuilder setColor(final String color) {
        this.car.setColor(color);
        return this;
    }

    @Override
    public CarBuilder setWheels(final int wheels) {
        this.car.setWheels(wheels);
        return this;
    }
}
