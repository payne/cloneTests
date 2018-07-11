package org.mattpayne.demo;

import java.util.Objects;

public class Address implements Cloneable {
    private String streetNumber, street, city, state, country, zipThing;

    public Address(String streetNumber, String street, String city, String state, String country, String zipThing) {
        this.streetNumber = streetNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipThing = zipThing;
    }

    @Override
    public Address clone() {
        Address clone = new Address(streetNumber,street,city,state,country,zipThing);
        return clone;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetNumber='" + streetNumber + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zipThing='" + zipThing + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;
        Address address = (Address) o;
        return Objects.equals(streetNumber, address.streetNumber) &&
                Objects.equals(street, address.street) &&
                Objects.equals(city, address.city) &&
                Objects.equals(state, address.state) &&
                Objects.equals(country, address.country) &&
                Objects.equals(zipThing, address.zipThing);
    }

    @Override
    public int hashCode() {

        return Objects.hash(streetNumber, street, city, state, country, zipThing);
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipThing() {
        return zipThing;
    }

    public void setZipThing(String zipThing) {
        this.zipThing = zipThing;
    }
}
