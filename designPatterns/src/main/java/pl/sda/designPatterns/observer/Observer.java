package pl.sda.designPatterns.observer;

public class Observer {
    public void react(int value) {
        System.out.println("Value " + value + " changed by observer");
    }
}
