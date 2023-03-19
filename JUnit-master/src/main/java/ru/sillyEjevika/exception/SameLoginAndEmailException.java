package ru.sillyEjevika.exception;

public class SameLoginAndEmailException extends RuntimeException{
    public SameLoginAndEmailException(String message) {
        super(message);
    }
}
