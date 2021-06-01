package com.java.business;

import java.io.FileNotFoundException;	

import com.java.exceptions.MyCustomException;
import com.java.generics.GenericMethods;

public class MyBusinessLogic {

	public void genericsExample() throws MyCustomException, FileNotFoundException {
//		
//		FileInputStream fis = null;
//		
//		fis = new FileInputStream("");

		Integer arraySize = 9;
		
		// Create arrays of Integer, Double and Character
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

		System.out.println("Array integerArray contains:");
		GenericMethods.printArray(intArray); // pass an Integer array

		System.out.println("\nArray doubleArray contains:");
		GenericMethods.printArray(doubleArray); // pass a Double array

		System.out.println("\nArray characterArray contains:");
		GenericMethods.printArray(charArray); // pass a Character array
		
// if you uncomment this line it will throw null pointer exception
//		Object[] differentTypesArray = new Object[arraySize];
		Object[] differentTypesArray = new Object[6];
		differentTypesArray[0] = new String("String1");
		differentTypesArray[1] = new Integer(1);
		differentTypesArray[2] = new String("String2");
		differentTypesArray[3] = new Double(2.2);
		differentTypesArray[4] = new String("String3");
		differentTypesArray[5] = new Float(3.33333333);

		System.out.println("\nArray differentTypesArray contains:");
		GenericMethods.printArray(differentTypesArray);
		
		System.out.println("\nArray differentTypesArray contains objects of the following types:");
		GenericMethods.printArrayTypes(differentTypesArray);
		
//		if you uncomment this line,  the entire thing will break when you run it. why?		
//		System.out.println(differentTypesArray[10]);
		
		
		try {
			System.out.println(differentTypesArray[10]);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Gee, looks like we FINALLY made it. get it? no? ok..");
		}
		
		try {			
			GenericMethods.checkArrayTypes(charArray);
			GenericMethods.checkArrayTypes(differentTypesArray);
		} catch (MyCustomException e) {
			System.out.println("HEY WAIT A MINUTE!! i found something we don't want here in MyBusinessLogic.java line 54!");
			throw e;
		}finally {
			System.out.println("did this print? if so, we handled exceptions correctly and the finally block worked as expected.");
		}
		System.out.println("will this print?");

	}
}
