package designpatterns.behavioral.strategy;

public class Demo {
    public static void main(String[] args) {
        RouteStrategy strategy = new RoadStrategy();
        Navigator navigator = new Navigator(strategy);
        Route route = navigator.buildRoute("nordsee");
        route.travel();
    }
}
