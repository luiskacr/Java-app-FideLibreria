/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.awt.Color;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import logica.Cliente;
import logica.ClienteBD;

/**
 *
 * @author luis_
 */
public class FrameClientes extends javax.swing.JInternalFrame {

    //Colores del Frame
    Color fondoBg = new Color(43, 43, 43); //Gris Oscuro
    Color fondoPanel = new Color(69, 73, 74); //Gris Medio
    Color Texto = new Color(102, 102, 102); //Gris Claro

    ClienteBD CDatos = new ClienteBD();
    Cliente cliente = new Cliente();
    Notificaciones mensaje = new Notificaciones();

    DefaultTableModel modelo = new DefaultTableModel();
    Personalizar personalizar = new Personalizar();
    int id;

    /**
     * Creates new form FrameClientes
     */
    public FrameClientes() {
        initComponents();
        listar();
    }

    public void listar() {
        List<Cliente> lista = CDatos.listar();
        modelo = (DefaultTableModel) jTableCliente.getModel();
        Object[] tabla = new Object[7];
        for (int i = 0; i < lista.size(); i++) {
            tabla[0] = lista.get(i).getId();
            tabla[1] = lista.get(i).getCedCliente();
            tabla[2] = lista.get(i).getNombreCliente();
            tabla[3] = lista.get(i).getApellidoCliente();
            tabla[4] = lista.get(i).getCorreoCliente();
            tabla[5] = lista.get(i).getUsuario();
            tabla[6] = lista.get(i).getDireccionCliente();
            modelo.addRow(tabla);
        }
        jTableCliente.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTCedula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTCorreo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTUsuario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTDireccion = new javax.swing.JTextArea();
        jBLimpiar = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();
        jBActualizar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBAgregar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCliente = new javax.swing.JTable();

        jFormattedTextField1.setText("jFormattedTextField1");

        setBackground(fondoBg);
        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setClosable(true);
        setTitle("Clientes");
        setAutoscrolls(true);
        setOpaque(true);

        jPanel1.setBackground(fondoPanel);
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cedula");

        jTCedula.setBackground(Texto);
        jTCedula.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jTCedula.setForeground(new java.awt.Color(255, 255, 255));
        jTCedula.setBorder(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");

        jTNombre.setBackground(Texto);
        jTNombre.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jTNombre.setForeground(new java.awt.Color(255, 255, 255));
        jTNombre.setBorder(null);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellido");

        jTApellido.setBackground(Texto);
        jTApellido.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jTApellido.setForeground(new java.awt.Color(255, 255, 255));
        jTApellido.setBorder(null);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Correo");

        jTCorreo.setBackground(Texto);
        jTCorreo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jTCorreo.setForeground(new java.awt.Color(255, 255, 255));
        jTCorreo.setBorder(null);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Usuario:");

        jTUsuario.setBackground(Texto);
        jTUsuario.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jTUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jTUsuario.setBorder(null);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Direccion:");

        jTDireccion.setBackground(Texto);
        jTDireccion.setColumns(20);
        jTDireccion.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jTDireccion.setForeground(new java.awt.Color(255, 255, 255));
        jTDireccion.setRows(5);
        jTDireccion.setAutoscrolls(false);
        jTDireccion.setBorder(null);
        jScrollPane1.setViewportView(jTDireccion);

        jBLimpiar.setBackground(fondoPanel);
        jBLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jBLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        jBLimpiar.setText("Limpiar");
        jBLimpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBLimpiar.setFocusPainted(false);
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jBBuscar.setBackground(fondoPanel);
        jBBuscar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jBBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jBBuscar.setText("Buscar");
        jBBuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBBuscar.setFocusPainted(false);
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBActualizar.setBackground(fondoPanel);
        jBActualizar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jBActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jBActualizar.setText("Actualizar");
        jBActualizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBActualizar.setFocusPainted(false);
        jBActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarActionPerformed(evt);
            }
        });

        jBEliminar.setBackground(fondoPanel);
        jBEliminar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jBEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jBEliminar.setText("Eliminar ");
        jBEliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBEliminar.setFocusPainted(false);
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBAgregar.setBackground(fondoPanel);
        jBAgregar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jBAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jBAgregar.setText("Agregar");
        jBAgregar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBAgregar.setFocusPainted(false);
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTNombre)
                            .addComponent(jTCedula)
                            .addComponent(jTApellido)
                            .addComponent(jTCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(35, 35, 35)
                                .addComponent(jTUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jTCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))))
        );

        jScrollPane2.setBorder(null);

        jTableCliente.setAutoCreateRowSorter(true);
        jTableCliente.setBackground(Texto);
        jTableCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTableCliente.setForeground(new java.awt.Color(255, 255, 255));
        jTableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cedula", "Nombre", "Apellidos", "Correo", "Usuario", "Direccion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }

        });
        jTableCliente.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTableCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableCliente.setFillsViewportHeight(true);
        jTableCliente.setGridColor(new java.awt.Color(204, 204, 204));
        jTableCliente.setInheritsPopupMenu(true);
        jTableCliente.setRowSorter(null);
        jTableCliente.setShowGrid(true);
        jTableCliente.getTableHeader().setReorderingAllowed(false);
        jTableCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableCliente);
        if (jTableCliente.getColumnModel().getColumnCount() > 0) {
            jTableCliente.getColumnModel().getColumn(0).setResizable(false);
            jTableCliente.getColumnModel().getColumn(0).setPreferredWidth(40);
            jTableCliente.getColumnModel().getColumn(1).setResizable(false);
            jTableCliente.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTableCliente.getColumnModel().getColumn(2).setResizable(false);
            jTableCliente.getColumnModel().getColumn(2).setPreferredWidth(125);
            jTableCliente.getColumnModel().getColumn(3).setResizable(false);
            jTableCliente.getColumnModel().getColumn(3).setPreferredWidth(125);
            jTableCliente.getColumnModel().getColumn(4).setResizable(false);
            jTableCliente.getColumnModel().getColumn(4).setPreferredWidth(200);
            jTableCliente.getColumnModel().getColumn(5).setResizable(false);
            jTableCliente.getColumnModel().getColumn(5).setPreferredWidth(100);
            jTableCliente.getColumnModel().getColumn(6).setResizable(false);
            jTableCliente.getColumnModel().getColumn(6).setPreferredWidth(500);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        limpiarCapos();
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        int cedulaConsulta = mensaje.pregundaNumero("Favor indicar la cedula a Consultar", "Numero de cedula");
        if (cedulaConsulta == -1000) {

        } else {
            buscar(cedulaConsulta);
        }

    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarActionPerformed

        actualizar();
    }//GEN-LAST:event_jBActualizarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed

        eliminar();

    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jTableClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClienteMouseClicked
        int fila = jTableCliente.getSelectedRow();
        if (fila == -1) {
            mensaje.error("Debe de Selecciona una fila");
        } else {
            this.id = Integer.parseInt(jTableCliente.getValueAt(fila, 0).toString());
            String cedula = jTableCliente.getValueAt(fila, 1).toString();
            String nombre = jTableCliente.getValueAt(fila, 2).toString();
            String apellido = jTableCliente.getValueAt(fila, 3).toString();
            String correo = jTableCliente.getValueAt(fila, 4).toString();
            String usuario = jTableCliente.getValueAt(fila, 5).toString();
            String direccion = jTableCliente.getValueAt(fila, 6).toString();

            jTCedula.setText(cedula);
            jTNombre.setText(nombre);
            jTApellido.setText(apellido);
            jTCorreo.setText(correo);
            jTUsuario.setText(usuario);
            jTDireccion.setText(direccion);
        }

    }//GEN-LAST:event_jTableClienteMouseClicked

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
        agregar();
    }//GEN-LAST:event_jBAgregarActionPerformed

    public void agregar() {
        try {
            if (validaCamposVacios() == true) {
                if (validarCedula(jTCedula.getText()) && validaCorreo(jTCorreo.getText())) {
                    String cedula = jTCedula.getText();
                    String nombre = jTNombre.getText();
                    String apellido = jTApellido.getText();
                    String correo = jTCorreo.getText();
                    String usuario = jTUsuario.getText();
                    String direccion = jTDireccion.getText();

                    Object[] agregar = new Object[6];
                    agregar[0] = cedula;
                    agregar[1] = nombre;
                    agregar[2] = apellido;
                    agregar[3] = correo;
                    agregar[4] = direccion;
                    agregar[5] = usuario;

                    CDatos.incluir(agregar);

                    limpiarTabla();
                    listar();
                    limpiarCapos();
                } else {
                    mensaje.error("Los Datos de Correo o Cedula no cumplen los equisitos");

                }
            } else {
                mensaje.error("Los campos se encuentran Vacios");
            }

        } catch (Exception e) {
            mensaje.error("Error al incluir los Datos");

        }

    }

    public void buscar(int cedBuscar) {
        cliente = CDatos.buscarCliente(cedBuscar);
        System.out.println(cliente.getId());
        if (cliente.getId() <= 0) {
            mensaje.error("El cliente " + cedBuscar + " no existe, Favor Crearlo");
        } else {
            
            jTableCliente.setRowSelectionInterval(cliente.getId() - 1, cliente.getId() - 1); //Se elecciona la columana que coincide con el ID 

            int fila = jTableCliente.getSelectedRow();

            this.id = Integer.parseInt(jTableCliente.getValueAt(fila, 0).toString());
            String cedula = jTableCliente.getValueAt(fila, 1).toString();
            String nombre = jTableCliente.getValueAt(fila, 2).toString();
            String apellido = jTableCliente.getValueAt(fila, 3).toString();
            String correo = jTableCliente.getValueAt(fila, 4).toString();
            String usuario = jTableCliente.getValueAt(fila, 5).toString();
            String direccion = jTableCliente.getValueAt(fila, 6).toString();

            jTCedula.setText(cedula);
            jTNombre.setText(nombre);
            jTApellido.setText(apellido);
            jTCorreo.setText(correo);
            jTUsuario.setText(usuario);
            jTDireccion.setText(direccion);

        }
    }

    public void actualizar() {
        int fila = jTableCliente.getSelectedRow();
        if (fila == -1) {
            mensaje.error("No ha Seleccionado una Fila");
        } else if (validarCedula(jTCedula.getText()) && validaCorreo(jTCorreo.getText())) {
            String cedula = jTCedula.getText();
            String nombre = jTNombre.getText();
            String apellido = jTApellido.getText();
            String correo = jTCorreo.getText();
            String usuario = jTUsuario.getText();
            String direccion = jTDireccion.getText();

            Object[] objActualizar = new Object[7];
            objActualizar[0] = cedula;
            objActualizar[1] = nombre;
            objActualizar[2] = apellido;
            objActualizar[3] = correo;
            objActualizar[4] = usuario;
            objActualizar[5] = direccion;
            objActualizar[6] = id;

            CDatos.actualizar(objActualizar);
            limpiarTabla();
            listar();
            limpiarCapos();

        } else {
            mensaje.error("Los Datos de Correo o Cedula no cumplen los equisitos para Actualizarse");
        }

    }

    public void eliminar() {
        int fila = jTableCliente.getSelectedRow();
        String nombre = jTNombre.getText();
        if (fila == -1) {
            mensaje.error("No ha Seleccionado una Fila");
        } else {
            boolean consulta = mensaje.confirmar("Desea continuar con la eliminacion de " + nombre, "Seleccione una Opcion");
            if (consulta) {
                CDatos.eliminar(id);
                limpiarTabla();
                listar();
                limpiarCapos();
            } else {
                limpiarTabla();
                listar();
                limpiarCapos();
            }
        }
    }

    public boolean validarCedula(String ced) {
        boolean validar = false;
        try {
            int tamaño = ced.length();

            if (tamaño >= 7) {
                Integer.parseInt(ced);
                return validar = true;
            }
        } catch (Exception e) {
            return validar;
        }
        return validar;
    }

    public boolean validaCorreo(String correo) {
        boolean validar = false;
        if (correo.contains("@") && (correo.endsWith(".com")) || (correo.endsWith(".es"))) {
            validar = true;
        }
        return validar;
    }

    public boolean validaCamposVacios() {

        if (jTCedula.getText().length() == 0 && (cliente.getId() <= 0)) {
            return false;
        } else if (jTNombre.getText().length() == 0) {
            return false;
        } else if (jTApellido.getText().length() == 0) {
            return false;
        } else if (jTCorreo.getText().length() == 0) {
            return false;
        } else {
            return true;
        }

    }

    public void limpiarCapos() {
        jTCedula.setText(" ");
        jTNombre.setText(" ");
        jTApellido.setText(" ");
        jTCorreo.setText(" ");
        jTUsuario.setText(" ");
        jTDireccion.setText(" ");
    }

    public void limpiarTabla() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i--;
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActualizar;
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTApellido;
    private javax.swing.JTextField jTCedula;
    private javax.swing.JTextField jTCorreo;
    private javax.swing.JTextArea jTDireccion;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTUsuario;
    private javax.swing.JTable jTableCliente;
    // End of variables declaration//GEN-END:variables
}
