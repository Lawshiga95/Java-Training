package com.lawshiga.bankManagement;

import com.lawshiga.exceptions.NoSessionCreatedException;
import com.lawshiga.exceptions.OverDraftException;
import com.lawshiga.exceptions.UserNotFoundException;

public class BankService {

    private boolean sessionRecord;

    public BankService(){

    }

    public void recordSession() throws NoSessionCreatedException {
        if(!sessionRecord) {
            throw new NoSessionCreatedException();
        } else {
            System.out.println("Session starts: ");
        }
    }

    public void authenticateUser(String accountName, String accountNumber) throws UserNotFoundException {
        try {
            recordSession();
        } catch (NoSessionCreatedException e) {
            e.printStackTrace();
        }
        if((accountName.equalsIgnoreCase(Bank.accountName)) && (accountNumber.equals(Bank.accountNumber))) {
            System.out.println("Authentication successful");
        } else {
            throw new UserNotFoundException();
        }
    }

    public void withdrawCash(double amount) throws OverDraftException {

        BankService bankService = new BankService();
        try {
            bankService.authenticateUser("lawshiga", "1212121212");
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
        if(amount > Bank.balance) {
            throw new OverDraftException();
        }
        Bank.balance = Bank.balance - amount;
        System.out.println("Amount withdrawn, Current Balance: " + Bank.balance);
    }

}
