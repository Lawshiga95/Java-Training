package com.lawshiga.exceptions;

public class NoSessionCreatedException extends Exception{

    public NoSessionCreatedException(){
        super("Couldn't start new session, Try again later");
    }
}
