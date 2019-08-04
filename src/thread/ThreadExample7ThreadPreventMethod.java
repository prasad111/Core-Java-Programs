package thread;

/**
 * We can stop a running thread by using the below methods
 * yield()
 * =======
 * 1. yield() method causes "to pause current executing Thread for giving the chance of remaining waiting Threads of same priority".
 * 2. If all waiting Threads have the low priority or if there is no waiting Threads then the same Thread will be continued its execution.
 * 3. If several waiting Threads with same priority available then we can't expect exact which Thread will get chance for execution.
 * 4. The Thread which is yielded when it get chance once again for execution is depends on mercy of the Thread scheduler.
 * 5. public static native void yield();
 *
 * sleep();
 * ========
 *
 * join()
 */
public class ThreadExample7ThreadPreventMethod {
    public static void main(String...args){

    }
}
