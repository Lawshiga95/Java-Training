package com.lawshiga.bankManagement;

public class Bank {

    protected static String accountNumber;
    protected static String accountName;
    protected static double balance;

    public Bank(){

    }

    public static String getAccountNumber() {
        return accountNumber;
    }

    public static void setAccountNumber(String accountNumber) {
        Bank.accountNumber = accountNumber;
    }

    public static String getAccountName() {
        return accountName;
    }

    public static void setAccountName(String accountName) {
        Bank.accountName = accountName;
    }

    public static double getBalance() {
        return balance;
    }

    public static void setBalance(double balance) {
        Bank.balance = balance;
    }

}
