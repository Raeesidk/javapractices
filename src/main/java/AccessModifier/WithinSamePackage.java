package AccessModifier;
public class WithinSamePackage

{
    public static void main(String[] args) {
        WithinSameClass wsc=new WithinSameClass();
        wsc.defaultmethod();
        wsc.protectedMethod();
        wsc.publicMethod();

    }
}
