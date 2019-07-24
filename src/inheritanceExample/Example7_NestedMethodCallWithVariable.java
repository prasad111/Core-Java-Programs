package inheritanceExample;

class A7
{
    int i = 10;

    public void show(){
        System.out.println("Inside show of Parent");
    }
}

class B7 extends A7
{
    int i = 20;
    public void show(){
        System.out.println("Inside show of Child");
    }
}

public class Example7_NestedMethodCallWithVariable
{
    public static void main(String[] args)
    {
        A7 a = new B7();

        System.out.println(a.i);
        a.show();
    }
}

/**
 *OUTPUT
 * 10
 * Inside show of Child
 */