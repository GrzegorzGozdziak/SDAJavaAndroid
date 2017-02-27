package pl.sda.designPatterns.builder;

import org.junit.Test;

/**
 * Created by Grzegorz on 2017-02-27.
 */
public class builderTest {

    @Test
    public void builderTest() {
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

        System.out.println();

        MovieBulider movieBulider = new MovieBulider();
        Movie movie = movieBulider.withTitle("PSY")
                .withDirector("Steven Spielberg")
                .withProductionYear(1982)
                .withGenres("Adventures movie")
                .build();
        System.out.println(movie.toString());
    }
}
