
package proyectoclinicadental;


public class frmMenuPrincipal extends javax.swing.JFrame {

   
    public frmMenuPrincipal() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnClientesMPrincipal = new javax.swing.JButton();
        btnDentistas = new javax.swing.JButton();
        btnTratamientosOdon = new javax.swing.JButton();
        btnCitas = new javax.swing.JButton();
        btnSalas = new javax.swing.JButton();
        btnFacturacion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnClientesMPrincipal.setText("CLIENTES");
        getContentPane().add(btnClientesMPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, -1));

        btnDentistas.setText("DENTISTA");
        getContentPane().add(btnDentistas, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, -1, -1));

        btnTratamientosOdon.setText("TRATAMIENTOS ODONTOLOGICOS");
        getContentPane().add(btnTratamientosOdon, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        btnCitas.setText("CITAS");
        getContentPane().add(btnCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, -1, -1));

        btnSalas.setText("SALAS");
        getContentPane().add(btnSalas, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, -1, -1));

        btnFacturacion.setText("FACTURACION");
        getContentPane().add(btnFacturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCitas;
    private javax.swing.JButton btnClientesMPrincipal;
    private javax.swing.JButton btnDentistas;
    private javax.swing.JButton btnFacturacion;
    private javax.swing.JButton btnSalas;
    private javax.swing.JButton btnTratamientosOdon;
    // End of variables declaration//GEN-END:variables
}
