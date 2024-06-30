package org.example;

public class AnimalMethod
        /**1.Method; A set of code which performs a particular task./ Behaviour
         * of an object can be method
//SYNTAX:- access_modifier(public, statisc etc.) return_type,method name (range of parameters)
         Advantage of method is :- code -reusability & code optimization
         METHOD IS ALWAYS WRITTEN OUTSIDE THE MAIN METHOD
         ( public static void main(String[] args)**/
/** For return_type we can use :- void, int, float, long, double, boolean, string,**/
{
    public void run()
    {
        System.out.println(" Tiger is running 🐅🐯 ");
    }
    public int dogage ()
    {
        int age = 30;
        System.out.println("Dog age is : 🐶" + age);
        return age;
    }
/**To create an  object we use 5 types of keywords: - new(), newinstance(), clone(), dsearialization() & factory ()
 * every keyword is used for different task */
    public static void main(String[] args)
    {
        AnimalMethod Tiger = new AnimalMethod();
        Tiger.run();
        Tiger.dogage();

    }

}
