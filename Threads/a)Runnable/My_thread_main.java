
package Multithreading_classCO;

import MT_5IT.Thread1;

public class My_thread_main {

    public static void main(String[] args) {
        My_Thread1 t1 = new My_Thread1(1000);
        My_Thread1 t2 = new My_Thread1(3000);

        // create threads
        Thread th1 = new Thread(t1, "Thread 1");
        Thread th2 = new Thread(t2,"Thread 2");

        //start both the threads
        th1.start();
        th2.start();
    }

}
