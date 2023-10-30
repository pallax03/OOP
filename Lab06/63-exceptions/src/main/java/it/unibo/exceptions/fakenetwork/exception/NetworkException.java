package it.unibo.exceptions.fakenetwork.exception;

import java.io.IOException;

public class NetworkException extends IOException{
    NetworkException() {
        super("Network error: no response");
    }
    public NetworkException(String message) {
        super("Network error while sending message: "+message);
    }
}
