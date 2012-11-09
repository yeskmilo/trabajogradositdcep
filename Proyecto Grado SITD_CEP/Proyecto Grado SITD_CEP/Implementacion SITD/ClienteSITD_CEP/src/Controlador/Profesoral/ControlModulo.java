/*
 * Sistema de Información para la toma de Decisiones
 * Centro de Educación Permanente
 * Autor: 
 * Yesid Camilo Ortiz Castillo 
 */
package Controlador.Profesoral;

import Estructural.Modulo;
import Modelo.IServicioProfesoral;
import java.rmi.RemoteException;

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
  public ControlModulo(IServicioProfesoral servicioProfesoral) {
    this.servicioProfesoral = servicioProfesoral;
  }

  /**
   * Adicion de un nuevo modulo vinculado a un programa y asignadole un conferencista
   * @param modulo
   * @return
   * @throws RemoteException 
   */
  public boolean AgregarModuloPrograma(Modulo modulo) throws RemoteException {
    return servicioProfesoral.AgregarModuloPrograma(modulo);
  }
}
