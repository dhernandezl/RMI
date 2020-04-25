/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class Conexion_Server {
    
    public Conexion_Server(){
    }
    
    public String Validar_RMI(String tarjeta, String tipo_tarjeta) {
        /* Conexión con el servidor RMI */
        try {
            /**
             * Conexión al Servidor RMI mediante IP y Puerto Registry es también
             * un objeto remoto, que nos permite invocar métodos desde distintas
             * máquinas en la red.
             */
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 9090);
            /* Variable de clase obtiene la referencia a un objeto remoto especificado por su nombre */
            TestRemote server = (TestRemote) registry.lookup("rmi://localhost:3000/server");
            /**
             * Consulta al método remoto: Obtener la validación de la tarjeta
             */
            String respuesta = server.validar_tarjeta(tarjeta, tipo_tarjeta);
            /**
             * Condición si la tarjeta es válida
             * Proceso según el resultado obtenido del servidor RMI */
            if (respuesta.equals("Correcto")) {
                return "Tarjeta válida";
            } else {
                return "Tarjeta no válida";
            }
            /**/

        } catch (RemoteException ex) { /*Excepción de conexión Remota */

            Logger.getLogger(ex.getMessage());
            System.err.println("Excepcion cliente : " + ex.toString());
        } catch (NotBoundException ex) { /*Excepción de nombre de objeto no asociado al servidor RMI*/
            Logger.getLogger(ex.getMessage());
        }
        return "Error con el Servidor";
    }
}
