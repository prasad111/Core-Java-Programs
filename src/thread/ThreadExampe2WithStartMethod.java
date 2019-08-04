package thread;

/**
 * NOTE : ITS never recomended to override start method
 */

public class ThreadExampe2WithStartMethod {
    public static void main(String...args){
        MyThread4 myThread3 = new MyThread4();
        System.out.println("Inside Main Method");

        myThread3.start();
        myThread3.run();
    }
}

class MyThread4 extends Thread{

    public void start(){
        System.out.println("Inside overrided start() method");
    }

    public void run() {
        System.out.println("Inside run method");
    }
}
