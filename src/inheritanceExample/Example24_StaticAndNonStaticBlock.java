package inheritanceExample;

class A24
{
    static int i;

    static
    {
        i++;
    }

    {
        ++i;
    }
}

class B24 extends A24
{
    static
    {
        --i;
    }

    {
        i--;
    }
}

public class Example24_StaticAndNonStaticBlock
{
    public static void main(String[] args)
    {
        System.out.println(new B24().i);
    }
}
/**
 * OUTPUT
 * 0
 */
