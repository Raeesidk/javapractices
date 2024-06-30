package org.example;

import java.util.Scanner;

public class Scannerclass_userdata
{
/**The Scanner class is a Predefined class iwhich is used for reading data dynamically from the keyboard  .
 * It is widely used for reading input of Primitive data type & Strings**/
/*Basically in  this Scanner class  at the time of execution of code in compiler
USER NEEDS TO ENTER THE  INPUT OF DATA TYPE VALUES  : Output: Enter age : 33 Output: my age is 33 */

/*SYNTAX: Scanner sc = new Scanner(System.in);*
Here "sc " is an object of scanner class by using which we can call methods of scanner class to take input from user*/
    /** To take the input of the data types we nedd to use  "next" methods of scanner class for each data types we have different "next" methods in scanner class i.e.
    * for int : nextInt(); , for long : nextLong(); , byte: nextByte(); , short: nextShort(); , float: nextFloat(); , double: nextDouble();
    * char: nextChar(); , boolean: nextBoolean(); & String: nextLine();
    * we need to give this method giving the data type variable name see example : **/
    /**SYNTAX: - int age = sc . nextInt(); **/
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter name : ");
    String name = sc.nextLine();
    System.out.println("The User name is : " + name + " 🐱‍👤⚔ ");

    System.out.println("Enter age : ");
    byte age = sc.nextByte();
    System.out.println("The User age is : " + age);

    System.out.println("Enter User Mobile number : ");
    long Ph_no = sc.nextLong();
    System.out.println("The User mobile number is : " + Ph_no);

    System.out.println("Enter User ID : ");
    int User_ID = sc.nextInt();
    System.out.println("The User ID is : " + User_ID);

    System.out.println("Enter User Date Of Birth : ");
    short DOB = sc.nextShort();
    System.out.println("The User  Date Of Birth is : " + DOB);

    System.out.println("Enter User Weight : ");
    float weight = sc.nextFloat();
    System.out.println("The User weight is : " + weight + "Kgs");

    System.out.println("Enter User Height ; ");
    double height = sc.nextDouble();
    System.out.println("The User Height is : " + height + "feet");

    System.out.println("Enter User Blood group : ");
    char Bloodgroup = sc.next().charAt(0);
    System.out.println("The User Blood group is : 🩸 " + Bloodgroup + "+ (Positive)");




}
}

