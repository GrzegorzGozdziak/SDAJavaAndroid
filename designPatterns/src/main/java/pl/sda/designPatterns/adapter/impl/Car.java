package pl.sda.designPatterns.adapter.impl;

import pl.sda.designPatterns.adapter.CarInterface;

/**
 * Created by RENT on 2017-02-27.
 */
public class Car implements CarInterface{
    @Override
    public void drive() {
        System.out.println("jade");
    }

    @Override
    public void horn() {
        System.out.println("trabie");
    }
}
