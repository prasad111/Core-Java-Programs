package inheritanceExample;

class One27
{
    int x = 2121;
}

class Two27
{
    int x = 1234;

    {
        System.out.println(x);
    }
}

public class Example27_NonStaticBlockCall
{
    public static void main(String[] args)
    {
        Two27 two = new Two27();
    }
}
/**
 *OUTPUT
 * 1234
 */