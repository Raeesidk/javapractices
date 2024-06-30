package Abstraction_Encapsulation_Interface_Super;
/**Multiple Inheritance: - One child Class having more Than ONE PARENT Class is known as Multiple Inheritance
 * The Java does not Support Multiple Inheritance
 * The Multiple Inheritance can be achieved by Interface Only Because in Interface we can Override(replace) the method*/
// Define two interfaces: Character and Weapon
interface Character {
    void attack();
}

interface Weapon {
    void use();
}

// Implement the interfaces in concrete classes
 class Multiple_Inheritance implements Character,Weapon
{
   public void attack()
        {
            System.out.println("Hey it's an child class method i can able to Override the parent class Method");
        }

        public void use()
        {
            System.out.println(" Warrior uses the Sword ⚔ ⚔ ⚔ ");
        }

    public static void main(String[] args)
    {
        Multiple_Inheritance mi = new Multiple_Inheritance();
        mi.attack();
        mi.use();
    }

}
