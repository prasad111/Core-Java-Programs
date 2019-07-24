package inheritanceExample;

class ClassOne
{
    static int i, j = 191919;

    {
        --i;
    }

    {
        j++;
    }
}

public class Example21 extends ClassOne
{
    static
    {
        i++;
    }

    static
    {
        --j;
    }

    public static void main(String[] args)
    {
        System.out.println(i);

        System.out.println(j);
    }
}
/**
 * OUTPUT
 * 1
 * 191918
 */
