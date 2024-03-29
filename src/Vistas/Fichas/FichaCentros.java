/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Fichas;

import Modelo.Entidades.Centro;
import Modelo.Entidades.Trabajador;
import javax.swing.JFrame;

/**
 *
 * @author usuario
 */
public class FichaCentros extends javax.swing.JDialog {

    /**
     * Creates new form FichaCentros
     *
     * @param parent
     * @param modal
     * @param centro
     */
    public FichaCentros(java.awt.Frame parent, boolean modal, Centro centro) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        txt_codigo.setText(centro.getCodigo() + "");
        txt_nombre.setText(centro.getNombre());
        txt_direccion.setText(centro.getDireccion());
        txt_poblacion.setText(centro.getPoblacion());
        txt_tlf.setText(centro.getTelefono() + "");
        txt_email.setText(centro.getEmail());
        txt_contacto.setText(centro.getContacto());
        txt_horas_semana.setText(centro.getHoras_semana() + "");
        txt_facturacion.setText(centro.getFacturacion_mes() + "");
        txt_iban.setText(centro.getIban() + "");
    }

    private FichaCentros(JFrame jFrame, boolean b) {

    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        lbl_facturacion = new javax.swing.JLabel();
        lbl_nombre_comercial = new javax.swing.JLabel();
        lbl_contacto = new javax.swing.JLabel();
        lbl_tlf = new javax.swing.JLabel();
        lbl_codigo = new javax.swing.JLabel();
        lbl_responsable2 = new javax.swing.JLabel();
        lbl_nombre_fiscal = new javax.swing.JLabel();
        lbl_horas_semana = new javax.swing.JLabel();
        lbl_email = new javax.swing.JLabel();
        lbl_cif = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Aceptar = new org.edisoncor.gui.button.ButtonRect();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JLabel();
        txt_tlf = new javax.swing.JLabel();
        txt_horas_semana = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JLabel();
        txt_facturacion = new javax.swing.JLabel();
        txt_poblacion = new javax.swing.JLabel();
        txt_contacto = new javax.swing.JLabel();
        txt_email = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JLabel();
        lbl_iban = new javax.swing.JLabel();
        txt_iban = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(442, 446));
        setMinimumSize(new java.awt.Dimension(442, 446));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(442, 446));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setForeground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        lbl_facturacion.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbl_facturacion.setForeground(new java.awt.Color(153, 153, 153));
        lbl_facturacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_facturacion.setText("Facturación/Mes");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(lbl_facturacion, gridBagConstraints);

        lbl_nombre_comercial.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbl_nombre_comercial.setForeground(new java.awt.Color(153, 153, 153));
        lbl_nombre_comercial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_nombre_comercial.setText("Dirección");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(lbl_nombre_comercial, gridBagConstraints);

        lbl_contacto.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbl_contacto.setForeground(new java.awt.Color(153, 153, 153));
        lbl_contacto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_contacto.setText("Persona de contacto");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(lbl_contacto, gridBagConstraints);

        lbl_tlf.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbl_tlf.setForeground(new java.awt.Color(153, 153, 153));
        lbl_tlf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_tlf.setText("Teléfono");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 100;
        jPanel2.add(lbl_tlf, gridBagConstraints);

        lbl_codigo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbl_codigo.setForeground(new java.awt.Color(153, 153, 153));
        lbl_codigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_codigo.setText("Codigo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 100;
        jPanel2.add(lbl_codigo, gridBagConstraints);

        lbl_responsable2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbl_responsable2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_responsable2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_responsable2.setText("Datos del centro");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        jPanel2.add(lbl_responsable2, gridBagConstraints);

        lbl_nombre_fiscal.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbl_nombre_fiscal.setForeground(new java.awt.Color(153, 153, 153));
        lbl_nombre_fiscal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_nombre_fiscal.setText("Nombre");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(lbl_nombre_fiscal, gridBagConstraints);

        lbl_horas_semana.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbl_horas_semana.setForeground(new java.awt.Color(153, 153, 153));
        lbl_horas_semana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_horas_semana.setText("Horas semana");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(lbl_horas_semana, gridBagConstraints);

        lbl_email.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbl_email.setForeground(new java.awt.Color(153, 153, 153));
        lbl_email.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_email.setText("E-mail");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(lbl_email, gridBagConstraints);

        lbl_cif.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbl_cif.setForeground(new java.awt.Color(153, 153, 153));
        lbl_cif.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_cif.setText("Población");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(lbl_cif, gridBagConstraints);

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator1.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 25;
        jPanel2.add(jSeparator1, gridBagConstraints);

        Aceptar.setBackground(new java.awt.Color(204, 204, 204));
        Aceptar.setForeground(new java.awt.Color(51, 51, 51));
        Aceptar.setText("Aceptar");
        Aceptar.setColorDeSombra(new java.awt.Color(204, 204, 204));
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel2.add(Aceptar, gridBagConstraints);

        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 25;
        jPanel2.add(jSeparator2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 15;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 15;
        jPanel2.add(jLabel2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipady = 20;
        jPanel2.add(jLabel3, gridBagConstraints);

        txt_nombre.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(204, 204, 204));
        txt_nombre.setText("aaaa");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        jPanel2.add(txt_nombre, gridBagConstraints);

        txt_tlf.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_tlf.setForeground(new java.awt.Color(204, 204, 204));
        txt_tlf.setText("aaaa");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        jPanel2.add(txt_tlf, gridBagConstraints);

        txt_horas_semana.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_horas_semana.setForeground(new java.awt.Color(204, 204, 204));
        txt_horas_semana.setText("aaaa");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        jPanel2.add(txt_horas_semana, gridBagConstraints);

        txt_direccion.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_direccion.setForeground(new java.awt.Color(204, 204, 204));
        txt_direccion.setText("aaaa");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        jPanel2.add(txt_direccion, gridBagConstraints);

        txt_facturacion.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_facturacion.setForeground(new java.awt.Color(204, 204, 204));
        txt_facturacion.setText("aaaa");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        jPanel2.add(txt_facturacion, gridBagConstraints);

        txt_poblacion.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_poblacion.setForeground(new java.awt.Color(204, 204, 204));
        txt_poblacion.setText("aaaa");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        jPanel2.add(txt_poblacion, gridBagConstraints);

        txt_contacto.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_contacto.setForeground(new java.awt.Color(204, 204, 204));
        txt_contacto.setText("aaaa");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        jPanel2.add(txt_contacto, gridBagConstraints);

        txt_email.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_email.setForeground(new java.awt.Color(204, 204, 204));
        txt_email.setText("aaaa");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        jPanel2.add(txt_email, gridBagConstraints);

        txt_codigo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_codigo.setForeground(new java.awt.Color(204, 204, 204));
        txt_codigo.setText("aaaa");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        jPanel2.add(txt_codigo, gridBagConstraints);

        lbl_iban.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbl_iban.setForeground(new java.awt.Color(153, 153, 153));
        lbl_iban.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_iban.setText("IBAN");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        jPanel2.add(lbl_iban, gridBagConstraints);

        txt_iban.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_iban.setForeground(new java.awt.Color(204, 204, 204));
        txt_iban.setText("aaaa");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 11;
        jPanel2.add(txt_iban, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_AceptarActionPerformed

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
            java.util.logging.Logger.getLogger(FichaCentros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FichaCentros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FichaCentros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FichaCentros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FichaCentros dialog = new FichaCentros(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonRect Aceptar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_cif;
    private javax.swing.JLabel lbl_codigo;
    private javax.swing.JLabel lbl_contacto;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_facturacion;
    private javax.swing.JLabel lbl_horas_semana;
    private javax.swing.JLabel lbl_iban;
    private javax.swing.JLabel lbl_nombre_comercial;
    private javax.swing.JLabel lbl_nombre_fiscal;
    private javax.swing.JLabel lbl_responsable2;
    private javax.swing.JLabel lbl_tlf;
    private javax.swing.JLabel txt_codigo;
    private javax.swing.JLabel txt_contacto;
    private javax.swing.JLabel txt_direccion;
    private javax.swing.JLabel txt_email;
    private javax.swing.JLabel txt_facturacion;
    private javax.swing.JLabel txt_horas_semana;
    private javax.swing.JLabel txt_iban;
    private javax.swing.JLabel txt_nombre;
    private javax.swing.JLabel txt_poblacion;
    private javax.swing.JLabel txt_tlf;
    // End of variables declaration//GEN-END:variables
}
