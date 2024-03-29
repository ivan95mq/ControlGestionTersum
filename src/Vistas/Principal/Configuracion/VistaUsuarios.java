/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Principal.Configuracion;

import Modelo.Entidades.Usuario;
import Modelo.Repository.UsuarioRepository;
import Utilidades.UtilidadesPantalla;
import Vistas.Formularios.FormularioUsuario;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DisenoWeb
 */
public class VistaUsuarios extends javax.swing.JFrame {

    UsuarioRepository repoUsuarios;
    Usuario usu = new Usuario();
    private boolean isAlreadyOneClick;

    /**
     * Creates new form VistaUsuarios
     */
    public VistaUsuarios() {
        iniciarOtrosComponentes();
        repoUsuarios.rellenarTablaDefault(tabla_usuarios);
    }

    private void iniciarOtrosComponentes() {
        initComponents();
        repoUsuarios = new UsuarioRepository();
        UtilidadesPantalla.centrarTablas(tabla_usuarios);
        UtilidadesPantalla.resolucionPantalla(this);
        ponAyuda();
        tabla_usuarios.getColumnModel().getColumn(0).setMaxWidth(0);
        tabla_usuarios.getColumnModel().getColumn(0).setMinWidth(0);
        tabla_usuarios.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
        tabla_usuarios.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
        tabla_usuarios.getColumnModel().getColumn(1).setMaxWidth(100);
        tabla_usuarios.getColumnModel().getColumn(1).setPreferredWidth(75);
    }

