package thread;

public class OverloadRunMethodExample {
    public static void main(String...args){
        MyThread3 myThread3 = new MyThread3();
        System.out.println("Inside Main Method");

        myThread3.start();
        myThread3.run();
        myThread3.run(12);
    }
}

class MyThread3 extends Thread{

    @Override
    public void run() {
        super.run();
        System.out.println("Inside no parameter run method");
    }

    public void run(int i){
        System.out.println("Inside parameterised rrun method");
    }
}
