/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import logica.AutorBD;
import logica.Libro;
import logica.LibroBD;

/**
 *
 * @author luis_
 */
public class FrameLibros extends javax.swing.JInternalFrame {

    //Colores del Frame
    Color fondoBg = new Color(43, 43, 43); //Gris Oscuro
    Color fondoPanel = new Color(69, 73, 74); //Gris Medio
    Color Texto = new Color(102, 102, 102); //Gris Claro

    AutorBD autorBD = new AutorBD();
    LibroBD librosBD = new LibroBD();
    DefaultTableModel modelo = new DefaultTableModel();
    Personalizar personalizar = new Personalizar();
    Notificaciones mensaje = new Notificaciones();
    int id;

    /**
     * Creates new form Libros
     */
    public FrameLibros() {
        initComponents();
        llenarCombox();
        listar();
        //La ultima columa 7 id Vendedor la oculta
        jTLibros.getTableHeader().getColumnModel().getColumn(7).setMinWidth(0);
        jTLibros.getTableHeader().getColumnModel().getColumn(7).setMaxWidth(0);
    }

    public void llenarCombox() {
        jCBAutores.removeAllItems();
        List<String> listaCB = new ArrayList<>();
        listaCB = autorBD.ListarNombresAutores();
        for (int i = 0; i < listaCB.size(); i++) {
            jCBAutores.addItem(listaCB.get(i));
        }
    }

    public void listar() {
        List<Libro> lista = librosBD.listar();
        modelo = (DefaultTableModel) jTLibros.getModel();
        Object[] tabla = new Object[8];
        for (int i = 0; i < lista.size(); i++) {
            tabla[0] = lista.get(i).getIdLibro();
            tabla[1] = lista.get(i).getNombreLibro();
            tabla[2] = lista.get(i).getAutortxt();
            tabla[3] = lista.get(i).getEditorial();
            tabla[4] = lista.get(i).getGenero();
            tabla[5] = lista.get(i).getStock();
            tabla[6] = lista.get(i).getPrecio();
            tabla[7] = lista.get(i).getAutor();
            modelo.addRow(tabla);
        }
        jTLibros.setModel(modelo);
    }

    public void incluir() {
        try {
            if (validaCamposVacios()) {

                String nombre = jTNombre.getText();
                int autor = jCBAutores.getSelectedIndex();
                String editorial = jTEditorial.getText();
                String genero = jTGenero.getText();
                int stock = Integer.parseInt(jTStock.getText());
                double precio = Double.parseDouble(jTPrecio.getText());

                Object[] incluirLibro = new Object[6];
                incluirLibro[0] = nombre;
                incluirLibro[1] = autor;
                incluirLibro[2] = editorial;
                incluirLibro[3] = genero;
                incluirLibro[4] = stock;
                incluirLibro[5] = precio;

                librosBD.incluir(incluirLibro);
                
                limpiartabla();
                limpiarCampos();
                listar();
            } else {
                mensaje.error("Algun campo se encuentra Vacio");
            }

        } catch (Exception e) {
            mensaje.error("Error al incluir los Datos");
        }

    }

    public void actualizar() {
        int fila = jTLibros.getSelectedRow();
        if (fila == -1) {
            mensaje.error("No ha seleccionado una Fila");
        } else if (validaNumeros()) {
            String nombre = jTNombre.getText();
            int autor = jCBAutores.getSelectedIndex();
            String editorial = jTEditorial.getText();
            String genero = jTGenero.getText();
            int stock = Integer.parseInt(jTStock.getText());
            double precio = Double.parseDouble(jTPrecio.getText());
            int idlibro = id;

            Object[] libroAct = new Object[7];
            libroAct[0] = nombre;
            libroAct[1] = autor;
            libroAct[2] = editorial;
            libroAct[3] = genero;
            libroAct[4] = stock;
            libroAct[5] = precio;
            libroAct[6] = idlibro;

            librosBD.actualizar(libroAct);
            limpiartabla();
            limpiarCampos();
            listar();

        } else {
            mensaje.error("Los Datos son incorrectos,No cumplen con los requisitos para actualizarlos");
        }

    }

    public boolean validaCamposVacios() {
        if (jTNombre.getText().length() == 0) {
            return false;
        } else if (jCBAutores.getSelectedIndex() == 0) {
            return false;
        } else if (jTEditorial.getText().length() == 0) {
            return false;
        } else if (jTStock.getText().length() == 0) {
            return false;
        } else if (jTPrecio.getText().length() == 0) {
            return false;
        } else if (jTGenero.getText().length() == 0) {
            return false;
        }
        return true;
    }

