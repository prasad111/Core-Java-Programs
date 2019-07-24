package inheritanceExample;

class A9
{
    String s = "Class A";
}

class B9 extends A9
{
    String s = "Class B";

    {
        System.out.println(super.s);
    }
}

class C9 extends B9
{
    String s = "Class C";

    {
        System.out.println(super.s);
    }
}

public class Example9
{
    public static void main(String[] args)
    {
        C9 c = new C9();

        System.out.println(c.s);
    }
}

/**
 * OUTPUT
 * Class A
 * Class B
 * Class C
 */
