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
 * This class implements the abstract methods of the TestRemote 
 * class in order to program the function of each method.
 */

public class MethodRemote implements TestRemote{

    @Override
    public Double Addition(String a, String b) throws RemoteException {
        return Double.parseDouble(a) + Double.parseDouble(b);
    }

    @Override
    public Double Substraction(String a, String b) throws RemoteException {
        return Double.parseDouble(a) - Double.parseDouble(b);
    }

    @Override
    public Double Multiplication(String a, String b) throws RemoteException {
        return Double.parseDouble(a) * Double.parseDouble(b);
    }

    @Override
    public Double Division(String a, String b) throws RemoteException {
        return Double.parseDouble(a) / Double.parseDouble(b);
    }
    
}
