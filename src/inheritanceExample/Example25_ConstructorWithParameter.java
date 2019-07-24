package inheritanceExample;

public class Example25_ConstructorWithParameter
{
    public Example25_ConstructorWithParameter(int i, int j)
    {
        System.out.println(method(i, j));
    }

    int method(int i, int j)
    {
        return i++ + ++j;
    }

    public static void main(String[] args)
    {
        Example25_ConstructorWithParameter main = new Example25_ConstructorWithParameter(10, 20);
    }
}

/**
 * OUTPUT
 * 31
 */