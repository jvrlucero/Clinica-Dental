
package proyectoclinicadental;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


public class frmLogin extends javax.swing.JFrame {

    
    public frmLogin() {
        initComponents();
        this.setSize(jLabel1.getSize());
        lblTemaLogin.setFont(new java.awt.Font("Times New Roman", 0, 20)); 
        lblUser.setFont(new java.awt.Font("Times New Roman", 0, 20)); 
        lblPassword.setFont(new java.awt.Font("Times New Roman", 0, 20)); 
        txtPassword.setFont(new java.awt.Font("Times New Roman", 0, 20)); 
        txtUser.setFont(new java.awt.Font("Times New Roman", 0, 20)); 
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUser = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        lblTemaLogin = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUser.setText("User");
        getContentPane().add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 50, 20));

        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserKeyTyped(evt);
            }
        });
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 120, 30));

        lblPassword.setText("Password");
        getContentPane().add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 80, 30));

        lblTemaLogin.setText("LOG IN");
        getContentPane().add(lblTemaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 80, 30));

        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordKeyTyped(evt);
            }
        });
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 120, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cortedientes.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyTyped
        if(evt.getKeyChar()==KeyEvent.VK_ENTER)
        login();
    }//GEN-LAST:event_txtUserKeyTyped

    private void txtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyTyped
        if(evt.getKeyChar()==KeyEvent.VK_ENTER)
        login();
        else
        pass+=evt.getKeyChar();
    }//GEN-LAST:event_txtPasswordKeyTyped
                                        
    String pass="";
    private void login(){        
        if(txtPassword.getText().equals("root")&&txtUser.getText().equals("root")){
            frmMenuPrincipal menu=new frmMenuPrincipal();
            this.dispose();
            menu.setVisible(true);
        } else if(txtUser.getText().length()!=4||(!txtUser.getText().equals("root"))){
            JOptionPane.showMessageDialog(this, "Usuario incorrecto");
            txtUser.setText("");
            txtUser.requestFocus();
        } else if(pass.length()!=4||(!pass.equals("root"))){
            JOptionPane.showMessageDialog(this, "Contraseña incorrecta");
            txtPassword.setText("");
            txtPassword.requestFocus();
            pass="";
        }            
    }
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
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTemaLogin;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
