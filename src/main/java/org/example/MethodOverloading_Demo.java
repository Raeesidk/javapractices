package org.example;
 /**Polymorphism(METHOD OVERLOADING & OVERRIDING):- POLY means(many) MORPH means(forms). there are 2 types of polymorphism
  * 1.Compile time polymorphism/Static polymorphism (It is achieved by  METHOD OVERLOADING ) & 2. Runtime polymorphism/Dynamic polymorphism
  * METHOD OVERLOADING :- having Same class, same methods name , but different parameters is known as METHOD OVERLOADING */
public class MethodOverloading_Demo
{
    public void Quirk(int i , String a , double d) // different parameters & same method name in same class
    {
        System.out.println("I am Quirkless" + i + a + d);
    }

    public void Quirk ( String a , double d, int i) // different parameters & same method name in same class
    {
        System.out.println("I have Quirk" + a + d + i);
    }

    public static void main(String[] args)
    {
     MethodOverloading_Demo  mdo = new MethodOverloading_Demo();
     mdo.Quirk(24, "Zoro", 78.5);
     mdo.Quirk("Ace", 85.5, 27);
    }
}
