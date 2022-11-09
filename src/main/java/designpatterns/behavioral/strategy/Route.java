package designpatterns.behavioral.strategy;

public record Route(String route, String transport) {

    public void travel(){
        System.out.println(this.toString());
    }
}
