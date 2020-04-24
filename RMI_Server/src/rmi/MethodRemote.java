/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.RemoteException;

/**
 *
 * @author DHL-SIS-ING
 */
public class MethodRemote implements TestRemote{

    @Override
    public String validar_tarjeta(String tarjeta, String tipo) throws RemoteException {
        return "";
    }
    
}
