package inheritanceExample;

class A19
{
    void A19()
    {
        System.out.println("Constructor Of Parent");
    }
}

class B19 extends A19
{
    B19()
    {
        A19();
        System.out.println("Inside B19 Constructor");
    }

    void B19()
    {
        A19();
        System.out.println("Inside B19() method");
    }
}

public class Example19_CallingCOnstructorAsMethod
{
    public static void main(String[] args)
    {
        new B19().B19();
    }
}
/**
 * OUTPUT
 * Constructor Of Parent
 * Inside B19 Constructor
 * Constructor Of Parent
 * Inside B19() method
 */
