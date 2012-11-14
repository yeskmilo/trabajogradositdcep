/*
 * Sistema de Información para la toma de Decisiones
 * Centro de Educación Permanente
 * Autor: 
 * Yesid Camilo Ortiz Castillo 
 */
package Controlador;

import Estructural.Aportes_convenio;
import Modelo.IServicioConvenios;
import java.rmi.RemoteException;

/**
 *
 * @author Kmilo
 */
public class ControlAporte {

    private IServicioConvenios servicioConvenios;

    public ControlAporte(IServicioConvenios servicioConvenios) throws RemoteException {
        this.servicioConvenios = servicioConvenios;        
    }

    /**
     * Metodo para adicionar un aporte a un convenio hecho por una entidad
     * @param aporte
     * @return
     * @throws RemoteException 
     */
    public boolean AdicionAporte(Aportes_convenio aporte) throws RemoteException {
        return servicioConvenios.AdicionAporte(aporte);
    }
}
