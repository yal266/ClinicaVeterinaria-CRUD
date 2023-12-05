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
public class HistorialClass {
    private int idHistorial;
    private Date Fecha_Apertura;
    private MascotaClass mascota;
    private DiagnosticoClass diagnostico;
    private PersonalClass Personal;

    public int getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(int idHistorial) {
        this.idHistorial = idHistorial;
    }

    public Date getFecha_Apertura() {
        return Fecha_Apertura;
    }

    public void setFecha_Apertura(Date Fecha_Apertura) {
        this.Fecha_Apertura = Fecha_Apertura;
    }

    public MascotaClass getMascota() {
        return mascota;
    }

    public void setMascota(MascotaClass mascota) {
        this.mascota = mascota;
    }

    public DiagnosticoClass getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(DiagnosticoClass diagnostico) {
        this.diagnostico = diagnostico;
    }

    public PersonalClass getPersonal() {
        return Personal;
    }

    public void setPersonal(PersonalClass Personal) {
        this.Personal = Personal;
    }
}
