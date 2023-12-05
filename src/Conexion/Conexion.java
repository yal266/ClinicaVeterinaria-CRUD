/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion extends ConexionSQL {

    private String url;
    private String nombreServidor;
    private String numeroPuerto;
    private String nombreBaseDato;
    private String nombreUsuario;
    private String clave;
    private String conexion;

    public Conexion(String url, String nombreServidor, String numeroPuerto, String nombreBaseDato, String nombreUsuario, String clave) {
        this.url = url;
        this.nombreServidor = nombreServidor;
        this.numeroPuerto = numeroPuerto;
        this.nombreBaseDato = nombreBaseDato;
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
    }
    
    public void conectar() {
        conexion = url
                + nombreServidor + ":"
                + numeroPuerto + ";"
                + "databaseName=" + nombreBaseDato;
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        }
        catch (ClassNotFoundException e)
        {
            JOptionPane.showMessageDialog(null,"Driver no encontrado: "+e.getMessage(),"Error de conexión",JOptionPane.ERROR_MESSAGE);
        }
        
        try
        {
            conector = DriverManager.getConnection(conexion,nombreUsuario,clave);
            // Por defecto esta habilitado el modo auto-commit en la conexión            
            conector.setAutoCommit(false); //Para tener el control en forma manual           
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Error de nombre de usuario y/o clave: "+e.getMessage(),"Error de conexión",JOptionPane.ERROR_MESSAGE);
        }
    }
    
}