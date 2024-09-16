package org.example;

public class CustomException extends Exception {
    public CustomException(String Message){
        super(Message);
    }
    public CustomException(String Message , Throwable cause){
        super(Message , cause);
    }
}
