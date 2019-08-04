package thread;

public class ThreadExample6WithThreadName {
    public static void main(String...arfs){
        for(int i = 0;i<10;i++){
            System.out.println("Inside Main method of Thread "+i);
        }


        Thread6 thread6 = new Thread6();
        new Thread(thread6,"Thread6").start();

        System.out.println("Current THread Name is "+Thread.currentThread().getName());
        System.out.println("Current Tread Priority is "+Thread.currentThread().getPriority());
    }
}

class Thread6 implements Runnable{

    @Override
    public void run() {
        for(int i = 0;i<10;i++){
            System.out.println("Inside run method of Thread "+i);
            System.out.println("Current THread Name is "+Thread.currentThread().getName());
            System.out.println("Current Tread Priority is "+Thread.currentThread().getPriority());
        }
    }
}
