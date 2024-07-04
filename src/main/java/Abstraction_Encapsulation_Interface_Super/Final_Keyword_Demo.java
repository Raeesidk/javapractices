package Abstraction_Encapsulation_Interface_Super;
/**Final:- The "final" keyword in Java serves various purposes, such as making variables constant, preventing method overrides, and restricting class inheritance.*/
final class pop //Declare a class as final to prevent it from being extended (inherited) by other classes. Useful for creating unmodifiable utility classes.
{
   final void display() //Final Methods:- we can Mark a method as final to prevent it from being overridden by subclasses.
   {
        System.out.println("I am Top class");
    }
}
public class Final_Keyword_Demo  // restricting class inheritance because of final parent Class
{
  final   int a=10203;  //When a variable is declared as final, its value cannot be changed once initialized. It’s often used for constants. Or Declare a variable as final to make it constant
    void display()
    {
        System.out.println("I am Down class");
    }
    public static void main(String[] args)
    {
        Final_Keyword_Demo obj = new Final_Keyword_Demo();
        System.out.println(obj.a);  // here we get the current value of "a" Before using final keyword.
//        obj.a=30201;    // here we changed the value of "a" Before using final keyword.
//        System.out.println(obj.a);  // here we get the value of changed variable "a"
        System.out.println(obj.a); // So here when we use final keyword we are unable to change it
        obj.display();

    }
}
