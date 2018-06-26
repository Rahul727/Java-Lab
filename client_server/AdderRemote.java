
package prctl12;

import java.rmi.*;
import java.rmi.server.*;

public class AdderRemote extends UnicastRemoteObject implements adder
{
   AdderRemote() throws RemoteException
   { 
   super();
   }
 public int add(int x,int y)
   {
   int ans=x+y;
   return ans;
   }
}
