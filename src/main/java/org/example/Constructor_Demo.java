package org.example;

public class Constructor_Demo
{
    /**Constructor:- A constructor is a block of codes similar to the method. Having same name as Class Name.
     * It is called when an instance of the class is created. At the time of calling constructor, memory for the object is allocated in the memory.
     * It's Execute automatically when we create an object. Every time an object is created using the new() keyword, at least one constructor is called.
     * Types of Java constructors:There are two types of constructors in Java:1. Default constructor (no-arg constructor)2. Parameterized constructor*/

    /*Rules for creating Java constructor: -There are two rules defined for the constructor.
1. Constructor name must be the same as its class name2. Does not have any return_type not even Void.
3. The only modifiers applicable for constructor are public, private, default and protected. A Java constructor cannot be abstract, static, final, and synchronized*/
    Constructor_Demo ()
    {
        System. out.println ("Hey It's me Constructor");
    }
    Constructor_Demo (String name)
    {
        System. out.println ("Hey It's me Constructor and My name is: "+name);
    }
    public static void main (String[] args)
    {
        Constructor_Demo cd = new Constructor_Demo () ;
        Constructor_Demo cd1 = new Constructor_Demo ("Jyoti");  //this is a parameterized constructor
    }
}
