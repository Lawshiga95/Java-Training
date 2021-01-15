package com.lawshiga.bankManagement;

import com.lawshiga.exceptions.OverDraftException;

public class BankManagementSystem {

    public static void main(String args[]){
        String accountName = "Lawshiga";
        String accountNumber = "1212344209";
        double balance = 2000.0;

        Bank.setAccountName(accountName);
        Bank.setAccountNumber(accountNumber);
        Bank.setBalance(balance);

        BankService bankService = new BankService();

        try {
            bankService.withdrawCash(3000.0);
        } catch (OverDraftException e) {
            e.printStackTrace();
        }
    }
}
