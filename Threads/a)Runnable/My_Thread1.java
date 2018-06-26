

package Multithreading_classCO;

import java.util.*;

public class My_Thread1  implements Runnable{
int interval;
    public My_Thread1(int interval) {
        this.interval = interval;
    }

    public void run(){

        for(int i=0;i<=5;i++){
        System.out.println("I'm "+Thread.currentThread().getName());
        try {
            Thread.sleep(this.interval);
        } catch (InterruptedException ex) {

        }
        }
    }

}
