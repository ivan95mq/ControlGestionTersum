/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Principal;

import Modelo.Entidades.Permiso;
import Utilidades.Colores;
import Utilidades.Utilidades;
import Utilidades.UtilidadesPantalla;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import javax.swing.ImageIcon;
import Vistas.Archivos.Contratos_vista;
import Vistas.Archivos.Vacaciones_vista;
import Vistas.Archivos.Clientes.VistaClientes;
import Vistas.Principal.Configuracion.Usuarios_vista;
import Vistas.Archivos.Trabajadores.VistaTrabajadores;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.help.HelpSetException;

/**
 *
 * @author DisenoWeb
 */
public class Principal_vista extends javax.swing.JFrame {

    Utilidades utilidades = new Utilidades();
    SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yy");
    Colores color = new Colores();
    private int xx;
    private int xy;

    /**
     * Creates new form Principal
     */
    public Principal_vista() {
        initComponents();
        UtilidadesPantalla.resolucionPantalla(this);

        this.setTitle(utilidades.empresa);
        this.setLocationRelativeTo(null);
        representarEmpresaImagen(utilidades.empresa);
        java.util.Date fecha = new Date();
        menunombreusuario.setText("Usuario: " + utilidades.usuario.getNombre() + " / Fecha: " + formato.format(fecha));
        rolPermisos();
        ponAyuda();
        //consola_permisos();
    }

