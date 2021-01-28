package rmi;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Logger;

/**
 *
 * @author DHL-SIS-ING
 */
public class ConnectionServer {
    
    public ConnectionServer(){
    }
    
    public String CalculatorProcesses(String a, String b, String operator){
        /* Connecting to the RMI server */
        try {
            /**
             * Connection to the RMI Server through IP and Registry Port is also a remote object, 
             * which allows us to invoke methods from different machines on the network.
             */
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 9090);
            /* Class variable gets the reference to a remote object specified by its name */
            TestRemote server = (TestRemote) registry.lookup("rmi://localhost:3000/server");
            //Connection remote methods
            switch(operator){
                case "addition":
                    return server.Addition(a, b).toString();
                case "substraction":
                    return server.Substraction(a, b).toString();
                case "multiplication":
                    return server.Multiplication(a, b).toString();
                case "division":
                    return server.Division(a, b).toString();
                default:
                    return "Sintax ERROR";
            }

        } catch (RemoteException ex) { /*Excepción de conexión Remota */
            Logger.getLogger(ex.getMessage());
            System.err.println("Excepcion client: " + ex.toString());
        } catch (NotBoundException ex) { /*Object name exception not associated with RMI server*/
            Logger.getLogger(ex.getMessage());
        }
        return "Server Error";
    }
}
