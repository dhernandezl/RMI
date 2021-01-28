package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Interface class that inherits from the java.rmi.Remote class, 
 * to indicate that it can be called from any Java virtual machine
 */
public interface TestRemote extends Remote{
    //Remote methods
    Double Addition(String a, String b) throws RemoteException;
    Double Substraction(String a, String b) throws RemoteException;
    Double Multiplication(String a, String b) throws RemoteException;
    Double Division(String a, String b) throws RemoteException;
}
