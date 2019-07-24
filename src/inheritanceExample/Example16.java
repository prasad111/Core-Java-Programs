package inheritanceExample;

class M16
{
    int i = 51;

    public M16(int j)
    {
        System.out.println(i);

        this.i = j * 10;
    }
}

class N16 extends M16
{
    public N16(int j)
    {
        super(j);

        System.out.println(i);

        this.i = j * 20;
    }

    private void show(){
        System.out.println(i);
    }

}

public class Example16
{
    public static void main(String[] args)
    {
        N16 n = new N16(26);

        System.out.println(n.i);
    }
}
/**
 * OUTPUT
 * 51
 * 260
 * 520
 */