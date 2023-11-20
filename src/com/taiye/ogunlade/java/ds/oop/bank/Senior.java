package com.taiye.ogunlade.java.ds.oop.bank;

public class Senior extends Customer {

    public static final double SAVINGS_INTEREST = 0.03;
    public static final double CHECK_INTEREST = 0.001;
    public static final double CHECK_CHARGE = 0.03;
    public static final double OVERDRAFT_PENALTY = 25;

    public Senior(String name, String address, int age, String telephoneNumber) {
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
