package inheritanceExample;

class X12
{
    static void staticMethod()
    {
        System.out.println("Class X");
    }
}

class Y12 extends X12
{
    static void staticMethod()
    {
        System.out.println("Class Y");
    }
}

public class Example12_StaticMethodCall
{
    public static void main(String[] args)
    {
        Y12.staticMethod();
    }
}
/**
 * OUTPUT
 * Class Y
 */
