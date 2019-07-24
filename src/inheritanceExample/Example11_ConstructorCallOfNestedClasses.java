package inheritanceExample;

class A11
{
    public A11()
    {
        System.out.println("Class A Constructor");
    }
}

class B11 extends A11
{
    public B11()
    {
        System.out.println("Class B Constructor");
    }
}

class C11 extends B11
{
    public C11()
    {
        System.out.println("Class C Constructor");
    }
}

public class Example11_ConstructorCallOfNestedClasses
{
    public static void main(String[] args)
    {
        C11 c = new C11();
    }
}
/**
 * OUTPUT
 * Class A Constructor
 * Class B Constructor
 * Class C Constructor
 */
