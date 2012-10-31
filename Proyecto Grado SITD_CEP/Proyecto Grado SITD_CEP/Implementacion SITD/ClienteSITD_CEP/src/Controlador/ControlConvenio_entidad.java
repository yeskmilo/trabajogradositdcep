/*
 * Sistema de Información para la toma de Decisiones
 * Centro de Educación Permanente
 * Autor: 
 * Yesid Camilo Ortiz Castillo 
 */
package Controlador;

import Estructural.Convenio_entidad;
import Modelo.IServicioConvenios;
import java.rmi.RemoteException;

/**
 *
 * @author Kmilo
 */
public class ControlConvenio_entidad {

    private IServicioConvenios servicioConvenios;

    public ControlConvenio_entidad(IServicioConvenios servicioConvenios) throws RemoteException {
        this.servicioConvenios = servicioConvenios;
    }

    /**
     * Metodo para crear una relacion entre el convenio y la entidad
     * @param convenio_emtidad
     * @return
     * @throws RemoteException 
     */
    public boolean AdicionConvenio_entidad(Convenio_entidad convenio_entidad) throws RemoteException {
        return servicioConvenios.AdicionConvenioEntidad(convenio_entidad);
    }

    /**
     * Metodo para eliiminar la relacion entre un convenio y una entidad
     * @param convenio_entidad
     * @return
     * @throws RemoteException 
     */
    public boolean EliminarConvenio_entidad(Convenio_entidad convenio_entidad) throws RemoteException {
        return servicioConvenios.EliminarConvenio_entidad(convenio_entidad);
    }
}
