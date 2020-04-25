/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author DHL-SIS-ING
 * Clase interface que hereda de de la clase java.rmi.Remote,
 * para indicar que puede llamarse desde cualquier máquina virtual
 * Java
 */
public interface TestRemote extends Remote{
    //Métodos Remotos
    String validar_tarjeta(String tarjeta, String tipo) throws RemoteException;
}
