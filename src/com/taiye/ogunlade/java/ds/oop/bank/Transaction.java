package com.taiye.ogunlade.java.ds.oop.bank;

public class Transaction {

    private String customerNumber;
    private int transactionType;
    private double amount;
    private String date;
    private String fees;

    public Transaction(String customerNumber, int transactionType, double amount, String date, String fees) {
        this.customerNumber = customerNumber;
        this.transactionType = transactionType;
        this.amount = amount;
        this.date = date;
        this.fees = fees;
    }

    private void processTran() {

    }
}
