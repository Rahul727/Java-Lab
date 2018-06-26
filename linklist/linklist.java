package prctl26;
import java.util.*;

public class linklist {
    
   static  LinkedList l;   
    void display(){
         System.out.println("Elements inserted in linklist");
     
        for(int i=0; i<l.size() ; i++){
            System.out.println("\tindex:"+i+" -->"+l.get(i));
        }
    }
    public static void main(String[] args) {
 
        l = new LinkedList();

        l.add("A");
        l.add("B");
        l.add("C");

        linklist ll = new linklist();
        ll.display();

        l.add(2,"Z");

        System.out.println("\n\n\t\tModified linkedlist");
        ll.display();
   }
}