    public void ponAyuda() {
        try {
            HelpSet helpset = new HelpSet(getClass().getClassLoader(), UtilidadesPantalla.obtenerUrlAyuda());
            HelpBroker hb = helpset.createHelpBroker();
            hb.enableHelpOnButton(menuitemAyuda, "principal", helpset);
            hb.enableHelpKey(this.getContentPane(), "principal", helpset);
        } catch (HelpSetException ex) {
            Logger.getLogger(Principal_vista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        lbl_imagen_principal = new javax.swing.JLabel();
        menubar = new javax.swing.JMenuBar();
        menu_archivos = new javax.swing.JMenu();
        menuitemtrabajadores = new javax.swing.JMenuItem();
        menuitemclientes = new javax.swing.JMenuItem();
        menuitemcentros = new javax.swing.JMenuItem();
        menuitemcontratos = new javax.swing.JMenuItem();
        menuitemincidencias = new javax.swing.JMenuItem();
        menuitemfaltas = new javax.swing.JMenuItem();
        menu_procesos = new javax.swing.JMenu();
        menu_listados = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        menu_configuracion = new javax.swing.JMenu();
        menuitemconfiguracionusuario = new javax.swing.JMenuItem();
        menuitemcerrarsesion = new javax.swing.JMenuItem();
        menu_ayuda = new javax.swing.JMenu();
        menuitemAyuda = new javax.swing.JMenuItem();
        menunombreusuario = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/img/logo-tersum.png")).getImage());
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_imagen_principal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbl_imagen_principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 740));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 740));

        menubar.setBorderPainted(false);
        menubar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        menu_archivos.setText("Archivos");
        menu_archivos.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        menuitemtrabajadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trabajador.png"))); // NOI18N
        menuitemtrabajadores.setText("Trabajadores");
        menuitemtrabajadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemtrabajadoresActionPerformed(evt);
            }
        });
        menu_archivos.add(menuitemtrabajadores);

        menuitemclientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clientes.png"))); // NOI18N
        menuitemclientes.setText("Clientes");
        menuitemclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemclientesActionPerformed(evt);
            }
        });
        menu_archivos.add(menuitemclientes);

        menuitemcentros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/centros .png"))); // NOI18N
        menuitemcentros.setText("Centros");
        menuitemcentros.setEnabled(false);
        menuitemcentros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemcentrosActionPerformed(evt);
            }
        });
        menu_archivos.add(menuitemcentros);

        menuitemcontratos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/contratos.png"))); // NOI18N
        menuitemcontratos.setText("Contratos");
        menuitemcontratos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemcontratosActionPerformed(evt);
            }
        });
        menu_archivos.add(menuitemcontratos);

        menuitemincidencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/incidencias .png"))); // NOI18N
        menuitemincidencias.setText("Incidencias");
        menuitemincidencias.setEnabled(false);
        menuitemincidencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemincidenciasActionPerformed(evt);
            }
        });
        menu_archivos.add(menuitemincidencias);

        menuitemfaltas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/falta.png"))); // NOI18N
        menuitemfaltas.setText("Faltas");
        menuitemfaltas.setEnabled(false);
        menuitemfaltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemfaltasActionPerformed(evt);
            }
        });
        menu_archivos.add(menuitemfaltas);

        menubar.add(menu_archivos);

        menu_procesos.setText("Procesos");
        menu_procesos.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        menubar.add(menu_procesos);

        menu_listados.setText("Listados");
        menu_listados.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jMenu2.setText("Listado de trabajadores");
        menu_listados.add(jMenu2);

        menubar.add(menu_listados);

        menu_configuracion.setText("Configuración");
        menu_configuracion.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        menuitemconfiguracionusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario.png"))); // NOI18N
        menuitemconfiguracionusuario.setText("Usuarios");
        menuitemconfiguracionusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemconfiguracionusuarioActionPerformed(evt);
            }
        });
        menu_configuracion.add(menuitemconfiguracionusuario);

        menuitemcerrarsesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.png"))); // NOI18N
        menuitemcerrarsesion.setText("Cerrar Sesión");
        menuitemcerrarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemcerrarsesionActionPerformed(evt);
            }
        });
        menu_configuracion.add(menuitemcerrarsesion);

        menubar.add(menu_configuracion);

        menu_ayuda.setText("Ayuda");
        menu_ayuda.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        menuitemAyuda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        menuitemAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ayuda .png"))); // NOI18N
        menuitemAyuda.setText("Ayuda");
        menu_ayuda.add(menuitemAyuda);

        menubar.add(menu_ayuda);

        menunombreusuario.setText("Usuario: XXXXXXXX / Fecha: XX-XX-XXXX");
        menunombreusuario.setActionCommand("usuario: XXXXXXXX");
        menunombreusuario.setEnabled(false);
        menunombreusuario.setFocusable(false);
        menunombreusuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menunombreusuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menunombreusuario.setMargin(new java.awt.Insets(0, 600, 0, 0));
        menubar.add(menunombreusuario);

        setJMenuBar(menubar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void menuitemclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemclientesActionPerformed
        VistaClientes vista_clientes = new VistaClientes();
        vista_clientes.setVisible(true);
    }//GEN-LAST:event_menuitemclientesActionPerformed

    private void menuitemtrabajadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemtrabajadoresActionPerformed
        VistaTrabajadores vista_trabajadores = new VistaTrabajadores();
        vista_trabajadores.setVisible(true);
    }//GEN-LAST:event_menuitemtrabajadoresActionPerformed

    private void menuitemcontratosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemcontratosActionPerformed
        Contratos_vista vista_contratos = new Contratos_vista();
        vista_contratos.setVisible(true);
    }//GEN-LAST:event_menuitemcontratosActionPerformed

    private void menuitemconfiguracionusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemconfiguracionusuarioActionPerformed
        Usuarios_vista vista_usuarios = new Usuarios_vista();
        vista_usuarios.setVisible(true);
    }//GEN-LAST:event_menuitemconfiguracionusuarioActionPerformed

    private void menuitemcentrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemcentrosActionPerformed
        //Centros_vista vista_centros = new Centros_vista();
        //vista_centros.setVisible(true);
    }//GEN-LAST:event_menuitemcentrosActionPerformed

    private void menuitemfaltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemfaltasActionPerformed
        Vacaciones_vista vista_faltas = new Vacaciones_vista();
        vista_faltas.setVisible(true);
    }//GEN-LAST:event_menuitemfaltasActionPerformed

    private void menuitemincidenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemincidenciasActionPerformed
