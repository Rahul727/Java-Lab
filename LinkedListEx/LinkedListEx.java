package Collection;

import java.util.*;
public class LinkedListEx {
   static  LinkedList l;
     
    void display(){
         System.out.println("Elements inserted in linklist");
     // print the elements
         
        for(int i=0; i<l.size() ; i++){
            System.out.println("\tindex:"+i+" -->"+l.get(i));
        }
    }

    public static void main(String[] args) {
     // create an object of linklsit
        l = new LinkedList();
        
     // add some elements in linklist
        l.add("A");
        l.add("B");
        l.add("C");

        LinkedListEx ll = new LinkedListEx();
        ll.display();

     // add an element at index 2
        l.add(2,"Z");

        System.out.println("\n\n\t\tModified linkedlist");
        ll.display();
   }
}
