package thread;

public class THreadWithoutRunExample {
    public static void main(String...args){
        MyThread2 myThread2 = new MyThread2();
        myThread2.start(); // it will not start thread
    }
}

class MyThread2 extends Thread{

}
