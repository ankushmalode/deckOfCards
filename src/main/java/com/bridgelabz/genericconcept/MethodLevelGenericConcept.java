package com.bridgelabz.genericconcept;

public class MethodLevelGenericConcept {
    public static void main(String[] args) {
        Address<String, Integer> address = new Address<>();
        address.setAddress("");

        Address<Integer, String> address1 = new Address<>();
        address1.setAddress(1);
    }
}


// Template // Bounded type - generic i.e T extends Number
class Address<T, V> {
    private T firstName;
    private T lastName;
    private T address;
    private T city;
    private T state;
    private V pinCode;

    public T getFirstName() {
        return firstName;
    }

    public void setFirstName(T firstName) {
        this.firstName = firstName;
    }

    public T getLastName() {
        return lastName;
    }

    public void setLastName(T lastName) {
        this.lastName = lastName;
    }

    public T getAddress() {
        return address;
    }

    public void setAddress(T address) {
        this.address = address;
    }

    public T getCity() {
        return city;
    }

    public void setCity(T city) {
        this.city = city;
    }

    public T getState() {
        return state;
    }

    public void setState(T state) {
        this.state = state;
    }

    public V getPinCode() {
        return pinCode;
    }

    public void setPinCode(V pinCode) {
        this.pinCode = pinCode;
    }
}
