package Abstraction_Encapsulation_Interface_Super;
/**The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:
 declare class variables/attributes as private & provide public "get" and "set" methods to access and update the value of a private variable
 *Rules:- private variables can only be accessed within the same class (an outside class has no access to it). However,
 * it is possible to access them if we provide public "get" and "set" methods.*/

class Employ
{
    private int empId = 1563;
    public void setEmpId(int empid)  //the "set" method sets the value
    {
        empId= empid;
    }
    public int getEmpId()  //The "get" method returns the variable value,
    {
        System.out.println("Current value of Employ id is : - " + empId);
        return empId;
    }
}
public class Company_Encapsulation
{
    public static void main(String[] args)
    {
        Employ obj = new Employ();
        obj.setEmpId(4596);
        obj.getEmpId();

    }
}
