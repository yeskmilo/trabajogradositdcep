/*
 * Sistema de Información para la toma de Decisiones
 * Centro de Educación Permanente
 * Autor: 
 * Yesid Camilo Ortiz Castillo 
 */
package servidorsitd_cep;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import Modelo.*;

/**
 *
 * @author kmilo
 */
public class ServidorSITD_CEP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RemoteException {
        // TODO code application logic here
        try {
            LocateRegistry.createRegistry(1099);
            IServicioGeneralSITD servicioGeneralSITD = new ServicioGeneralSITD();
            Naming.rebind("//127.0.0.1/ServicioGeneralSITD", servicioGeneralSITD);            
            System.out.println("Servidor Arriba\n");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
