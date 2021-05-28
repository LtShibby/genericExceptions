package com.java.generics;

import com.java.exceptions.MyCustomException;

public class GenericMethods {

   public static < E > void printArray( E[] inputArray ) {
      // Display array elements
      for(E element : inputArray) {
         System.out.printf("%s ", element);
      }
      System.out.println();
   }
   
   public static < E > void printArrayTypes( E[] inputArray ) {
	      // Display array elements
	      for(E element : inputArray) {
	         System.out.printf("%s ", element.getClass());
	      }
	      System.out.println();
	   }
   
   public static < E > void checkArrayTypes( E[] inputArray ) throws MyCustomException {
	      // Display array elements
	   Integer integer = 1;
	      for(E element : inputArray) {
	    	  
	    	  if(element.getClass().equals(integer.getClass())) {
	    		  throw new MyCustomException("Looks like this is the type we don't want.");
	    	  }
	    	  
	      }
	      System.out.println("All types are valid~!!1!one!");
	   }
}
