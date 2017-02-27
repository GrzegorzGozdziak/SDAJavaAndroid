package pl.sda.designPatterns.builder;

public class PersonBulider {
    private Person person;

    public PersonBulider() {
        person = new Person();
    }

    public PersonBulider withFirstName(String firstName) {
        person.setFirstName(firstName);
        return this;
    }

    public PersonBulider withLastName(String lastName) {
        person.setLastName(lastName);
        return this;
    }

    public PersonBulider withPersonAddress(PersonAddress personAddress) {
        person.setAddress(personAddress);
        return this;
    }

    public PersonBulider withPesel(String pesel) {
        person.setPesel(pesel);
        return this;
    }

    public Person build() {
        return person;
    }
}
