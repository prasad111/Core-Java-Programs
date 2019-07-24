package inheritanceExample;

class A20
{
    int i = 1212;
}

class B20 extends A20
{
    A20 a;

    public B20(A20 a)
    {
        this.a = a;
    }
}

public class Example20_ChildConstructorWith
{
    public static void main(String[] args)
    {
        A20 a = new A20();

        B20 b = new B20(a);

        System.out.println(a.i);

        System.out.println(b.i);

        System.out.println(b.a.i);

        b.a.i = 2121;

        System.out.println("--------");

        System.out.println(a.i);

        System.out.println(b.i);
    }
}
/**
 * OUTPUT
 *
 * 1212
 * 1212
 * 1212
 * --------
 * 2121
 * 1212
 */
