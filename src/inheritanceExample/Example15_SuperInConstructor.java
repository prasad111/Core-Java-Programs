package inheritanceExample;

class M15
{
    int i;

    public M15(int i)
    {
        this.i = i--;
    }
}

class N15 extends M15
{
    public N15(int i)
    {
        super(++i);

        System.out.println(i);
    }
}

public class Example15_SuperInConstructor
{
    public static void main(String[] args)
    {
        N15 n = new N15(26);
    }
}

/**
 * OUTPUT
 * 27
 */