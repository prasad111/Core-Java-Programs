package inheritanceExample;

class A13
{
    public A13(int num)
    {
        System.out.println("Class A Constructor "+num);
    }
}

class B13 extends A13
{
    public B13(int num)
    {
        super(num);
        System.out.println("Class B Constructor "+num);
    }
}

class C13 extends B13
{
    public C13(int num)
    {
        super(num);
        System.out.println("Class C Constructor "+num);
    }
}

public class Example13_ConstructorCallInInheritance
{
    public static void main(String[] args)
    {
        C13 c = new C13(123);
    }
}
/**
 * OUTPUT
 * Class A Constructor 123
 * Class B Constructor 123
 * Class C Constructor 123
 */
