/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author DisenoWeb
 */
public class Conexion {

    Connection conn;
    String urlbase;
    String url;
    String urlHora = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    String ipPrueba = "localhost";
    String ip = "192.168.0.20:80";
    String user = "root";
    String password = "Gesinformatica2019*";
    String password2 = "";
//    String user = "tiendage_teru";
//    String password = "Ges1809*";

    public Connection conectar_db_empresas() {
        conn = null;
        url = "jdbc:mysql://" + ipPrueba + "/empresas_db" + urlHora; //PRUEBAS EN LOCAL

//        url = "jdbc:mysql://gesinformatica.es:3306/tiendage_programa"; //SERVIDOR
        try {
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password2);
            if (conn != null) {
                //System.out.println("CONECTADO");
                //JOptionPane.showMessageDialog(null, "CONECTADO");//SI NECESITAMOS SABER SI SE HA CONECTADO
            }
        } catch (ClassNotFoundException | SQLException e) {
            try {
                conn = DriverManager.getConnection(url, user, password);

            } catch (SQLException ex) {
                System.out.println("Error al conectar: " + e);
                JOptionPane.showMessageDialog(null, "No se pudo conectar con la Base de Datos");
                JOptionPane.showMessageDialog(null, "Error al conectar: " + e);
            }
        }
        return conn;
    }

    public Connection conectar_empresa_concreta(String url2) {
        conn = null;
        urlbase = "jdbc:mysql://" + ipPrueba + "/";
//           urlbase = "jdbc:mysql://gesinformatica.es:3306/tiendage_programa"; //TEMPORAL
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(urlbase + url2 + urlHora, user, password2);
//    conn = DriverManager.getConnection(urlbase, user, password);//TEMPORAL
            if (conn != null) {
                //System.out.println("CONECTADO");
            }
        } catch (ClassNotFoundException | SQLException e) {
            try {
                conn = DriverManager.getConnection(urlbase + url2 + urlHora, user, password);

            } catch (SQLException ex) {
                System.out.println("Error al conectar: " + e);
            }
        }
        return conn;
    }

    public void desconectar(Connection conn) throws SQLException {
        conn.close();
    }
}
