
package prctl12;


public class main extends Super {
    
    static int a=10;
    
     main()
    {
        System.out.println("This is derived class constructor");
    }
     main(int x)
     {
     System.out.println("This is derived class constructor with value "+x);
     } 
    static void display()
    {
        System.out.println("This is Derived class");
         System.out.println("a in derived class "+a);
    }
    void show()
    {
     super.display();
     System.out.println("a in base class "+super.a);
    }
    
    public static void main(String[] args) {
        display();
        main i=new main();
        i.show();
    }   
}
