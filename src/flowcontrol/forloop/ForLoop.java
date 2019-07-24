package flowcontrol.forloop;

public class ForLoop {
    public static void main(String... args) {

    }

    private void forLoopExample1() {
        int i = 0;
        for (System.out.println("hello u r sleeping"); i < 3; i++) {
            System.out.println("no boss, u only sleeping");
        }
    }

    private void forLoopExample2() {
        int i = 0;
        for (System.out.println("hello"); i < 3; System.out.println("hi")) {
            i++;
        }
    }

    private void infiniteForLoop() {
        for(;;){
            System.out.println("hello"); // it will print hello number of time
        }
    }

    private void unReachableForLoop() {
        for(int i=0;true;i++){
            System.out.println("hello");
        }
       // System.out.println("hi");  // it will show compile time error, i.e the expression is unreachable
        // because the above for loop is infinite, so the program will not come out of the loop
    }

    private void unReachableForLoop1() {
        //for(int i=0;false;i++){
            // System.out.println("hello"); // unreachable statement error, because the condition is false, so the print statement will never execute
      //  }
        System.out.println("hi");
    }

    private void unRechableForLoopExample2() {
        for(int i=0;;i++){
            System.out.println("hello"); // it will print hello infinite time, so it will not come out of the loop
        }
     //   System.out.println("hi");
    }

    private void forloopExampleOfCondition() {
        int a=10,b=20;
        for(int i=0;a<b;i++){ System.out.println("hello");
        }
        System.out.println("hi");
    }

    private void forLoopExampleWIthFinalvariable() {
        final int a=10,b=20;
        for(int i=0;a<b;i++){ System.out.println("hello");
        }
        // System.out.println("hi"); // unreachable statement compile time error/
    }

    private void forLoopExample() {

    }


}
