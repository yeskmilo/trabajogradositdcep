/*
 * Sistema de Información para la toma de Decisiones
 * Centro de Educación Permanente
 * Autor: 
 * Yesid Camilo Ortiz Castillo 
 */
package Modelo;

import ConexionBD.ConexionBD;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kmilo
 */
public class ServicioGeneralSITD extends UnicastRemoteObject implements IServicioGeneralSITD {

  private ConexionBD conexion;

  public ServicioGeneralSITD() throws RemoteException {
    conexion = new ConexionBD();
  }

  /**
   * Inicio de Sesion de los Usuarios
   * @param usuario
   * @param contrasena
   * @return
   * @throws RemoteException 
   */
  @Override
  public int InicioSesion(String usuario, String contrasena) throws RemoteException {
    int categoria = 0;
    ResultSet consulta = null;
    String cadenaBD = "SELECT id_categoria FROM usuarios_login WHERE nombre_usuario ='" + usuario + "' AND contrasena = MD5('" + contrasena + "')";
    try {
      conexion.conectar();
      consulta = conexion.executeQueryStatement(cadenaBD);
      if (consulta != null) {
        try {
          while (consulta.next()) {
            categoria = consulta.getInt(1);
          }
        } catch (Exception ex) {
          System.err.println(ex.getMessage());
        }
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    conexion.closeConecction();
    return categoria;
  }

  @Override
  public IServicioConvenios InstanciaServicioConvenio() throws RemoteException {
    IServicioConvenios servicioConvenios = new ServicioConvenios();
    try {
      Naming.rebind("//127.0.0.1/ServicioConvenios", servicioConvenios);
    } catch (MalformedURLException ex) {
      Logger.getLogger(ServicioGeneralSITD.class.getName()).log(Level.SEVERE, null, ex);
    }
    return servicioConvenios;
  }

  @Override
  public IServicioProfesoral InstanciaServicioProfesoral() throws RemoteException {
    IServicioProfesoral servicioProfesoral = new ServicioProfesoral();
    try {
      Naming.rebind("//127.0.0.1/servicioProfesoral", servicioProfesoral);
    } catch (MalformedURLException ex) {
      Logger.getLogger(ServicioGeneralSITD.class.getName()).log(Level.SEVERE, null, ex);
    }
    return servicioProfesoral;
  }
}
