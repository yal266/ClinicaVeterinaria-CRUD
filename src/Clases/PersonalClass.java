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
public class PersonalClass extends Persona{
    private int idPersonal;
    private int CMP;
    private Date Fecha_Contratacion;
    private String Correo;
    private String TelefonoPersonal;
    
    public PersonalClass(){
        
    }

    public PersonalClass(int idPersonal, int CMP, Date Fecha_Contratacion, String Correo, String TelefonoPersonal) {
        this.idPersonal = idPersonal;
        this.CMP = CMP;
        this.Fecha_Contratacion = Fecha_Contratacion;
        this.Correo = Correo;
        this.TelefonoPersonal = TelefonoPersonal;
    }

    public PersonalClass(int idPersonal, int CMP, Date Fecha_Contratacion, String Correo, String TelefonoPersonal, String Nombre, String Apellido, String Sexo, String DNI, String Direc) {
        super(Nombre, Apellido, Sexo, DNI, Direc);
        this.idPersonal = idPersonal;
        this.CMP = CMP;
        this.Fecha_Contratacion = Fecha_Contratacion;
        this.Correo = Correo;
        this.TelefonoPersonal = TelefonoPersonal;
    }

    public int getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(int idPersonal) {
        this.idPersonal = idPersonal;
    }

    public int getCMP() {
        return CMP;
    }

    public void setCMP(int CMP) {
        this.CMP = CMP;
    }

    public Date getFecha_Contratacion() {
        return Fecha_Contratacion;
    }

    public void setFecha_Contratacion(Date Fecha_Contratacion) {
        this.Fecha_Contratacion = Fecha_Contratacion;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getTelefonoPersonal() {
        return TelefonoPersonal;
    }

    public void setTelefonoPersonal(String TelefonoPersonal) {
        this.TelefonoPersonal = TelefonoPersonal;
    }
}
