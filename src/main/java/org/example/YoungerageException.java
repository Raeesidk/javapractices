package org.example;
/*To create an Customized exception we need to Create an class of that Customized Exception(YoungerageException) 
& need to Extend with parent Exception(RuntimeException)*/
 class YoungerageException extends RuntimeException
{

	YoungerageException(String msg)
	{
		super(msg);
	}

}
