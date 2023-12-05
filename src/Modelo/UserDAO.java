/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Mi Equipo
*/

import Clases.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class UserDAO {
    private Connection conector;
    private String sql;
    private PreparedStatement ps;
    private ResultSet rs;

    public UserDAO(Connection conector) {
        this.conector = conector;
    }

    public void guardarUsuario(User usuario){
        
        ps = null;
        sql = "Insert into UsuariosMod (key_usu, nombre_usu, login_usu, clave_usu, "
                + "clave_usu02, codsegu, activo_usu) values (?,?,?,?,?,?,?)";
        
        try {
            ps = conector.prepareStatement(sql);
            
            ps.setInt(1 , usuario.getKey_usu());
            ps.setString(2 , usuario.getNombre_usu());
            ps.setString(3 , usuario.getLogin_usu());
            ps.setString(4 , usuario.getClave_usu());
            
            ejecutarActualizacion();

        } 
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
    
    public void modificarDatos(User usuario){
        
        ps = null;
        sql = "Update UsuariosMod set nombre_usu = ?, login_usu = ?, clave_usu = ?, "
                + "clave_usu02 = ?, codsegu = ?, activo_usu = ? where key_usu = ?";
        
        try {
            ps = conector.prepareStatement(sql);
            
            ps.setString(1 , usuario.getNombre_usu());
            ps.setString(2 , usuario.getLogin_usu());
            ps.setString(3 , usuario.getClave_usu());
            ps.setInt(4 , usuario.getKey_usu());    
            
            ejecutarActualizacion();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    
    }
    
    public void eliminarUsuario(int id){
        
        ps = null;
        sql = "Delete From UsuariosMod where key_usu = ?";
        
        try {
            ps = conector.prepareStatement(sql);
            ps.setInt(1 , id);
            
            ejecutarActualizacion();          
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    private void ejecutarActualizacion() throws SQLException{
        try {
            ps.executeUpdate();
            conector.commit();  
            JOptionPane.showMessageDialog(null,"Transacción exitosa","Confirmación",JOptionPane.NO_OPTION);                          
            } 
        catch (SQLException ex) {
            conector.rollback();
            JOptionPane.showMessageDialog(null,"Transacción NO exitosa","Error...",JOptionPane.NO_OPTION);              
        } finally {
            if (ps != null){
                ps.close();
            }
          }
            
    }

    public List seleccionarDatos(int id){

        List<User> dato = new ArrayList<>();
       
        sql = "Select key_usu, nombre_usu, login_usu, clave_usu, "
                + "clave_usu02, codsegu, activo_usu from UsuariosMod Where key_usu = ?";
        
        try {
            ps = conector.prepareStatement(sql);
            ps.setInt(1 , id);
            rs = ps.executeQuery();
            
            while (rs.next()){
                User u = new User();
                u.setKey_usu(rs.getInt(1));
                u.setNombre_usu(rs.getString(2));
                u.setLogin_usu(rs.getString(3));
                u.setClave_usu(rs.getString(4));
                
                dato.add(u);
            }        
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return dato;
    }
    
    public List listaUsuarios(){
        List<User> datos = new ArrayList<>();
       
        sql = "Select key_usu, nombre_usu from UsuariosMod order by key_usu";
        
        try {
            ps = conector.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()){
                User u = new User();
                u.setKey_usu(rs.getInt(1));
                u.setNombre_usu(rs.getString(2));
                
                datos.add(u);
            }        
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return datos;
    }
}

