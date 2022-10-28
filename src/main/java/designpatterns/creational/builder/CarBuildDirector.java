package designpatterns.creational.builder;

public class CarBuildDirector {

    private CarBuilder builder;

    public CarBuildDirector(CarBuilder builder) {
        this.builder = builder;
    }

    public Car construct() {
        return this.builder.setWheels(4)
                .setColor("Red")
                .build();
    }

    public Car constructSupercar(){
        return this.builder.setWheels(4)
                .setColor("White")
                .build();
    }
}
