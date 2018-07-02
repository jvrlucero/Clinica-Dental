/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoclinicadental;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier
 */
public class frmSalas extends javax.swing.JFrame {

    /**
     * Creates new form frmSalas
     */
    class_Salas salas=new class_Salas();
    ResultSet rst_lista=null;    
    DefaultListModel modelo=new DefaultListModel();
    
    public frmSalas() {
        initComponents();
        llenarlista();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTemaSalas = new javax.swing.JLabel();
        txtSala = new javax.swing.JTextField();
        lblSalas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstSalasActuales = new javax.swing.JList<>();
        btnAgregarSalas = new javax.swing.JButton();
        lblSalasActuales = new javax.swing.JLabel();
        btnAtrasSalas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTemaSalas.setText("SALAS");
        getContentPane().add(lblTemaSalas, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 22, -1, -1));
        getContentPane().add(txtSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 59, 210, -1));

        lblSalas.setText("Sala:");
        getContentPane().add(lblSalas, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 65, -1, -1));

        lstSalasActuales.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstSalasActuales);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 140, 146, -1));

        btnAgregarSalas.setText("AGREGAR");
        getContentPane().add(btnAgregarSalas, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, -1));

        lblSalasActuales.setText("Salas Actuales");
        getContentPane().add(lblSalasActuales, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 118, -1, -1));

        btnAtrasSalas.setText("ATRAS");
        getContentPane().add(btnAtrasSalas, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, -1, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void llenarlista(){        
        try{
            modelo.removeAllElements();
            rst_lista=salas.LlenarListadeSalas();
            while (rst_lista.next()) 
                modelo.addElement(rst_lista.getString("Nombre_Sala").toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Error", 0);
                modelo.addElement("Error");
        }
        lstSalasActuales.setModel(modelo);
    }
    private void btnAgregarSalasActionPerformed(java.awt.event.ActionEvent evt) {                                                
        if(txtSala.getText().length()==0)
            JOptionPane.showMessageDialog(this, "No hay ninguna referencia para \nguardar el nombre de la sala");
        else{
            salas.insertar(txtSala.getText());
            JOptionPane.showMessageDialog(this, "Registro de nueva sala exitoso");
        }
            llenarlista();
    }                                               

    private void btnAtrasSalasActionPerformed(java.awt.event.ActionEvent evt) {                                              
        frmMenuPrincipal menu=new frmMenuPrincipal();
        this.dispose();
        menu.setVisible(true);
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
            java.util.logging.Logger.getLogger(frmSalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSalas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarSalas;
    private javax.swing.JButton btnAtrasSalas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSalas;
    private javax.swing.JLabel lblSalasActuales;
    private javax.swing.JLabel lblTemaSalas;
    private javax.swing.JList<String> lstSalasActuales;
    private javax.swing.JTextField txtSala;
    // End of variables declaration//GEN-END:variables
}
