package pl.sda.designPatterns.adapter.impl;

import pl.sda.designPatterns.adapter.PersonInterface;

/**
 * Created by RENT on 2017-02-27.
 */
public class Person implements PersonInterface {
    @Override
    public void move() {
        System.out.println("Ide");
    }

    @Override
    public void say() {
        System.out.println("mowie");

    }
}
