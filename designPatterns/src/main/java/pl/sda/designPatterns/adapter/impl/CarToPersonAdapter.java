package pl.sda.designPatterns.adapter.impl;

import pl.sda.designPatterns.adapter.CarInterface;
import pl.sda.designPatterns.adapter.PersonInterface;

public class CarToPersonAdapter implements PersonInterface {

    private CarInterface car;

    public CarToPersonAdapter(CarInterface car) {
        this.car = car;
    }

    @Override
    public void move() {
        car.drive();
    }

    @Override
    public void say() {
        car.horn();
    }
}
