/*
 * Sistema de Información para la toma de Decisiones
 * Centro de Educación Permanente
 * Autor: 
 * Yesid Camilo Ortiz Castillo 
 */
package clientesitd_cep;

import Modelo.IServicioGeneralSITD;
import Vista.GUILoginInicio;
import java.rmi.Naming;

/**
 *
 * @author kmilo
 */
public class ClienteSITD_CEP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            IServicioGeneralSITD ser = (IServicioGeneralSITD) Naming.lookup("//127.0.0.1/ServicioGeneralSITD");
            if (ser == null) {
                System.out.println("Error... Cliente");
                return;
            } else {
                System.out.println("Conectado al servidor");
                GUILoginInicio guiLogin = new GUILoginInicio(ser);
                guiLogin.show();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
