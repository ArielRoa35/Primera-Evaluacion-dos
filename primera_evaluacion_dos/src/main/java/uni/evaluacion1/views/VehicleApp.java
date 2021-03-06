/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.evaluacion1.views;

import javax.swing.JFrame;

/**
 *
 * @author Ariel Roa
 */
public class VehicleApp extends javax.swing.JFrame {

    /**
     * Creates new form VehicleApp
     */
    public VehicleApp() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dskContent = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mniVehicleNew = new javax.swing.JMenuItem();
        mniVehicleView = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mniExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vehicle App");
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        javax.swing.GroupLayout dskContentLayout = new javax.swing.GroupLayout(dskContent);
        dskContent.setLayout(dskContentLayout);
        dskContentLayout.setHorizontalGroup(
            dskContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        dskContentLayout.setVerticalGroup(
            dskContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        getContentPane().add(dskContent, java.awt.BorderLayout.CENTER);

        jMenu1.setText("Options");

        mniVehicleNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        mniVehicleNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/VehicleAppIcon_2.png"))); // NOI18N
        mniVehicleNew.setText("New");
        mniVehicleNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniVehicleNewActionPerformed(evt);
            }
        });
        jMenu1.add(mniVehicleNew);

        mniVehicleView.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mniVehicleView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/VehicleAppIcon_1.png"))); // NOI18N
        mniVehicleView.setText("View");
        mniVehicleView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniVehicleViewActionPerformed(evt);
            }
        });
        jMenu1.add(mniVehicleView);
        jMenu1.add(jSeparator1);

        mniExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        mniExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/VehicleAppIcon_3.png"))); // NOI18N
        mniExit.setText("Exit");
        jMenu1.add(mniExit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniVehicleNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniVehicleNewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniVehicleNewActionPerformed

    private void mniVehicleViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniVehicleViewActionPerformed
        
        IFrmVehicle iFrmVehicle = new IFrmVehicle();
        
        dskContent.add(iFrmVehicle);
        iFrmVehicle.setVisible(true);
    }//GEN-LAST:event_mniVehicleViewActionPerformed

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
            java.util.logging.Logger.getLogger(VehicleApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VehicleApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VehicleApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VehicleApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VehicleApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dskContent;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem mniExit;
    private javax.swing.JMenuItem mniVehicleNew;
    private javax.swing.JMenuItem mniVehicleView;
    // End of variables declaration//GEN-END:variables
}
