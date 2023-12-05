/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Mi Equipo
 */
public class Telefono {
    private String telefonos;
    private PropietarioClass propiet;

    public Telefono(String telefonos, PropietarioClass propiet) {
        this.telefonos = telefonos;
        this.propiet = propiet;
    }

    public String getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(String telefonos) {
        this.telefonos = telefonos;
    }

    public PropietarioClass getPropiet() {
        return propiet;
    }

    public void setPropiet(PropietarioClass propiet) {
        this.propiet = propiet;
    }
}
