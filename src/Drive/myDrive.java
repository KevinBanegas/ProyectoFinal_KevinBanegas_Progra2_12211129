/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Drive;

import Conexiones.Dba;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import loginFrames.Administrador;
import loginFrames.Cuenta;
import loginFrames.DefaultLoginFrame;
import loginFrames.MenuPrincipal;

/**
 *
 * @author Usuario
 */
public class myDrive extends javax.swing.JFrame {

    /**
     * Creates new form myDrive
     *
     * @param indexCuenta
     * @param cuentas
     */
    public myDrive(int indexCuenta) {
        initComponents();
        traerCuenta();
        myDrive.indexCuenta = indexCuenta;
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
        panel_minimize_myDrive = new javax.swing.JPanel();
        label_minimize_myDrive = new javax.swing.JLabel();
        panel_exit_myDrive = new javax.swing.JPanel();
        label_exit_myDrive = new javax.swing.JLabel();

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

        panel_minimize_myDrive.setBackground(new java.awt.Color(122, 68, 149));

        label_minimize_myDrive.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        label_minimize_myDrive.setForeground(new java.awt.Color(255, 255, 255));
        label_minimize_myDrive.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_minimize_myDrive.setText("🗕");
        label_minimize_myDrive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_minimize_myDriveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_minimize_myDriveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_minimize_myDriveMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_minimize_myDriveLayout = new javax.swing.GroupLayout(panel_minimize_myDrive);
        panel_minimize_myDrive.setLayout(panel_minimize_myDriveLayout);
        panel_minimize_myDriveLayout.setHorizontalGroup(
            panel_minimize_myDriveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_minimize_myDriveLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label_minimize_myDrive, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_minimize_myDriveLayout.setVerticalGroup(
            panel_minimize_myDriveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_minimize_myDriveLayout.createSequentialGroup()
                .addComponent(label_minimize_myDrive)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panel_exit_myDrive.setBackground(new java.awt.Color(122, 68, 149));

        label_exit_myDrive.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        label_exit_myDrive.setForeground(new java.awt.Color(255, 255, 255));
        label_exit_myDrive.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_exit_myDrive.setText("🗙");
        label_exit_myDrive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_exit_myDriveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_exit_myDriveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_exit_myDriveMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_exit_myDriveLayout = new javax.swing.GroupLayout(panel_exit_myDrive);
        panel_exit_myDrive.setLayout(panel_exit_myDriveLayout);
        panel_exit_myDriveLayout.setHorizontalGroup(
            panel_exit_myDriveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_exit_myDriveLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label_exit_myDrive, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_exit_myDriveLayout.setVerticalGroup(
            panel_exit_myDriveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_exit_myDriveLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label_exit_myDrive, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout header_menuLayout = new javax.swing.GroupLayout(header_menu);
        header_menu.setLayout(header_menuLayout);
        header_menuLayout.setHorizontalGroup(
            header_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, header_menuLayout.createSequentialGroup()
                .addContainerGap(684, Short.MAX_VALUE)
                .addComponent(panel_minimize_myDrive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_exit_myDrive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        header_menuLayout.setVerticalGroup(
            header_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(header_menuLayout.createSequentialGroup()
                .addGroup(header_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_minimize_myDrive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(header_menuLayout.createSequentialGroup()
                        .addComponent(panel_exit_myDrive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        bg_myDrive.add(header_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 30));

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

    private void label_minimize_myDriveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_minimize_myDriveMouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_label_minimize_myDriveMouseClicked

    private void label_minimize_myDriveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_minimize_myDriveMouseEntered
        panel_minimize_myDrive.setBackground(new Color(122, 96, 149));
    }//GEN-LAST:event_label_minimize_myDriveMouseEntered

    private void label_minimize_myDriveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_minimize_myDriveMouseExited
        panel_minimize_myDrive.setBackground(header_menu.getBackground());
    }//GEN-LAST:event_label_minimize_myDriveMouseExited

    private void label_exit_myDriveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_exit_myDriveMouseClicked
        int yesno = JOptionPane.showConfirmDialog(this, "Salir y guardar cambios?", "Salir", 0);
        if (yesno == 0) {
            if ("Kevin".equals(cuentas.get(indexCuenta).getUser())) {
                setVisible(false);
                new Administrador(indexCuenta).setVisible(true);
            } else {
                setVisible(false);
                new MenuPrincipal(indexCuenta).setVisible(true);
            }
        }
    }//GEN-LAST:event_label_exit_myDriveMouseClicked

    private void label_exit_myDriveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_exit_myDriveMouseEntered
        panel_exit_myDrive.setBackground(Color.red);
    }//GEN-LAST:event_label_exit_myDriveMouseEntered

    private void label_exit_myDriveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_exit_myDriveMouseExited
        panel_exit_myDrive.setBackground(header_menu.getBackground());
    }//GEN-LAST:event_label_exit_myDriveMouseExited

    private void header_menuMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_header_menuMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_header_menuMouseDragged

    private void header_menuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_header_menuMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_header_menuMousePressed
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
            java.util.logging.Logger.getLogger(myDrive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(myDrive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(myDrive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(myDrive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new myDrive(indexCuenta).setVisible(true);
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
    private javax.swing.JLabel label_exit_myDrive;
    private javax.swing.JLabel label_minimize_myDrive;
    private javax.swing.JPanel panel_exit_myDrive;
    private javax.swing.JPanel panel_minimize_myDrive;
    // End of variables declaration//GEN-END:variables
}
