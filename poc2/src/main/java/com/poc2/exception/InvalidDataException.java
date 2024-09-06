package com.poc2.exception;

public class InvalidDataException extends RuntimeException {
    
	public InvalidDataException(String message) {
        super(message);
    }
	
}