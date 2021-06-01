package com.java.product;

import java.io.FileNotFoundException;

import com.java.business.MyBusinessLogic;
import com.java.exceptions.MyCustomException;

public class WorkingProduct {

	public static void main(String[] args) {
		
		MyBusinessLogic myBusinessLogic = new MyBusinessLogic();
		
		try {
			myBusinessLogic.genericsExample();
		} catch (MyCustomException e) {
			System.out.println("ok now we will print this stack trace from WorkingProduct.java line 16");
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			System.out.println("ok now we will print this stack trace from WorkingProduct.java line 16");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("ok now we will print this stack trace from WorkingProduct.java line 16");
			e.printStackTrace();
		} finally {
			System.out.println("Glad that's over.");
		}
		
		System.out.println("This is the end of the main class.");
	}
}
