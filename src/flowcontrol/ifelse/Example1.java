package flowcontrol.ifelse;

public class Example1 {
    public static void main(String...args){

        Example1 e = new Example1();
        e.example4();

    }

    private void example(){
        /*int x=0;
        if(x)
        {
            System.out.println("hello");
        }else{
            System.out.println("hi");
        }*/
    }

    private void example2(){
        /*int x=10;
        if(x=20)
        {
            System.out.println("hello");
        }
        else{
            System.out.println("hi");
        }*/
    }

    private void example3(){
        int x=10;
        if(x==20)
        {
            System.out.println("hello");
        }else{
            System.out.println("hi");
        }
    }

    private void example4(){
        boolean b=false;
        if(b=true)
        {
            System.out.println("hello");
        }else{
            System.out.println("hi");
        }
        System.out.println("Value of b "+b);

    }

    private void example5(){
        boolean b=false;
        if(b==true)
        {
            System.out.println("hello");
        }else{
            System.out.println("hi");
        }
    }

    private void example6(){
        if(true)
            System.out.println("hello");
    }
    private void example7(){
        if(true); // no output
    }

    private void example8(){

        if(true);

        if(true){
            int x=10;  // the below statement will show error
        }

        /*if(true)
            int x=10;*/ // compile time error
    }
}
