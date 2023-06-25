package com.taiye.ogunlade.basics.oop.bank;

import java.util.List;

public class Account {
    private Customer customer;
    private double balance;
    private long accountNumber;

    private List<Transaction> transactions;

    public Customer getCustomer() {


        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
