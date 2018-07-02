
package proyectoclinicadental;

import java.awt.Color;
import javax.swing.JOptionPane;

public class frmClientes extends javax.swing.JFrame {

    
    public frmClientes() {
        initComponents();
        lblTemaClientes.setForeground(Color.red);
        
        lblTemaClientes.setFont(new java.awt.Font("Times New Roman", 0, 20)); 
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTemaClientes = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellidoCliente = new javax.swing.JLabel();
        lblTelefonoCliente = new javax.swing.JLabel();
        lblEdadCliente = new javax.swing.JLabel();
        lblDireccionCliente = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        txtApellidoCliente = new javax.swing.JTextField();
        txtTelefonoCliente = new javax.swing.JTextField();
        txtEdadCliente = new javax.swing.JTextField();
        txtDireccionCliente = new javax.swing.JTextField();
        btnAgregarCliente = new javax.swing.JToggleButton();
        btnLimpiarCliente = new javax.swing.JToggleButton();
        btnRegresarCliente = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTemaClientes.setForeground(new java.awt.Color(255, 0, 0));
        lblTemaClientes.setText("Administracion de Clientes");
        getContentPane().add(lblTemaClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 220, 30));

        lblNombre.setForeground(new java.awt.Color(204, 204, 0));
        lblNombre.setText("Nombre");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, 20));

        lblApellidoCliente.setForeground(new java.awt.Color(51, 255, 153));
        lblApellidoCliente.setText("Apellido");
        getContentPane().add(lblApellidoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        lblTelefonoCliente.setForeground(new java.awt.Color(102, 255, 102));
        lblTelefonoCliente.setText("Telefono");
        getContentPane().add(lblTelefonoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        lblEdadCliente.setForeground(new java.awt.Color(0, 255, 255));
        lblEdadCliente.setText("Edad");
        getContentPane().add(lblEdadCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        lblDireccionCliente.setForeground(new java.awt.Color(255, 0, 0));
        lblDireccionCliente.setText("Direccion");
        lblDireccionCliente.setToolTipText("");
        getContentPane().add(lblDireccionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 70, 30));

        txtNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreClienteActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 270, 30));
        getContentPane().add(txtApellidoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 270, -1));
        getContentPane().add(txtTelefonoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 120, -1));
        getContentPane().add(txtEdadCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 60, -1));
        getContentPane().add(txtDireccionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 270, -1));

        btnAgregarCliente.setText("AGREGAR");
        getContentPane().add(btnAgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 120, -1));

        btnLimpiarCliente.setText("LIMPIAR");
        getContentPane().add(btnLimpiarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 90, -1));

        btnRegresarCliente.setText("REGRESAR");
        getContentPane().add(btnRegresarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 120, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1250, 840));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarCliente() {
       class_Clientes cli=new class_Clientes();
       cli.insertar(txtNombreCliente.getText(), txtApellidoCliente.getText(), txtTelefonoCliente.getText(), txtDireccionCliente.getText(), txtEdadCliente.getText());
       Mensajes("El registro del nuevo cliente se ha logrado con éxito");
    }
    private void Mensajes(String Men){
        JOptionPane.showMessageDialog(this, Men);
    }
    private void comprobarcampos(){
        String mens="";
        if(txtNombreCliente.getText().isEmpty())
            mens=("No ha ingresado el nombre\n");
        if(txtApellidoCliente.getText().isEmpty())
            mens+=("No ha ingresado apellidos\n");
        if(txtTelefonoCliente.getText().isEmpty())
            mens+=("No ha ingresado el nombre\n");
        if(txtDireccionCliente.getText().isEmpty())
            mens+=("No ha ingresado apellidos\n");
        if(txtEdadCliente.getText().isEmpty())
            mens+=("No ha ingresado el nombre\n");
        if(!mens.equals(""))
            Mensajes(mens);
        else 
            RegistrarCliente();
        mens="";
    }
    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {                                                  
       comprobarcampos();
    }                                                 

    private void txtNombreClienteKeyTyped(java.awt.event.KeyEvent evt) {                                          
        if(txtNombreCliente.getText().length()==50)
            evt.consume();
        if(!Character.isLetter(evt.getKeyChar()))
            evt.consume();
    }                                         

    private void txtApellidoClienteKeyTyped(java.awt.event.KeyEvent evt) {                                            
        if(txtApellidoCliente.getText().length()==50)
            evt.consume();
        if(!Character.isLetter(evt.getKeyChar()))
            evt.consume();
    }                                           

    private void txtTelefonoClienteKeyTyped(java.awt.event.KeyEvent evt) {                                            
        if(txtTelefonoCliente.getText().length()==8)
            evt.consume();
        if(!Character.isDigit(evt.getKeyChar()))
            evt.consume();
    }                                           

    private void txtDireccionClienteKeyTyped(java.awt.event.KeyEvent evt) {                                             
        if(txtDireccionCliente.getText().length()==100)
            evt.consume();
    }                                            

    private void txtEdadClienteKeyTyped(java.awt.event.KeyEvent evt) {                                        
        if(txtEdadCliente.getText().length()==2)
            evt.consume();
    }                                       

    private void btnLimpiarClienteActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        txtNombreCliente.setText("");
        txtApellidoCliente.setText("");
        txtTelefonoCliente.setText("");
        txtEdadCliente.setText("");
        txtDireccionCliente.setText("");
    }                                                 

    private void btnRegresarClienteActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        frmMenuPrincipal menu=new frmMenuPrincipal();
        this.dispose();
        menu.setVisible(true);
    }                                                  

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        frmHistorialCliente HC=new frmHistorialCliente();
        this.dispose();
        HC.setVisible(true);
    }
    
    private void txtNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreClienteActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtNombreClienteActionPerformed

    
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
            java.util.logging.Logger.getLogger(frmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAgregarCliente;
    private javax.swing.JToggleButton btnLimpiarCliente;
    private javax.swing.JToggleButton btnRegresarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblApellidoCliente;
    private javax.swing.JLabel lblDireccionCliente;
    private javax.swing.JLabel lblEdadCliente;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefonoCliente;
    private javax.swing.JLabel lblTemaClientes;
    private javax.swing.JTextField txtApellidoCliente;
    private javax.swing.JTextField txtDireccionCliente;
    private javax.swing.JTextField txtEdadCliente;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtTelefonoCliente;
    // End of variables declaration//GEN-END:variables
}
