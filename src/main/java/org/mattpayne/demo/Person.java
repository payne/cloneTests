package org.mattpayne.demo;
public class Person implements Cloneable {
    private String name;
    private Address address;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public Person clone() {
        Person aClone = new Person(this.name);
        Address addressClone = this.address.clone();
        aClone.setAddress(addressClone);
        return aClone;
    }
}
