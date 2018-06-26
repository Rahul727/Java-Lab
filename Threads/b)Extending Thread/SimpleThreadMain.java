

package Multithreading;

public class SimpleThreadMain {

    public static void main(String[] args) {
        SimpleThread t1 = new SimpleThread();
        SimpleThread1 t2 = new SimpleThread1();
        t1.setName("Thread 1");
        t2.setName("Thread 2");

        t1.start();
        t2.start();
    }
}
