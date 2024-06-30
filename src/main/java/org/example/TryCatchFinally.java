package org.example;

public class TryCatchFinally {

	public static void main(String[] args) 
	{
/*we use "try" block when we expect the exception in that  block of code When an exception occurs within the try block, 
the control transfers to the corresponding catch block.it's important to add catch block with try block to handle Exception*/
		try 
		{
            System.out.println("1");
            System.out.println("2");
            System.out.println(10/0);
            System.out.println("3");
            System.out.println("4");
	    }
//	The catch block follows the try block.It catches and handles exceptions thrown within the try block.	
		catch (Exception e) 
		{
			System.out.println(e);
		}
/*	The finally block contains code that executes regardless of whether an exception occurs or not. we can give any statements/code 
		which is important to be printed.
NOTE:- If we use "try" block with "finally" block instead of "Catch" the exception can't be handled & the JVM will Only execute 
 the finally block only    */ 	
		finally 
		{
		  	System.out.println("This is finally Block");
		}
		
		System.out.println("Last line of Code/statement ");
		
	}	

}
