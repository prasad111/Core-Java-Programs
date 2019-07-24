package flowcontrol.whileLoop;

public class WhileLoopExample {
    public static void main(String...args){
        WhileLoopExample whileLoopBracketAreOptional = new WhileLoopExample();
        whileLoopBracketAreOptional.whileLoopBracketAreOptional();

    }
    private void basicExample(){
        /*while(1)  // ERROR : boolean required, found integer
        {
            System.out.println("hello");
        }*/
    }

    private void whileLoopBracketAreOptional(){
        while(true) //  it will become infinite loop
            System.out.println("hello");
    }
    private void whileLoopWithEMptyBody(){
        while(true); // no output
    }

    private void unReachableStatementInWhile(){
        while(true)  // if u pass false, it will show compile time error
        {
            System.out.println("hello");
        }

      //  System.out.println("hi"); it will show compile time error , unreachable statement
    }

    private void infiniteLoopExample(){
        int a=10,b=20;
        while(a<b)
        {
            System.out.println("hello");  // it will print infinite time in the console
        }
        System.out.println("hi");
    }

    private void whileUnreachableError(){
        final int a=10,b=20;
        while(a<b)
        {
            System.out.println("hello");
        }
//        System.out.println("hi");  // it will show compile time error
    }

}
