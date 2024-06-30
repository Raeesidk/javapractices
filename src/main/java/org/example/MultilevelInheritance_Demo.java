package org.example;

/**MultilevelInheritance :- In multilevel inheritance, a Child class extends from a Parent class and then the same Child class acts as a Parent class for another class.   */
class GrandFather  // Parent  Class
{
    public void gfMethod ()
    {
        System. out. println ("Grand Father Method");
    }
}
class Father extends GrandFather  // Child Class inheriting from Parent Class
{
    public void fatherMethod ()   // Child Class
    {
        System. out. println ("Father Method");
    }
}
public class MultilevelInheritance_Demo extends Father
// Here the Child Class ("Father ") Act as a PARENT Class & MultilevelInheritance_Demo is a (CHILD class )and this Class inherits form Parent Class (Father)
{
    public void meMethod ()
    {
        System. out.println ("Me Method");
    }
    public static void main (String [] args)
    {
        GrandFather gf=new GrandFather ( );
        gf.gfMethod ();
        Father f=new Father ();
        f. fatherMethod ();
        f.gfMethod();
        MultilevelInheritance_Demo my = new MultilevelInheritance_Demo();
        my.meMethod();
        my.fatherMethod();
        my.gfMethod();
    }
}



