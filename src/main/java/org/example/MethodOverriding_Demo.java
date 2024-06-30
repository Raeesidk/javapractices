package org.example;
/*2. Runtime polymorphism/Dynamic polymorphism :- is achieved by METHOD OVERRIDING*/
/**Method Overriding:- Having Different Classes , Same  parameters & Same Methods name is known as Method Overriding (replace).
 * Method Overriding can be performed  with the help of  INHERITANCE CONCEPT  ONLY   BY USING "EXTENDS" KEY WORD.  */
class MHA
{
    public void Hero(String a, String power, int rank)
    {
        System.out.println("H Data : " + a + power + rank );
    }
}
public class MethodOverriding_Demo extends MHA
{
    public void Hero (String a, String power, int rank)
    {
        System.out.println("I am All for one ");
    }

    public static void main(String[] args)
    {
        MethodOverriding_Demo obj = new MethodOverriding_Demo();
       obj.Hero("All might", "One for All", 1);
       obj.Hero("Eraser head","Eraser",5);
    }
}


