package flowcontrol.dowhile;

public class DoWhileExample {
    public static void main(String...args){

    }

    private void dowhileWithoutCurlyBracket(){
        do
            System.out.println("hello");
        while(true); // it will print hello infinite times in the console
    }

    private void emptydoWHileLoop(){
        do;
        while(true); // it will not show any output
    }

    private void errorDoWHile(){
      /*  do
            int x=10;  // declaration not allowed here, if we will put curly bracket after, do it will not show any error
        while(true);*/
    }

    private void dowhileInfiniteLoop(){
        do
            while(true)
                System.out.println("hello");
            while(true);
    }
    private void errorWithoutAnything(){
        /*do
            while(true);*/  // compile time error : while expected
    }

    private void unreachableStatementError1(){
        do
        {
            System.out.println("hello");
        }
        while(true);
//        System.out.println("hi"); // it will print compile time error, unreachable statement
    }

    private void modifiedABoveExample(){
        do
        {
            System.out.println("hello");
        }
        while(false);
        System.out.println("hi");
    }

    private void anotherInfiniteLoop(){
        int a=10,b=20;
        do
        {
            System.out.println("hello");
        }
        while(a<b);
        System.out.println("hi");
    }
    private void modificationOfAboveMethod(){
        int a=10,b=20;
        do
        {
            System.out.println("hello");
        }
        while(a>b);
        System.out.println("hi"); //  it will print helo hi
    }

    private void unReachableStatementExample1(){
        final int a=10,b=20;
        do
        {
            System.out.println("hello");
        }
        while(a<b);
        // System.out.println("hi");  / this method will not execute, because, a<b is always true
        // so the hi print statement will never execute
    }

    private void modificationOfAboveMethod1(){
        final int a=10,b=20;
        do
        {
            System.out.println("hello");
        }
        while(a>b);
        System.out.println("hi"); //  it will print helo hi
    }
}
