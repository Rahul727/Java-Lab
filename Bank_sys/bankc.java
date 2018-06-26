/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr_7;
import java.util.Scanner;
/**
 *
 * @author Rahul
 */
public class bankc {
      public static void main(String[] a)
    {
             int ch=0;
        bank b1 = new bank(100,"Rahul",7000);
        


        Scanner sc = new Scanner(System.in); 
        System.out.println("1.Withdraw\n");
        System.out.println("2.Deposite\n");
        System.out.println("3.Display\n");
        System.out.println("4.Exit\n");
         
         ch = sc.nextInt();
     switch(ch)
      {
       case 1 : System.out.println("Enter money");
                int wd = sc.nextInt();
                if(wd >= b1.bal)
                {
                   System.out.println("You have no enough money\n");
                   System.exit(0);
                }
                 b1.bal = b1.bal - wd;
                 b1.display();
                 break;
                
       case 2 : System.out.println("Enter money");
                int dp = sc.nextInt();
                      
                b1.bal = b1.bal + dp;
                b1.display();
                break;
                 
       case 3 : b1.display();
                break;
    
        case 4: break;      
     }
  }
  
}
