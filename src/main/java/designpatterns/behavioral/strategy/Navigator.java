package designpatterns.behavioral.strategy;

public class Navigator {
    private RouteStrategy routeStrategy;

    public Navigator(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public Route buildRoute(String route){
        return routeStrategy.buildRoute(route);
    }
}
