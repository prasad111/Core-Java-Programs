package inheritanceExample;

class A23
{
    int methodOfA(int i)
    {
        i /= 10;

        return i;
    }
}

class B23 extends A23
{
    int methodOfB(int i)
    {
        i *= 20;
        return methodOfA(i);
    }
}

public class Example23_SuperMethodCallFromChild
{
    public static void main(String[] args)
    {
        B23 b = new B23();

        System.out.println(b.methodOfB(100));
    }
}

/**
 * 200
 */
