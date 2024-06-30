package org.example;

import java.util.Scanner;

/*The "Throw key word is used to create an Customized Exception
 * To create an exception we need to Create an class of Customized Exception & need to Extend with parent Exception"
 * The throw key word is Followed by an object (instance) of an exception type.
 * In case of Throw Keyword we can Throw only single Exception
 * This keyword is used with in the method
 **/

public class Throw_Demo {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		if(age<18) 
		{
			throw new YoungerageException("You are Minor");    //This "throw" key word if followed by "new" key word & 
                                                               //we can not write any statement after throw keyword
		}
		else
		{
		  System.out.println("You can Vote");	
		}

	}

}
