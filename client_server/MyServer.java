
package prctl12;

import java.rmi.*;
import java.rmi.registry.*;

public class MyServer 
{
    public static void main(String[] args) {
        try{
          Registry reg = LocateRegistry.createRegistry(1099);
          adder stub = new AdderRemote();
          reg.bind("addition", stub);
            System.out.println("Server is Started");
        }
        catch(Exception e)
        {}
    }
    
    
}
