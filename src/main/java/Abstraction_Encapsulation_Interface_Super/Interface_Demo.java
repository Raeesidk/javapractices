package Abstraction_Encapsulation_Interface_Super;
/*Interface:-It is similar to abstract class, but it allows u to define ONLY ABSTRACT Methods by default
* 1) It is used to achieve abstraction.2) It supports Multiple Inheritance.3) It can be used to achieve Loose coupling. */
/**NOTE:- TO inherit from Class➡ we use "extends" key word➡Class, similarly we use "extends" key word for Interface ➡ extends➡Interface
 * But for Interface to Class We use "implements" key word  Interface ➡implements➡Class*/
interface Inter1
{
     int a=15;
    void show(); //A Method without implementation(no body)
    static void staticMethod()
    {
        System.out.println("This is a static method.");
    }
    // Concrete method (non-static)
    default void concreteMethod() {
        System.out.println("This is a concrete method.");
    }
    // private method
    private void PrivateMethod()
    {
        System.out.println("This is a protected method.");
    }
}


public class Interface_Demo implements Inter1
{
       public void show()
        {  //Here we are Overriding the method of Interface.
            System.out.println("hey It's Overriding(replace) the method by child class");
        }

    public static void main(String[] args)
    {
        Inter1 obj = new Interface_Demo();
        System.out.println(obj.a);
       Interface_Demo id = new Interface_Demo();
       id.show();
       id.concreteMethod();
       Inter1.staticMethod();

    }
}
