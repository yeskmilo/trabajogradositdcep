/*
 * Sistema de Información para la toma de Decisiones
 * Centro de Educación Permanente
 * Autor: 
 * Yesid Camilo Ortiz Castillo 
 */
/**
 * Clase ServiciosProfesoral logica relacionada con la gestión de
 * conferencistas.
 */
package Modelo;

import ConexionBD.ConexionBD;
import Estructural.Asignacion_honorarios;
import Estructural.Asignacion_tiquete;
import Estructural.Asignacion_viaticos;
import Estructural.Conferencista;
import Estructural.Convenio;
import Estructural.Modulo;
import Estructural.Programa;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author kmilo
 */
public class ServicioProfesoral extends UnicastRemoteObject implements IServicioProfesoral, ICambioVista {
  
  private ConexionBD conexion;
  private DateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd");
  private ArrayList<ICambioVista> listaVistas;
  
  public ServicioProfesoral() throws RemoteException {
    conexion = new ConexionBD();
    listaVistas = new ArrayList<ICambioVista>();
  }
  
  @Override
  public void CambioVista() throws RemoteException {
    for (int i = 0; i < listaVistas.size(); i++) {
      listaVistas.get(i).CambioVista();
    }
  }
  
  @Override
  public void AgregarVista(ICambioVista vista) throws RemoteException {
    listaVistas.add(vista);
  }

