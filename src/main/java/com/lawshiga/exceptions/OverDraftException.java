package com.lawshiga.exceptions;

public class OverDraftException extends Exception {

    public OverDraftException(){
        super("Amount you want to withdraw exceeds the limit");
    }
}
