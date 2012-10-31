/*
 * Sistema de Información para la toma de Decisiones
 * Centro de Educación Permanente
 * Autor: 
 * Yesid Camilo Ortiz Castillo 
 */
package Vista;

import Modelo.ICambioVista;
import Modelo.IServicioConvenios;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Kmilo
 */
public class AdicionConvenio extends UnicastRemoteObject implements Serializable, ICambioVista {
    
    private transient GUIAdicionConvenio guiAdicionConvenio;    
    private IServicioConvenios servicioConvenios;

    /**
     * Metodo constructor de la clase adicion convenio, que registra la interfaz y  lanza la vista dle usuario
     * @param servicioGeneral
     * @throws RemoteException 
     */
    public AdicionConvenio(IServicioConvenios servicioConvenios) throws RemoteException {        
        this.servicioConvenios = servicioConvenios;
        AgregarVista();
    }
    
    private void AgregarVista() throws RemoteException {
        servicioConvenios.AgregarVista(this);
        guiAdicionConvenio = new GUIAdicionConvenio(servicioConvenios);
        guiAdicionConvenio.show();
    }
    
    @Override
    public void CambioVista() throws RemoteException {
        guiAdicionConvenio.CambioVista();
    }
}
