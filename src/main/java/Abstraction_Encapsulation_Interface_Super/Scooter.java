package Abstraction_Encapsulation_Interface_Super;
/**Abstraction:- HIDING  THE IMPLEMENTATION (body of method ) OF METHOD IS KNOWN AS  ABSTRACTION In JAVA**/
/* OR Abstraction in Java refers to the practice of hiding implementation(method with body) details and providing a simplified view of a system to its users.
Instead of exposing all the details of how an object works, abstraction focuses on what the object does. In Java, you can achieve abstraction using ABSTRACT classes and INTERFACES*/
/**NOTE:- An ABSTRACT Class can have any Regular method But ABSTRACT Method should be in ABSTRACT Class ONLY
 * We can not Create the OBJECT OF ABSTRACT Class
 *If a regular class "extends"(Inheritance ) the Abstract class then that regular class method should be implemented */

abstract class Vehicle
{
     abstract void start();  // this is a Parent class method which gets override(replace) by child class method
}
class car extends Vehicle
{
    void start()   //here the child class Method overrides(replace) the parents class Method
    {
        System.out.println("Car Starts with the Key");
    }
}

public class Scooter extends Vehicle
{
   void start ()  //here the child class Method overrides(replace) the parents class Method
   {
       System.out.println("Scooter Starts with the Kick or Self Button");
   }

    public static void main(String[] args)
    {
         car c = new car();
         c.start();
         Scooter s = new Scooter();
         s.start();
    }
}
