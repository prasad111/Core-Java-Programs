package inheritanceExample;

class A
{
    int i = 10;

    public void show(){
        System.out.println("Inside show of Parent");
    }
}

class B extends A
{
    int i = 20;
    public void show(){
        System.out.println("Inside show of Child");
    }
}

public class Example7
{
    public static void main(String[] args)
    {
        A a = new B();

        System.out.println(a.i);
        a.show();
    }
}

/**
 *OUTPUT
 * 10
 * Inside show of Child
 */