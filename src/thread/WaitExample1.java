package thread;

import com.sun.javafx.tools.packager.Log;

public class WaitExample1 {
    private String packet;
     
    // True if receiver should wait
    // False if sender should wait
    private boolean transfer = true;
  
    public synchronized void send(String packet) {
        while (!transfer) {
            try { 
                wait();
            } catch (InterruptedException e)  {
                Thread.currentThread().interrupt(); 
                Log.debug("Thread interrupted");
            }
        }
        transfer = false;
         
        this.packet = packet;
        notifyAll();
    }
  
    public synchronized String receive() {
        while (transfer) {
            try {
                wait();
            } catch (InterruptedException e)  {
                Thread.currentThread().interrupt(); 
                Log.debug("Thread interrupted");
            }
        }
        transfer = true;
 
        notifyAll();
        return packet;
    }
}