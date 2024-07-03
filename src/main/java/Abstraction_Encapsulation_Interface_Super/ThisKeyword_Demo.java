package Abstraction_Encapsulation_Interface_Super;
public class ThisKeyword_Demo 
{
	int a=10;
	void add (int a)
	{
		this.a=a;
     System. out.println ("Method a Value: " + a);
	}
	public static void main (String [] args) 
	{
	  ThisKeyword_Demo tkd=new ThisKeyword_Demo();
	System. out.println (tkd.a);
	tkd.add (60);
    System. out.println (tkd.a);
	
	}
}

class main 
{

	
	
}