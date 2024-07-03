package Abstraction_Encapsulation_Interface_Super;
/**Super:- The super keyword in Java is a powerful tool used to refer to the parent class when working with objects.
 * When creating a child class, its constructor must call the constructor of its parent class using super().
 * super must be the first statement in a constructor.
 * It cannot be used in a static context (e.g., static methods or variables).*/
class Superdad
{
    int a=10;
}
public class SuperKeyword_Demo extends Superdad
{
    int a=20;
    void show()
    {
        int a=30;
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);   //A child class can call a method defined in its parent class using the "super" keyword.
    }
    public static void main(String[] args)
    {
        SuperKeyword_Demo skd = new SuperKeyword_Demo();
        skd.show();
    }
}
