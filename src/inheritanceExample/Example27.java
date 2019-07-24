package inheritanceExample;

class One27
{
    int x = 2121;
}

class Two27
{
    int x = 1212;

    {
        System.out.println(x);
    }
}

public class Example27
{
    public static void main(String[] args)
    {
        Two27 two = new Two27();
    }
}
/**
 *OUTPUT
 * 1212
 */