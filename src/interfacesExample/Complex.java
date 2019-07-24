package interfacesExample;


interface Interfce1 {
     int sum(int a , int b);
}

interface Interfce2 {
    // float sum(int a , int b);
}

class InterFace implements Interfce1,Interfce2{
    @Override
    public int sum(int a, int b) {
        return 0;
    }
}

class InterFaceExample1 {
    public static void main(String args[])
    {
      //  Complex c = new Complex(10, 15);
      //  System.out.println("Complex number is " + c);
    }
}
