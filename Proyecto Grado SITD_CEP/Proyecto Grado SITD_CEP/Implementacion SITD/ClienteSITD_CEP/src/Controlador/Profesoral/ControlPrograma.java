/*
 * Sistema de Información para la toma de Decisiones
 * Centro de Educación Permanente
 * Autor: 
 * Yesid Camilo Ortiz Castillo 
 */
package Controlador.Profesoral;

import Estructural.*;
import Modelo.IServicioProfesoral;
import java.rmi.RemoteException;

/**
 *
 * @author Kmilo
 */
public class ControlPrograma {

  private IServicioProfesoral servicioProfesoral;

  /**
   * Constructor del controlador ControlPrograma
   * @param servicioProfesoral 
   */
  public ControlPrograma(IServicioProfesoral servicioProfesoral) {
    this.servicioProfesoral = servicioProfesoral;
  }

  /**
   * Consulta de convenio por numero de convenio para vincular a un programa
   * @param numeroConvenio
   * @return
   * @throws RemoteException 
   */
  public Convenio ConsultaConvenio(int numeroConvenio) throws RemoteException {
    return servicioProfesoral.ConsultaConvenio(numeroConvenio);
  }

  /**
   * Metodo para adicionar un nuevo programa con relacion o no a un convenio
   * @param programa
   * @return
   * @throws RemoteException 
   */
  public boolean AdicionPrograma(Programa programa) throws RemoteException {
    return servicioProfesoral.AdicionPrograma(programa);
  }

  /**
   * Busqueda de programas dada la cohorte del mismo
   * @param cohorte
   * @return
   * @throws RemoteException 
   */
  public Programa ConsultarPrograma(String cohorte) throws RemoteException {
    return servicioProfesoral.ConsultarPrograma(cohorte);
  }
}
