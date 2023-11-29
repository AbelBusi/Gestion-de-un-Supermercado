package vista;

import controlador.CRT_USUARIOS;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import modelo.USUARIO;

/**
 *
 * @author Edison Zambrano
 */
public class FrmLogin extends javax.swing.JFrame {

    public FrmLogin() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Login - SISTEMA DE VENTAS");
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        LabelPass = new javax.swing.JLabel();
        labelIniciar = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        txtUsuario = new javax.swing.JTextField();
        labelUsuario = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        txtPass = new javax.swing.JPasswordField();
        panelentrar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(164, 156, 152));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitulo.setFont(new java.awt.Font("Baskerville Old Face", 1, 48)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Sistema de Ventas");
        jPanel1.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 380, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 710));

        jPanel2.setBackground(new java.awt.Color(236, 196, 156));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelPass.setFont(new java.awt.Font("Palace Script MT", 1, 48)); // NOI18N
        LabelPass.setForeground(new java.awt.Color(0, 0, 0));
        LabelPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelPass.setText("Password");
        jPanel2.add(LabelPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 180, -1));

        labelIniciar.setFont(new java.awt.Font("Baskerville Old Face", 1, 36)); // NOI18N
        labelIniciar.setForeground(new java.awt.Color(0, 0, 0));
        labelIniciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIniciar.setText("Iniciar Sesión");
        jPanel2.add(labelIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 319, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 270, 30));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 270, 30));

        txtUsuario.setBackground(new java.awt.Color(0, 0, 0));
        txtUsuario.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jPanel2.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 350, 50));

        labelUsuario.setFont(new java.awt.Font("Palace Script MT", 1, 48)); // NOI18N
        labelUsuario.setForeground(new java.awt.Color(0, 0, 0));
        labelUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUsuario.setText("Usuario");
        jPanel2.add(labelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 180, 40));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 270, 30));

        txtPass.setBackground(new java.awt.Color(0, 0, 0));
        txtPass.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtPass.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 350, 50));

        panelentrar.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Palace Script MT", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("        Ingresar");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelentrarLayout = new javax.swing.GroupLayout(panelentrar);
        panelentrar.setLayout(panelentrarLayout);
        panelentrarLayout.setHorizontalGroup(
            panelentrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );
        panelentrarLayout.setVerticalGroup(
            panelentrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel2.add(panelentrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 560, 240, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 460, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        login();
        

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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel labelIniciar;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JPanel panelentrar;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    private void login() {
        if (!txtUsuario.getText().isEmpty() && !txtPass.getText().isEmpty()) {
            CRT_USUARIOS controlUsuario = new CRT_USUARIOS();
            USUARIO usuario = new USUARIO();
            usuario.setUsuario(txtUsuario.getText().trim());
            usuario.setPassword(txtPass.getText().trim());

            try {
                if (controlUsuario.LOGIN_USER(usuario)) {
                    JOptionPane.showMessageDialog(null, "Login correcto");
                    FRM_MENU entrarMenu = new FRM_MENU();
                    entrarMenu.setVisible(true);
                    this.setVisible(false);

                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o clave incorrecta");
                }
            } catch (Exception e) {
                e.printStackTrace(); // o manejar la excepción de manera adecuada
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese sus credenciales");
        }
    }
}
