

package Multithreading;


public class SimpleThread extends Thread{
    
   
    public void run(){
        for(int i=1; i<=5 ; i++){
        System.out.println("I'm " + Thread.currentThread().getName());
        try{
        Thread.sleep(1000);
        }
        catch(Exception e) {}
    }

}
}
