/*
 * Sistema de Información para la toma de Decisiones
 * Centro de Educación Permanente
 * Autor: 
 * Yesid Camilo Ortiz Castillo 
 */
package Controlador.Profesoral;

import Estructural.Conferencista;
import Modelo.IServicioProfesoral;
import java.rmi.RemoteException;

/**
 *
 * @author juanpanlo
 */
public class ControlConferencista {

    private IServicioProfesoral servicioProfesoral;

    /**
     * Constructor del controlador para Conferencista ControlConferencista
     *
     * @param servicioProfesoral
     */
    public ControlConferencista(IServicioProfesoral servicioProfesoral) {
        this.servicioProfesoral = servicioProfesoral;
    }

    /**
     * Metodo para adicionar un nuevo conferencista en el sistema
     *
     * @param conferencista
     * @return
     * @throws RemoteException
     */
    public boolean IngresarConferencista(Conferencista conferencista) throws RemoteException {
        return servicioProfesoral.IngresarConferencista(conferencista);
    }

    /**
     * Edicion de datos de conferencista
     *
     * @param conferencista
     * @return
     * @throws RemoteException
     */
    public boolean EditarConferencista(Conferencista conferencista) throws RemoteException {
        return servicioProfesoral.EditarConferencista(conferencista);
    }

    /**
     * Busqueda de conferencista dada la cedula del mismo
     *
     * @param cedula
     * @return
     * @throws RemoteException
     */
    public Conferencista BuscarConferencistaCedula(int cedula) throws RemoteException {
        return servicioProfesoral.BuscarConferencistaCedula(cedula);
    }
}
