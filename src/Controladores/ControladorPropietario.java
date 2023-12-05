/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;


import Clases.PropietarioClass;
import Modelo.PropietarioDAO;
import Vistas.Propietario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
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
public class ControladorPropietario implements ActionListener, ListSelectionListener {
    private PropietarioClass propietario;
    private PropietarioDAO dao;
    private Connection conector;

    private Propietario vista;

    java.util.Date date = new java.util.Date();
    SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");

    public ControladorPropietario(Propietario vista, Connection conector) {
        this.conector = conector;
        dao = new PropietarioDAO(conector);
        this.vista = vista;

        int columnasMostradas = 8;
        int[] anchoColumnas = {10, 10};
        for (int indice = 0; indice < columnasMostradas; indice++) {
            vista.TablaPropietario.getColumnModel().getColumn(indice).setPreferredWidth(anchoColumnas[indice]);
        }

        this.vista.btnlistar.addActionListener(this);
        this.vista.btnagregar.addActionListener(this);
        this.vista.btnmodificar.addActionListener(this);
        this.vista.btndarBaja.addActionListener(this);
        this.vista.btnlimpiar.addActionListener(this);
        this.vista.TablaPropietario.getSelectionModel().addListSelectionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        if (arg0.getSource() == vista.btnlistar) {
            llenarTabla(vista.TablaPropietario);
        } else if (arg0.getSource() == vista.btnagregar) {
            propietario = new PropietarioClass();
            cargarDatos();
            dao.guardarPropietario(propietario);
            limpiar();
            llenarTabla(vista.TablaPropietario);
        } else if (arg0.getSource() == vista.btnmodificar) {
            propietario = new PropietarioClass();
            cargarDatos();
            dao.modificarDatos(propietario);
            llenarTabla(vista.TablaPropietario);
            limpiar();
        } else if (arg0.getSource() == vista.btndarBaja) {
            int id = Integer.parseInt(vista.txtID_Propietario.getText());
            dao.eliminarPropietario(id);
            llenarTabla(vista.TablaPropietario);
        } else if (arg0.getSource() == vista.btnlimpiar) {
            limpiar();
        }
    }

    public void cargarDatos() {
        propietario.setId_propietario(Integer.parseInt(vista.txtID_Propietario.getText()));
        propietario.setNombre(vista.txtNombre.getText());
        propietario.setApellido(vista.txtApellido.getText());
        propietario.setSexo(vista.jRadioButtonFemenino.getText());
        propietario.setSexo(vista.jRadioButtonMasculino.getText());
        propietario.setDNI(vista.txtDNI.getText());
        propietario.setDirec(vista.txtDireccion.getText());
        propietario.setTelefonoPropietario(vista.txtTelefono.getText());
        propietario.setCorreo(vista.txtCorreo.getText());   
    }

    public void limpiar() {
        vista.txtID_Propietario.setText("");
        vista.txtNombre.setText("");
        vista.txtNombre.setText("");
        vista.jRadioButtonFemenino.setText(null); 
        vista.jRadioButtonMasculino.setText(null);
        vista.txtDNI.setText("");
        vista.txtTelefono.setText("");
        vista.txtID_Propietario.requestFocus();
    }

    public void llenarTabla(JTable tablaDatos) {

        DefaultTableModel modeloTabla = new DefaultTableModel();
        modeloTabla = (DefaultTableModel) tablaDatos.getModel();

        List<PropietarioClass> lista = dao.listaPropietario();
        Object[] fila = new Object[2];
        for (int indice = 0; indice < lista.size(); indice++) {
            fila[0] = lista.get(indice).getId_propietario();
            fila[1] = lista.get(indice).getNombre();
            fila[2] = lista.get(indice).getApellido();
            fila[3] = lista.get(indice).getSexo();
            fila[4] = lista.get(indice).getDNI();
            fila[5] = lista.get(indice).getDirec();
            fila[6] = lista.get(indice).getTelefonoPropietario();
            fila[7] = lista.get(indice).getCorreo();
            
            modeloTabla.addRow(fila);
        }
        vista.TablaPropietario.setModel(modeloTabla);
    }

    @Override
    public void valueChanged(ListSelectionEvent arg0) {
        int fila = vista.TablaPropietario.getSelectedRow();
        int id = Integer.parseInt(vista.TablaPropietario.getValueAt(fila, 0).toString());
        List<PropietarioClass> dato = dao.seleccionarDatos(id);
        vista.txtID_Propietario.setText("" + dato.get(0).getId_propietario());
        vista.txtNombre.setText(dato.get(0).getNombre());
        vista.txtApellido.setText(dato.get(0).getApellido());
        vista.jRadioButtonFemenino.setText(null + dato.get(0).getSexo());
        vista.jRadioButtonMasculino.setText(null + dato.get(0).getSexo());
        vista.txtDNI.setText(dato.get(0).getDNI());
        vista.txtDireccion.setText(dato.get(0).getDirec());
        vista.txtTelefono.setText(dato.get(0).getTelefonoPropietario());
        vista.txtTelefono.setText(dato.get(0).getCorreo());
    }
}
