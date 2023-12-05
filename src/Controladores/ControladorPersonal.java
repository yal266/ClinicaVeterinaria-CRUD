/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Clases.PersonalClass;
import Modelo.PersonalDAO;
import Vistas.Personal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mi Equipo
 */
public class ControladorPersonal implements ActionListener, ListSelectionListener {

    private PersonalClass personal;
    private PersonalDAO dao;
    private Connection conector;

    private Personal vista;

    java.util.Date date = new java.util.Date();
    SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");

    public ControladorPersonal(Personal vista, Connection conector) {
        this.conector = conector;
        dao = new PersonalDAO(conector);
        this.vista = vista;

        int columnasMostradas = 9;
        int[] anchoColumnas = {10, 20};
        for (int indice = 0; indice < columnasMostradas; indice++) {
            vista.TablaPersonal.getColumnModel().getColumn(indice).setPreferredWidth(anchoColumnas[indice]);
        }

        this.vista.btnlistar.addActionListener(this);
        this.vista.btnagregar.addActionListener(this);
        this.vista.btnmodificar.addActionListener(this);
        this.vista.btndarBaja.addActionListener(this);
        this.vista.btnlimpiar.addActionListener(this);
        this.vista.TablaPersonal.getSelectionModel().addListSelectionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        if (arg0.getSource() == vista.btnlistar) {
            llenarTabla(vista.TablaPersonal);
        } else if (arg0.getSource() == vista.btnagregar) {
            personal = new PersonalClass();
            cargarDatos();
            dao.guardarPersonal(personal);
            limpiar();
            llenarTabla(vista.TablaPersonal);
        } else if (arg0.getSource() == vista.btnmodificar) {
            personal = new PersonalClass();
            cargarDatos();
            dao.modificarDatos(personal);
            llenarTabla(vista.TablaPersonal);
            limpiar();
        } else if (arg0.getSource() == vista.btndarBaja) {
            int id = Integer.parseInt(vista.txtID_Medico.getText());
            dao.darBajaPersonal(id);
            llenarTabla(vista.TablaPersonal);
        } else if (arg0.getSource() == vista.btnlimpiar) {
            limpiar();
        }
    }

    public void cargarDatos() {
        personal.setIdPersonal(Integer.parseInt(vista.txtID_Medico.getText()));
        personal.setNombre(vista.txtNombre.getText());
        personal.setApellido(vista.txtApellidos.getText());
        personal.setSexo(vista.jRadioButtonFemenino.getText());
        personal.setSexo(vista.jRadioButtonMasculino.getText());
        personal.setDNI(vista.txtDNIMedico.getText());
        personal.setCMP(Integer.parseInt(vista.txtCMP.getText()));
        personal.setTelefonoPersonal(vista.txtTelefono.getText());
        personal.setCorreo(vista.txtCorreo.getText());
        personal.setFecha_Contratacion((Date) vista.txtFechaContratacion.getDate());
    }

    public void limpiar() {
        vista.txtID_Medico.setText("");
        vista.txtNombre.setText("");
        vista.txtApellidos.setText("");
        vista.jRadioButtonFemenino.setText(null); 
        vista.jRadioButtonMasculino.setText(null);
        vista.txtDNIMedico.setText("");
        vista.txtCMP.setText("");
        vista.txtTelefono.setText("");
        vista.txtCorreo.setText("");
        vista.txtFechaContratacion.setDate(null);
        vista.txtID_Medico.requestFocus();
    }

    public void llenarTabla(JTable tablaDatos) {

        DefaultTableModel modeloTabla = new DefaultTableModel();
        modeloTabla = (DefaultTableModel) tablaDatos.getModel();

        List<PersonalClass> lista = dao.listaPersonal();
        Object[] fila = new Object[2];
        for (int indice = 0; indice < lista.size(); indice++) {
            fila[0] = lista.get(indice).getIdPersonal();
            fila[1] = lista.get(indice).getNombre();
            fila[2] = lista.get(indice).getApellido();
            fila[3] = lista.get(indice).getSexo();
            fila[4] = lista.get(indice).getDNI();
            fila[5] = lista.get(indice).getCMP();
            fila[6] = lista.get(indice).getTelefonoPersonal();
            fila[7] = lista.get(indice).getCorreo();
            fila[8] = lista.get(indice).getFecha_Contratacion();
            
            modeloTabla.addRow(fila);
        }
        vista.TablaPersonal.setModel(modeloTabla);
    }

    @Override
    public void valueChanged(ListSelectionEvent arg0) {
        int fila = vista.TablaPersonal.getSelectedRow();
        int id = Integer.parseInt(vista.TablaPersonal.getValueAt(fila, 0).toString());
        List<PersonalClass> dato = dao.seleccionarDatos(id);
        vista.txtID_Medico.setText("" + dato.get(0).getIdPersonal());
        vista.txtNombre.setText(dato.get(0).getNombre());
        vista.txtApellidos.setText(dato.get(0).getApellido());
        vista.jRadioButtonFemenino.setText(dato.get(0).getSexo());
        vista.jRadioButtonMasculino.setText(dato.get(0).getSexo());
        vista.txtDNIMedico.setText(dato.get(0).getDNI());
        vista.txtCMP.setText(""+ dato.get(0).getCMP());
        vista.txtTelefono.setText(dato.get(0).getCorreo());
        vista.txtFechaContratacion.setDate(dato.get(0).getFecha_Contratacion());
    }
}
