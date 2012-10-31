/*
 * Sistema de Información para la toma de Decisiones
 * Centro de Educación Permanente
 * Autor: 
 * Yesid Camilo Ortiz Castillo 
 */
package Modelo;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Kmilo
 */
public interface ICambioVista extends Remote {

    /**
     * Metodo para realizar actualizacion en una vista;
     * @throws RemoteException 
     */
    public void CambioVista() throws RemoteException;
}
