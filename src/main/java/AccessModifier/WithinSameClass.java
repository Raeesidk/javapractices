package AccessModifier;

public class WithinSameClass
{
//    1.Private: We can Access this method with in same Class ONLY
    private void privateMethod()
    {
        System.out.println("Private Method");
    }
//  2.Default method:- this method doesn't have any key word to create & We can access this method with in same class & from different class with in same package
    void defaultmethod ()
    {
        System.out.println("Default Method");
    }
//    3.Protected Method:- we can acess this method With in SameClass, With in SamePackage & Outside the package Subclass(with help of inheritance )
    protected void protectedMethod()
    {
        System.out.println("Protected Method");
    }
// 4. Public Method:- we can access this method With in SameClass, With in SamePackage, Outside the package Subclass & Outside The Package
    public void publicMethod()
    {
        System.out.println("Public Method");
    }
    public static void main(String[] args)
    {
        WithinSameClass wsc = new WithinSameClass();
        wsc.privateMethod();
        wsc.defaultmethod();
        wsc.protectedMethod();
        wsc.publicMethod();
    }
}
