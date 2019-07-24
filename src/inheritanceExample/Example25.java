package inheritanceExample;

public class Example25
{
    public Example25(int i, int j)
    {
        System.out.println(method(i, j));
    }

    int method(int i, int j)
    {
        return i++ + ++j;
    }

    public static void main(String[] args)
    {
        Example25 main = new Example25(10, 20);
    }
}

/**
 * OUTPUT
 * 31
 */