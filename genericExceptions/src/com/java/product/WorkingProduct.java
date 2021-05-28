package com.java.product;

import com.java.business.MyBusinessLogic;
import com.java.exceptions.MyCustomException;
import com.java.generics.GenericMethods;

public class WorkingProduct {

	public static void main(String[] args) {
		
		MyBusinessLogic myBusinessLogic = new MyBusinessLogic();
		
		try {
			myBusinessLogic.genericsExample();
		} catch (MyCustomException e) {
			System.out.println("ok now we will print this stack trace from WorkingProduct.java line 16");
			e.printStackTrace();
		}
	}
}
