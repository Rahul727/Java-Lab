
package assign_1_1;

public class Empl_Main 
{
    public static void main(String[] args)
    {
      Employee e1 = new  Employee();
        e1.get();
        
        e1.chng_post("high");
        System.out.println("Employee e1's Post -> " + e1.Emp_Post);
        
        System.out.println("\n\n");
    
        Employee e2 = new Employee();
        e2.display();
       
       e1.sal();    
    }
}
