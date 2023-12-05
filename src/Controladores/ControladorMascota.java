/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Clases.MascotaClass;
import Modelo.MascotaDao;
import Vistas.Mascota;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class ControladorMascota implements ActionListener, ListSelectionListener {

    private MascotaClass mascota;
    private MascotaDao dao;
    private Connection conector;

    private Mascota vista;
    
    java.util.Date date = new java.util.Date();
    SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");

    public ControladorMascota(Mascota vista, Connection conector) {
        this.conector = conector;
        dao = new MascotaDao(conector);
        this.vista = vista;

        int columnasMostradas = 7;
        int[] anchoColumnas = {10, 20};
        for (int indice = 0; indice < columnasMostradas; indice++) {
            vista.TablaMascota.getColumnModel().getColumn(indice).setPreferredWidth(anchoColumnas[indice]);
        }

        this.vista.btnlistarMascota.addActionListener(this);
        this.vista.btnagregarMascota.addActionListener(this);
        this.vista.btnmodificarMascota.addActionListener(this);
        this.vista.btndarBajaMascota.addActionListener(this);
        this.vista.btnlimpiarMascota.addActionListener(this);
        this.vista.TablaMascota.getSelectionModel().addListSelectionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        if (arg0.getSource() == vista.btnlistarMascota) {
            llenarTabla(vista.TablaMascota);
        } else if (arg0.getSource() == vista.btnagregarMascota) {
            mascota = new MascotaClass();
            cargarDatos();
            dao.guardarMascota(mascota);
            limpiar();
            llenarTabla(vista.TablaMascota);
        } else if (arg0.getSource() == vista.btnmodificarMascota) {
            mascota = new MascotaClass();
            cargarDatos();
            dao.modificarDatos(mascota);
            llenarTabla(vista.TablaMascota);
            limpiar();
        } else if (arg0.getSource() == vista.btndarBajaMascota) {
            int id = Integer.parseInt(vista.txtID_Mascota.getText());
            dao.darBajaMascota(id);
            llenarTabla(vista.TablaMascota);
        } else if (arg0.getSource() == vista.btnlimpiarMascota) {
            limpiar();
        } 
//        else if(arg0.getSource() == vista.jButtonBuscar){
//            buscar();btnlimpiarMascota
//        }
    }

   public void cargarDatos() {
        mascota.setIdMascota(Integer.parseInt(vista.txtID_Mascota.getText()));
        mascota.setNombre(vista.txtNomMascota.getText());
        mascota.setRaza(vista.txtRaza.getText());
        mascota.setFecha_Nac((Date) vista.txtFechaNac.getDate());
        mascota.setGenero(vista.jRadioButtonHembra.getText());
        mascota.setGenero(vista.jRadioButtonMacho.getText());
        mascota.setTipo_Animal(vista.txttipoAnimal.getText());
        mascota.setPropietario_idpropietario(vista.txtPropietario.getText());
        mascota.setHistorial_idhistorial(vista.txtHistorialMed.getText());
    }

    public void limpiar() {
        vista.txtID_Mascota.setText("");
        vista.txtNomMascota.setText("");
        vista.txtRaza.setText("");
        vista.txtFechaNac.setDate(null);
        vista.jRadioButtonHembra.setText(null); 
        vista.jRadioButtonMacho.setText(null);
        vista.txttipoAnimal.setText("");
        vista.txtPropietario.setText("");
        vista.txtHistorialMed.setText("");
        vista.txtID_Mascota.requestFocus();
    }

    public void llenarTabla(JTable tablaDatos) {

        DefaultTableModel modeloTabla = new DefaultTableModel();
        modeloTabla = (DefaultTableModel) tablaDatos.getModel();

        List<MascotaClass> lista = dao.listaMascota();
        Object[] fila = new Object[2];
        for (int indice = 0; indice < lista.size(); indice++) {
            fila[0] = lista.get(indice).getIdMascota();
            fila[1] = lista.get(indice).getNombre();
            fila[2] = lista.get(indice).getFecha_Nac();
            fila[3] = lista.get(indice).getGenero();
            fila[4] = lista.get(indice).getTipo_Animal();
            fila[5] = lista.get(indice).getPropietario_idpropietario();
            fila[6] = lista.get(indice).getHistorial_idhistorial();
            modeloTabla.addRow(fila);
        }
        vista.TablaMascota.setModel(modeloTabla);
    }

    @Override
    public void valueChanged(ListSelectionEvent arg0) {
        int fila = vista.TablaMascota.getSelectedRow();
        int id = Integer.parseInt(vista.TablaMascota.getValueAt(fila, 0).toString());
        List<MascotaClass> dato = dao.seleccionarDatos(id);
        vista.txtID_Mascota.setText("" + dato.get(0).getIdMascota());
        vista.txtNomMascota.setText(dato.get(0).getNombre());
        vista.txtRaza.setText(dato.get(0).getRaza());
        vista.txtFechaNac.setDate(dato.get(0).getFecha_Nac());
        vista.jRadioButtonHembra.setText(dato.get(0).getGenero());
        vista.jRadioButtonMacho.setText(dato.get(0).getGenero());
        vista.txttipoAnimal.setText(dato.get(0).getTipo_Animal());
        vista.txtPropietario.setText(dato.get(0).getPropietario_idpropietario());
        vista.txtHistorialMed.setText(dato.get(0).getHistorial_idhistorial());
    }

//    private void buscar() {
////        TableRowSorter trs;
////        vista.jTextBuscador.addKeyListener(new KeyAdapter() {
////            @Override
////            public void keyReleased(KeyEvent e) {
////                trs.setRowFilter(RowFilter.regexFilter(vista.jTextBuscador.getText(), 1));
////            }
////        });
////
////        trs = new TableRowSorter((TableModel) vista);
////        vista.TablaMascota.setRowSorter(trs);
//    }
}
