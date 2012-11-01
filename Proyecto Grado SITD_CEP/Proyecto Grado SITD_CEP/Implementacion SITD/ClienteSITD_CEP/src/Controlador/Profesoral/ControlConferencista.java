/*
 * Sistema de Información para la toma de Decisiones
 * Centro de Educación Permanente
 * Autor: 
 * Yesid Camilo Ortiz Castillo 
 */
package Controlador.Profesoral;

import Modelo.IServicioProfesoral;

/**
 *
 * @author juanpanlo
 */
public class ControlConferencista {

    private IServicioProfesoral servicioProfesoral;
    
    /**
     * Constructor del controlador para Conferencista ControlConferencista
     * @param servicioProfesoral 
     */
    public ControlConferencista(IServicioProfesoral servicioProfesoral) {
        this.servicioProfesoral = servicioProfesoral;
    }
}
