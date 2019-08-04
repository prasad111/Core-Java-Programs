package thread;

public class ThreadExample1 {
    public static void main(String...args){
        MyThread1 myThread1 = new MyThread1();
        myThread1.start();
        for (int i = 0;i<10;i++){
            System.out.println("Main Thread "+i );
        }
    }
}

class MyThread1 extends Thread{
    public void run(){
        for (int i = 0;i<10;i++){
            System.out.println("My Thread "+i );
        }
    }
}
