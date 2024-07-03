package Abstraction_Encapsulation_Interface_Super;

import com.sun.jdi.PathSearchingVirtualMachine;

/**This:- "this" keyword  can be used to call on current class method (implicitly)
 * You may  call on  the method of the current class by using the "this" keyword. If you don't use the "this" keyword, compiler AUTOMATICALLY adds this keyword while calling the method. Let's see the example*/
public class Thiskeyword_forMethodandConstructor
{
    void firstMethod()
    {
        System.out.println("this is 1st method");
    }
    void secondMethod ()
    {
        firstMethod();
        System.out.println("this is 2nd method");
    }

    public static void main(String[] args)
    {
       Thiskeyword_forMethodandConstructor obj = new Thiskeyword_forMethodandConstructor();
       obj.firstMethod();   //As we can see here while calling the first method it will print statement of ONLY firstMethod.
       obj.secondMethod();    //As we can see here while calling the  Secondmethod  it will print statements of BOTH Methods
    }
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
}
/*this() : to call on current class constructor
The this() constructor call can be used to invoke the current class constructor. It is used to reuse the constructor. In other words, it is used for constructor chaining.*/
class A{
    A(){System.out.println("hello a");}
    A(int x){
        this();
        System.out.println(x);
    }
}
class TestThis5{
    public static void main(String[] args)
    {
        A a=new A(10);
    }
}