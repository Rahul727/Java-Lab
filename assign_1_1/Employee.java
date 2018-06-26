
package assign_1_1;

import java.util.Scanner;

public class Employee
{
    int Emp_Id , salary , Emp_Contact;
    String Emp_Name, Emp_Dept, Emp_Post ,Emp_CompanyName;
    
 Employee( )
 {
   Emp_Id =0 ;
   Emp_Name ="" ;
   Emp_Contact =0; 
   Emp_Dept ="";
   Emp_Post ="" ;
   Emp_CompanyName ="";  
 }  
   Scanner sc = new Scanner(System.in);
   void get()
   {
       System.out.println("Enter Empl's Detail \n \n");
       System.out.println("Id:");
       Emp_Id=sc.nextInt();
       System.out.println("name :");
       Emp_Name=sc.next();
       System.out.println("contact");
       Emp_Contact=sc.nextInt();
       System.out.println("Department");
       Emp_Dept=sc.next();
       System.out.println("Post");
       Emp_Post=sc.next();
       System.out.println("Co_name");
       Emp_CompanyName=sc.next();
      System.out.println("\n");     
   }
    
   void display()
   {
       System.out.println("Emp_Id: "+ Emp_Id);
       System.out.println("Emp_Name: "+ Emp_Name);
       System.out.println("Emp_Contact: "+ Emp_Contact );
       System.out.println("Emp_Dept: "+ Emp_Dept);
       System.out.println("Emp_Post: "+ Emp_Post);
       System.out.println("Emp_CompanyName: " + Emp_CompanyName);
       System.out.println("\n \n");
   }
   void chng_post(String nw)       
   {
       Emp_Post=nw;
   }
    
   void sal()
   {
     if(Emp_Post == "high")
     { salary=(21000)*12 ;  }
     else if(Emp_Post == "lower")   
        { salary=(13000)*12 ;  }
       System.out.println("salary of employee = " + salary);
   }   
}