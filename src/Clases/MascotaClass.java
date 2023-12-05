/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.Date;

/**
 *
 * @author Mi Equipo
 */
public class MascotaClass {
    private int idMascota;
    private String Nombre;
    private String Raza;
    private Date Fecha_Nac;
    private String Genero;
    private String Tipo_Animal;
    private String Propietario_idpropietario;
    private String Historial_idhistorial;

    public MascotaClass() {
        
    }

    public MascotaClass(int idMascota, String Nombre, String Raza, Date Fecha_Nac, String Genero, String Tipo_Animal, String Propietario_idpropietario, String Historial_idhistorial) {
        this.idMascota = idMascota;
        this.Nombre = Nombre;
        this.Raza = Raza;
        this.Fecha_Nac = Fecha_Nac;
        this.Genero = Genero;
        this.Tipo_Animal = Tipo_Animal;
        this.Propietario_idpropietario = Propietario_idpropietario;
        this.Historial_idhistorial = Historial_idhistorial;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public Date getFecha_Nac() {
        return Fecha_Nac;
    }

    public void setFecha_Nac(Date Fecha_Nac) {
        this.Fecha_Nac = Fecha_Nac;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getTipo_Animal() {
        return Tipo_Animal;
    }

    public void setTipo_Animal(String Tipo_Animal) {
        this.Tipo_Animal = Tipo_Animal;
    }

    public String getPropietario_idpropietario() {
        return Propietario_idpropietario;
    }

    public void setPropietario_idpropietario(String Propietario_idpropietario) {
        this.Propietario_idpropietario = Propietario_idpropietario;
    }

    public String getHistorial_idhistorial() {
        return Historial_idhistorial;
    }

    public void setHistorial_idhistorial(String Historial_idhistorial) {
        this.Historial_idhistorial = Historial_idhistorial;
    }
}
