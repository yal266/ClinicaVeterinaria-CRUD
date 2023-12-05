
package Clases;

public class Persona {
    private String Nombre;
    private String Apellido;
    private String Sexo;
    private String DNI;
    private String Direc;

    public Persona() {
    }

    public Persona(String Nombre, String Apellido, String Sexo, String DNI, String Direc) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Sexo = Sexo;
        this.DNI = DNI;
        this.Direc = Direc;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getDirec() {
        return Direc;
    }

    public void setDirec(String Direc) {
        this.Direc = Direc;
    } 
}

