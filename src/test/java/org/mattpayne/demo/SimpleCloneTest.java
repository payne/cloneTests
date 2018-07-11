package org.mattpayne.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

public class SimpleCloneTest {

    @Test
    public void simpleAssignmentUsesReferences() {
        Person george = new Person("George Harrison");
        Person paul = george;
        assertEquals(george, paul);
    }

    @Test
    public void changingEitherReferenceWorks() {
        Person george = new Person("George Harrison");
        Person paul = george;
        assertEquals(george, paul);
        paul.setName("Paul McCartney");
        assertEquals(george, paul);
        assertEquals(paul.getName(), "Paul McCartney");
    }

    @Test
    public void cloneMakesCopy() {
        String name = "George Harrison";
        String streetNumber = "One";
        String street = "Abbey Road";
        String city = "London";
        String state = "Cool";
        String country = "England";
        String zipThing = "1234567890";
        Person george = new Person(name);
        Address address = new Address(streetNumber, street,city,state,country,zipThing);
        george.setAddress(address);
        Person georgeClone = george.clone();
        assertNotEquals(george, georgeClone);
        assertEquals(georgeClone.getAddress().getCity(),city);
        georgeClone.getAddress().setCity("Omaha");
        assertEquals(georgeClone.getAddress().getCity(),"Omaha");
        assertEquals(george.getAddress().getCity(),city);

    }
}

