package inheritanceExample;

class A19
{
    void A19()
    {
        System.out.println(1);
    }
}

class B19 extends A19
{
    void B()
    {
        A19();
    }
}

public class Example19
{
    public static void main(String[] args)
    {
//        new B().B();    // It will show error

    }
}
/**
 * OUTPUT
 * compile time error
 */
