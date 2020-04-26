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
 * Esta clase implementa los métodos abstractos
 * de la clase TestRemote para poder programar 
 * la función de cada método.
 */

public class MethodRemote implements TestRemote{

    /*Método de Validación de Tarjetas*/
    @Override
    public String validar_tarjeta(String tarjeta, String tipo) throws RemoteException {
        /**Declaración de variable respuesta */
        String respuesta = "";
        switch (tipo) {
            /**Si el tipo de tarjeta es Visa*/
            case "Visa":
                /**Crea un vector de string separados por un guión medio*/
                String[] v = tarjeta.split("-");
                /**Proceso de Validación de Tarjetas*/
                /**Suma de los primeros digitos, de los 3 primeros cuartetos*/
                int val1 = Integer.valueOf(v[0].substring(0, 1)) + Integer.valueOf(v[1].substring(0, 1)) + Integer.valueOf(v[2].substring(0, 1));
                /** El resultado de la suma MOD 10 debe ser Igual al primer número del último cuarteto*/
                if (val1 % 10 == Integer.valueOf(v[3].substring(0, 1))) {
                    /**Suma de los segundos digitos, de los 3 primeros cuartetos*/
                    int val2 = (Integer.valueOf(v[0].substring(1, 2)) * 2) + (Integer.valueOf(v[1].substring(1, 2)) * 2) + (Integer.valueOf(v[2].substring(1, 2)) * 2);
                    /** El resultado de la suma DIV 10 debe ser Igual al segundo número del último cuarteto*/
                    if (val2 / 10 == Integer.valueOf(v[3].substring(1, 2))) {
                        /**Suma de los terceros digitos, de los 3 primeros cuartetos*/
                        int val3 = (Integer.valueOf(v[0].substring(2, 3)) * 3) + (Integer.valueOf(v[1].substring(2, 3)) * 3) + (Integer.valueOf(v[2].substring(2, 3)) * 3);
                        /** El resultado de la suma MOD 10 debe ser Igual al tercer número del último cuarteto*/
                        if (val3 % 10 == Integer.valueOf(v[3].substring(2, 3))) {
                            /**Suma de los cuartos digitos, de los 3 primeros cuartetos*/
                            int val4 = (Integer.valueOf(v[0].substring(3)) * 4) + (Integer.valueOf(v[1].substring(3)) * 4) + (Integer.valueOf(v[2].substring(3)) * 4);
                            /** El resultado de la suma DIV 10 debe ser Igual al cuarto número del último cuarteto*/
                            if (val4 / 10 == Integer.valueOf(v[3].substring(3))) {
                                respuesta = "Correcto";
                            } else {
                                respuesta = "Tarjeta no válida";
                            }
                        } else {
                            respuesta = "Tarjeta no válida";
                        }
                    } else {
                        respuesta = "Tarjeta no válida";
                    }
                } else {
                    respuesta = "Tarjeta no válida";
                }
                break;
            /**Si el tipo de tarjeta es Mastercard*/
            case "MasterCard":
                /**Crea un vector de string separados por un guión medio*/
                String[] v1 = tarjeta.split("-");
                /**Proceso de Validación de Tarjetas*/
                /**Suma de los primeros digitos, de los 3 primeros cuartetos*/
                int vall1 = Integer.valueOf(v1[0].substring(0, 1)) + Integer.valueOf(v1[1].substring(0, 1)) + Integer.valueOf(v1[2].substring(0, 1));
                /** El resultado de la suma MOD 10 debe ser Igual al primer número del último cuarteto*/
                if (vall1 % 10 == Integer.valueOf(v1[3].substring(0, 1))) {
                    /**Suma de los segundos digitos, de los 3 primeros cuartetos*/
                    int val2 = (Integer.valueOf(v1[0].substring(1, 2)) * 2) + (Integer.valueOf(v1[1].substring(1, 2)) * 2) + (Integer.valueOf(v1[2].substring(1, 2)) * 2);
                    /** El resultado de la suma DIV 10 debe ser Igual al segundo número del último cuarteto*/
                    if (val2 / 10 == Integer.valueOf(v1[3].substring(1, 2))) {
                        /**Suma de los terceros digitos, de los 3 primeros cuartetos*/
                        int val3 = (Integer.valueOf(v1[0].substring(2, 3)) * 3) + (Integer.valueOf(v1[1].substring(2, 3)) * 3) + (Integer.valueOf(v1[2].substring(2, 3)) * 3);
                        /** El resultado de la suma MOD 10 debe ser Igual al tercer número del último cuarteto*/
                        if (val3 % 10 == Integer.valueOf(v1[3].substring(2, 3))) {
                            /**Suma de los cuartos digitos, de los 3 primeros cuartetos*/
                            int val4 = (Integer.valueOf(v1[0].substring(3)) * 4) + (Integer.valueOf(v1[1].substring(3)) * 4) + (Integer.valueOf(v1[2].substring(3)) * 4);
                            /** El resultado de la suma DIV 10 debe ser Igual al cuarto número del último cuarteto*/
                            if (val4 / 10 == Integer.valueOf(v1[3].substring(3))) {
                                respuesta = "Correcto";
                            } else {
                                respuesta = "Tarjeta no válida";
                            }
                        } else {
                            respuesta = "Tarjeta no válida";
                        }
                    } else {
                        respuesta = "Tarjeta no válida";
                    }
                } else {
                    respuesta = "Tarjeta no válida";
                }
                break;
            /**Si el tipo de tarjeta es Dinnners Club*/
            case "Dinners Club":
                /**Crea un vector de string separados por un guión medio*/
                String[] v2 = tarjeta.split("-");
                /**Proceso de Validación de Tarjetas*/
                /**Suma de los primeros digitos, de los 2 primeros quintetos*/
                int valll1 = Integer.valueOf(v2[0].substring(0, 1)) + Integer.valueOf(v2[1].substring(0, 1));
                /** El resultado de la suma MOD 10 debe ser Igual al primer número del último quinteto*/
                if (valll1 % 10 == Integer.valueOf(v2[2].substring(0, 1))) {
                    /**Suma de los segundos digitos, de los 2 primeros quintetos*/
                    int val2 = (Integer.valueOf(v2[0].substring(1, 2)) * 2) + (Integer.valueOf(v2[1].substring(1, 2)) * 2);
                    /** El resultado de la suma DIV 10 debe ser Igual al segundo número del último quinteto*/
                    if (val2 / 10 == Integer.valueOf(v2[2].substring(1, 2))) {
                        /**Suma de los terceros digitos, de los 2 primeros quintetos*/
                        int val3 = (Integer.valueOf(v2[0].substring(2, 3)) * 3) + (Integer.valueOf(v2[1].substring(2, 3)) * 3);
                        /** El resultado de la suma MOD 10 debe ser Igual al tercer número del último quinteto*/
                        if (val3 % 10 == Integer.valueOf(v2[2].substring(2, 3))) {
                            /**Suma de los cuartos digitos, de los 2 primeros quintetos*/
                            int val4 = (Integer.valueOf(v2[0].substring(3, 4)) * 4) + (Integer.valueOf(v2[1].substring(3, 4)) * 4);
                            /** El resultado de la suma DIV 10 debe ser Igual al cuarto número del último quinteto*/
                            if (val4 / 10 == Integer.valueOf(v2[2].substring(3, 4))) {
                                /**Suma de los quintos digitos, de los 2 primeros quintetos*/
                                int val5 = (Integer.valueOf(v2[0].substring(4)) * 5) + (Integer.valueOf(v2[1].substring(4)) * 5);
                                /** El resultado de la suma MOD 10 debe ser Igual al quinto número del último quinteto*/
                                if (val5 % 10 == Integer.valueOf(v2[2].substring(4))) {
                                    respuesta = "Correcto";
                                } else {
                                    respuesta = "Tarjeta no válida";
                                }
                            } else {
                                respuesta = "Tarjeta no válida";
                            }
                        } else {
                            respuesta = "Tarjeta no válida";
                        }
                    } else {
                        respuesta = "Tarjeta no válida";
                    }
                } else {
                    respuesta = "Tarjeta no válida";
                }
                break;
        }
        return respuesta;
    }
}