    public boolean validaNumeros() {
        try {
            Integer.parseInt(jTStock.getText());
            Double.parseDouble(jTPrecio.getText());
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void eliminar() {
        int fila = jTLibros.getSelectedRow();
        String nombreLibro = jTNombre.getText();
        if (fila == -1) {
            mensaje.error("No seleccionado un Libro para eliminar");
        } else {
            boolean consulta = mensaje.confirmar("Desea continuar con la eliminacion de " + nombreLibro, "Selccione una Opcion");
            if (consulta) {

                librosBD.eliminar(id);
                limpiartabla();
                limpiarCampos();
                listar();
            } else {
                limpiartabla();
                limpiarCampos();
                listar();

            }
        }

    }

    public void limpiartabla() {

        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    public void limpiarCampos() {
        jTNombre.setText("");
        jTEditorial.setText("");
        jTStock.setText("");
        jTPrecio.setText("");
        jTGenero.setText("");
        jCBAutores.setSelectedIndex(0);
        llenarCombox();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jBLimpiar = new javax.swing.JButton();
        jBAgregar = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();
        jBActualizar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jTNombre = new javax.swing.JTextField();
        jTEditorial = new javax.swing.JTextField();
        jTStock = new javax.swing.JTextField();
        jTPrecio = new javax.swing.JTextField();
        jTGenero = new javax.swing.JTextField();
        jBCrear = new javax.swing.JButton();
        jCBAutores = new javax.swing.JComboBox<>();
        jBBuscarAutor = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTLibros = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setClosable(true);
        setTitle("Inventario Libros");
        setAutoscrolls(true);
        setOpaque(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Autor:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Editorial:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Genero:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Stock:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Precio:");

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

        jBCrear.setBackground(fondoPanel);
        jBCrear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBCrear.setForeground(new java.awt.Color(255, 255, 255));
        jBCrear.setText("Crear");
        jBCrear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jCBAutores.setBackground(Texto);
        jCBAutores.setForeground(new java.awt.Color(255, 255, 255));
        jCBAutores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jBBuscarAutor.setBackground(fondoPanel);
        jBBuscarAutor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBBuscarAutor.setForeground(new java.awt.Color(255, 255, 255));
        jBBuscarAutor.setText("Buscar");
        jBBuscarAutor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
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
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTNombre)
                            .addComponent(jTEditorial)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTStock, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jTPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTGenero)
                            .addComponent(jCBAutores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jBBuscarAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                                .addComponent(jBCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBAutores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscarAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jTStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTLibros.setAutoCreateRowSorter(true);
        jTLibros.setBackground(Texto);
        jTLibros.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTLibros.setForeground(new java.awt.Color(255, 255, 255));
        jTLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Autor", "Editorial", "Genero", "Stock", "Precio", "AutorID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTLibros.setFillsViewportHeight(true);
        jTLibros.setGridColor(new java.awt.Color(204, 204, 204));
        jTLibros.setInheritsPopupMenu(true);
        jTLibros.setShowGrid(true);
        jTLibros.setShowHorizontalLines(true);
        jTLibros.getTableHeader().setReorderingAllowed(false);
        jTLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTLibrosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTLibros);
        if (jTLibros.getColumnModel().getColumnCount() > 0) {
            jTLibros.getColumnModel().getColumn(0).setResizable(false);
            jTLibros.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTLibros.getColumnModel().getColumn(1).setResizable(false);
            jTLibros.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTLibros.getColumnModel().getColumn(2).setResizable(false);
            jTLibros.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTLibros.getColumnModel().getColumn(3).setResizable(false);
            jTLibros.getColumnModel().getColumn(3).setPreferredWidth(75);
            jTLibros.getColumnModel().getColumn(4).setResizable(false);
            jTLibros.getColumnModel().getColumn(4).setPreferredWidth(50);
            jTLibros.getColumnModel().getColumn(5).setResizable(false);
            jTLibros.getColumnModel().getColumn(5).setPreferredWidth(25);
            jTLibros.getColumnModel().getColumn(6).setResizable(false);
            jTLibros.getColumnModel().getColumn(6).setPreferredWidth(20);
            jTLibros.getColumnModel().getColumn(7).setResizable(false);
            jTLibros.getColumnModel().getColumn(7).setPreferredWidth(1);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        limpiartabla();
        listar();
        limpiarCampos();
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
        incluir();
    }//GEN-LAST:event_jBAgregarActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed

    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarActionPerformed
        actualizar();
    }//GEN-LAST:event_jBActualizarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jTLibrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTLibrosMouseClicked
        int fila = jTLibros.getSelectedRow();
        if (fila == -1) {
            mensaje.error("Debe de Seleccionar una Fila");
        } else {
            this.id = Integer.parseInt(jTLibros.getValueAt(fila, 0).toString());
            String nombreLibro = jTLibros.getValueAt(fila, 1).toString();
            String nombreAutor = jTLibros.getValueAt(fila, 2).toString();
            String editorial = jTLibros.getValueAt(fila, 3).toString();
            String genero = jTLibros.getValueAt(fila, 4).toString();
            String stock = jTLibros.getValueAt(fila, 5).toString();
            String precio = jTLibros.getValueAt(fila, 6).toString();
            int idAutor = Integer.parseInt(jTLibros.getValueAt(fila, 7).toString());

            jTNombre.setText(nombreLibro);
            jTEditorial.setText(editorial);
            jTStock.setText(stock);
            jTPrecio.setText(precio);
            jTGenero.setText(genero);
            jCBAutores.setSelectedIndex(idAutor);
        }
    }//GEN-LAST:event_jTLibrosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActualizar;
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBBuscarAutor;
    private javax.swing.JButton jBCrear;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JComboBox<String> jCBAutores;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTEditorial;
    private javax.swing.JTextField jTGenero;
    private javax.swing.JTable jTLibros;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTPrecio;
    private javax.swing.JTextField jTStock;
    // End of variables declaration//GEN-END:variables
}
