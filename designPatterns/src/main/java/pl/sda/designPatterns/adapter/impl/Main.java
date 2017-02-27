package pl.sda.designPatterns.adapter.impl;

import pl.sda.designPatterns.adapter.PersonInterface;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        Person person = new Person();

        CarToPersonAdapter carToPersonAdapter = new CarToPersonAdapter(car);

        List<PersonInterface> personsList = new ArrayList<>();

        personsList.add(person);
        personsList.add(carToPersonAdapter);

        for (PersonInterface personFromList : personsList) {
            personFromList.move();
            personFromList.say();
        }
    }

}
