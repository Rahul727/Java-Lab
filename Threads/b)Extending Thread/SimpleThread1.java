

package Multithreading;

public class SimpleThread1 extends Thread{


    public void run(){
        for(int i=1; i<=3 ; i++){
         System.out.println("I'm " + Thread.currentThread().getName());
        try{
        Thread.sleep(3000);
        }
        catch(Exception e) {}
    }

}
}
