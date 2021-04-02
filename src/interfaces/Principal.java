/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import logica.Vendedor;

/**
 *
 * @author luis_
 */
public class Principal extends javax.swing.JFrame {

    Vendedor vendedor = new Vendedor(); //Objeto vendedor que hace referencia al vendedor que se ingresa en el sistema.
    Notificaciones mensaje = new Notificaciones();
    /**
     * Creates new form Principal
     */
    public Principal(Vendedor vendedor) {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/isotipo.png")).getImage());
        this.vendedor = vendedor;
    }

    public Principal() {
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VentanaPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMCambiaUsuario = new javax.swing.JMenuItem();
        jMAcerca = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMVentas = new javax.swing.JMenu();
        jMGenerarVenta = new javax.swing.JMenuItem();
        jMInventario = new javax.swing.JMenu();
        jMLibros = new javax.swing.JMenuItem();
        jMAutores = new javax.swing.JMenuItem();
        jMMante = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMVendedores = new javax.swing.JMenuItem();
        jMReportes = new javax.swing.JMenu();
        jMRepVendedores = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Punto de Venta Fidelibros V1");

        VentanaPrincipal.setBackground(new java.awt.Color(51, 51, 51));
        VentanaPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout VentanaPrincipalLayout = new javax.swing.GroupLayout(VentanaPrincipal);
        VentanaPrincipal.setLayout(VentanaPrincipalLayout);
        VentanaPrincipalLayout.setHorizontalGroup(
            VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1288, Short.MAX_VALUE)
        );
        VentanaPrincipalLayout.setVerticalGroup(
            VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 428, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(61, 63, 64));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar1.setForeground(new java.awt.Color(51, 51, 51));
        jMenuBar1.setToolTipText("");
        jMenuBar1.setAutoscrolls(true);
        jMenuBar1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N

        jMMenu.setBackground(new java.awt.Color(61, 63, 64));
        jMMenu.setForeground(new java.awt.Color(255, 255, 255));
        jMMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/049-website.png"))); // NOI18N
        jMMenu.setText("Menu");
        jMMenu.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jMenuItem1.setBackground(new java.awt.Color(61, 63, 64));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setText("Ayuda");
        jMMenu.add(jMenuItem1);

