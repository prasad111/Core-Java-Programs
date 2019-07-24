package inheritanceExample;

class A22
{
    int[] a = new int[5];

    {
        a[0] = 10;
    }
}

public class Example22 extends A22
{
    {
        a = new int[5];
    }

    {
        System.out.println(a[0]);
    }

    public static void main(String[] args)
    {
        Example22 main = new Example22();
    }
}
/**
 * OUTPUT
 * 0
 */
