package com.taiye.ogunlade.java.ds.oop.bank;

public class Bank {
    private final Account[] accounts;
    private int size;
    private static final int SAVINGS = 0;
    private static final int CHECKING = 1;
    private static final int SENIOR = 0;
    private static final int ADULT = 1;
    private static final int STUDENT = 2;

    public Bank() {
        accounts = new Account[100];
        size = 0;
    }

    String addAccount(String customerName, String customerAddress, int customerAge, String customerPhoneNumber, int customerType, int typeAccount) {
        String accountNumber = "";
        Customer customer;

        if(customerType == SENIOR){
            customer = new Senior(customerName,customerAddress,customerAge,customerPhoneNumber);
        }else if(customerType == ADULT){
            customer = new Student(customerName,customerAddress,customerAge,customerPhoneNumber);
        }else{
            customer = new Student(customerName,customerAddress,customerAge,customerPhoneNumber);
        }

        return accountNumber;
    }

    void makeDeposit() {

    }

    void makeWithdrawal() {

    }

    int getAccount() {
        return 0;
    }
}
