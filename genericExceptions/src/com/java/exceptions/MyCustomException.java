package com.java.exceptions;

public class MyCustomException extends Exception {

	/**
	 *  Auto Generated serial version UID
	 */
	private static final long serialVersionUID = 2695891167081663952L;
	
	public MyCustomException() {
		super();
	}
	
	public MyCustomException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	
	public MyCustomException(String message, Throwable cause) {
		super(message, cause);
	}
	
    public MyCustomException(String message) {
        super(message);
    }
    
    public MyCustomException(Throwable cause) {
        super(cause);
    }
	
	

}
