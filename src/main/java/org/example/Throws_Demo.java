package org.example;

/* throws:- The throws keyword in Java is used when there is a possibility of an exception occurring within a method. 
 * It allows you to declare that a method may throw one or more exceptions.
When a method is declared with throws, it indicates that the method may propagate exceptions to its caller.
The caller of such a method must handle the exceptions using a try-catch block or declare them with throws as well.
Use throws Keyword for checked exceptions Only
Here the"throws" keyword is used along with Method*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws_Demo 
{

	public void readFile() throws FileNotFoundException 
	{
		FileInputStream fis = new FileInputStream("F:\\Jnr\\FORM B");
	}
	
	public static void main(String[] args) throws FileNotFoundException 
	{
		Throws_Demo TD = new Throws_Demo();
		TD.readFile(); 
		
		System.out.println("Last Execution");
	}
     
	
}
  