    private void ponAyuda() {

    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_botones = new org.edisoncor.gui.panel.Panel();
        btn_Añadir_trabajador = new javax.swing.JButton();
        btn_borrar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_añadir = new javax.swing.JButton();
        Buscador = new javax.swing.JPanel();
        txt_buscador = new javax.swing.JTextField();
        btn_buscar = new org.edisoncor.gui.button.ButtonIcon();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_usuarios = new javax.swing.JTable();
        panelRect1 = new org.edisoncor.gui.panel.PanelRect();
        panelCurves1 = new org.edisoncor.gui.panel.PanelCurves();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("USUARIOS");
        setIconImage(new ImageIcon(getClass().getResource("/img/usuario.png")).getImage());
        setMinimumSize(new java.awt.Dimension(1360, 762));
        setPreferredSize(new java.awt.Dimension(1360, 762));
        setResizable(false);
        setSize(new java.awt.Dimension(1360, 762));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_botones.setColorPrimario(new java.awt.Color(102, 102, 102));
        Panel_botones.setColorSecundario(new java.awt.Color(51, 51, 51));

        btn_Añadir_trabajador.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_Añadir_trabajador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/añadir.png"))); // NOI18N
        btn_Añadir_trabajador.setText("Añadir Cliente");
        btn_Añadir_trabajador.setToolTipText("");
        btn_Añadir_trabajador.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_Añadir_trabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Añadir_trabajadorActionPerformed(evt);
            }
        });

        btn_borrar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/borrar.png"))); // NOI18N
        btn_borrar.setText("Borrar ");
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });

        btn_modificar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/modificar.png"))); // NOI18N
        btn_modificar.setText("Modificar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        btn_añadir.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_añadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/añadir.png"))); // NOI18N
        btn_añadir.setText("Añadir");
        btn_añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_añadirActionPerformed(evt);
            }
        });

        Buscador.setBackground(new java.awt.Color(102, 102, 102));
        Buscador.setForeground(new java.awt.Color(102, 102, 102));

        txt_buscador.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_buscador.setText("Buscar...");
        txt_buscador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_buscadorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_buscadorFocusLost(evt);
            }
        });
        txt_buscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_buscadorKeyReleased(evt);
            }
        });

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/busqueda.png"))); // NOI18N
        btn_buscar.setText("buttonIcon1");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BuscadorLayout = new javax.swing.GroupLayout(Buscador);
        Buscador.setLayout(BuscadorLayout);
        BuscadorLayout.setHorizontalGroup(
            BuscadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BuscadorLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt_buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BuscadorLayout.setVerticalGroup(
            BuscadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BuscadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txt_buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout Panel_botonesLayout = new javax.swing.GroupLayout(Panel_botones);
        Panel_botones.setLayout(Panel_botonesLayout);
        Panel_botonesLayout.setHorizontalGroup(
            Panel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_botonesLayout.createSequentialGroup()
                .addGroup(Panel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_botonesLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(Panel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_Añadir_trabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Buscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Panel_botonesLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(Panel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24))
        );
        Panel_botonesLayout.setVerticalGroup(
            Panel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_botonesLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Buscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 305, Short.MAX_VALUE)
                .addComponent(btn_Añadir_trabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        getContentPane().add(Panel_botones, new org.netbeans.lib.awtextra.AbsoluteConstraints(992, 63, 250, 610));

        tabla_usuarios.setAutoCreateRowSorter(true);
        tabla_usuarios.setBackground(new java.awt.Color(204, 204, 204));
        tabla_usuarios.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tabla_usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "USUARIO", "ROL", "ultima sesion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_usuarios.setRowHeight(25);
        tabla_usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_usuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_usuarios);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 860, 600));

        panelRect1.setColorPrimario(new java.awt.Color(102, 102, 102));
        panelRect1.setColorSecundario(new java.awt.Color(204, 204, 204));

        panelCurves1.setBackground(new java.awt.Color(102, 102, 102));
        panelCurves1.setOpaque(true);

        javax.swing.GroupLayout panelRect1Layout = new javax.swing.GroupLayout(panelRect1);
        panelRect1.setLayout(panelRect1Layout);
        panelRect1Layout.setHorizontalGroup(
            panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCurves1, javax.swing.GroupLayout.PREFERRED_SIZE, 1362, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelRect1Layout.setVerticalGroup(
            panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRect1Layout.createSequentialGroup()
                .addComponent(panelCurves1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        getContentPane().add(panelRect1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-8, -10, 1380, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
        if (tabla_usuarios.getSelectedRow() != -1) {
            int filaSeleccionada = tabla_usuarios.getSelectedRow();
            int opcionborrar = JOptionPane.showConfirmDialog(rootPane, "¿Estas seguro de borrar el registro?\n"
                    + "Trabajador: " + (String) tabla_usuarios.getValueAt(filaSeleccionada, 2) + " " + (String) tabla_usuarios.getValueAt(filaSeleccionada, 3));
            switch (opcionborrar) {
                case 0://OPCION SI BORRAR TRABAJADOR
                    int id = UtilidadesPantalla.getIdSelected(tabla_usuarios);
                    repoUsuarios.delete(id);
                    restablecerTabla();
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un trabajador");
        }
    }//GEN-LAST:event_btn_borrarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        if (tabla_usuarios.getSelectedRow() != -1) {
            usu = repoUsuarios.getById(UtilidadesPantalla.getIdSelected(tabla_usuarios));//Cogemos el trabajador seleccionado.
            FormularioUsuario FT = new FormularioUsuario(this, true, usu);
            if (usu != null) {
                FT.setVisible(true);
            }
            Usuario get = FT.usuarioModificar;
            if (get != null) {
                repoUsuarios.update(get);
                restablecerTabla();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un trabajador");
        }
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_añadirActionPerformed
        FormularioUsuario FT = new FormularioUsuario(this, true);
        FT.setVisible(true);
        Usuario get = FT.usuarioModificar;
        if (get != null) {
            if (!repoUsuarios.ifIdExist(get.getId())) {
                get.toString();
                repoUsuarios.insert(get);
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo insertar el trabajador por que ya existe en la base de datos", "Error al insertar", JOptionPane.WARNING_MESSAGE);
            }
            restablecerTabla();
        }
    }//GEN-LAST:event_btn_añadirActionPerformed

    private void txt_buscadorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_buscadorFocusGained
        if (txt_buscador.getText().contains("Buscar...")) {
            txt_buscador.setText("");
        }
    }//GEN-LAST:event_txt_buscadorFocusGained

    private void txt_buscadorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_buscadorFocusLost
        if (txt_buscador.getText().length() == 0) {
            txt_buscador.setText("Buscar...");
        }
    }//GEN-LAST:event_txt_buscadorFocusLost

    private void txt_buscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscadorKeyReleased

        if (!txt_buscador.getText().isEmpty()) {//SI EL BUSCADOR NO ESTA VACIO, VACIA LA TABLA Y EMPIEZA A BUSCAR CON LOS CARACTERES QUE LE VAMOS INTRODUCIENDO
            DefaultTableModel dm = (DefaultTableModel) tabla_usuarios.getModel();
            dm.getDataVector().removeAllElements();
            dm.fireTableDataChanged();
            repoUsuarios.buscar(tabla_usuarios, txt_buscador.getText());
            //utilidades.buscaryRellenarTabla(evt, txt_buscador_trabajador.getText(), tabla_trabajadores,"trabajadores");
        } else {//SI POR EL CONTRARIO ESTA VACIO EL BUSCADOR, ENTONCES RELLENA LA TABLA CON TODO
            restablecerTabla();
        }
    }//GEN-LAST:event_txt_buscadorKeyReleased

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void tabla_usuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_usuariosMouseClicked
        if (isAlreadyOneClick) {
            usu = repoUsuarios.getById(UtilidadesPantalla.getIdSelected(tabla_usuarios));//Cogemos el trabajador seleccionado.
//            if (trabajador != null) {
//                FichaTrabajador ficha = new FichaTrabajador(this, rootPaneCheckingEnabled, usu);
//                ficha.setVisible(true);
//            }
            isAlreadyOneClick = false;
        } else {
            isAlreadyOneClick = true;
            Timer t = new Timer("doubleclickTimer", false);
            t.schedule(new TimerTask() {
                @Override
                public void run() {
                    isAlreadyOneClick = false;
                }
            }, 250);
        }
    }//GEN-LAST:event_tabla_usuariosMouseClicked

    private void btn_Añadir_trabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Añadir_trabajadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Añadir_trabajadorActionPerformed

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
            java.util.logging.Logger.getLogger(VistaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Buscador;
    private org.edisoncor.gui.panel.Panel Panel_botones;
    private javax.swing.JButton btn_Añadir_trabajador;
    private javax.swing.JButton btn_añadir;
    private javax.swing.JButton btn_borrar;
    private org.edisoncor.gui.button.ButtonIcon btn_buscar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JScrollPane jScrollPane1;
    private org.edisoncor.gui.panel.PanelCurves panelCurves1;
    private org.edisoncor.gui.panel.PanelRect panelRect1;
    private javax.swing.JTable tabla_usuarios;
    private javax.swing.JTextField txt_buscador;
    // End of variables declaration//GEN-END:variables

    private void restablecerTabla() {
        repoUsuarios.rellenarTablaDefault(tabla_usuarios);
    }

}
