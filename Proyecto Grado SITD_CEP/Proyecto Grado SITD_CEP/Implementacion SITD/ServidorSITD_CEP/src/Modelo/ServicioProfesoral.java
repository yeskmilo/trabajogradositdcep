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
import Estructural.Conferencista;
import Estructural.Convenio;
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
            conexion.closeConecction();
            while (resultadoConsulta.next()) {
                programa = new Programa(resultadoConsulta.getInt(1), resultadoConsulta.getString(2), resultadoConsulta.getString(3),
                        resultadoConsulta.getDate(4), resultadoConsulta.getDouble(5), resultadoConsulta.getInt(6),
                        resultadoConsulta.getString(7), resultadoConsulta.getInt(8));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return programa;
    }
}
