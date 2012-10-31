/*
 * Sistema de Información para la toma de Decisiones
 * Centro de Educación Permanente
 * Autor: 
 * Yesid Camilo Ortiz Castillo 
 */
package Estructural;

import java.io.Serializable;

/**
 *
 * @author Kmilo
 * Clase estructural Convenio_vinculado
 */
public class Convenio_vinculado implements Serializable {

    private int id_convenio_vinculado;
    private int numero_convenio;
    private int id_vinculado;

    public Convenio_vinculado(int id_convenio_vinculado, int numero_convenio, int id_vinculado) {
        this.id_convenio_vinculado = id_convenio_vinculado;
        this.numero_convenio = numero_convenio;
        this.id_vinculado = id_vinculado;
    }

    public int getId_convenio_vinculado() {
        return id_convenio_vinculado;
    }

    public int getId_vinculado() {
        return id_vinculado;
    }

    public int getNumero_convenio() {
        return numero_convenio;
    }

    public void setId_convenio_vinculado(int id_convenio_vinculado) {
        this.id_convenio_vinculado = id_convenio_vinculado;
    }

    public void setId_vinculado(int id_vinculado) {
        this.id_vinculado = id_vinculado;
    }

    public void setNumero_convenio(int numero_convenio) {
        this.numero_convenio = numero_convenio;
    }
}
