package loginFrames;

import Conexiones.Dba;
import Correo.myMail;
import Drive.myDrive;
import ToDo.myToDo;
import java.awt.Color;
import java.awt.Cursor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     *
     * @param indexCuenta
     * @param cuentas
     */
    public MenuPrincipal(int indexCuenta) {
        initComponents();
        traerCuenta();
        this.indexCuenta = indexCuenta;
        label_bienvenido_menu.setText("Bienvenido, " + cuentas.get(MenuPrincipal.indexCuenta).getUser());
        if (myDay) {
            ingresarMyDay.setEnabled(true);
        } else {
            if ("Kevin".equals(cuentas.get(MenuPrincipal.indexCuenta).getUser())) {
                ingresarMyDay.setEnabled(true);
            } else {
                ingresarMyDay.setEnabled(false);
            }
        }

        if (myDrive) {
            ingresarMyDrive.setEnabled(true);
        } else {
            if ("Kevin".equals(cuentas.get(MenuPrincipal.indexCuenta).getUser())) {
                ingresarMyDrive.setEnabled(true);
            } else {
                ingresarMyDrive.setEnabled(false);
            }
        }

        if (myMail) {
            ingresarMyMail.setEnabled(true);
        } else {
            if ("Kevin".equals(cuentas.get(MenuPrincipal.indexCuenta).getUser())) {
                ingresarMyMail.setEnabled(true);
            } else {
                ingresarMyMail.setEnabled(false);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel2 = new javax.swing.JPanel();
        header_menu = new javax.swing.JPanel();
        panel_minimize_menu = new javax.swing.JPanel();
        label_minimize_menu = new javax.swing.JLabel();
        panel_exit_menu = new javax.swing.JPanel();
        label_exit_menu = new javax.swing.JLabel();
        panel_bienvenido_menu = new javax.swing.JPanel();
        label_bienvenido_menu = new javax.swing.JLabel();
        ingresarMyDay = new javax.swing.JLabel();
        ingresarMyDrive = new javax.swing.JLabel();
        ingresarMyMail = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(252, 226, 219));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        panel_minimize_menu.setBackground(new java.awt.Color(122, 68, 149));

        label_minimize_menu.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        label_minimize_menu.setForeground(new java.awt.Color(255, 255, 255));
        label_minimize_menu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_minimize_menu.setText("🗕");
        label_minimize_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_minimize_menuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_minimize_menuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_minimize_menuMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_minimize_menuLayout = new javax.swing.GroupLayout(panel_minimize_menu);
        panel_minimize_menu.setLayout(panel_minimize_menuLayout);
        panel_minimize_menuLayout.setHorizontalGroup(
            panel_minimize_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_minimize_menuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label_minimize_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_minimize_menuLayout.setVerticalGroup(
            panel_minimize_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_minimize_menuLayout.createSequentialGroup()
                .addComponent(label_minimize_menu)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panel_exit_menu.setBackground(new java.awt.Color(122, 68, 149));

        label_exit_menu.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        label_exit_menu.setForeground(new java.awt.Color(255, 255, 255));
        label_exit_menu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_exit_menu.setText("🗙");
        label_exit_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_exit_menuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_exit_menuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_exit_menuMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_exit_menuLayout = new javax.swing.GroupLayout(panel_exit_menu);
        panel_exit_menu.setLayout(panel_exit_menuLayout);
        panel_exit_menuLayout.setHorizontalGroup(
            panel_exit_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_exit_menuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label_exit_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_exit_menuLayout.setVerticalGroup(
            panel_exit_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_exit_menuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label_exit_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout header_menuLayout = new javax.swing.GroupLayout(header_menu);
        header_menu.setLayout(header_menuLayout);
        header_menuLayout.setHorizontalGroup(
            header_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, header_menuLayout.createSequentialGroup()
                .addContainerGap(614, Short.MAX_VALUE)
                .addComponent(panel_minimize_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_exit_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        header_menuLayout.setVerticalGroup(
            header_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(header_menuLayout.createSequentialGroup()
                .addGroup(header_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_minimize_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(header_menuLayout.createSequentialGroup()
                        .addComponent(panel_exit_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2.add(header_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 30));

        panel_bienvenido_menu.setBackground(new java.awt.Color(178, 112, 162));

        label_bienvenido_menu.setFont(new java.awt.Font("Litera-Serial", 0, 24)); // NOI18N
        label_bienvenido_menu.setForeground(new java.awt.Color(255, 255, 255));
        label_bienvenido_menu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_bienvenido_menu.setText("Bienvenido, ");

        javax.swing.GroupLayout panel_bienvenido_menuLayout = new javax.swing.GroupLayout(panel_bienvenido_menu);
        panel_bienvenido_menu.setLayout(panel_bienvenido_menuLayout);
        panel_bienvenido_menuLayout.setHorizontalGroup(
            panel_bienvenido_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_bienvenido_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_bienvenido_menu, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_bienvenido_menuLayout.setVerticalGroup(
            panel_bienvenido_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_bienvenido_menu, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel2.add(panel_bienvenido_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 370, 40));

        ingresarMyDay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LogoMyDay-removebg-preview.png"))); // NOI18N
        ingresarMyDay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresarMyDayMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ingresarMyDayMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ingresarMyDayMouseExited(evt);
            }
        });
        jPanel2.add(ingresarMyDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 150, 150));

        ingresarMyDrive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LogoMyDrive-removebg-preview.png"))); // NOI18N
        ingresarMyDrive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresarMyDriveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ingresarMyDriveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ingresarMyDriveMouseExited(evt);
            }
        });
        jPanel2.add(ingresarMyDrive, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 150, 160));

        ingresarMyMail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LogoMyMail-removebg-preview.png"))); // NOI18N
        ingresarMyMail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresarMyMailMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ingresarMyMailMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ingresarMyMailMouseExited(evt);
            }
        });
        jPanel2.add(ingresarMyMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void label_minimize_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_minimize_menuMouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_label_minimize_menuMouseClicked

    private void label_minimize_menuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_minimize_menuMouseEntered
        panel_minimize_menu.setBackground(new Color(122, 96, 149));
    }//GEN-LAST:event_label_minimize_menuMouseEntered

    private void label_minimize_menuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_minimize_menuMouseExited
        panel_minimize_menu.setBackground(header_menu.getBackground());
    }//GEN-LAST:event_label_minimize_menuMouseExited

    private void label_exit_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_exit_menuMouseClicked
        int yesno = JOptionPane.showConfirmDialog(this, "Salir y guardar cambios?", "Salir", 0);
        if (yesno == 0) {
            setVisible(false);
            new FirstLoginFrame().setVisible(true);
        }
    }//GEN-LAST:event_label_exit_menuMouseClicked

    private void label_exit_menuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_exit_menuMouseEntered
        panel_exit_menu.setBackground(Color.red);
    }//GEN-LAST:event_label_exit_menuMouseEntered

    private void label_exit_menuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_exit_menuMouseExited
        panel_exit_menu.setBackground(header_menu.getBackground());
    }//GEN-LAST:event_label_exit_menuMouseExited

    private void header_menuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_header_menuMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_header_menuMousePressed

    private void header_menuMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_header_menuMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_header_menuMouseDragged

    private void ingresarMyDayMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarMyDayMouseEntered
        if (myDay) {
            setCursor(Cursor.HAND_CURSOR);
        } else {
            if ("Kevin".equals(cuentas.get(indexCuenta).getUser())) {
                setCursor(Cursor.HAND_CURSOR);
            }
        }
    }//GEN-LAST:event_ingresarMyDayMouseEntered

    private void ingresarMyDayMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarMyDayMouseExited
        if (myDay) {
            setCursor(Cursor.DEFAULT_CURSOR);
        } else {
            if ("Kevin".equals(cuentas.get(indexCuenta).getUser())) {
                setCursor(Cursor.DEFAULT_CURSOR);
            }
        }
    }//GEN-LAST:event_ingresarMyDayMouseExited

    private void ingresarMyDriveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarMyDriveMouseEntered
        if (myDrive) {
            setCursor(Cursor.HAND_CURSOR);
        } else {
            if ("Kevin".equals(cuentas.get(indexCuenta).getUser())) {
                setCursor(Cursor.HAND_CURSOR);
            }
        }
    }//GEN-LAST:event_ingresarMyDriveMouseEntered

    private void ingresarMyDriveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarMyDriveMouseExited
        if (myDrive) {
            setCursor(Cursor.DEFAULT_CURSOR);
        } else {
            if ("Kevin".equals(cuentas.get(indexCuenta).getUser())) {
                setCursor(Cursor.DEFAULT_CURSOR);
            }
        }
    }//GEN-LAST:event_ingresarMyDriveMouseExited

    private void ingresarMyMailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarMyMailMouseEntered
        if (myMail) {
            setCursor(Cursor.HAND_CURSOR);
        } else {
            if ("Kevin".equals(cuentas.get(indexCuenta).getUser())) {
                setCursor(Cursor.HAND_CURSOR);
            }
        }
    }//GEN-LAST:event_ingresarMyMailMouseEntered

    private void ingresarMyMailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarMyMailMouseExited
        if (myMail) {
            setCursor(Cursor.DEFAULT_CURSOR);
        } else {
            if ("Kevin".equals(cuentas.get(indexCuenta).getUser())) {
                setCursor(Cursor.DEFAULT_CURSOR);
            }
        }
    }//GEN-LAST:event_ingresarMyMailMouseExited

    private void ingresarMyDayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarMyDayMouseClicked
        if (myDay) {
            setVisible(false);
            new myToDo(indexCuenta).setVisible(true);
        } else {
            if ("Kevin".equals(cuentas.get(indexCuenta).getUser())) {
                setVisible(false);
                new myToDo(indexCuenta).setVisible(true);
            }
        }
    }//GEN-LAST:event_ingresarMyDayMouseClicked

    private void ingresarMyDriveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarMyDriveMouseClicked
        if (myDrive) {
            setVisible(false);
            new myDrive(indexCuenta).setVisible(true);
        } else {
            if ("Kevin".equals(cuentas.get(indexCuenta).getUser())) {
                setVisible(false);
                new myDrive(indexCuenta).setVisible(true);
            }
        }
    }//GEN-LAST:event_ingresarMyDriveMouseClicked

    private void ingresarMyMailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarMyMailMouseClicked
        if (myMail && !"Kevin".equals(cuentas.get(indexCuenta).getUser())) {
            setVisible(false);
            new myMail(indexCuenta).setVisible(true);
        } else {
            if ("Kevin".equals(cuentas.get(indexCuenta).getUser())) {
                setVisible(false);
                new myMail(indexCuenta).setVisible(true);
            }
        }
    }//GEN-LAST:event_ingresarMyMailMouseClicked
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
                u.setId(rs.getInt("id"));
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
                if ("FlatLaf".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal(indexCuenta).setVisible(true);
            }
        });
    }
    private int xMouse;
    private int yMouse;
    private static int indexCuenta;
    private static ArrayList<Cuenta> cuentas;
    public static boolean myDay = true;
    public static boolean myDrive = true;
    public static boolean myMail = true;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel header_menu;
    private javax.swing.JLabel ingresarMyDay;
    private javax.swing.JLabel ingresarMyDrive;
    private javax.swing.JLabel ingresarMyMail;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel label_bienvenido_menu;
    private javax.swing.JLabel label_exit_menu;
    private javax.swing.JLabel label_minimize_menu;
    private javax.swing.JPanel panel_bienvenido_menu;
    private javax.swing.JPanel panel_exit_menu;
    private javax.swing.JPanel panel_minimize_menu;
    // End of variables declaration//GEN-END:variables
}
