package flowcontrol.switchExample;

public class SwitchExample {
    public static void main(String...args){

        SwitchExample switchExample = new SwitchExample();
        switchExample.example1();

    }

    private void example1(){
        int x=10;
        switch(x) {
           // System.out.println("hello");  // Compile time error
        }
    }

    private void example2(){
        int x = 10;
        int y = 20;
        switch(x) {
            case 10:
                System.out.println("10");
                // case y: // constant expression required
                //      System.out.println("20"); }
              //  If we declare y as finalEx we won't get any compile time error.
        }
    }
    private void example3(){
        int x=10;
        final int y=20;
        switch(x)
        {
            case 10:
                System.out.println("10");
            case y:
                System.out.println("20");
        }
    }
    private void example4(){
        int x=10;
        switch(x+1)
        {
            case 10:
            case 10+20:
            case 10+20+30: // no output
        }
    }

    private void differentTypeCase() {
        byte b = 10;
        switch (b) {
            case 10:
                System.out.println("10");
            case 100:
                System.out.println("100");
           /* case 1000:  // error, required byte but found int
                System.out.println("1000");*/
        }
    }

    private void duplicateCaseLebel(){
        int x=10;
        switch(x)
        {
            /*case 97:
                System.out.println("97");
            case 99:
                System.out.println("99");
            case 'a':
                System.out.println("100");*/
        }
    }
    private void allthroughInsideExample(){
        // take different values for x like, 1,2,3
        int x=0;
        switch(x) {
            case 0:
                System.out.println("0");
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
            default:
                System.out.println("default");
        }
    }
    private void defaultAtAnywhereinSwitch(){
        int x=0;
        switch(x)
        {
            default: System.out.println("default");
            case 0:
                System.out.println("0");
                break;
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
        }
    }
}
