package accessModifier.finalEx;

public class FinalVariableExample1 {
//    final int i; , it will show compile time error
final int i=10; // this will execute fine
    final static int l;

    // we can initialize final variable inside non static block or instance block
    final int j;
    {
        j=10;

    }

    // we can initialize final variable inside constructor also
    final int k;
    FinalVariableExample1()
    {
        k=10;
    }

    static {
        l = 23;
    }

}
