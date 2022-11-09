package designpatterns.behavioral.strategy;

public class RoadStrategy implements RouteStrategy{


    @Override
    public Route buildRoute(String route) {
        return new Route(route, "Road");
    }
}
