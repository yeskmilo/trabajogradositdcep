/*
 * Sistema de Información para la toma de Decisiones
 * Centro de Educación Permanente
 * Autor: 
 * Yesid Camilo Ortiz Castillo 
 */
package Controlador.Profesoral;

import Estructural.Asignacion_tiquete;
import Estructural.Asignacion_viaticos;
import Modelo.IServicioProfesoral;
import java.rmi.RemoteException;

/**
 *
 * @author Kmilo
 */
public class ControlAsignaciones {

  private IServicioProfesoral servicioProfesoral;

  /**
   * Constructor de la clase controladora ControlAsignaciones
   * @param servicioProfesoral 
   */
  public ControlAsignaciones(IServicioProfesoral servicioProfesoral) {
    this.servicioProfesoral = servicioProfesoral;
  }

  /**
   * Adicion de una nueva asignacion de Viaticos
   * @param modulo
   * @return
   * @throws RemoteException 
   */
  public boolean AgregarAsignacionViaticos(Asignacion_viaticos asignacionViaticos) throws RemoteException {
    return servicioProfesoral.AgregarAsignacionViaticos(asignacionViaticos);
  }

  /**
   * Adición de una nueva asignación de Tiquetes
   * @param asignacionTiquete
   * @return
   * @throws RemoteException 
   */
  public boolean AgregarAsignacionTiquete(Asignacion_tiquete asignacionTiquete) throws RemoteException {
    return servicioProfesoral.AgregarAsignacionTiquete(asignacionTiquete);
  }
}
