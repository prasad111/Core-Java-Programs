package flowcontrol.flowControl_labels;

public class BreakExample {
    public static void main(String args[]) {

    }

    private void breakExample1(){
        int x = 0;
        switch (x) {
            case 0:
                System.out.println("hello");
                break;
            case 1:
                System.out.println("hi");
        }
    }
    private void breakForLoops(){
        for(int i=0; i<10; i++) {
            if(i==5)
                break;
            System.out.println(i);
        }
    }

    private void labeledBreakExample(){
        int x=10;
        l1 : {
            System.out.println("begin");
            if(x==10)
                break l1;
            System.out.println("end");
        }
        System.out.println("hello");
    }

}

