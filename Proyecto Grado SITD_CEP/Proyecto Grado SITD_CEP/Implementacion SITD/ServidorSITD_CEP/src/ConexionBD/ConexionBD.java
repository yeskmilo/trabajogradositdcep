/*
 * Sistema de Información para la toma de Decisiones
 * Centro de Educación Permanente
 * Autor: 
 * Yesid Camilo Ortiz Castillo 
 */
package ConexionBD;

import java.sql.*;

public class ConexionBD {

    private String ipAdress;
    private String user;
    private String password;
    private String url;
    private String nombreBD;
    private Connection con;
    private Statement stmt;
    private String portNumber;

    //Recuerde crear un DSN del sistema al archivo .mdb de la base de datosd y
    //asignarlo  a el atributo nombreBD
    public ConexionBD(String ipadd, String us, String pass, String port) {
        ipAdress = ipadd;
        user = us;
        password = pass;
        nombreBD = "BDSITD_CEP";
        portNumber = port;
    }

    public ConexionBD() {
        this("127.0.0.1", "root", "123", "3306");
    }

    //Metodo pra conectarce a una base de datos Access
    public void conectar() {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            //Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("'conectMySql()' Error loading driver. " + e.getMessage());
        }

        try {
            url = "jdbc:mysql://" + ipAdress + ":" + portNumber + "/" + nombreBD;
            con = DriverManager.getConnection(url, user, password);            
            System.out.println("Succes Conection...");
        } catch (Exception e) {
            System.out.println("Error in Conection: " + e);
        }
    }

    //metodo que permite ejecutar una transaccion de insercion o actualizacion
    //o eliminacion
    public boolean executeUpdateStatement(String cad) {
        int r = 0;
        try {
            stmt = con.createStatement();
            r = stmt.executeUpdate(cad);
            System.out.println("Update done...  " + r);
            //con.commit();
            stmt.close();
            return true;
        } catch (Exception ex) {
            System.out.println("Error in update..." + ex);
            return false;
        }
    }

    //Metodo que permite ejecutar una consulta y retorna un objeto ResulSet con
    //los resultados.
    public ResultSet executeQueryStatement(String cad) {
        ResultSet res = null;
        try {
            stmt = con.createStatement();
            res = stmt.executeQuery(cad);
            System.out.println("Succes query...  ");
        } catch (Exception ex) {
            System.out.println("Error in query..." + ex);
        }

        return res;
    }

    //Objeto que cierra la conexion con la base de datos.
    public void closeConecction() {
        try {
            con.close();
        } catch (SQLException e) {
        }
    }
}
