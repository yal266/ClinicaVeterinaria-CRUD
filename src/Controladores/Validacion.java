package Controladores;

import Clases.User;
import javax.swing.JOptionPane;

public class Validacion {

    public boolean checkpass(String passw) {
        boolean valido = false;
        if (passw.length() < 3) {
            this.showError("Contraseña debe tener 3 caracteres mínimo");
            valido = false;
        } else {
            valido = true;
        }
        return valido;
    }

    public boolean checkUser(User userlog) {
        boolean logeado = false;
        UserCrud userdaologin = new UserCrud();
        User userbd = userdaologin.read(userlog.getNombre_usu());
        if (userbd == null) {
            JOptionPane.showMessageDialog(null, "El usuario es incorrecto", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!userbd.getClave_usu().equals(userlog.getClave_usu())) {
            JOptionPane.showMessageDialog(null, "El clave es incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            logeado = true;
        }
        return logeado;
    }

    public void showError(String s) {
        JOptionPane.showMessageDialog(null, s);
    }
}
