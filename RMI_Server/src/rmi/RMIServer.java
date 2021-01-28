package rmi;

import java.rmi.AlreadyBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class RMIServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        /**Main method
         Create an Instance of the Class that implements the abstract methods of the interface class*/
        MethodRemote server = new MethodRemote();
        /**Set an IP address by which clients connect to the RMI Server*/
        System.setProperty("java.rmi.server.hostname", "127.0.0.1");
        /**Create a remote variable, assigning the class and the communication port */
        Remote stub = UnicastRemoteObject.exportObject(server, 9090);
        /**Create a Registry variable for method invocation from different machines on the network.
        Assigning the connection port*/
        Registry registry = LocateRegistry.createRegistry(9090);
        /**Registers the created remote object with a name in the registry utility*/
        registry.bind("rmi://localhost:3000/server", stub);
        /**Server message running*/
        System.out.println("Server running..");
    }
}
