/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoclinicadental;

import com.sun.glass.events.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier
 */
public class frmHistorialCliente extends javax.swing.JFrame {

    /**
     * Creates new form frmHistorialCliente
     */    
    class_HistorialMedico HistMed=new class_HistorialMedico();
    ResultSet rst_lista=null;    
    DefaultComboBoxModel modelo=new DefaultComboBoxModel();
    public frmHistorialCliente() {
        initComponents();
        llenarlista();
        this.setSize(480,363);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTemaHistorial = new javax.swing.JLabel();
        lblHistorialMedico = new javax.swing.JLabel();
        txtHistorialMedico = new javax.swing.JTextField();
        lblTratamientoMedico = new javax.swing.JLabel();
        txtTratamientoMedico = new javax.swing.JTextField();
        lblFechaInicio = new javax.swing.JLabel();
        txtFechaInicio = new javax.swing.JTextField();
        lblFechaFin = new javax.swing.JLabel();
        txtFechaFin = new javax.swing.JTextField();
        btnAgregarHistorial = new javax.swing.JButton();
        btnAtrasHistorial = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTemaHistorial.setText("Historial Medico");
        getContentPane().add(lblTemaHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 31, -1, -1));

        lblHistorialMedico.setText("Historial Medico:");
        getContentPane().add(lblHistorialMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 128, -1, -1));

        txtHistorialMedico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHistorialMedicoKeyTyped(evt);
            }
        });
        getContentPane().add(txtHistorialMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 122, 278, -1));

        lblTratamientoMedico.setText("Tratamiento Medico:");
        getContentPane().add(lblTratamientoMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 182, -1, -1));

        txtTratamientoMedico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTratamientoMedicoKeyTyped(evt);
            }
        });
        getContentPane().add(txtTratamientoMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 176, 258, -1));

        lblFechaInicio.setText("Fecha Inicio:");
        getContentPane().add(lblFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 243, -1, -1));

        txtFechaInicio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFechaInicioFocusGained(evt);
            }
        });
        txtFechaInicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaInicioKeyTyped(evt);
            }
        });
        getContentPane().add(txtFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 240, 112, -1));

        lblFechaFin.setText("Fecha Fin:");
        getContentPane().add(lblFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 243, -1, -1));

        txtFechaFin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFechaFinFocusGained(evt);
            }
        });
        txtFechaFin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaFinKeyTyped(evt);
            }
        });
        getContentPane().add(txtFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 240, 117, -1));

        btnAgregarHistorial.setText("AGREGAR");
        btnAgregarHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarHistorialActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 286, -1, -1));

        btnAtrasHistorial.setText("ATRAS");
        getContentPane().add(btnAtrasHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 286, -1, -1));

        jLabel2.setText("Cliente:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 77, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 74, 332, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fundo-azul.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, -40, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtHistorialMedicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHistorialMedicoKeyTyped
        if(txtHistorialMedico.getText().length()==100)
            evt.consume();
    }//GEN-LAST:event_txtHistorialMedicoKeyTyped

    private void txtTratamientoMedicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTratamientoMedicoKeyTyped
        if(txtTratamientoMedico.getText().length()==100)
            evt.consume();
    }//GEN-LAST:event_txtTratamientoMedicoKeyTyped

    private void txtFechaInicioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaInicioKeyTyped
        if ((!Character.isDigit(evt.getKeyChar()))||(txtFechaInicio.getText().length()==10))
        evt.consume();
        if((KeyEvent.VK_BACKSPACE!=evt.getKeyCode())&&(evt.getKeyChar()!='')){
            if((txtFechaInicio.getText().length()==2)||(txtFechaInicio.getText().length()==5))
            txtFechaInicio.setText(txtFechaInicio.getText()+"/");
        }
    }//GEN-LAST:event_txtFechaInicioKeyTyped

    private void txtFechaFinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaFinKeyTyped
        if ((!Character.isDigit(evt.getKeyChar()))||(txtFechaFin.getText().length()==10))
        evt.consume();
        if((KeyEvent.VK_BACKSPACE!=evt.getKeyCode())&&(evt.getKeyChar()!='')){
            if((txtFechaFin.getText().length()==2)||(txtFechaFin.getText().length()==5))
            txtFechaFin.setText(txtFechaFin.getText()+"/");
        }
    }//GEN-LAST:event_txtFechaFinKeyTyped

    private void btnAgregarHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarHistorialActionPerformed
        if(txtFechaInicio.getText().equals("dd/mm/aaaa")||txtFechaInicio.getText().isEmpty())
            JOptionPane.showMessageDialog(this, "Ingrese una fecha válida de inicio del tratamiento");
        else if(txtFechaFin.getText().equals("dd/mm/aaaa")||txtFechaFin.getText().isEmpty())
            JOptionPane.showMessageDialog(this, "Ingrese una fecha válida de fin del tratamiento");            
        else if(txtHistorialMedico.getText().length()<2)
            JOptionPane.showMessageDialog(this, "Ingrese algo representativo para el historial médico");
        else if(txtTratamientoMedico.getText().length()<2)
            JOptionPane.showMessageDialog(this, "Ingrese algo representativo de su tratamiento");
        else 
        RegistrarHistMed();
    }//GEN-LAST:event_btnAgregarHistorialActionPerformed

    private void txtFechaInicioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFechaInicioFocusGained
        if(txtFechaInicio.getText().equals("dd/mm/aaaa"))
            txtFechaInicio.setText("");
    }//GEN-LAST:event_txtFechaInicioFocusGained

    private void txtFechaFinFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFechaFinFocusGained
        if(txtFechaFin.getText().equals("dd/mm/aaaa"))
            txtFechaFin.setText("");
    }//GEN-LAST:event_txtFechaFinFocusGained

    private void llenarlista(){        
        try{
            modelo.removeAllElements();
            rst_lista=HistMed.ListaClientes();
            while (rst_lista.next()) 
                modelo.addElement(rst_lista.getString(1)+" "+rst_lista.getString(2));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Error", 0);
                modelo.addElement("Error");
        }
        jComboBox1.setModel(modelo);
        Resetear();
    }
    private void Resetear(){        
        txtFechaInicio.setText("dd/mm/aaaa");
        txtFechaFin.setText("dd/mm/aaaa");
        txtHistorialMedico.setText("");
        txtTratamientoMedico.setText("");
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
            java.util.logging.Logger.getLogger(frmHistorialCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmHistorialCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmHistorialCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmHistorialCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmHistorialCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarHistorial;
    private javax.swing.JButton btnAtrasHistorial;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblFechaFin;
    private javax.swing.JLabel lblFechaInicio;
    private javax.swing.JLabel lblHistorialMedico;
    private javax.swing.JLabel lblTemaHistorial;
    private javax.swing.JLabel lblTratamientoMedico;
    private javax.swing.JTextField txtFechaFin;
    private javax.swing.JTextField txtFechaInicio;
    private javax.swing.JTextField txtHistorialMedico;
    private javax.swing.JTextField txtTratamientoMedico;
    // End of variables declaration//GEN-END:variables

    private void RegistrarHistMed() { 
        String FechaIniTrat=txtFechaInicio.getText().charAt(6)+""+txtFechaInicio.getText().charAt(7)+""+txtFechaInicio.getText().charAt(8)+""+txtFechaInicio.getText().charAt(9)+"/"+txtFechaInicio.getText().charAt(3)+""+txtFechaInicio.getText().charAt(4)+"/"+txtFechaInicio.getText().charAt(0)+""+txtFechaInicio.getText().charAt(1);
        String FechaFinTrat=txtFechaFin.getText().charAt(6)+""+txtFechaFin.getText().charAt(7)+""+txtFechaFin.getText().charAt(8)+""+txtFechaFin.getText().charAt(9)+"/"+txtFechaFin.getText().charAt(3)+""+txtFechaFin.getText().charAt(4)+"/"+txtFechaFin.getText().charAt(0)+""+txtFechaFin.getText().charAt(1);
        HistMed.insertar(jComboBox1.getSelectedIndex()+1, txtHistorialMedico.getText(), txtTratamientoMedico.getText(), FechaIniTrat, FechaFinTrat);
        JOptionPane.showMessageDialog(this, "Historial médico del paciente:\n"+jComboBox1.getSelectedItem().toString()+"\n Modificado con éxito");
        Resetear();
    }
}
