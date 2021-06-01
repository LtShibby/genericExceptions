package com.java.exceptions;

public class MyCustomException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9173636766595515090L;

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
