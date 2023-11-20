package com.taiye.ogunlade.java.ds.oop.bank;

public abstract class Customer {

    private String name;
    private String address;
    private int age;
    private String telephoneNumber;
    private int customerNumber;


    public Customer(String name, String address, int age, String telephoneNumber) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.telephoneNumber = telephoneNumber;
    }

    abstract double getSavingsInterest();

    abstract double getCheckInterest();

    abstract double getCheckCharge();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = String.valueOf(telephoneNumber);
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }
}
