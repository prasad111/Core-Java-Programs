package inheritanceExample;

class A10
{
    static
    {
        System.out.println("THIRD");
    }
}

class B10 extends A10
{
    static
    {
        System.out.println("SECOND");
    }
}

class C10 extends B10
{
    static
    {
        System.out.println("FIRST");
    }
}

public class Example10
{
    public static void main(String[] args)
    {
        C10 c = new C10();
    }
}
/**
 * OUTPUT
 * THIRD
 * SECOND
 * FIRST
 */
