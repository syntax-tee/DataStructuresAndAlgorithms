package com.taiye.ogunlade.basics.oop.bank;

public class Student extends  Customer {

    public static final double SAVINGS_INTEREST = 0.04;
    public static final double CHECK_INTEREST = 0.01;
    public static final double CHECK_CHARGE = 0.02;
    public static final double OVERDRAFT_PENALTY = 25;


    public Student(String name, String address, int age, String telephoneNumber) {
        super(name, address, age, telephoneNumber);
    }

    @Override
    double getSavingsInterest() {
        return 0.0;
    }

    @Override
    double getCheckInterest() {
        return 0.0;
    }

    @Override
    double getCheckCharge() {
        return 0.0;
    }
}
