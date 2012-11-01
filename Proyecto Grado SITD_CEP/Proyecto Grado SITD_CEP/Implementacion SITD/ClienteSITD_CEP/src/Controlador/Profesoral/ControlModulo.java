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
public class ControlModulo {
    
    private IServicioProfesoral servicioProfesoral;
    
    /**
     * Constructor del controlador para modulo ControlModulo
     * @param servicioProfesoral 
     */
    public ControlModulo(IServicioProfesoral servicioProfesoral){
        this.servicioProfesoral = servicioProfesoral;
    }
    
}
