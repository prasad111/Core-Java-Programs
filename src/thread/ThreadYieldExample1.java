package thread;

public class ThreadYieldExample1 {
    public static void main(String...args){

        ThreadYield1 threadYield1 = new ThreadYield1();
        Thread t = new Thread(threadYield1);
        t.start();

        for(int i = 0;i<5;i++){
            System.out.println("Inside Main method "+i);
        }
    }
}

class ThreadYield1 implements Runnable{

    @Override
    public void run() {
        for(int i = 0;i<5;i++){
            System.out.println("Inside RUn of THread "+i);
            if(i == 2){
                Thread.yield();
            }
        }
    }
}