package thread;

public class ThreadExample5WithRunnable {
    public static void main(String...args){

        Thread5 t5 = new Thread5();
        Thread t = new Thread(t5);
        t.start();

        for(int i = 0;i<10;i++) {
            System.out.println("Inside main thread " +i);
        }

    }
}

class Thread5 implements Runnable{

    @Override
    public void run() {
        for(int i = 0;i<10;i++) {
            System.out.println("Inside Run method of runnable " +i);
        }
    }
}
