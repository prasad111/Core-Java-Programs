package inheritanceExample;

class X18
{
    int i = 101010;

    public X18()
    {
        i = i++ + i-- - i;
    }

    static int staticMethod(int i)
    {
        return --i;
    }
}

class Y18 extends X18
{
    public Y18()
    {
        System.out.println(staticMethod(i));
    }
}

public class Example18_StaticMethodCall
{
    public static void main(String[] args)
    {
        Y18 y = new Y18();
    }
}
/**
 * OUTPUT
 * 101010
 */
