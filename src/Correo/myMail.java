/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Correo;

import Conexiones.Dba;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import loginFrames.Cuenta;
import loginFrames.DefaultLoginFrame;
import loginFrames.MenuPrincipal;

/**
 *
 * @author Usuario
 */
public class myMail extends javax.swing.JFrame {

    /**
     * Creates new form myMail
     *
     * @param indexCuenta
     * @param cuentas
     */
    public myMail(int indexCuenta) {
        initComponents();
        traerCuenta();
        myMail.indexCuenta = indexCuenta;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_myDrive = new javax.swing.JPanel();
        header_menu = new javax.swing.JPanel();
        panel_minimize_myMail = new javax.swing.JPanel();
        label_minimize_myMail = new javax.swing.JLabel();
        panel_exit_myMail = new javax.swing.JPanel();
        label_exit_myMail = new javax.swing.JLabel();
        menuBar_menu = new javax.swing.JPanel();
        panel_salir_myMail = new javax.swing.JPanel();
        salir_myMail = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        bg_myDrive.setBackground(new java.awt.Color(252, 226, 219));
        bg_myDrive.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header_menu.setBackground(new java.awt.Color(122, 68, 149));
        header_menu.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                header_menuMouseDragged(evt);
            }
        });
        header_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                header_menuMousePressed(evt);
            }
        });

        panel_minimize_myMail.setBackground(new java.awt.Color(122, 68, 149));

        label_minimize_myMail.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        label_minimize_myMail.setForeground(new java.awt.Color(255, 255, 255));
        label_minimize_myMail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_minimize_myMail.setText("🗕");
        label_minimize_myMail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_minimize_myMailMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_minimize_myMailMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_minimize_myMailMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_minimize_myMailLayout = new javax.swing.GroupLayout(panel_minimize_myMail);
        panel_minimize_myMail.setLayout(panel_minimize_myMailLayout);
        panel_minimize_myMailLayout.setHorizontalGroup(
            panel_minimize_myMailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_minimize_myMailLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label_minimize_myMail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_minimize_myMailLayout.setVerticalGroup(
            panel_minimize_myMailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_minimize_myMailLayout.createSequentialGroup()
                .addComponent(label_minimize_myMail)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panel_exit_myMail.setBackground(new java.awt.Color(122, 68, 149));

        label_exit_myMail.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        label_exit_myMail.setForeground(new java.awt.Color(255, 255, 255));
        label_exit_myMail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_exit_myMail.setText("🗙");
        label_exit_myMail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_exit_myMailMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_exit_myMailMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_exit_myMailMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_exit_myMailLayout = new javax.swing.GroupLayout(panel_exit_myMail);
        panel_exit_myMail.setLayout(panel_exit_myMailLayout);
        panel_exit_myMailLayout.setHorizontalGroup(
            panel_exit_myMailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_exit_myMailLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label_exit_myMail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_exit_myMailLayout.setVerticalGroup(
            panel_exit_myMailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_exit_myMailLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label_exit_myMail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout header_menuLayout = new javax.swing.GroupLayout(header_menu);
        header_menu.setLayout(header_menuLayout);
        header_menuLayout.setHorizontalGroup(
            header_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, header_menuLayout.createSequentialGroup()
                .addContainerGap(684, Short.MAX_VALUE)
                .addComponent(panel_minimize_myMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_exit_myMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        header_menuLayout.setVerticalGroup(
            header_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(header_menuLayout.createSequentialGroup()
                .addGroup(header_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_minimize_myMail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(header_menuLayout.createSequentialGroup()
                        .addComponent(panel_exit_myMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        bg_myDrive.add(header_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 30));

        menuBar_menu.setBackground(new java.awt.Color(153, 153, 153));

        panel_salir_myMail.setBackground(new java.awt.Color(153, 153, 153));
        panel_salir_myMail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_salir_myMailMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_salir_myMailMouseExited(evt);
            }
        });

        salir_myMail.setForeground(new java.awt.Color(255, 255, 255));
        salir_myMail.setText("Salir");

        javax.swing.GroupLayout panel_salir_myMailLayout = new javax.swing.GroupLayout(panel_salir_myMail);
        panel_salir_myMail.setLayout(panel_salir_myMailLayout);
        panel_salir_myMailLayout.setHorizontalGroup(
            panel_salir_myMailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_salir_myMailLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(salir_myMail)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_salir_myMailLayout.setVerticalGroup(
            panel_salir_myMailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(salir_myMail, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout menuBar_menuLayout = new javax.swing.GroupLayout(menuBar_menu);
        menuBar_menu.setLayout(menuBar_menuLayout);
        menuBar_menuLayout.setHorizontalGroup(
            menuBar_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuBar_menuLayout.createSequentialGroup()
                .addComponent(panel_salir_myMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 705, Short.MAX_VALUE))
        );
        menuBar_menuLayout.setVerticalGroup(
            menuBar_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuBar_menuLayout.createSequentialGroup()
                .addComponent(panel_salir_myMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bg_myDrive.add(menuBar_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 750, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_myDrive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_myDrive, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void label_minimize_myMailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_minimize_myMailMouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_label_minimize_myMailMouseClicked

    private void label_minimize_myMailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_minimize_myMailMouseEntered
        panel_minimize_myMail.setBackground(new Color(122, 96, 149));
    }//GEN-LAST:event_label_minimize_myMailMouseEntered

    private void label_minimize_myMailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_minimize_myMailMouseExited
        panel_minimize_myMail.setBackground(header_menu.getBackground());
    }//GEN-LAST:event_label_minimize_myMailMouseExited

    private void label_exit_myMailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_exit_myMailMouseClicked
        int yesno = JOptionPane.showConfirmDialog(this, "Salir y guardar cambios?", "Salir", 0);
        if (yesno == 0) {
            setVisible(false);
            new MenuPrincipal(indexCuenta).setVisible(true);
        } else {

        }
    }//GEN-LAST:event_label_exit_myMailMouseClicked

    private void label_exit_myMailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_exit_myMailMouseEntered
        panel_exit_myMail.setBackground(Color.red);
    }//GEN-LAST:event_label_exit_myMailMouseEntered

    private void label_exit_myMailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_exit_myMailMouseExited
        panel_exit_myMail.setBackground(header_menu.getBackground());
    }//GEN-LAST:event_label_exit_myMailMouseExited

    private void header_menuMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_header_menuMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_header_menuMouseDragged

    private void header_menuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_header_menuMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_header_menuMousePressed

    private void panel_salir_myMailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_salir_myMailMouseEntered
        panel_salir_myMail.setBackground(Color.LIGHT_GRAY);
        salir_myMail.setForeground(Color.BLACK);
    }//GEN-LAST:event_panel_salir_myMailMouseEntered

    private void panel_salir_myMailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_salir_myMailMouseExited
        panel_salir_myMail.setBackground(new Color(153, 153, 153));
        salir_myMail.setForeground(Color.WHITE);
    }//GEN-LAST:event_panel_salir_myMailMouseExited
    public void traerCuenta() {
        Dba db = new Dba("./DataBaseProyectoFinal.accdb");
        db.conectar();
        cuentas = new ArrayList();
        try {
            db.query.execute("select * from Cuentas");
            ResultSet rs = db.query.getResultSet();
            cuentas = new ArrayList();
            while (rs.next()) {
                Cuenta u = new Cuenta();
                u.setUser(rs.getString("usuario"));
                u.setContra(rs.getString("contra"));
                cuentas.add(u);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();

    }

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
            java.util.logging.Logger.getLogger(myMail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(myMail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(myMail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(myMail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new myMail(indexCuenta).setVisible(true);
            }
        });
    }
    private int xMouse;
    private int yMouse;
    private static int indexCuenta;
    private static ArrayList<Cuenta> cuentas;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg_myDrive;
    private javax.swing.JPanel header_menu;
    private javax.swing.JLabel label_exit_myMail;
    private javax.swing.JLabel label_minimize_myMail;
    private javax.swing.JPanel menuBar_menu;
    private javax.swing.JPanel panel_exit_myMail;
    private javax.swing.JPanel panel_minimize_myMail;
    private javax.swing.JPanel panel_salir_myMail;
    private javax.swing.JLabel salir_myMail;
    // End of variables declaration//GEN-END:variables
}