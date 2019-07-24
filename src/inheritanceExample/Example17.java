package inheritanceExample;

class A17
{
    static String s = "AAA";

    static
    {
        s = s + "BBB";
    }

    {
        s = "AAABBB";
    }
}

class B17 extends A17
{
    static
    {
        s = s + "BBBAAA";
    }

    {
        System.out.println(s);
    }
}

public class Example17
{
    public static void main(String[] args)
    {
        B17 b = new B17();
    }
}
/**
 * OUTPUT
 * AAABBB
 */
