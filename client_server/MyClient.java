
package prctl12;
import java.rmi.*;
import java.rmi.registry.*;
import java.util.Scanner;

public class MyClient
{
    public static void main(String[] args) {
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter 1st Number : ");
            int a = sc.nextInt();
            System.out.println("enter 2nd Number : ");
            int b = sc.nextInt();
        Registry reg = LocateRegistry.getRegistry("localhost",1099);    
        adder stub = (adder)reg.lookup("addition");
        System.out.println(" \n Answer = "+stub.add(a,b));
        }
        catch(Exception e)
        {}
    }
}
