
package prctl12;

import java.rmi.*;

public interface adder extends Remote
{
public int add(int x,int y) throws RemoteException;
}
