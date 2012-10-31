/*
 * Sistema de Información para la toma de Decisiones
 * Centro de Educación Permanente
 * Autor: 
 * Yesid Camilo Ortiz Castillo 
 */
package Controlador;

import Modelo.IServicioGeneralSITD;
import java.rmi.RemoteException;

/**
 *
 * @author Kmilo
 */
public class ControlLogin {

    private IServicioGeneralSITD servicioGeneral;

    public ControlLogin(IServicioGeneralSITD servicioGeneral) {
        this.servicioGeneral = servicioGeneral;
    }

    public int InicioSesion(String usuario, String contrasena) throws RemoteException {
        return servicioGeneral.InicioSesion(usuario, contrasena);
    }
}
