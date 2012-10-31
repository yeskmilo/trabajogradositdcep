/*
 * Sistema de Información para la toma de Decisiones
 * Centro de Educación Permanente
 * Autor: 
 * Yesid Camilo Ortiz Castillo 
 */
package Estructural;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Kmilo
 * Clase estructural Conferencista
 */
public class Conferencista implements Serializable {

    private int id_conferencista;
    private int cedula_conferencista;
    private String nombres_conferencista;
    private String apellidos_conferencista;
    private Date fecha_nacimiento;
    private String genero_conferencista;
    private String direccion_conferencista;
    private String telefono_conferencista;
    private String celular_conferencista;
    private String correo_electronico_conferencista;
    private String numero_cuenta_conferencista;
    private String tipo_cuenta_conferencista;
    private String banco_conferencista;
    private String estado_conferencista;

    /**
     * Constructor de la clase Conferencista;
     * @param id_conferencista
     * @param cedula_conferencista
     * @param nombres_conferencista
     * @param apellidos_conferencista
     * @param fecha_nacimiento
     * @param genero_conferencista
     * @param direccion_conferencista
     * @param telefono_conferencista
     * @param celular_conferencista
     * @param correo_electronico_conferencista
     * @param numero_cuenta_conferencista
     * @param tipo_cuenta_conferencista
     * @param banco_conferencista
     * @param estado_conferencista 
     */
    public Conferencista(int id_conferencista, int cedula_conferencista, String nombres_conferencista, String apellidos_conferencista, Date fecha_nacimiento, String genero_conferencista, String direccion_conferencista, String telefono_conferencista, String celular_conferencista, String correo_electronico_conferencista, String numero_cuenta_conferencista, String tipo_cuenta_conferencista, String banco_conferencista, String estado_conferencista) {
        this.id_conferencista = id_conferencista;
        this.cedula_conferencista = cedula_conferencista;
        this.nombres_conferencista = nombres_conferencista;
        this.apellidos_conferencista = apellidos_conferencista;
        this.fecha_nacimiento = fecha_nacimiento;
        this.genero_conferencista = genero_conferencista;
        this.direccion_conferencista = direccion_conferencista;
        this.telefono_conferencista = telefono_conferencista;
        this.celular_conferencista = celular_conferencista;
        this.correo_electronico_conferencista = correo_electronico_conferencista;
        this.numero_cuenta_conferencista = numero_cuenta_conferencista;
        this.tipo_cuenta_conferencista = tipo_cuenta_conferencista;
        this.banco_conferencista = banco_conferencista;
        this.estado_conferencista = estado_conferencista;
    }

    public String getApellidos_conferencista() {
        return apellidos_conferencista;
    }

    public String getBanco_conferencista() {
        return banco_conferencista;
    }

    public int getCedula_conferencista() {
        return cedula_conferencista;
    }

    public String getCelular_conferencista() {
        return celular_conferencista;
    }

    public String getCorreo_electronico_conferencista() {
        return correo_electronico_conferencista;
    }

    public String getDireccion_conferencista() {
        return direccion_conferencista;
    }

    public String getEstado_conferencista() {
        return estado_conferencista;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public String getGenero_conferencista() {
        return genero_conferencista;
    }

    public int getId_conferencista() {
        return id_conferencista;
    }

    public String getNombres_conferencista() {
        return nombres_conferencista;
    }

    public String getNumero_cuenta_conferencista() {
        return numero_cuenta_conferencista;
    }

    public String getTelefono_conferencista() {
        return telefono_conferencista;
    }

    public String getTipo_cuenta_conferencista() {
        return tipo_cuenta_conferencista;
    }

    public void setApellidos_conferencista(String apellidos_conferencista) {
        this.apellidos_conferencista = apellidos_conferencista;
    }

    public void setBanco_conferencista(String banco_conferencista) {
        this.banco_conferencista = banco_conferencista;
    }

    public void setCedula_conferencista(int cedula_conferencista) {
        this.cedula_conferencista = cedula_conferencista;
    }

    public void setCelular_conferencista(String celular_conferencista) {
        this.celular_conferencista = celular_conferencista;
    }

    public void setCorreo_electronico_conferencista(String correo_electronico_conferencista) {
        this.correo_electronico_conferencista = correo_electronico_conferencista;
    }

    public void setDireccion_conferencista(String direccion_conferencista) {
        this.direccion_conferencista = direccion_conferencista;
    }

    public void setEstado_conferencista(String estado_conferencista) {
        this.estado_conferencista = estado_conferencista;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public void setGenero_conferencista(String genero_conferencista) {
        this.genero_conferencista = genero_conferencista;
    }

    public void setId_conferencista(int id_conferencista) {
        this.id_conferencista = id_conferencista;
    }

    public void setNombres_conferencista(String nombres_conferencista) {
        this.nombres_conferencista = nombres_conferencista;
    }

    public void setNumero_cuenta_conferencista(String numero_cuenta_conferencista) {
        this.numero_cuenta_conferencista = numero_cuenta_conferencista;
    }

    public void setTelefono_conferencista(String telefono_conferencista) {
        this.telefono_conferencista = telefono_conferencista;
    }

    public void setTipo_cuenta_conferencista(String tipo_cuenta_conferencista) {
        this.tipo_cuenta_conferencista = tipo_cuenta_conferencista;
    }
}
