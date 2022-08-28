package loginFrames;

import java.awt.Color;
import java.awt.Cursor;
import static java.awt.event.KeyEvent.VK_ENTER;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DefaultLoginFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginFrame
     * @param cuentas
     */
    public DefaultLoginFrame(ArrayList<Cuenta> cuentas) {
        initComponents();
        this.cuentas = cuentas;
        textf_contra_iniciar.setEchoChar((char) 0);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_bg_iniciar = new javax.swing.JPanel();
        header_iniciar = new javax.swing.JPanel();
        panel_exit_iniciar = new javax.swing.JPanel();
        label_exit_inciar = new javax.swing.JLabel();
        panel_minimize_iniciar = new javax.swing.JPanel();
        label_minimize_iniciar = new javax.swing.JLabel();
        panel_iniciarSesion = new javax.swing.JPanel();
        label_iniciarSesion = new javax.swing.JLabel();
        img_myOffice = new javax.swing.JLabel();
        panel_contra_iniciar = new javax.swing.JPanel();
        textf_contra_iniciar = new javax.swing.JPasswordField();
        icon_contra_iniciar = new javax.swing.JLabel();
        icon_visualize_iniciar = new javax.swing.JLabel();
        panel_usuario_iniciar = new javax.swing.JPanel();
        textf_usuario_iniciar = new javax.swing.JTextField();
        icon_usuario_iniciar = new javax.swing.JLabel();
        panel_ingresar_iniciar = new javax.swing.JPanel();
        label_ingresar_iniciar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        panel_bg_iniciar.setBackground(new java.awt.Color(252, 226, 219));
        panel_bg_iniciar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header_iniciar.setBackground(new java.awt.Color(122, 68, 149));
        header_iniciar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                header_iniciarMouseDragged(evt);
            }
        });
        header_iniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                header_iniciarMousePressed(evt);
            }
        });

        panel_exit_iniciar.setBackground(new java.awt.Color(122, 68, 149));

        label_exit_inciar.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        label_exit_inciar.setForeground(new java.awt.Color(255, 255, 255));
        label_exit_inciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_exit_inciar.setText("🗙");
        label_exit_inciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_exit_inciarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_exit_inciarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_exit_inciarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_exit_iniciarLayout = new javax.swing.GroupLayout(panel_exit_iniciar);
        panel_exit_iniciar.setLayout(panel_exit_iniciarLayout);
        panel_exit_iniciarLayout.setHorizontalGroup(
            panel_exit_iniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_exit_iniciarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label_exit_inciar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_exit_iniciarLayout.setVerticalGroup(
            panel_exit_iniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_exit_inciar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        panel_minimize_iniciar.setBackground(new java.awt.Color(122, 68, 149));

        label_minimize_iniciar.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        label_minimize_iniciar.setForeground(new java.awt.Color(255, 255, 255));
        label_minimize_iniciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_minimize_iniciar.setText("🗕");
        label_minimize_iniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_minimize_iniciarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_minimize_iniciarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_minimize_iniciarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_minimize_iniciarLayout = new javax.swing.GroupLayout(panel_minimize_iniciar);
        panel_minimize_iniciar.setLayout(panel_minimize_iniciarLayout);
        panel_minimize_iniciarLayout.setHorizontalGroup(
            panel_minimize_iniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_minimize_iniciarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label_minimize_iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_minimize_iniciarLayout.setVerticalGroup(
            panel_minimize_iniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_minimize_iniciar, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout header_iniciarLayout = new javax.swing.GroupLayout(header_iniciar);
        header_iniciar.setLayout(header_iniciarLayout);
        header_iniciarLayout.setHorizontalGroup(
            header_iniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, header_iniciarLayout.createSequentialGroup()
                .addGap(0, 334, Short.MAX_VALUE)
                .addComponent(panel_minimize_iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_exit_iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        header_iniciarLayout.setVerticalGroup(
            header_iniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(header_iniciarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(header_iniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_minimize_iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_exit_iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_bg_iniciar.add(header_iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 30));

        panel_iniciarSesion.setBackground(new java.awt.Color(178, 112, 162));
        panel_iniciarSesion.setForeground(new java.awt.Color(255, 255, 255));

        label_iniciarSesion.setFont(new java.awt.Font("Litera-Serial", 0, 30)); // NOI18N
        label_iniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        label_iniciarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_iniciarSesion.setText("INICIAR SESION");

        javax.swing.GroupLayout panel_iniciarSesionLayout = new javax.swing.GroupLayout(panel_iniciarSesion);
        panel_iniciarSesion.setLayout(panel_iniciarSesionLayout);
        panel_iniciarSesionLayout.setHorizontalGroup(
            panel_iniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_iniciarSesionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_iniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_iniciarSesionLayout.setVerticalGroup(
            panel_iniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_iniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panel_bg_iniciar.add(panel_iniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 270, 50));

        img_myOffice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/resized-removebg-preview.png"))); // NOI18N
        img_myOffice.setText("jLabel5");
        panel_bg_iniciar.add(img_myOffice, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 140, 130));

        panel_contra_iniciar.setBackground(new java.awt.Color(204, 153, 255));

        textf_contra_iniciar.setBackground(new java.awt.Color(204, 153, 255));
        textf_contra_iniciar.setFont(new java.awt.Font("Litera-Serial", 0, 14)); // NOI18N
        textf_contra_iniciar.setForeground(new java.awt.Color(255, 255, 255));
        textf_contra_iniciar.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textf_contra_iniciar.setText("Contraseña");
        textf_contra_iniciar.setBorder(null);
        textf_contra_iniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textf_contra_iniciarMousePressed(evt);
            }
        });
        textf_contra_iniciar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textf_contra_iniciarKeyPressed(evt);
            }
        });

        icon_contra_iniciar.setBackground(new java.awt.Color(255, 0, 51));
        icon_contra_iniciar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        icon_contra_iniciar.setForeground(new java.awt.Color(255, 255, 255));
        icon_contra_iniciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_contra_iniciar.setText("🔒");

        icon_visualize_iniciar.setBackground(new java.awt.Color(255, 0, 51));
        icon_visualize_iniciar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        icon_visualize_iniciar.setForeground(new java.awt.Color(255, 255, 255));
        icon_visualize_iniciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_visualize_iniciar.setText("👁");
        icon_visualize_iniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon_visualize_iniciarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_contra_iniciarLayout = new javax.swing.GroupLayout(panel_contra_iniciar);
        panel_contra_iniciar.setLayout(panel_contra_iniciarLayout);
        panel_contra_iniciarLayout.setHorizontalGroup(
            panel_contra_iniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_contra_iniciarLayout.createSequentialGroup()
                .addComponent(icon_contra_iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textf_contra_iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(icon_visualize_iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_contra_iniciarLayout.setVerticalGroup(
            panel_contra_iniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_contra_iniciarLayout.createSequentialGroup()
                .addGroup(panel_contra_iniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textf_contra_iniciar, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_contra_iniciarLayout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addComponent(icon_contra_iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(icon_visualize_iniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2))
        );

        panel_bg_iniciar.add(panel_contra_iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 210, 30));

        panel_usuario_iniciar.setBackground(new java.awt.Color(204, 153, 255));

        textf_usuario_iniciar.setBackground(new java.awt.Color(204, 153, 255));
        textf_usuario_iniciar.setFont(new java.awt.Font("Litera-Serial", 0, 14)); // NOI18N
        textf_usuario_iniciar.setForeground(new java.awt.Color(255, 255, 255));
        textf_usuario_iniciar.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textf_usuario_iniciar.setText("Usuario");
        textf_usuario_iniciar.setBorder(null);
        textf_usuario_iniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textf_usuario_iniciarMousePressed(evt);
            }
        });
        textf_usuario_iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textf_usuario_iniciarActionPerformed(evt);
            }
        });
        textf_usuario_iniciar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textf_usuario_iniciarKeyPressed(evt);
            }
        });

        icon_usuario_iniciar.setBackground(new java.awt.Color(255, 0, 51));
        icon_usuario_iniciar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        icon_usuario_iniciar.setForeground(new java.awt.Color(255, 255, 255));
        icon_usuario_iniciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_usuario_iniciar.setText("👤 ");
        icon_usuario_iniciar.setMaximumSize(new java.awt.Dimension(22, 19));
        icon_usuario_iniciar.setMinimumSize(new java.awt.Dimension(22, 19));

        javax.swing.GroupLayout panel_usuario_iniciarLayout = new javax.swing.GroupLayout(panel_usuario_iniciar);
        panel_usuario_iniciar.setLayout(panel_usuario_iniciarLayout);
        panel_usuario_iniciarLayout.setHorizontalGroup(
            panel_usuario_iniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_usuario_iniciarLayout.createSequentialGroup()
                .addComponent(icon_usuario_iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(textf_usuario_iniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
        );
        panel_usuario_iniciarLayout.setVerticalGroup(
            panel_usuario_iniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_usuario_iniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(textf_usuario_iniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addComponent(icon_usuario_iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel_bg_iniciar.add(panel_usuario_iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 210, 30));

        panel_ingresar_iniciar.setBackground(new java.awt.Color(178, 112, 162));

        label_ingresar_iniciar.setFont(new java.awt.Font("Litera-Serial", 0, 18)); // NOI18N
        label_ingresar_iniciar.setForeground(new java.awt.Color(255, 255, 255));
        label_ingresar_iniciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_ingresar_iniciar.setText("INGRESAR");
        label_ingresar_iniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_ingresar_iniciarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_ingresar_iniciarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_ingresar_iniciarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                label_ingresar_iniciarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panel_ingresar_iniciarLayout = new javax.swing.GroupLayout(panel_ingresar_iniciar);
        panel_ingresar_iniciar.setLayout(panel_ingresar_iniciarLayout);
        panel_ingresar_iniciarLayout.setHorizontalGroup(
            panel_ingresar_iniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_ingresar_iniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        panel_ingresar_iniciarLayout.setVerticalGroup(
            panel_ingresar_iniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_ingresar_iniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panel_bg_iniciar.add(panel_ingresar_iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 90, 40));

        jLabel1.setFont(new java.awt.Font("Litera-Serial", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(178, 112, 162));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("No tienes cuenta? Registrate!");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        panel_bg_iniciar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 210, -1));

        jLabel3.setFont(new java.awt.Font("Litera-Serial", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Usuario no Existe. Intente de Nuevo.");
        panel_bg_iniciar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 230, -1));

        jLabel4.setFont(new java.awt.Font("Litera-Serial", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Ingrese un Usuario");
        panel_bg_iniciar.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 120, -1));

        jLabel5.setFont(new java.awt.Font("Litera-Serial", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Ingrese una Contraseña.");
        panel_bg_iniciar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 140, -1));

        jLabel6.setFont(new java.awt.Font("Litera-Serial", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Contraseña Incorrecta. Intente de Nuevo.");
        panel_bg_iniciar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 230, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_bg_iniciar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_bg_iniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void label_exit_inciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_exit_inciarMouseEntered
        panel_exit_iniciar.setBackground(Color.red);
    }//GEN-LAST:event_label_exit_inciarMouseEntered

    private void label_minimize_iniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_minimize_iniciarMouseEntered
        panel_minimize_iniciar.setBackground(new Color(122, 96, 149));
    }//GEN-LAST:event_label_minimize_iniciarMouseEntered

    private void label_exit_inciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_exit_inciarMouseExited
        panel_exit_iniciar.setBackground(header_iniciar.getBackground());
    }//GEN-LAST:event_label_exit_inciarMouseExited

    private void label_minimize_iniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_minimize_iniciarMouseExited
        panel_minimize_iniciar.setBackground(header_iniciar.getBackground());
    }//GEN-LAST:event_label_minimize_iniciarMouseExited

    private void label_exit_inciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_exit_inciarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_label_exit_inciarMouseClicked

    private void label_minimize_iniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_minimize_iniciarMouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_label_minimize_iniciarMouseClicked

    private void header_iniciarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_header_iniciarMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_header_iniciarMousePressed

    private void header_iniciarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_header_iniciarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_header_iniciarMouseDragged

    private void textf_usuario_iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textf_usuario_iniciarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textf_usuario_iniciarActionPerformed

    private void textf_usuario_iniciarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textf_usuario_iniciarMousePressed
        if (textf_usuario_iniciar.getText().equals("Usuario")) {
            textf_usuario_iniciar.setText("");
            textf_usuario_iniciar.setForeground(Color.WHITE);
        }

        if (String.valueOf(textf_contra_iniciar.getPassword()).isEmpty()) {
            textf_contra_iniciar.setEchoChar((char) 0);
            textf_contra_iniciar.setText("Contraseña");
            textf_contra_iniciar.setForeground(Color.WHITE);
            bruh = 0;
        }
    }//GEN-LAST:event_textf_usuario_iniciarMousePressed

    private void textf_contra_iniciarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textf_contra_iniciarMousePressed
        if (textf_usuario_iniciar.getText().isEmpty()) {
            textf_usuario_iniciar.setText("Usuario");
            textf_usuario_iniciar.setForeground(Color.WHITE);
        }

        if (String.valueOf(textf_contra_iniciar.getPassword()).equals("Contraseña")) {
            textf_contra_iniciar.setText("");
            textf_contra_iniciar.setForeground(Color.WHITE);
            textf_contra_iniciar.setEchoChar('*');
            bruh = 0;
        }
    }//GEN-LAST:event_textf_contra_iniciarMousePressed

    private void textf_usuario_iniciarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textf_usuario_iniciarKeyPressed
        if (evt.getKeyCode() == VK_ENTER) {
            textf_contra_iniciar.requestFocus();
            if (textf_usuario_iniciar.getText().isEmpty()) {
                textf_usuario_iniciar.setText("Usuario");
                textf_usuario_iniciar.setForeground(Color.WHITE);
            }

            if (String.valueOf(textf_contra_iniciar.getPassword()).equals("Contraseña")) {
                textf_contra_iniciar.setText("");
                textf_contra_iniciar.setForeground(Color.WHITE);
                textf_contra_iniciar.setEchoChar('*');
                bruh = 0;
            }
        }
    }//GEN-LAST:event_textf_usuario_iniciarKeyPressed

    private void label_ingresar_iniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_ingresar_iniciarMouseClicked
        if (textf_usuario_iniciar.getText().isEmpty() || textf_usuario_iniciar.getText().equals("Usuario")) {
            jLabel4.setVisible(true);
            jLabel3.setVisible(false);
            jLabel5.setVisible(false);
            jLabel6.setVisible(false);
        } else if (textf_contra_iniciar.getText().isEmpty() || textf_contra_iniciar.getText().equals("Contraseña")) {
            jLabel5.setVisible(true);
            jLabel3.setVisible(false);
            jLabel4.setVisible(false);
            jLabel6.setVisible(false);
        } else {
            int verU = 0, verC = 0, indexCuenta=0;
            for (Cuenta usuario : cuentas) {
                if (usuario.getUser().equals(textf_usuario_iniciar.getText())) {
                    verU = 1;
                }
                if (usuario.getContra().equals(textf_contra_iniciar.getText())) {
                    verC = 1;
                }
                if(usuario.getContra().equals(textf_contra_iniciar.getText()) && usuario.getUser().equals(textf_usuario_iniciar.getText())){
                    indexCuenta = cuentas.indexOf(usuario);
                }
            }
            if (verU == 1 && verC == 1) {
                JOptionPane.showMessageDialog(this, "Ingresado Exitosamente", "Ingresado", 1);
                textf_contra_iniciar.setText("Contraseña");
                textf_usuario_iniciar.setText("Usuario");
                setVisible(false);
                new MenuPrincipal(indexCuenta, cuentas).setVisible(true);
            } else if (verU == 0) {
                jLabel3.setVisible(true);
                jLabel4.setVisible(false);
                jLabel5.setVisible(false);
                jLabel6.setVisible(false);
            } else if (verC == 0) {
                jLabel6.setVisible(true);
                jLabel4.setVisible(false);
                jLabel5.setVisible(false);
                jLabel3.setVisible(false);

            }
        }

    }//GEN-LAST:event_label_ingresar_iniciarMouseClicked

    private void textf_contra_iniciarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textf_contra_iniciarKeyPressed
        if (evt.getKeyCode() == VK_ENTER) {
            label_ingresar_iniciarMouseClicked(new java.awt.event.MouseEvent(this, 1, 1, 1, 1, 1, 1, rootPaneCheckingEnabled));
        }
    }//GEN-LAST:event_textf_contra_iniciarKeyPressed

    private void label_ingresar_iniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_ingresar_iniciarMouseEntered
        panel_ingresar_iniciar.setBackground(new Color(204, 122, 241));
    }//GEN-LAST:event_label_ingresar_iniciarMouseEntered

    private void label_ingresar_iniciarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_ingresar_iniciarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_label_ingresar_iniciarMousePressed

    private void label_ingresar_iniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_ingresar_iniciarMouseExited
        panel_ingresar_iniciar.setBackground(new Color(178, 112, 162));
    }//GEN-LAST:event_label_ingresar_iniciarMouseExited

    private void icon_visualize_iniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon_visualize_iniciarMouseClicked
        if (bruh == 0 && !"Contraseña".equals(textf_contra_iniciar.getText())) {
            textf_contra_iniciar.setEchoChar((char) 0);
            bruh = 1;
        } else if (bruh == 1 && !"Contraseña".equals(textf_contra_iniciar.getText())) {
            textf_contra_iniciar.setEchoChar('*');
            bruh = 0;
        } else {
            bruh = 0;
        }
    }//GEN-LAST:event_icon_visualize_iniciarMouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        new NewUser(cuentas).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(DefaultLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DefaultLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DefaultLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DefaultLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DefaultLoginFrame(cuentas).setVisible(true);
            }
        });
    }
    private static ArrayList<Cuenta> cuentas;
    private int xMouse;
    private int yMouse;
    private int bruh = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel header_iniciar;
    private javax.swing.JLabel icon_contra_iniciar;
    private javax.swing.JLabel icon_usuario_iniciar;
    private javax.swing.JLabel icon_visualize_iniciar;
    private javax.swing.JLabel img_myOffice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel label_exit_inciar;
    private javax.swing.JLabel label_ingresar_iniciar;
    private javax.swing.JLabel label_iniciarSesion;
    private javax.swing.JLabel label_minimize_iniciar;
    private javax.swing.JPanel panel_bg_iniciar;
    private javax.swing.JPanel panel_contra_iniciar;
    private javax.swing.JPanel panel_exit_iniciar;
    private javax.swing.JPanel panel_ingresar_iniciar;
    private javax.swing.JPanel panel_iniciarSesion;
    private javax.swing.JPanel panel_minimize_iniciar;
    private javax.swing.JPanel panel_usuario_iniciar;
    private javax.swing.JPasswordField textf_contra_iniciar;
    private javax.swing.JTextField textf_usuario_iniciar;
    // End of variables declaration//GEN-END:variables
}
