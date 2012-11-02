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
     * @param conferencista
     * @return
     * @throws RemoteException 
     */
    public boolean IngresarConferencista(Conferencista conferencista) throws RemoteException {
        return servicioProfesoral.IngresarConferencista(conferencista);
    }
}
