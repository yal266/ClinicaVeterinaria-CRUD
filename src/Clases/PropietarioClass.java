package Clases;

public class PropietarioClass extends Persona {

    private int id_propietario;
    private String Correo;
    private String TelefonoPropietario;

    public PropietarioClass(){
        
    }
    
    public PropietarioClass(int id_propietario, String Correo) {
        this.id_propietario = id_propietario;
        this.Correo = Correo;
    }

    public PropietarioClass(int id_propietario, String Correo, String TelefonoPropietario, String Nombre, String Apellido, String Sexo, String DNI, String Direc) {
        super(Nombre, Apellido, Sexo, DNI, Direc);
        this.id_propietario = id_propietario;
        this.Correo = Correo;
        this.TelefonoPropietario = TelefonoPropietario;
    }

    public int getId_propietario() {
        return id_propietario;
    }

    public void setId_propietario(int id_propietario) {
        this.id_propietario = id_propietario;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getTelefonoPropietario() {
        return TelefonoPropietario;
    }

    public void setTelefonoPropietario(String TelefonoPropietario) {
        this.TelefonoPropietario = TelefonoPropietario;
    }
}
