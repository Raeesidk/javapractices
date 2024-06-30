package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
/*NOTE: - Either if its an Checked Exceptions or UncheckedException it will show/got to know at the RUN TIME ONLY **/
public class CheckedException_Demo {
/*Checked Exception:- An exception which we expect at the compile time is known as Checked exception
 * */
	public static void main(String[] args) throws FileNotFoundException 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\OneDrive\\Documents\\abcd.pdf");
		 
		System.out.println("Last Execution");
	}

}
