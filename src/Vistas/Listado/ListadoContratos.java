/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Listado;

import Modelo.Entidades.Contrato;
import Utilidades.Utilidades;
import Utilidades.UtilidadesPantalla;
import Vistas.Fichas.FichaContratos;

/**
 *
 * @author usuario
 */
public class ListadoContratos extends javax.swing.JFrame {
 Utilidades utilidades = new Utilidades();

    /**
     * Creates new form ListadoContratos
     */
    public ListadoContratos() {
        initComponents();
         UtilidadesPantalla.centrarTablas(listado_contratos);
        UtilidadesPantalla.resolucionPantalla(this);
        listado_contratos.getColumnModel().getColumn(0).setMaxWidth(0);
        listado_contratos.getColumnModel().getColumn(0).setMinWidth(0);
        listado_contratos.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
        listado_contratos.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
        utilidades.rellenarTabla(listado_contratos, "clientes", "");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listado_contratos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1360, 762));
        setSize(new java.awt.Dimension(1360, 762));

        listado_contratos.setAutoCreateRowSorter(true);
        listado_contratos.setBackground(new java.awt.Color(204, 204, 204));
        listado_contratos.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        listado_contratos.setForeground(new java.awt.Color(51, 51, 51));
        listado_contratos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CODIGO", "NOMBRE", "APELLIDOS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
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
        listado_contratos.setRowHeight(30);
        listado_contratos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listado_contratosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listado_contratos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listado_contratosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listado_contratosMouseClicked
        int id_contratos = 0;
        Contrato contrato = null;
        id_contratos = (Integer) (listado_contratos.getValueAt(listado_contratos.getSelectedRow(), 0));
        for (int i = 0; i < utilidades.lista_de_contratos.size(); i++) {
            if (utilidades.lista_de_contratos.get(i).getId() == id_contratos) {
                contrato = utilidades.lista_de_contratos.get(i);
            }
        }
        FichaContratos ficha = new FichaContratos(this, rootPaneCheckingEnabled, contrato);
        ficha.setVisible(true);
    }//GEN-LAST:event_listado_contratosMouseClicked

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
            java.util.logging.Logger.getLogger(ListadoContratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListadoContratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListadoContratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListadoContratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListadoContratos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listado_contratos;
    // End of variables declaration//GEN-END:variables
}
