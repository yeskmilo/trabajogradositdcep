/*
 * Sistema de Información para la toma de Decisiones
 * Centro de Educación Permanente
 * Autor: 
 * Yesid Camilo Ortiz Castillo 
 */
package Modelo;

import ConexionBD.ConexionBD;
import Estructural.Actas;
import Estructural.Aporte_rubro_entidad;
import Estructural.Aportes_convenio;
import Estructural.Convenio;
import Estructural.Convenio_entidad;
import Estructural.Convenio_vinculado;
import Estructural.Ejecucion_presupuesto;
import Estructural.Entidad_convenio;
import Estructural.Presupuesto;
import Estructural.Rubro_presupuestal;
import Estructural.Variaciones_tiempo;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author Kmilo
 */
public class ServicioConvenios extends UnicastRemoteObject implements IServicioConvenios, ICambioVista {

  private ConexionBD conexion;
  private DateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd");
  private ArrayList<ICambioVista> listaVistas;

  public ServicioConvenios() throws RemoteException {
    conexion = new ConexionBD();
    listaVistas = new ArrayList<ICambioVista>();
  }

  @Override
  public boolean AdicionarConvenio(Convenio convenio) throws RemoteException {
    boolean controlAdicion = false;
    String cadenaBD = "INSERT INTO convenio VALUES (" + convenio.getId_convenio() + ", "
            + "" + convenio.getNumero_convenio() + ", '" + formatoFecha.format(convenio.getFecha_inicio_convenio()) + "',"
            + "" + convenio.getDuracion_convenio_dias() + ", '" + convenio.getSaldos_sociales() + "',"
            + "'" + convenio.getSaldos_pedagogicos() + "','" + convenio.getResumen_convenio() + "',"
            + "'" + convenio.getObjeto_convenio() + "','" + convenio.getEstado_convenio() + "')";
    try {
      conexion.conectar();
      controlAdicion = conexion.executeUpdateStatement(cadenaBD);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    conexion.closeConecction();
    return controlAdicion;
  }

  @Override
  public boolean AdicionActa(Actas acta) throws RemoteException {
    boolean controlAdicion = false;
    String cadenaBD = "INSERT INTO actas VALUES(" + acta.getId_actas() + ", '" + formatoFecha.format(acta.getFecha_acta()) + "',"
            + "'" + acta.getAsunto_acta() + "'," + acta.getNumero_convenio() + ")";
    try {
      conexion.conectar();
      controlAdicion = conexion.executeUpdateStatement(cadenaBD);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    conexion.closeConecction();
    return controlAdicion;
  }

  @Override
  public boolean AdicionConvenioEntidad(Convenio_entidad convenioEntidad) throws RemoteException {
    boolean controlAdicion = false;
    int id_detalle = 0;
    String cadenaBD = "INSERT INTO convenio_entidad VALUES(" + convenioEntidad.getId_convenio_entidad() + ", "
            + "" + convenioEntidad.getNumero_convenio() + ", '" + convenioEntidad.getNit_entidad() + "')";
    try {
      conexion.conectar();
      controlAdicion = conexion.executeUpdateStatement(cadenaBD);
      /*ResultSet consulta_id = null;
      cadenaBD = "SELECT LAST_INSERT_ID()";
      consulta_id = conexion.executeQueryStatement(cadenaBD);
      while (consulta_id.next()) {
      id_detalle = consulta_id.getInt(1);
      }*/
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    conexion.closeConecction();
    CambioVista();
    return controlAdicion;
  }

  @Override
  public boolean AdicionConvenioVinculado(Convenio_vinculado vinculadoConvenio) throws RemoteException {
    boolean controlAdicion = false;
    int id_detalle = 0;
    String cadenaBD = "INSERT INTO convenio_vinculado VALUES(" + vinculadoConvenio.getId_convenio_vinculado() + ", "
            + "" + vinculadoConvenio.getId_vinculado() + ", " + vinculadoConvenio.getNumero_convenio() + ")";
    try {
      conexion.conectar();
      controlAdicion = conexion.executeUpdateStatement(cadenaBD);
      /*ResultSet consulta_id = null;
      cadenaBD = "SELECT LAST_INSERT_ID()";
      consulta_id = conexion.executeQueryStatement(cadenaBD);
      while (consulta_id.next()) {
      id_detalle = consulta_id.getInt(1);
      }*/
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    conexion.closeConecction();
    return controlAdicion;
  }

  @Override
  public ArrayList<Entidad_convenio> ConsultaEntidades(int numeroConvenio) throws RemoteException {
    ArrayList entidadesNIT = new ArrayList();
    ArrayList entidades = new ArrayList<Entidad_convenio>();
    try {
      entidadesNIT = ConsultaEntidad_convenio(numeroConvenio);
      conexion.conectar();
      String cadenaBD = "";
      ResultSet consultaEntidades = null;
      for (int i = 0; i < entidadesNIT.size(); i++) {
        cadenaBD = "SELECT * FROM entidad_convenio where NIT_entidad = '" + entidadesNIT.get(i) + "'";
        consultaEntidades = conexion.executeQueryStatement(cadenaBD);
        while (consultaEntidades.next()) {
          Entidad_convenio entidad_convenio = new Entidad_convenio(consultaEntidades.getInt(1), consultaEntidades.getString(2), consultaEntidades.getString(3), consultaEntidades.getString(4));
          entidades.add(entidad_convenio);
        }
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    conexion.closeConecction();
    return entidades;
  }

  public ArrayList ConsultaEntidad_convenio(int numeroConvenio) throws RemoteException {
    ArrayList entidades = new ArrayList();
    String cadenaBD = "SELECT NIT_entidad FROM convenio_entidad where numero_convenio = " + numeroConvenio;
    try {
      conexion.conectar();
      ResultSet consultaNIT = null;
      consultaNIT = conexion.executeQueryStatement(cadenaBD);
      while (consultaNIT.next()) {
        entidades.add(consultaNIT.getString(1));
      }
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
    conexion.closeConecction();
    return entidades;
  }

  @Override
  public boolean AdicionEntidad(Entidad_convenio entidad) throws RemoteException {
    boolean controlAdicion = false;
    String cadenaBD = "INSERT INTO entidad_convenio VALUES(" + entidad.getId_entidad() + ",'" + entidad.getNIT_entidad() + "',"
            + "'" + entidad.getNombre_entidad() + "','" + entidad.getDescripcion_entidad() + "')";
    try {
      conexion.conectar();
      controlAdicion = conexion.executeUpdateStatement(cadenaBD);
    } catch (Exception e) {
    }
    conexion.closeConecction();
    return controlAdicion;
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

  @Override
  public Entidad_convenio ConsultaEntidad(String NIT) throws RemoteException {
    Entidad_convenio entidad = null;
    String cadenaBD = "SELECT * FROM entidad_convenio where NIT_entidad='" + NIT + "'";
    ResultSet consultaEntidad = null;
    try {
      conexion.conectar();
      consultaEntidad = conexion.executeQueryStatement(cadenaBD);
      while (consultaEntidad.next()) {
        entidad = new Entidad_convenio(consultaEntidad.getInt(1), consultaEntidad.getString(2), consultaEntidad.getString(3), consultaEntidad.getString(4));
      }
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
    conexion.closeConecction();
    return entidad;
  }

  @Override
  public boolean EliminarConvenio_entidad(Convenio_entidad convenio_entidad) throws RemoteException {
    boolean controlEliminacion = false;
    String cadenaBD = "DELETE FROM convenio_entidad WHERE numero_convenio=" + convenio_entidad.getNumero_convenio()
            + " AND NIT_entidad='" + convenio_entidad.getNit_entidad() + "'";
    String cadenaBDaporte = "DELETE FROM aportes_convenio WHERE numero_convenio=" + convenio_entidad.getNumero_convenio()
            + " AND NIT_entidad='" + convenio_entidad.getNit_entidad() + "'";
    try {
      conexion.conectar();
      controlEliminacion = conexion.executeUpdateStatement(cadenaBD);
      controlEliminacion = conexion.executeUpdateStatement(cadenaBDaporte);
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
    conexion.closeConecction();
    return controlEliminacion;
  }

  @Override
  public boolean AdicionAporte(Aportes_convenio aporte) throws RemoteException {
    boolean controlAdicion = false;
    String cadenaBD = "INSERT INTO aportes_convenio VALUES(" + aporte.getId_aporte() + ", "
            + "'" + formatoFecha.format(aporte.getFecha_desembolso()) + "'," + aporte.getMonto_aporte() + ",'" + aporte.getNIT_entidad() + "',"
            + "" + aporte.getNumeroConvenio() + ")";
    try {
      conexion.conectar();
      controlAdicion = conexion.executeUpdateStatement(cadenaBD);
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
    conexion.closeConecction();
    return controlAdicion;
  }

  @Override
  public ArrayList<Aportes_convenio> ConsultaAportesEntidadConvenio(String NIT, int numeroConvenio) throws RemoteException {
    ArrayList<Aportes_convenio> aportes = new ArrayList<Aportes_convenio>();
    ResultSet busquedaAportes = null;
    String cadenaBD = "SELECT * FROM aportes_convenio WHERE NIT_entidad = '" + NIT + "' AND numero_convenio= " + numeroConvenio;
    try {
      conexion.conectar();
      busquedaAportes = conexion.executeQueryStatement(cadenaBD);
      while (busquedaAportes.next()) {
        Aportes_convenio aporte = new Aportes_convenio(busquedaAportes.getInt(1), busquedaAportes.getDate(2),
                busquedaAportes.getDouble(3), busquedaAportes.getString(4), busquedaAportes.getInt(5));
        aportes.add(aporte);
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    conexion.closeConecction();
    return aportes;
  }

  @Override
  public boolean AdicionPresupuesto(Presupuesto presupuesto) throws RemoteException {
    boolean controlAdicion = false;
    String cadenaBD = "INSERT INTO presupuesto VALUES(" + presupuesto.getId_presupuesto() + ", "
            + "'" + formatoFecha.format(presupuesto.getFecha_elaboracion()) + "'," + presupuesto.getNumero_convenio() + ")";
    try {
      conexion.conectar();
      controlAdicion = conexion.executeUpdateStatement(cadenaBD);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    conexion.closeConecction();
    return controlAdicion;
  }

  @Override
  public Presupuesto PresupuestoPorConvenio(int numeroConvenio) throws RemoteException {
    Presupuesto presupuesto = null;
    ResultSet resultadoBusqueda = null;
    String cadenaBD = "SELECT * FROM presupuesto WHERE numero_convenio = " + numeroConvenio;
    try {
      conexion.conectar();
      resultadoBusqueda = conexion.executeQueryStatement(cadenaBD);
      while (resultadoBusqueda.next()) {
        presupuesto = new Presupuesto(resultadoBusqueda.getInt(1), resultadoBusqueda.getDate(2), resultadoBusqueda.getInt(3));
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    conexion.closeConecction();
    return presupuesto;
  }

  @Override
  public int AgregarRubro_presupuestal(Rubro_presupuestal rubro_presupuestal) throws RemoteException {
    boolean controlAdicion = false;
    int id_rubro = 0;
    String cadenaBD = "INSERT INTO rubro_presupuestal VALUES(" + rubro_presupuestal.getId_rubro() + ", "
            + "'" + rubro_presupuestal.getDescripcion_rubro() + "', " + rubro_presupuestal.getCantidad() + ", " + rubro_presupuestal.getValor_unitario() + ", "
            + "" + rubro_presupuestal.getId_presupuesto() + ")";
    try {
      conexion.conectar();
      controlAdicion = conexion.executeUpdateStatement(cadenaBD);
      if (controlAdicion) {
        ResultSet consulta_id = null;
        cadenaBD = "SELECT LAST_INSERT_ID()";
        consulta_id = conexion.executeQueryStatement(cadenaBD);
        while (consulta_id.next()) {
          id_rubro = consulta_id.getInt(1);
        }
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    conexion.closeConecction();
    CambioVista();
    return id_rubro;
  }

  @Override
  public boolean AgregarAporte_rubro_entidad(Aporte_rubro_entidad aporte_rubro_entidad) throws RemoteException {
    boolean controlAdicion = false;
    String cadenaBD = "INSERT INTO aporte_rubro_entidad VALUES(" + aporte_rubro_entidad.getId_aporte_rubro() + ", "
            + "'" + aporte_rubro_entidad.getNIT_entidad() + "', " + aporte_rubro_entidad.getMonto_aporte_rubro() + ","
            + " " + aporte_rubro_entidad.getId_rubro() + ")";
    try {
      conexion.conectar();
      controlAdicion = conexion.executeUpdateStatement(cadenaBD);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    conexion.closeConecction();
    CambioVista();
    return controlAdicion;
  }

  @Override
  public ArrayList<Rubro_presupuestal> ConsultaRubrosPorPresupuesto(Presupuesto presupuesto) throws RemoteException {
    ArrayList<Rubro_presupuestal> rubros = new ArrayList<Rubro_presupuestal>();
    ResultSet resultadoConsulta = null;
    String cadenaBD = "SELECT * FROM rubro_presupuestal WHERE id_presupuesto=" + presupuesto.getId_presupuesto();
    try {
      conexion.conectar();
      resultadoConsulta = conexion.executeQueryStatement(cadenaBD);
      while (resultadoConsulta.next()) {
        Rubro_presupuestal rubro_presupuestal = new Rubro_presupuestal(resultadoConsulta.getInt(1), resultadoConsulta.getString(2),
                resultadoConsulta.getInt(3), resultadoConsulta.getDouble(4), resultadoConsulta.getInt(5));
        rubros.add(rubro_presupuestal);
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    conexion.closeConecction();
    return rubros;
  }

  @Override
  public ArrayList<Aporte_rubro_entidad> ConsultaAportesPorRubroEntidad(Rubro_presupuestal rubro_presupuestal) throws RemoteException {
    ArrayList<Aporte_rubro_entidad> aportes = new ArrayList<Aporte_rubro_entidad>();
    ResultSet resultadoConsulta = null;
    String cadenaBD = "SELECT * FROM aporte_rubro_entidad WHERE id_rubro=" + rubro_presupuestal.getId_rubro();
    try {
      conexion.conectar();
      resultadoConsulta = conexion.executeQueryStatement(cadenaBD);
      while (resultadoConsulta.next()) {
        Aporte_rubro_entidad aporte_rubro = new Aporte_rubro_entidad(resultadoConsulta.getInt(1), resultadoConsulta.getString(2),
                resultadoConsulta.getDouble(3), resultadoConsulta.getInt(4));
        aportes.add(aporte_rubro);
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    conexion.closeConecction();
    return aportes;
  }

  @Override
  public Convenio ConsultaConvenioNumero(int numeroConvenio) throws RemoteException {
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
  public ArrayList<Ejecucion_presupuesto> ConsultaEjecucionPorRubro(int id_rubro) throws RemoteException {
    ArrayList<Ejecucion_presupuesto> ejecuciones = new ArrayList<Ejecucion_presupuesto>();
    ResultSet resultadoConsulta = null;
    String cadenaBD = "SELECT * FROM ejecucion_presupuesto WHERE id_rubro = " + id_rubro;
    try {
      conexion.conectar();
      resultadoConsulta = conexion.executeQueryStatement(cadenaBD);
      while (resultadoConsulta.next()) {
        Ejecucion_presupuesto ejecucion = new Ejecucion_presupuesto(resultadoConsulta.getInt(1),
                resultadoConsulta.getDouble(2), resultadoConsulta.getDate(3), resultadoConsulta.getString(4),
                resultadoConsulta.getInt(5));
        ejecuciones.add(ejecucion);
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    conexion.closeConecction();
    return ejecuciones;
  }

  @Override
  public Rubro_presupuestal ConsultaRubroPorId_Rubro(int id_rubro) throws RemoteException {
    Rubro_presupuestal rubro = null;
    ResultSet resultadoConsulta = null;
    String cadenaBD = "SELECT * FROM rubro_presupuestal WHERE id_rubro= " + id_rubro;
    try {
      conexion.conectar();
      resultadoConsulta = conexion.executeQueryStatement(cadenaBD);
      while (resultadoConsulta.next()) {
        rubro = new Rubro_presupuestal(resultadoConsulta.getInt(1), resultadoConsulta.getString(2),
                resultadoConsulta.getInt(3), resultadoConsulta.getDouble(4), resultadoConsulta.getInt(5));
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    conexion.closeConecction();
    return rubro;
  }

  @Override
  public boolean AdicionEjecucion_Presupuesto(Ejecucion_presupuesto ejecucion) throws RemoteException {
    boolean controlAdicion = false;
    String cadenaBD = "INSERT INTO ejecucion_presupuesto VALUES(" + ejecucion.getId_ejecucion() + ", " + ejecucion.getMonto_ejecutado() + ", "
            + "'" + formatoFecha.format(ejecucion.getFecha_ejecucion()) + "', '" + ejecucion.getDescripcion_ejecucion() + "', "
            + "" + ejecucion.getId_rubro() + ")";
    try {
      conexion.conectar();
      controlAdicion = conexion.executeUpdateStatement(cadenaBD);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    CambioVista();
    conexion.closeConecction();
    return controlAdicion;
  }

  @Override
  public boolean ActualizarRubro(Rubro_presupuestal rubro) throws RemoteException {
    boolean controlActualizacion = false;
    String cadenaBD = "UPDATE  `rubro_presupuestal` set `descripcion_rubro` = '" + rubro.getDescripcion_rubro() + "', "
            + "`cantidad`= " + rubro.getCantidad() + ", `valor_unitario` = " + rubro.getValor_unitario() + " where id_rubro = " + rubro.getId_rubro();
    try {
      conexion.conectar();
      controlActualizacion = conexion.executeUpdateStatement(cadenaBD);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    conexion.closeConecction();
    CambioVista();
    return controlActualizacion;
  }

  @Override
  public boolean ActualizarAporte_rubro_entidad(Aporte_rubro_entidad aporte) throws RemoteException {
    boolean controlActualizacion = false;
    String cadenaBD = "UPDATE aporte_rubro_entidad SET monto_aporte_rubro = " + aporte.getMonto_aporte_rubro() + " "
            + "WHERE id_rubro = " + aporte.getId_rubro() + " AND NIT_entidad = '" + aporte.getNIT_entidad() + "'";
    try {
      conexion.conectar();
      controlActualizacion = conexion.executeUpdateStatement(cadenaBD);
    } catch (Exception e) {
    }
    CambioVista();
    conexion.closeConecction();
    return controlActualizacion;
  }

  @Override
  public boolean EliminarRubro_presupuestal(Rubro_presupuestal rubro) throws RemoteException {
    boolean controlEliminacion = false;
    String cadenaBD = "DELETE FROM rubro_presupuestal WHERE id_rubro = " + rubro.getId_rubro();
    try {
      conexion.conectar();
      controlEliminacion = conexion.executeUpdateStatement(cadenaBD);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    conexion.closeConecction();
    CambioVista();
    return controlEliminacion;
  }

  @Override
  public boolean EliminarAporte_rubro_entidad_PorRubro(Rubro_presupuestal rubro) throws RemoteException {
    boolean controlEliminacion = false;
    String cadenaBD = "DELETE FROM aporte_rubro_entidad WHERE id_rubro = " + rubro.getId_rubro();
    try {
      conexion.conectar();
      controlEliminacion = conexion.executeUpdateStatement(cadenaBD);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    conexion.closeConecction();
    CambioVista();
    return controlEliminacion;
  }

  @Override
  public boolean EliminarEjecucion_presupuesto_PorRubro(Rubro_presupuestal rubro) throws RemoteException {
    boolean controlEliminacion = false;
    String cadenaBD = "DELETE FROM ejecucion_presupuesto WHERE id_rubro = " + rubro.getId_rubro();
    try {
      conexion.conectar();
      controlEliminacion = conexion.executeUpdateStatement(cadenaBD);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    conexion.closeConecction();
    CambioVista();
    return controlEliminacion;
  }

  @Override
  public boolean ActualizarEntidad_convenio(Entidad_convenio entidad) throws RemoteException {
    boolean controlActualizacion = false;
    String cadenaBD = "UPDATE entidad_convenio SET nombre_entidad='" + entidad.getNombre_entidad() + "', "
            + "descripcion_entidad='" + entidad.getDescripcion_entidad() + "' WHERE id_entidad = " + entidad.getId_entidad();
    try {
      conexion.conectar();
      controlActualizacion = conexion.executeUpdateStatement(cadenaBD);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    conexion.closeConecction();
    CambioVista();
    return controlActualizacion;
  }

  @Override
  public boolean AdicionarVariaciones_tiempo(Variaciones_tiempo variacion) throws RemoteException {
    boolean controlAdicion = false;
    String cadenaBD = "INSERT INTO variaciones_tiempo VALUES(" + variacion.getId_variacion() + ", "
            + "'" + formatoFecha.format(variacion.getFecha_variacion()) + "', '" + variacion.getDescripcion_variacion() + "', "
            + "" + variacion.getDuracion_variacion_dias() + ", " + variacion.getNumero_convenio() + ")";
    String cadenaBD_convenio = "";
    if (variacion.getDescripcion_variacion().equals("Suspension")) {
      cadenaBD_convenio = "UPDATE convenio SET estado_convenio = 'SUSPENDIDO' WHERE numero_convenio = " + variacion.getNumero_convenio();
    }else if (variacion.getDescripcion_variacion().equals("Reinicio")) {
      cadenaBD_convenio = "UPDATE convenio SET estado_convenio = 'EJECUCION' WHERE numero_convenio = " + variacion.getNumero_convenio();
    }
    try {
      conexion.conectar();
      controlAdicion = conexion.executeUpdateStatement(cadenaBD);
      if (!cadenaBD_convenio.equals("")) {
        conexion.executeUpdateStatement(cadenaBD_convenio);
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    conexion.closeConecction();
    CambioVista();
    return controlAdicion;
  }

  @Override
  public ArrayList<Variaciones_tiempo> ConsultaVariaciones_tiempoPorConvenio(Convenio convenio) throws RemoteException {
    ArrayList<Variaciones_tiempo> variaciones = new ArrayList<Variaciones_tiempo>();
    ResultSet resultadoConsulta = null;
    String cadenaBD = "SELECT * FROM variaciones_tiempo WHERE numero_convenio = " + convenio.getNumero_convenio();
    try {
      conexion.conectar();
      resultadoConsulta = conexion.executeQueryStatement(cadenaBD);
      while (resultadoConsulta.next()) {
        Variaciones_tiempo variacion = new Variaciones_tiempo(resultadoConsulta.getInt(1), resultadoConsulta.getDate(2), resultadoConsulta.getString(3), resultadoConsulta.getInt(4), resultadoConsulta.getInt(5));
        variaciones.add(variacion);
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    conexion.closeConecction();
    return variaciones;
  }

  @Override
  public boolean ActualizarConvenio(Convenio convenio) throws RemoteException {
    boolean controlActualizacion = false;
    String cadenaBD = "UPDATE convenio SET saldos_sociales='" + convenio.getSaldos_sociales() + "', "
            + "saldos_pedagogicos = '" + convenio.getSaldos_pedagogicos() + "', resumen_convenio='" + convenio.getResumen_convenio() + "', "
            + "estado_convenio='" + convenio.getEstado_convenio() + "' WHERE numero_convenio = " + convenio.getNumero_convenio() + "";
    try {
      conexion.conectar();
      controlActualizacion = conexion.executeUpdateStatement(cadenaBD);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    CambioVista();
    conexion.closeConecction();
    return controlActualizacion;
  }
}
