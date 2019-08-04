package thread;

/**
 * interrupt()
 * ===========
 * Whenever we are calling interrupt() method we may not see the effect immediately, if the target Thread
 * is in sleeping or waiting state it will be interrupted immediately.
 *
 *  If the target Thread is not in sleeping or waiting state then interrupt call will wait until target
 * Thread will enter into sleeping or waiting state. Once target Thread entered into sleeping or waiting state it
 * will effect immediately.
 *
 *  In its lifetime if the target Thread never entered into sleeping or waiting state then there is
 * no impact of interrupt call simply interrupt call will be wasted.
 *
 */

public class InterruptExample {
    public static void main(String...args){
        MyThread7 t=new MyThread7();
        t.start();
        t.interrupt(); //--->1 System.out.println("end of main thread");

        System.out.println("i am in Main Thread");


    }
}

class MyThread7 extends Thread{

        public void run(){

        try {
            for(int i=0;i<5;i++) {
                    System.out.println("i am lazy Thread :" + i);
                    Thread.sleep(2000);
                }
            }
            catch(InterruptedException e){
                System.out.println("i got interrupted");
            }
        }
}