  /**
   * Insercion de un nuevo conferencista
   *
   * @param conferencista
   * @return controlIngreso
   * @throws RemoteException
   */
  @Override
  public boolean IngresarConferencista(Conferencista conferencista) throws RemoteException {
    boolean controlIngreso = false;
    String cadenaBD = "INSERT INTO conferencista (id_conferencista, cedula_conferencista, "
            + "nombres_conferencista, apellidos_conferencista, fecha_nacimiento, genero_conferencista,"
            + "direccion_conferencista, telefono_conferencista, celular_conferencista, correo_electronico_conferencista,"
            + "numero_cuenta_conferencista, tipo_cuenta_conferencista, banco_conferencista, estado_conferencista) VALUES("
            + "" + conferencista.getId_conferencista() + ", " + conferencista.getCedula_conferencista() + ", "
            + "'" + conferencista.getNombres_conferencista() + "', '" + conferencista.getApellidos_conferencista() + "',"
            + "'" + formatoFecha.format(conferencista.getFecha_nacimiento()) + "','" + conferencista.getGenero_conferencista() + "', "
            + "'" + conferencista.getDireccion_conferencista() + "', '" + conferencista.getTelefono_conferencista() + "',"
            + "'" + conferencista.getCelular_conferencista() + "', '" + conferencista.getCorreo_electronico_conferencista() + "',"
            + "'" + conferencista.getNumero_cuenta_conferencista() + "', '" + conferencista.getTipo_cuenta_conferencista() + "',"
            + "'" + conferencista.getBanco_conferencista() + "', '" + conferencista.getEstado_conferencista() + "')";
    try {
      conexion.conectar();
      controlIngreso = conexion.executeUpdateStatement(cadenaBD);
      conexion.closeConecction();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return controlIngreso;
  }

  /**
   * Consulta de convenio por numero de convenio para vincular a un programa
   *
   * @param numeroConvenio
   * @return
   * @throws RemoteException
   */
  @Override
  public Convenio ConsultaConvenio(int numeroConvenio) throws RemoteException {
    Convenio convenio = null;
    String cadenaBD = "SELECT * FROM convenio WHERE numero_convenio = " + numeroConvenio;
    ResultSet resultadoConsulta = null;
    try {
      conexion.conectar();
      resultadoConsulta = conexion.executeQueryStatement(cadenaBD);
      while (resultadoConsulta.next()) {
        convenio = new Convenio(resultadoConsulta.getInt(1), resultadoConsulta.getInt(2), resultadoConsulta.getDate(3),
                resultadoConsulta.getInt(4), resultadoConsulta.getString(5), resultadoConsulta.getString(6), resultadoConsulta.getString(7),
                resultadoConsulta.getString(8), resultadoConsulta.getString(9));
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    conexion.closeConecction();
    return convenio;
  }
  
  @Override
  public boolean AdicionPrograma(Programa programa) throws RemoteException {
    boolean controlAdicion = false;
    String cadenaBD = "INSERT INTO programa VALUES(" + programa.getId_programa() + ", '" + programa.getCohorte_programa() + "',"
            + "'" + programa.getNombre_programa() + "', '" + formatoFecha.format(programa.getFecha_inicio_programa()) + "', "
            + "" + programa.getValor() + ", " + programa.getParticipantes() + ", '" + programa.getEstado() + "', "
            + "" + programa.getNumero_convenio() + ")";
    try {
      conexion.conectar();
      controlAdicion = conexion.executeUpdateStatement(cadenaBD);
      conexion.closeConecction();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    CambioVista();
    return controlAdicion;
  }
  
  @Override
  public Programa ConsultarPrograma(String cohorte) throws RemoteException {
    Programa programa = null;
    String cadenaBD = "SELECT * FROM programa WHERE cohorte_programa='" + cohorte + "'";
    ResultSet resultadoConsulta = null;
    try {
      conexion.conectar();
      resultadoConsulta = conexion.executeQueryStatement(cadenaBD);
      while (resultadoConsulta.next()) {
        programa = new Programa(resultadoConsulta.getInt(1), resultadoConsulta.getString(2), resultadoConsulta.getString(3),
                resultadoConsulta.getDate(4), resultadoConsulta.getDouble(5), resultadoConsulta.getInt(6),
                resultadoConsulta.getString(7), resultadoConsulta.getInt(8));
      }
      conexion.closeConecction();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return programa;
  }

  /**
   * Edicion de datos de conferencista
   *
   * @param conferencista
   * @return
   * @throws RemoteException
   */
  @Override
  public boolean EditarConferencista(Conferencista conferencista) throws RemoteException {
    boolean controlActualizacion = false;
    String cadenaBD = "UPDATE CONFERENCISTA SET nombres_conferencista='" + conferencista.getNombres_conferencista() + "', "
            + "apellidos_conferencista='" + conferencista.getApellidos_conferencista() + "', fecha_nacimiento='" + formatoFecha.format(conferencista.getFecha_nacimiento()) + "', "
            + "genero_conferencista='" + conferencista.getGenero_conferencista() + "', direccion_conferencista='" + conferencista.getDireccion_conferencista() + "', "
            + "telefono_conferencista='" + conferencista.getTelefono_conferencista() + "', celular_conferencista='" + conferencista.getCelular_conferencista() + "', "
            + "correo_electronico_conferencista='" + conferencista.getCorreo_electronico_conferencista() + "', "
            + "numero_cuenta_conferencista='" + conferencista.getNumero_cuenta_conferencista() + "', tipo_cuenta_conferencista='" + conferencista.getTipo_cuenta_conferencista() + "',"
            + "banco_conferencista='" + conferencista.getBanco_conferencista() + "', estado_conferencista='" + conferencista.getEstado_conferencista() + " "
            + "WHERE cedula_conferencista=" + conferencista.getCedula_conferencista();
    try {
      conexion.conectar();
      controlActualizacion = conexion.executeUpdateStatement(cadenaBD);
      conexion.closeConecction();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return controlActualizacion;
  }

  /**
   * Busqueda de conferencista dada la cedula del mismo
   *
   * @param cedula
   * @return
   * @throws RemoteException
   */
  @Override
  public Conferencista BuscarConferencistaCedula(int cedula) throws RemoteException {
    Conferencista conferencista = null;
    ResultSet resultadoBusqueda = null;
    String cadenaBD = "SELECT * FROM conferencista WHERE cedula_conferencista = " + cedula;
    try {
      conexion.conectar();
      resultadoBusqueda = conexion.executeQueryStatement(cadenaBD);
      while (resultadoBusqueda.next()) {
        conferencista = new Conferencista(resultadoBusqueda.getInt(1), resultadoBusqueda.getInt(2), resultadoBusqueda.getString(3),
                resultadoBusqueda.getString(4), resultadoBusqueda.getDate(5), resultadoBusqueda.getString(6), resultadoBusqueda.getString(7),
                resultadoBusqueda.getString(8), resultadoBusqueda.getString(9), resultadoBusqueda.getString(10), resultadoBusqueda.getString(11),
                resultadoBusqueda.getString(12), resultadoBusqueda.getString(13), resultadoBusqueda.getString(14));
      }
      conexion.closeConecction();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return conferencista;
  }
  
  @Override
  public int AgregarModuloPrograma(Modulo modulo) throws RemoteException {
    boolean controlAdicion = false;
    int id_modulo = 0;
    String cadenaBD = "INSERT INTO modulo VALUES(" + modulo.getId_modulo() + ", '" + modulo.getNombre_modulo() + "', "
            + "" + modulo.getDuracion_modulo_horas() + ",'" + formatoFecha.format(modulo.getFecha_inicio_modulo()) + "', "
            + "" + modulo.getValor_hora() + ", '" + modulo.getCohorte_programa() + "', " + modulo.getCedula_conferencista() + ")";
    try {
      conexion.conectar();
      controlAdicion = conexion.executeUpdateStatement(cadenaBD);
      if (controlAdicion) {
        ResultSet consulta_id = null;
        cadenaBD = "SELECT LAST_INSERT_ID()";
        consulta_id = conexion.executeQueryStatement(cadenaBD);
        while (consulta_id.next()) {
          id_modulo = consulta_id.getInt(1);
        }
      }
      conexion.closeConecction();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return id_modulo;
  }
  
  @Override
  public boolean AgregarAsignacionViaticos(Asignacion_viaticos asignacionViaticos) throws RemoteException {
    boolean controlAdicion = false;
    String cadenaBD = "INSERT INTO asignacion_viaticos VALUES(" + asignacionViaticos.getId_viaticos() + ", "
            + "'" + asignacionViaticos.getFecha_pago() + "', " + asignacionViaticos.getMonto_viaticos() + ", "
            + "" + asignacionViaticos.getid_modulo() + ")";
    try {
      conexion.conectar();
      controlAdicion = conexion.executeUpdateStatement(cadenaBD);
      conexion.closeConecction();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return controlAdicion;
  }
  
  @Override
  public ArrayList<Modulo> BuscarModuloPrograma(String cohorte) throws RemoteException {
    ArrayList<Modulo> modulos = new ArrayList<Modulo>();
    Modulo modulo = null;
    ResultSet resultadoConsulta = null;
    String cadenaBD = "SELECT * FROM modulo WHERE cohorte_programa = '" + cohorte + "'";
    try {
      conexion.conectar();
      resultadoConsulta = conexion.executeQueryStatement(cadenaBD);
      while (resultadoConsulta.next()) {
        modulo = new Modulo(resultadoConsulta.getInt(1), resultadoConsulta.getString(2),
                resultadoConsulta.getInt(3), resultadoConsulta.getDate(4), resultadoConsulta.getDouble(5),
                resultadoConsulta.getString(6), resultadoConsulta.getInt(7));
        modulos.add(modulo);
      }
      conexion.closeConecction();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return modulos;
  }
  
  @Override
  public boolean EditarPrograma(Programa programa) throws RemoteException {
    boolean controlActualizacion = false;
    String cadenaBD = "UPDATE programa SET nombre_programa='" + programa.getNombre_programa() + "', "
            + "fecha_inicio_programa='" + formatoFecha.format(programa.getFecha_inicio_programa()) + "',"
            + "valor=" + programa.getValor() + ", participantes=" + programa.getParticipantes() + ", "
            + "estado='" + programa.getEstado() + "', numero_convenio=" + programa.getNumero_convenio() + " "
            + "WHERE cohorte_programa='" + programa.getCohorte_programa() + "'";
    try {
      conexion.conectar();
      controlActualizacion = conexion.executeUpdateStatement(cadenaBD);
      conexion.closeConecction();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return controlActualizacion;
  }
  
  @Override
  public boolean AgregarAsignacionTiquete(Asignacion_tiquete asignacionTiquete) throws RemoteException {
    boolean controlAdicion = false;
    String cadenaBD = "INSERT INTO asignacion_tiquete VALUES(" + asignacionTiquete.getId_tiquete() + ","
            + "'" + asignacionTiquete.getFecha_solicitud() + "', '" + asignacionTiquete.getFecha_salida() + "',"
            + "'" + asignacionTiquete.getFecha_regreso() + "', '" + asignacionTiquete.getCiudad_origen() + "',"
            + "'" + asignacionTiquete.getCiudad_destino() + "', '" + asignacionTiquete.getAerolinea() + "',"
            + "" + asignacionTiquete.getid_modulo() + ")";
    try {
      conexion.conectar();
      controlAdicion = conexion.executeUpdateStatement(cadenaBD);
      conexion.closeConecction();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return controlAdicion;
  }
  
  @Override
  public boolean AgregarAsignacionHonorarios(Asignacion_honorarios asignacionHonorarios) throws RemoteException {
    boolean controlAdicion = false;
    String cadenaBD = "INSERT INTO asignacion_honorarios VALUES(" + asignacionHonorarios.getId_honorarios() + ","
            + "'" + asignacionHonorarios.getFecha_pago() + "', " + asignacionHonorarios.getMonto_honorarios() + ","
            + "" + asignacionHonorarios.getid_modulo() + ")";
    try {
      conexion.conectar();
      controlAdicion = conexion.executeUpdateStatement(cadenaBD);
      conexion.closeConecction();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return controlAdicion;
  }
  
  @Override
  public ArrayList<Programa> BuscarProgramas() throws RemoteException {
    ArrayList<Programa> programas = new ArrayList<Programa>();
    Programa programa = null;
    ResultSet resultadoConsulta = null;
    String cadenaBD = "SELECT * FROM programa";
    try {
      conexion.conectar();
      resultadoConsulta = conexion.executeQueryStatement(cadenaBD);
      while (resultadoConsulta.next()) {
        programa = new Programa(resultadoConsulta.getInt(1), resultadoConsulta.getString(2),
                resultadoConsulta.getString(3), resultadoConsulta.getDate(4),
                resultadoConsulta.getDouble(5), resultadoConsulta.getInt(6), resultadoConsulta.getString(7),
                resultadoConsulta.getInt(8));
        programas.add(programa);
      }
      conexion.closeConecction();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return programas;
  }
}