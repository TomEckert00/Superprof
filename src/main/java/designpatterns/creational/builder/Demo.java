package designpatterns.creational.builder;

public class Demo {
    public static void main(final String[] args) {

        final CarBuilder builder = new CarBuilderImpl();

        final CarBuildDirector carBuildDirector = new CarBuildDirector(builder);

        System.out.println(carBuildDirector.construct());
    }
}
