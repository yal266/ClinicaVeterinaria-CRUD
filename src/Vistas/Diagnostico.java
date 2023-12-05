/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Mi Equipo
 */
public class Diagnostico extends javax.swing.JInternalFrame {

    DefaultTableModel model = new DefaultTableModel();
    int filas;
    public Diagnostico() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator7 = new javax.swing.JSeparator();
        jPanelPrincipal = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jTextFieldBuscador = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        txtID_Diagnostico = new javax.swing.JTextField();
        txtTratamiento = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txtReceta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txtID_Mascota = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        txtPronostico = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDiagnostico = new javax.swing.JTable();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jButtonBuscar = new javax.swing.JButton();
        btnagregarMascota = new javax.swing.JButton();
        btnmodificarMascota = new javax.swing.JButton();
        btnlimpiarMascota = new javax.swing.JButton();
        btnlistarMascota = new javax.swing.JButton();
        btndarBajaMascota = new javax.swing.JButton();

        jSeparator7.setBackground(new java.awt.Color(0, 102, 102));
        jSeparator7.setForeground(new java.awt.Color(0, 153, 153));

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);

        jPanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));
        jPanel6.setForeground(new java.awt.Color(0, 153, 153));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Diagnostico");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextFieldBuscador.setText("Buscador");
        jTextFieldBuscador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        jTextFieldBuscador.setCaretColor(new java.awt.Color(0, 51, 51));
        jTextFieldBuscador.setSelectionColor(new java.awt.Color(0, 51, 51));
        jTextFieldBuscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBuscadorActionPerformed(evt);
            }
        });
        jTextFieldBuscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldBuscadorKeyTyped(evt);
            }
        });

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        jPanel10.setForeground(new java.awt.Color(0, 102, 102));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel37.setText("ID_Diagnostico");

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel39.setText("Dias de Tratamiento");

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel40.setText("Personal");

        txtID_Diagnostico.setText("Ingrese ID del Propietario");
        txtID_Diagnostico.setBorder(null);
        txtID_Diagnostico.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtID_DiagnosticoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtID_DiagnosticoFocusLost(evt);
            }
        });
        txtID_Diagnostico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtID_DiagnosticoActionPerformed(evt);
            }
        });

        txtTratamiento.setText("Ingrese el tratamiento de la Mascota");
        txtTratamiento.setBorder(null);
        txtTratamiento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTratamientoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTratamientoFocusLost(evt);
            }
        });
        txtTratamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTratamientoActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel41.setText("Receta");

        txtReceta.setText("Ingrese el diagnostico de la Mascota");
        txtReceta.setBorder(null);
        txtReceta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRecetaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRecetaFocusLost(evt);
            }
        });
        txtReceta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRecetaActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/diagnostico.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/receta.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tratamiento.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/veterinario.png"))); // NOI18N

        jSeparator3.setBackground(new java.awt.Color(0, 102, 102));
        jSeparator3.setForeground(new java.awt.Color(0, 153, 153));

        jSeparator5.setBackground(new java.awt.Color(0, 102, 102));
        jSeparator5.setForeground(new java.awt.Color(0, 153, 153));

        jSeparator6.setBackground(new java.awt.Color(0, 102, 102));
        jSeparator6.setForeground(new java.awt.Color(0, 153, 153));

        jSeparator8.setBackground(new java.awt.Color(0, 102, 102));
        jSeparator8.setForeground(new java.awt.Color(0, 153, 153));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jSeparator10.setBackground(new java.awt.Color(0, 102, 102));
        jSeparator10.setForeground(new java.awt.Color(0, 153, 153));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("ID_Mascota");

        txtID_Mascota.setText("Ingrese ID de la Mascota");
        txtID_Mascota.setBorder(null);
        txtID_Mascota.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtID_MascotaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtID_MascotaFocusLost(evt);
            }
        });
        txtID_Mascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtID_MascotaActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/identificacion_mascota.png"))); // NOI18N

        jSeparator4.setBackground(new java.awt.Color(0, 102, 102));
        jSeparator4.setForeground(new java.awt.Color(0, 153, 153));

        txtPronostico.setText("Ingrese pronostico de la Mascota");
        txtPronostico.setBorder(null);
        txtPronostico.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPronosticoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPronosticoFocusLost(evt);
            }
        });
        txtPronostico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPronosticoActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pronostico.png"))); // NOI18N

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel38.setText("Pronostico");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator10)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtID_Mascota, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel7)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel10Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel39)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel10Layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtReceta, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel41)
                                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel38)
                                        .addGroup(jPanel10Layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtPronostico, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel40)
                                            .addGroup(jPanel10Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(1, 1, 1)))
                                .addGap(1, 1, 1)))
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator3)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel10Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtID_Diagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel37)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtID_Diagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtID_Mascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtPronostico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtReceta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txtTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        TablaDiagnostico.setForeground(new java.awt.Color(0, 0, 255));
        TablaDiagnostico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID_Diagnostico", "Pronostico", "Receta", "Dias_de_Tratamiento", "Personal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaDiagnostico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDiagnosticoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaDiagnostico);

        jSeparator9.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator9.setForeground(new java.awt.Color(0, 102, 102));
        jSeparator9.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Buscar:");

        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-buscar-cliente-18.png"))); // NOI18N

        btnagregarMascota.setBackground(new java.awt.Color(204, 204, 204));
        btnagregarMascota.setText("Agregar");
        btnagregarMascota.setAlignmentY(0.1F);
        btnagregarMascota.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        btnagregarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarMascotaActionPerformed(evt);
            }
        });

        btnmodificarMascota.setBackground(new java.awt.Color(204, 204, 204));
        btnmodificarMascota.setText("Modificar");
        btnmodificarMascota.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        btnmodificarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarMascotaActionPerformed(evt);
            }
        });

        btnlimpiarMascota.setBackground(new java.awt.Color(204, 204, 204));
        btnlimpiarMascota.setText("Limpiar");
        btnlimpiarMascota.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        btnlimpiarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarMascotaActionPerformed(evt);
            }
        });

        btnlistarMascota.setBackground(new java.awt.Color(204, 204, 204));
        btnlistarMascota.setText("Listar");
        btnlistarMascota.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        btnlistarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistarMascotaActionPerformed(evt);
            }
        });

        btndarBajaMascota.setBackground(new java.awt.Color(204, 204, 204));
        btndarBajaMascota.setText("Dar de Baja ");
        btndarBajaMascota.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        btndarBajaMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndarBajaMascotaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnagregarMascota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnmodificarMascota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnlimpiarMascota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jTextFieldBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6)
                    .addComponent(btndarBajaMascota, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnlistarMascota, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)))
                .addGap(29, 29, 29))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnagregarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnmodificarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnlimpiarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnlistarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btndarBajaMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRecetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRecetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRecetaActionPerformed

    private void txtRecetaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRecetaFocusLost
        // TODO add your handling code here:
        if (txtReceta.getText().equals("")) {
            txtReceta.setText("Ingrese Dirección del Propietario");
            txtReceta.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtRecetaFocusLost

    private void txtRecetaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRecetaFocusGained
        // TODO add your handling code here:
        if (txtReceta.getText().equals("Ingrese Dirección del Propietario")) {
            txtReceta.setText("");
            txtReceta.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txtRecetaFocusGained

    private void txtTratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTratamientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTratamientoActionPerformed

    private void txtTratamientoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTratamientoFocusLost
        // TODO add your handling code here:
        if (txtTratamiento.getText().equals("")) {
            txtTratamiento.setText("Ingrese el tratamiento de la Mascota");
            txtTratamiento.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtTratamientoFocusLost

    private void txtTratamientoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTratamientoFocusGained
        // TODO add your handling code here:
        if (txtTratamiento.getText().equals("Ingrese el tratamiento de la Mascota")) {
            txtTratamiento.setText("");
            txtTratamiento.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txtTratamientoFocusGained

    private void txtPronosticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPronosticoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPronosticoActionPerformed

    private void txtPronosticoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPronosticoFocusLost
        // TODO add your handling code here:
        if (txtPronostico.getText().equals("")) {
            txtPronostico.setText("Ingrese pronostico de la Mascota");
            txtPronostico.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtPronosticoFocusLost

    private void txtPronosticoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPronosticoFocusGained
        // TODO add your handling code here:
        if (txtPronostico.getText().equals("Ingrese pronostico de la Mascota")) {
            txtPronostico.setText("");
            txtPronostico.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txtPronosticoFocusGained

    private void txtID_DiagnosticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtID_DiagnosticoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtID_DiagnosticoActionPerformed

    private void txtID_DiagnosticoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtID_DiagnosticoFocusLost
        // TODO add your handling code here:
        if (txtID_Diagnostico.getText().equals("")) {
            txtID_Diagnostico.setText("Ingrese el diagnostico de la Mascota");
            txtID_Diagnostico.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtID_DiagnosticoFocusLost

    private void txtID_DiagnosticoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtID_DiagnosticoFocusGained
        // TODO add your handling code here:
        if (txtID_Diagnostico.getText().equals("Ingrese el diagnostico de la Mascota")) {
            txtID_Diagnostico.setText("");
            txtID_Diagnostico.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txtID_DiagnosticoFocusGained

    private void TablaDiagnosticoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDiagnosticoMouseClicked

    }//GEN-LAST:event_TablaDiagnosticoMouseClicked

    private void jTextFieldBuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuscadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuscadorActionPerformed

    TableRowSorter trs;
    private void jTextFieldBuscadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscadorKeyTyped
        // TODO add your handling code here:
        jTextFieldBuscador.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyReleased(KeyEvent e) {
                trs.setRowFilter(RowFilter.regexFilter(jTextFieldBuscador.getText(),1));
            }
            
        });
        
        trs = new TableRowSorter(model);
        TablaDiagnostico.setRowSorter(trs);
    }//GEN-LAST:event_jTextFieldBuscadorKeyTyped

    private void txtID_MascotaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtID_MascotaFocusGained
        // TODO add your handling code here:
        if (txtID_Mascota.getText().equals("Ingrese ID de la Mascota")) {
            txtID_Mascota.setText("");
            txtID_Mascota.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txtID_MascotaFocusGained

    private void txtID_MascotaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtID_MascotaFocusLost
        // TODO add your handling code here:
        if (txtID_Mascota.getText().equals("")) {
            txtID_Mascota.setText("Ingrese ID de la Mascota");
            txtID_Mascota.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtID_MascotaFocusLost

    private void txtID_MascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtID_MascotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtID_MascotaActionPerformed

    private void btnagregarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarMascotaActionPerformed

    }//GEN-LAST:event_btnagregarMascotaActionPerformed

    private void btnmodificarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarMascotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmodificarMascotaActionPerformed

    private void btnlimpiarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarMascotaActionPerformed

    }//GEN-LAST:event_btnlimpiarMascotaActionPerformed

    private void btnlistarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistarMascotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnlistarMascotaActionPerformed

    private void btndarBajaMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndarBajaMascotaActionPerformed

    }//GEN-LAST:event_btndarBajaMascotaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Diagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Diagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Diagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Diagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Diagnostico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDiagnostico;
    public javax.swing.JButton btnagregarMascota;
    public javax.swing.JButton btndarBajaMascota;
    public javax.swing.JButton btnlimpiarMascota;
    public javax.swing.JButton btnlistarMascota;
    public javax.swing.JButton btnmodificarMascota;
    public javax.swing.JButton jButtonBuscar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextFieldBuscador;
    private javax.swing.JTextField txtID_Diagnostico;
    public javax.swing.JTextField txtID_Mascota;
    private javax.swing.JTextField txtPronostico;
    private javax.swing.JTextField txtReceta;
    private javax.swing.JTextField txtTratamiento;
    // End of variables declaration//GEN-END:variables
}
