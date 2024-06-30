package org.example;
/**Inheritance:- inheriting the properties of parent class into child class. Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object.
 Inheritance represents the IS-A relationship which is also known as a parent-child relationship, There are 5 types of inheritance*/

 /*1.Single Inheritance: one parent class & one Child class. Child class Inheriting the parent class is known as  Single Inheritance */
class Papa  //Parent Class
{
    public void papaMethod ()
    {
        System. out.println ("Papa Method");
    }
}
public class SingleInheritance_Demo extends Papa   //Child Class the "extends" Key word is used to inherit the properties from classes in Inheritance
{
    public void childMethod()
    {
        System. out. println ("Child Method");
    }
    public static void main (String [] args)
    {
        Papa p=new Papa ();
        p.papaMethod ();
        SingleInheritance_Demo sid=new SingleInheritance_Demo () ;
        sid. childMethod () ;
        sid.papaMethod () ;
    }
}



