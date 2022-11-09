package designpatterns.behavioral.strategy;

public class WalkingStrategy implements RouteStrategy{

    @Override
    public Route buildRoute(String route) {
        return new Route(route, "Gehweg");
    }
}
