/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Clases.PersonalClass;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Mi Equipo
 */
public class PersonalDAO {
    private Connection conector;
    private String sql;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public PersonalDAO(Connection conector) {
        this.conector = conector;
    }
    
    public void guardarPersonal(PersonalClass Personal){
        
        ps = null;
        sql = "Insert into Personal (idPersonal, Nombre, Apellido, Fecha_Nac, "
                + "Genero, Tipo_Animal, Personal_idPersonal) values (?,?,?,?,?,?,?)";
        
        try {
            ps = conector.prepareStatement(sql);
            
            ps.setInt(1 , Personal.getIdPersonal());
            ps.setString(2 , Personal.getNombre());
            ps.setString(3 , Personal.getApellido());
            ps.setString(4 , Personal.getDNI());
            ps.setString(5 , Personal.getSexo());
            ps.setString(6 , Personal.getDirec());
            ps.setInt(7 , Personal.getCMP());  
            ps.setString(8 , Personal.getTelefonoPersonal()); 
            ps.setDate(9 , Personal.getFecha_Contratacion()); 
    
            ejecutarActualizacion();

        } 
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }

    public void modificarDatos(PersonalClass Personal){
        
        ps = null;
        //modificar:
        sql = "Update Personals set nombre_usu = ?, login_usu = ?, clave_usu = ?, "
                + "clave_usu02 = ?, codsegu = ?, activo_usu = ? where key_usu = ?";
        
        try {
            ps = conector.prepareStatement(sql);
            
            ps.setString(1 , Personal.getNombre());
            ps.setString(2 , Personal.getApellido());
            ps.setString(3 , Personal.getDNI());
            ps.setString(4 , Personal.getSexo());
            ps.setString(5 , Personal.getDirec());
            ps.setInt(6 , Personal.getCMP());  
            ps.setString(7 , Personal.getTelefonoPersonal()); 
            ps.setDate(8 , Personal.getFecha_Contratacion()); 
            ps.setInt(9 , Personal.getIdPersonal());
            
            ejecutarActualizacion();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    
    }
    
    public void darBajaPersonal(int id){
        
        ps = null;
        sql = "Delete From Personal where idPersonal = ?";
        
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

        List<PersonalClass> dato = new ArrayList<>();

        //Crear y analizar el PersonalMod de la base de datos para crear la tabla PersonalMod
        sql = "Select idPersonal, Nombre, Raza, Fecha_Nac, "
                + "Genero, Tipo_Animal, Personal_idPersonal from Personal Where idPersonal = ?";
        
        try {
            ps = conector.prepareStatement(sql);
            ps.setInt(1 , id);
            rs = ps.executeQuery();
            
            while (rs.next()){
                PersonalClass m = new PersonalClass();
                m.setIdPersonal(rs.getInt(1));
                m.setNombre(rs.getString(2));
                m.setApellido(rs.getString(3));
                m.setDNI(rs.getString(4));
                m.setSexo(rs.getString(5));
                m.setDirec(rs.getString(6));                
                m.setCMP(rs.getInt(7));   
                m.setFecha_Contratacion(rs.getDate(8)); 
                m.setTelefonoPersonal(rs.getString(9)); 
    
                dato.add(m);
            }        
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return dato;
    }
    public List listaPersonal(){
        List<PersonalClass> datos = new ArrayList<>();

        //modificar y ver el sistema de info en  netbeans
        sql = "Select key_usu, nombre_usu from Personal order by key_usu";
        
        try {
            ps = conector.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()){
                PersonalClass m = new PersonalClass();
                //Modificado 
                m.setIdPersonal(rs.getInt(1));
                m.setNombre(rs.getString(2));
                m.setApellido(rs.getString(3));
                m.setDNI(rs.getString(4));
                m.setDirec(rs.getString(5));                
                m.setCMP(rs.getInt(6));   
                m.setFecha_Contratacion(rs.getDate(7)); 
                m.setTelefonoPersonal(rs.getString(8));
                
                datos.add(m);
            }        
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return datos;
    }

}
