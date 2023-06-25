package com.taiye.ogunlade.basics.oop.atm;

public class ATMbankAmerica implements  ATM{
    @Override
    public boolean verifyPIN(String pin) {
        return false;
    }

    @Override
    public boolean withdraw(String account, double amount) {
        return false;
    }

    @Override
    public void display(String account, double amount, boolean success) {

    }

    @Override
    public void display(String pin, boolean success) {

    }

    @Override
    public void showBalance(String account) {

    }
}
