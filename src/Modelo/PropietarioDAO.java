/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

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
public class PropietarioDAO {

    private Connection conector;
    private String sql;
    private PreparedStatement ps;
    private ResultSet rs;

    public PropietarioDAO(Connection conector) {
        this.conector = conector;
    }

    public void guardarPropietario(PropietarioClass propietario) {

        ps = null;
        sql = "Insert into Propietario (idPropietario, Nombres, Apellidos, Sexo, "
                + "DNI, Direccion, Correo) values (?,?,?,?,?,?,?)";

        try {
            ps = conector.prepareStatement(sql);

            ps.setInt(1, propietario.getId_propietario());
            ps.setString(2, propietario.getNombre());
            ps.setString(3, propietario.getApellido());
            ps.setString(4, propietario.getSexo());
            ps.setString(5, propietario.getDNI());
            ps.setString(6, propietario.getDirec());
            ps.setString(7, propietario.getCorreo());

            ejecutarActualizacion();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void modificarDatos(PropietarioClass propietario) {

        ps = null;
        //Crear tabla sql:
        sql = "Update Propietario set Nombres = ?, Apellidos = ? Sexo = ?, "
                + "DNI = ?, Direccion = ?, Correo = ? where idPropietario = ?";
        try {
            ps = conector.prepareStatement(sql);

            ps.setInt(1, propietario.getId_propietario());
            ps.setString(2, propietario.getNombre());
            ps.setString(3, propietario.getApellido());
            ps.setString(4, propietario.getSexo());
            ps.setString(5, propietario.getDNI());
            ps.setString(6, propietario.getDirec());
            ps.setString(7, propietario.getCorreo());

            ejecutarActualizacion();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void eliminarPropietario(int id) {

        ps = null;
        sql = "Delete From Propietario where idPropietario = ?";

        try {
            ps = conector.prepareStatement(sql);
            ps.setInt(1, id);

            ejecutarActualizacion();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void ejecutarActualizacion() throws SQLException {
        try {
            ps.executeUpdate();
            conector.commit();
            JOptionPane.showMessageDialog(null, "Transacción exitosa", "Confirmación", JOptionPane.NO_OPTION);
        } catch (SQLException ex) {
            conector.rollback();
            JOptionPane.showMessageDialog(null, "Transacción NO exitosa", "Error...", JOptionPane.NO_OPTION);
        } finally {
            if (ps != null) {
                ps.close();
            }
        }
    }

    public List seleccionarDatos(int id) {

        List<PropietarioClass> dato = new ArrayList<>();

        //Crear y analizar el propietarioMod de la base de datos para crear la tabla PropietarioMod
        sql = "Select idPropietario, Nombre, Raza, Fecha_Nac, "
                + "Genero, Tipo_Animal, Propietario_idPropietario from PropietarioMod Where idPropietario = ?";

        try {
            ps = conector.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                PropietarioClass m = new PropietarioClass();
                m.setId_propietario(rs.getInt(1));
                m.setNombre(rs.getString(2));
                m.setApellido(rs.getString(3));
                m.setDNI(rs.getString(4));
                m.setDirec(rs.getString(5));
                m.setCorreo(rs.getString(6));

                dato.add(m);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return dato;
    }

    public List listaPropietario() {
        List<PropietarioClass> datos = new ArrayList<>();

        //modificar y ver el sistema de info en  netbeans
        sql = "Select key_usu, nombre_usu from PropietariosMod order by key_usu";

        try {
            ps = conector.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                PropietarioClass m = new PropietarioClass();
                //Modificar 
                m.setId_propietario(rs.getInt(1));
                m.setNombre(rs.getString(2));
                m.setApellido(rs.getString(3));
                m.setDNI(rs.getString(4));
                m.setDirec(rs.getString(5));
                m.setCorreo(rs.getString(6));

                datos.add(m);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return datos;
    }
}
