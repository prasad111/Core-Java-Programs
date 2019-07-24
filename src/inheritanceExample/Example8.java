package inheritanceExample;

class A8
{
    {
        System.out.println(1);
    }
}

class B8 extends A8
{
    {
        System.out.println(2);
    }
}

class C8 extends B8
{
    {
        System.out.println(3);
    }
}

public class Example8
{
    public static void main(String[] args)
    {
        C8 c = new C8();
    }
}
/**
 * OUTPUT
 * 1
 * 2
 * 3
 *
 */

