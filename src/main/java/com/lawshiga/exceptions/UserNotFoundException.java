package com.lawshiga.exceptions;

public class UserNotFoundException extends Exception{

    public UserNotFoundException(){
        super("Invalid Account Name and Account Number");
    }
}
