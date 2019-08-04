package thread;

class SynchronizedDemo {
    public static void main(String[] args) {
        Display d1 = new Display();
        MyThread9 t1 = new MyThread9(d1, "dhoni");
        MyThread9 t2 = new MyThread9(d1, "yuvaraj");
        t1.start();
        t2.start();
    }
}

class Display {
    public synchronized void wish(String name) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Good morning "+name);
        }
    }

    public  void print(String name) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Non Synchronize block "+name);
        }
    }
}

class MyThread9 extends Thread {

    Display d;
    String name;

    MyThread9(Display d, String name) {
        this.d = d;
        this.name = name;
    }

    public void run() {
        d.wish(name);
        d.print(name);
    }
}