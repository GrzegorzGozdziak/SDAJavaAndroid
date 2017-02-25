package pl.sda.builder;

import java.util.Arrays;

/**
 * Created by RENT on 2017-02-25.
 */
public class Main {
    public static void main(String[] args) {
        PersonBulider personBulider = new PersonBulider();

        PersonAddress address = new PersonAddress();
        address.setCity("Poznan");
        address.setStreet("Baraniaka 88");
        address.setPostalCode("60-111");

        Person person = personBulider
                .withFirstName("Greg")
                .withLastName("Goz")
                .withPesel("986754322")
                .withPersonAddress(address)
                .build();

        System.out.println(person.toString());
    }
}
