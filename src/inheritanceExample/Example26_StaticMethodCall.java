package inheritanceExample;

class X26
{
    static
    {
        Y26.methodOfY();
    }
}

class Y26 extends X26
{
    static void methodOfY()
    {
        System.out.println("Hi....");
    }
}

public class Example26_StaticMethodCall
{
    public static void main(String[] args)
    {
        Y26.methodOfY();
    }
}

/**
 * Hi....
 * Hi....
 */