        jMCambiaUsuario.setBackground(new java.awt.Color(61, 63, 64));
        jMCambiaUsuario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jMCambiaUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jMCambiaUsuario.setText("Cerrar Seccion");
        jMCambiaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMCambiaUsuarioActionPerformed(evt);
            }
        });
        jMMenu.add(jMCambiaUsuario);

        jMAcerca.setBackground(new java.awt.Color(61, 63, 64));
        jMAcerca.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jMAcerca.setForeground(new java.awt.Color(255, 255, 255));
        jMAcerca.setText("Acerca ");
        jMAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMAcercaActionPerformed(evt);
            }
        });
        jMMenu.add(jMAcerca);

        jMenuItem2.setBackground(new java.awt.Color(61, 63, 64));
        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jMenuItem2.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMMenu.add(jMenuItem2);

        jMenuBar1.add(jMMenu);

        jMVentas.setBackground(new java.awt.Color(61, 63, 64));
        jMVentas.setForeground(new java.awt.Color(255, 255, 255));
        jMVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/041-shopping.png"))); // NOI18N
        jMVentas.setText("Ventas");
        jMVentas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jMVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMVentasActionPerformed(evt);
            }
        });

        jMGenerarVenta.setBackground(new java.awt.Color(61, 63, 64));
        jMGenerarVenta.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jMGenerarVenta.setForeground(new java.awt.Color(255, 255, 255));
        jMGenerarVenta.setText("Generar Venta");
        jMGenerarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMGenerarVentaActionPerformed(evt);
            }
        });
        jMVentas.add(jMGenerarVenta);

        jMenuBar1.add(jMVentas);

        jMInventario.setBackground(new java.awt.Color(61, 63, 64));
        jMInventario.setForeground(new java.awt.Color(255, 255, 255));
        jMInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/008-checklist.png"))); // NOI18N
        jMInventario.setText("Inventario");
        jMInventario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jMInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMInventarioActionPerformed(evt);
            }
        });

        jMLibros.setBackground(new java.awt.Color(61, 63, 64));
        jMLibros.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jMLibros.setForeground(new java.awt.Color(255, 255, 255));
        jMLibros.setText("Libros ");
        jMLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMLibrosActionPerformed(evt);
            }
        });
        jMInventario.add(jMLibros);

        jMAutores.setBackground(new java.awt.Color(61, 63, 64));
        jMAutores.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jMAutores.setForeground(new java.awt.Color(255, 255, 255));
        jMAutores.setText("Autores");
        jMAutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMAutoresActionPerformed(evt);
            }
        });
        jMInventario.add(jMAutores);

        jMenuBar1.add(jMInventario);

        jMMante.setForeground(new java.awt.Color(255, 255, 255));
        jMMante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/013-code.png"))); // NOI18N
        jMMante.setText("Mantenimiento");
        jMMante.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jMenuItem3.setBackground(new java.awt.Color(61, 63, 64));
        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jMenuItem3.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem3.setText("Clientes");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMMante.add(jMenuItem3);

        jMVendedores.setBackground(new java.awt.Color(61, 63, 64));
        jMVendedores.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jMVendedores.setForeground(new java.awt.Color(255, 255, 255));
        jMVendedores.setText("Vendedores");
        jMMante.add(jMVendedores);

        jMenuBar1.add(jMMante);

        jMReportes.setForeground(new java.awt.Color(255, 255, 255));
        jMReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/002-analysis.png"))); // NOI18N
        jMReportes.setText("Reportes");
        jMReportes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jMRepVendedores.setBackground(new java.awt.Color(61, 63, 64));
        jMRepVendedores.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jMRepVendedores.setForeground(new java.awt.Color(255, 255, 255));
        jMRepVendedores.setText("Reporte Vendedores");
        jMReportes.add(jMRepVendedores);

        jMenuBar1.add(jMReportes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMVentasActionPerformed

    }//GEN-LAST:event_jMVentasActionPerformed

    private void jMGenerarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMGenerarVentaActionPerformed
        FrameVentas vf = new FrameVentas(vendedor);
        CentrarVenta(vf);
    }//GEN-LAST:event_jMGenerarVentaActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        FrameClientes fc = new FrameClientes();
        CentrarVenta(fc);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMInventarioActionPerformed

    }//GEN-LAST:event_jMInventarioActionPerformed

    private void jMLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMLibrosActionPerformed
        FrameLibros fl = new FrameLibros();
        CentrarVenta(fl);
    }//GEN-LAST:event_jMLibrosActionPerformed

    private void jMCambiaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMCambiaUsuarioActionPerformed
        Login login = new Login();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMCambiaUsuarioActionPerformed

    private void jMAutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMAutoresActionPerformed
        FrameAutores au = new FrameAutores();
        CentrarVenta(au);
    }//GEN-LAST:event_jMAutoresActionPerformed

    private void jMAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMAcercaActionPerformed
        mensaje.notificar(
            "Programa Creado por Luis Carlos Porras Castro"
             +"\nPara la Materia Programación Cliente/Servidor Concurrente [I CM-G05-2021] "   
        
        
        );
        
    }//GEN-LAST:event_jMAcercaActionPerformed

    public void CentrarVenta(JInternalFrame frame) {
        VentanaPrincipal.add(frame);
        if (frame.isVisible()) {

        } else {
            //revisar esa locacion 
            //Dimension dimension=VentanaPrincipal.getSize();
            //Dimension formulaio = frame.getSize();
            //frame.setLocation((dimension.width -formulaio.height)/2,(dimension.height-formulaio.width)/2);
            frame.show();
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            Personalizar personalizar = new Personalizar();

            personalizar.table();
        } catch (Exception e) {
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane VentanaPrincipal;
    private javax.swing.JMenuItem jMAcerca;
    private javax.swing.JMenuItem jMAutores;
    private javax.swing.JMenuItem jMCambiaUsuario;
    private javax.swing.JMenuItem jMGenerarVenta;
    private javax.swing.JMenu jMInventario;
    private javax.swing.JMenuItem jMLibros;
    private javax.swing.JMenu jMMante;
    private javax.swing.JMenu jMMenu;
    private javax.swing.JMenuItem jMRepVendedores;
    private javax.swing.JMenu jMReportes;
    private javax.swing.JMenuItem jMVendedores;
    private javax.swing.JMenu jMVentas;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    // End of variables declaration//GEN-END:variables
}
