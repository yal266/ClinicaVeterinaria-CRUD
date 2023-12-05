/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Clases.MascotaClass;
import Clases.PropietarioClass;
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

public class MascotaDao {
    private Connection conector;
    private String sql;
    private PreparedStatement ps;
    private ResultSet rs;

    public MascotaDao(Connection conector) {
        this.conector = conector;
    }

    public void guardarMascota(MascotaClass mascota){
        
        ps = null;
        sql = "Insert into Mascota (idMascota, Nombre, Raza, Fecha_Nac, "
                + "Genero, Tipo_Animal, Propietario_idPropietario, Historial_idhistorial) values (?,?,?,?,?,?,?,?)";
        
        try {
            ps = conector.prepareStatement(sql);
            
            ps.setInt(1 , mascota.getIdMascota());
            ps.setString(2 , mascota.getNombre());
            ps.setString(3 , mascota.getRaza());
            ps.setDate(4 , mascota.getFecha_Nac());
            ps.setString(5 , mascota.getGenero());
            ps.setString(6 , mascota.getTipo_Animal());            
            ps.setString(7 , mascota.getPropietario_idpropietario()); 
            ps.setString(8 , mascota.getHistorial_idhistorial());
    
            ejecutarActualizacion();

        } 
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }

    public void modificarDatos(MascotaClass mascota){
        
        ps = null;
        //modificado: --pero consulta y falta agregar tabla MascotaMod
        sql = "Update Mascota set Nombre = ?, Raza = ?, "
                + "Fecha_Nac = ?, Genero = ?, TipoAnimal = ?, Propietario_idpropietario = ?, Historial_idhistorial = ? "
                + "where idMascota = ?";
        
        try {
            ps = conector.prepareStatement(sql);
            
            ps.setString(1 , mascota.getNombre());
            ps.setString(2 , mascota.getRaza());
            ps.setDate(3 , mascota.getFecha_Nac());
            ps.setString(4 , mascota.getGenero());
            ps.setString(5 , mascota.getTipo_Animal());            
            ps.setString(6 , mascota.getPropietario_idpropietario()); 
            ps.setString(7 , mascota.getHistorial_idhistorial());
            ps.setInt(8 , mascota.getIdMascota());
            
            ejecutarActualizacion();  
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    
    }
    
    public void darBajaMascota(int id){
        
        ps = null;
        sql = "Delete From Mascota where idMascota = ?";
        
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

        List<MascotaClass> dato = new ArrayList<>();

        //Crear y analizar el usuarioMod de la base de datos para crear la tabla MascotaMod
        sql = "Select idMascota, Nombre, Raza, Fecha_Nac, "
                + "Genero, Tipo_Animal, Propietario_idPropietario, Historial_idhistorial from Mascota Where idMascota = ?";
        
        
        try {
            ps = conector.prepareStatement(sql);
            ps.setInt(1 , id);
            rs = ps.executeQuery();
            
            while (rs.next()){
                MascotaClass m = new MascotaClass();
                m.setIdMascota(rs.getInt(1));
                m.setNombre(rs.getString(2));
                m.setRaza(rs.getString(3));
                m.setFecha_Nac(rs.getDate(4));
                m.setGenero(rs.getString(5));                
                m.setTipo_Animal(rs.getString(6));                
                m.setPropietario_idpropietario(rs.getString(7));
                m.setHistorial_idhistorial(rs.getString(8));
    
                dato.add(m);
            }        
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return dato;
    }
    public List listaMascota(){
        List<MascotaClass> datos = new ArrayList<>();

        //ver en la tabla sql
        sql = "Select idMascota, Nombre, Raza, Fecha_Nac, Genero, Tipo_Animal,"
                + " Propietario_idPropietario, Historial_idhistorial from Mascota order by idMascota";
        
        try {
            ps = conector.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()){
                MascotaClass m = new MascotaClass();
                //Modificar 
                m.setIdMascota(rs.getInt(1));
                m.setNombre(rs.getString(2));
                m.setRaza(rs.getString(3));
                m.setFecha_Nac(rs.getDate(4));
                m.setGenero(rs.getString(5));                
                m.setTipo_Animal(rs.getString(6));                
                m.setPropietario_idpropietario(rs.getString(7));
                m.setHistorial_idhistorial(rs.getString(8));
                
                datos.add(m);
            }        
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return datos;
    }
}
