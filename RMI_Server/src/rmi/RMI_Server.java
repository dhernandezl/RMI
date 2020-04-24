/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.AlreadyBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author DHL-SIS-ING
 */
public class RMI_Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        /**Método Main
         Crear una Instancia de la Clase que implementa los métodos abstractos de la clase interface*/
        MethodRemote server = new MethodRemote();
        /**Establecer una dirección IP por el cual se conectarán lo clientes al Servidor RMI*/
        System.setProperty("java.rmi.server.hostname", "127.0.0.1");
        /**Crea un variable remota, asignando la clases y el puerto de comunicación */
        Remote stub = UnicastRemoteObject.exportObject(server, 9090);
        /**Crea un variable Registry para la invocación de métodos desde distintas máquinas en la red.
         Asignando el puerto de conexión*/
        Registry registry = LocateRegistry.createRegistry(9090);
        /**Registra el objeto remoto creado con un nombre en la utilidad registry*/
        registry.bind("rmi://localhost:3000/server", stub);
        /**Mensaje de Servidor corriendo*/
        System.out.println("Servidor corriendo..");
    }
}
