package org.example;
/**HierarchicalInheritance : - Multiple Child Class inheriting form Single Parent class  is known as Hierarchical Inheritance*/
class Dad
{
    public void dadMethod()
    {
        System. out. println ("Dad Method");
    }
}
class Sis extends Dad
{
    public void sisMethod()
    {
        System. out. println("Sis Method");
    }
}
class Bro extends Dad
{
    public void broMethod ()
    {
        System. out. println ("Bro| Method");
    }
}
public class HierarchicalInheritance_Demo extends Dad
{
    public void mineMethod()
        {
            System.out.println("Mine Method");
        }
    public static void main (String [] args)
    {
        Dad d=new Dad () ;
        d. dadMethod ();
        System.out.println("____________________________________________________");
        Sis s=new Sis();
        s.sisMethod ();
        s. dadMethod();
        System.out.println("____________________________________________________");
        Bro b=new Bro();
        b.broMethod();
        b. dadMethod();
        System.out.println("____________________________________________________");
        HierarchicalInheritance_Demo hid=new HierarchicalInheritance_Demo ();
        hid.mineMethod();
        hid. dadMethod () ;
    }
}