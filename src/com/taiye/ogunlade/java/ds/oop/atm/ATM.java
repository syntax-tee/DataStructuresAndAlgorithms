package com.taiye.ogunlade.java.ds.oop.atm;

public interface ATM {

    /*
     *Verifies user's pin
     * @param pin The user's PIN
     * @return Whether or not the user's pin is verified
     */
    boolean verifyPIN(String pin);
    boolean withdraw(String account,double amount);
    void display(String account,double amount,boolean success);
    void display(String pin, boolean success);
    void showBalance(String account);

}
