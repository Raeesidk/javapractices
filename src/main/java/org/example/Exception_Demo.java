package org.example;

public class Exception_Demo 
/*Exception Handling:- 
 *An Exception is an unwanted or unexpected event which occurs during the execution of a program. 
 *i.e ., at runtime, that disrupts the normal flow of the program.There are two types of Exceptions.
 *1.Checked Exceptions (Compile time Exceptions) & 2.UncheckedException (Run time Exceptions ).
 *2.Unchecked Exception:- An exception which we cant expect at the compile time is known as Unchecked exception?
 *Unchecked exceptions (also known as runtime exceptions) are not checked by the compiler at compile time. 
 *They occur during the execution of a program and are typically related to logical errors or invalid conditions/

/*NOTE: - Either if its an Checked Exceptions or UncheckedException it will show/got to know at the RUN TIME ONLY **/
{

	public static void main(String[] args) 
	{
		System.out.println("1");
        System.out.println("2");
        System.out.println(10/0);
        System.out.println("3");
        System.out.println("5");
	}

}
