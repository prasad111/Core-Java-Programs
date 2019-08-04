package thread;


import java.util.logging.Handler;

/**
 * JOIN
 * =====
 * If a Thread wants to wait until completing some other Thread then we should go for join() method.
 * Example: If a Thread t1 executes t2.join() then t1 should go for waiting state until completing t2.
 */
public class ThreadJoinExample {
    public static void main(String...args){
        ThreadJoin1 threadJoin1 = new ThreadJoin1();
        ThreadJoin2 threadJoin2 = new ThreadJoin2();
        threadJoin1.start();
        threadJoin2.start();


        for (int i = 0;i<5;i++){
            System.out.println("Main  Thread "+i );
            try
            {
                if(i==2)
                threadJoin2.join();

            }
            catch (InterruptedException e1){

            }
        }

    }
}

class ThreadJoin1 extends Thread{
    public void run(){
        for (int i = 0;i<5;i++){
            System.out.println("ThreadJoin1 "+i );
        }
    }
}

class ThreadJoin2 extends Thread{
    public void run(){
        for (int i = 0;i<5;i++){
            System.out.println("ThreadJoin2 "+i );
        }
    }
}