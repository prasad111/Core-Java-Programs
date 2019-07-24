package inheritanceExample;

class M
{

    static
    {
        System.out.println("Inside Static Block of Parent");
    }

    {
        System.out.println("Inside Non Static Block of Parent");
    }

    public M()
    {
        System.out.println("Inside Constructor of Parent");
    }
}

class N extends M
{
    static
    {
        System.out.println("Inside Static Block of Child");
    }

    {
        System.out.println("Inside Non Static Block of Child");
    }

    public N()
    {
        System.out.println("Inside Constructor of Child");
    }
}

public class Example14_Static_NonStatic_Constructor
{
    public static void main(String[] args)
    {
        N n = new N();
    }
}

/**
 * OUTPUT
 * Inside Static Block of Parent
 * Inside Static Block of Child
 * Inside Non Static Block of Parent
 * Inside Constructor of Parent
 * Inside Non Static Block of Child
 * Inside Constructor of Child
 *
 */
