package Clases;

public class User {

    private int key_usu;
    private String nombre_usu;
    private String login_usu;
    private String clave_usu;

    public User() {
    }

    public User(int key_usu, String nombre_usu, String login_usu, String clave_usu) {
        this.key_usu = key_usu;
        this.nombre_usu = nombre_usu;
        this.login_usu = login_usu;
        this.clave_usu = clave_usu;
    }
    
    public int getKey_usu() {
        return key_usu;
    }

    public void setKey_usu(int key_usu) {
        this.key_usu = key_usu;
    }

    public String getNombre_usu() {
        return nombre_usu;
    }

    public void setNombre_usu(String nombre_usu) {
        this.nombre_usu = nombre_usu;
    }

    public String getLogin_usu() {
        return login_usu;
    }

    public void setLogin_usu(String login_usu) {
        this.login_usu = login_usu;
    }

    public String getClave_usu() {
        return clave_usu;
    }

    public void setClave_usu(String clave_usu) {
        this.clave_usu = clave_usu;
    }
}