//        Incidencias_vista vista_incidencias = new Incidencias_vista();
//        vista_incidencias.setVisible(true);
    }//GEN-LAST:event_menuitemincidenciasActionPerformed

    private void menuitemcerrarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemcerrarsesionActionPerformed
        Login_vista login = new Login_vista();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuitemcerrarsesionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal_vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_imagen_principal;
    private javax.swing.JMenu menu_archivos;
    private javax.swing.JMenu menu_ayuda;
    private javax.swing.JMenu menu_configuracion;
    private javax.swing.JMenu menu_listados;
    private javax.swing.JMenu menu_procesos;
    private javax.swing.JMenuBar menubar;
    private javax.swing.JMenuItem menuitemAyuda;
    private javax.swing.JMenuItem menuitemcentros;
    private javax.swing.JMenuItem menuitemcerrarsesion;
    private javax.swing.JMenuItem menuitemclientes;
    private javax.swing.JMenuItem menuitemconfiguracionusuario;
    private javax.swing.JMenuItem menuitemcontratos;
    private javax.swing.JMenuItem menuitemfaltas;
    private javax.swing.JMenuItem menuitemincidencias;
    private javax.swing.JMenuItem menuitemtrabajadores;
    private javax.swing.JMenu menunombreusuario;
    // End of variables declaration//GEN-END:variables

    private void consola_permisos() {
        Iterator<Permiso> nombreIterator = Utilidades.lista_de_permisos.iterator();
        while (nombreIterator.hasNext()) {
            Permiso permiso = nombreIterator.next();

        }
    }

    private void representarEmpresaImagen(String empresa) {
        String path;
        URL url;
        ImageIcon icon;
        empresa = "Tersum"; //SOLO PARA PRUEBAS

        switch (empresa) {
            case "Tersum":

                path = "/img/fondo-tersum.png";
                url = this.getClass().getResource(path);
                icon = new ImageIcon(url);
                lbl_imagen_principal.setIcon(icon);
                break;

            case "Aurum":
                path = "/img/fondo-aurum.png";
                url = this.getClass().getResource(path);
                icon = new ImageIcon(url);
                lbl_imagen_principal.setIcon(icon);
                break;

            case "Cleaning Consultores":
                path = "/img/fondo-cleaning.png";
                url = this.getClass().getResource(path);
                icon = new ImageIcon(url);
                lbl_imagen_principal.setIcon(icon);
                break;

        }

    }

    private void rolPermisos() {
        //  System.out.println(utilidades.usuario.getId_rol()); //PARA VER EL ID DE ROL
        if (utilidades.usuario.getId_rol() != 1) { //SI EL USUARIO NO ES ADMINISTRADOR
            menu_configuracion.setEnabled(false);
        }

        Iterator<Permiso> nombreIterator = Utilidades.lista_de_permisos.iterator();
        while (nombreIterator.hasNext()) {
            Permiso permiso = nombreIterator.next();
            if (!permiso.isActivo()) {
                String nombre_permiso = utilidades.comprobarNombrePermiso(permiso);
                switch (nombre_permiso) {
                    case "acceso_archivos":
                        menu_archivos.setEnabled(false);
                        break;
                    case "acceso_procesos":
                        menu_procesos.setEnabled(false);
                        break;
                    case "acceso_listado":
                        menu_listados.setEnabled(false);
                        break;
                    case "acceso_configuracion":
                        menu_configuracion.setEnabled(false);
                        break;
                    case "archivos_trabajadores":
                        menuitemtrabajadores.setEnabled(false);
                        break;
                    case "archivos_centros":
                        menuitemcentros.setEnabled(false);
                        break;
                    case "archivos_contratos":
                        menuitemcontratos.setEnabled(false);
                        break;
                    case "archivos_clientes":
                        menuitemclientes.setEnabled(false);
                        break;
                }
            }
        }
    }

}
