package inheritanceExample;

final class Complex {

    private final double re;
    private final double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public String toString() {
        return "(" + re + " + " + im + "i)";
    }
}

class Example6_ConstructorAndToString {
    public static void main(String args[])
    {
        Complex c = new Complex(10, 15);
        System.out.println("Complex number is " + c);
    }
}

/**
 * OUTPUT
 * Complex number is (10.0 + 15.0i)
 */
