package thread;

class ThreadInterruptDemo1
{
public static void main(String[] args) {
    Thread8 t=new Thread8();
t.start();
t.interrupt();
System.out.println("end of main thread");
} }

class Thread8 extends Thread{
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("iam lazy thread");
            }
            System.out.println("I'm entered into sleeping stage"); try
            {
                Thread.sleep(3000);
            }
            catch (InterruptedException e) {
                System.out.println("i got interrupted");
            } }
}