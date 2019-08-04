package thread;

public class SleepExample {
    public static void main(String...args){
        try {
            System.out.println("M");
            Thread.sleep(3000);
            System.out.println("E");
            Thread.sleep(3000);
            System.out.println("G");
            Thread.sleep(3000);
            System.out.println("A");
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
