package org.example;

public class Differentmethods
{
    public int dogage ()
    {
        int age = 30;
        System.out.println("Dog age is :" + age);
        return age;
    }
    public float Lion()
    {
        float weight = 128.5F;
        System.out.println("Lion weight is :" + weight + "Kgs  ⚖⚖");
        return weight;
    }
    public long Number()
    {
        long id_number = 8328217913L;
        System.out.println("Lion_ID_Number is :" + id_number + "LID 💳💳");
        return id_number;
    }
    public double cheetah ()
    {
        double speed = 154.512D;
        System.out.println("The Cheetah run at the Speed of : " + speed + "Kmph 🐆🐆");
        return speed;
    }
    public String Bird()
    {
        String name = "Hawkeye 🦅";
        System.out.println("My bird name is : " + name + "🦅🦅" );
        return name;
    }
    public boolean validity ()
    {
        boolean Lioniswildanimal = true;
        boolean pigeonisreptile = false;
        System.out.println( "Lion is wild animal  : " +Lioniswildanimal  );
        System.out.println("pigeon is reptile : " + pigeonisreptile );
        return true & false ;
    }

    public static void main(String[] args)
    {
        Differentmethods Animal = new Differentmethods();
        Animal.dogage();
        Animal.Lion();
        Animal.Number();
        Animal.cheetah();
        Animal.Bird();
        Animal.validity();

    }

}
