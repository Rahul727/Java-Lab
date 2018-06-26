/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr_7;

/**
 *
 * @author Rahul
 */
public class bank {
        double acc_no,bal;
    String nm;
    
 void display()
    {       
        System.out.println(" acc_no " + acc_no + "\n balance " +  bal );
    }
  
bank(double a,String n,double b)
       {
   	 acc_no = a;  
   	 bal= b;
   	 nm = n;
      }

}
