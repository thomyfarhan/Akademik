/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Component;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class MenuUtama_Admin extends javax.swing.JFrame {

    /**
     * Creates new form MenuUtama_Admin
     */
    public MenuUtama_Admin() {
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

        lblMenuUtamaAdmin = new javax.swing.JLabel();
        lblAdmin = new javax.swing.JLabel();
        btnKnfrmPmbyrnMhs = new javax.swing.JButton();
        btnPenjadwalanKls = new javax.swing.JButton();
        btnLogOutAdmin = new javax.swing.JButton();
        btnInputMatkul = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMenuUtamaAdmin.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblMenuUtamaAdmin.setText("Menu Utama");

        lblAdmin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblAdmin.setText("Administrator");

        btnKnfrmPmbyrnMhs.setText("Konfirmasi Pembayaran Mahasiswa");
        btnKnfrmPmbyrnMhs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKnfrmPmbyrnMhsActionPerformed(evt);
            }
        });

        btnPenjadwalanKls.setText("Penjadwalan Kelas");

        btnLogOutAdmin.setText("Log Out");

        btnInputMatkul.setText("Input Mata Kuliah");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnLogOutAdmin))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnKnfrmPmbyrnMhs)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMenuUtamaAdmin)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(lblAdmin)))
                                .addComponent(btnPenjadwalanKls, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(btnInputMatkul, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 227, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(lblMenuUtamaAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAdmin)
                .addGap(18, 18, 18)
                .addComponent(btnKnfrmPmbyrnMhs)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(btnLogOutAdmin))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnPenjadwalanKls)
                        .addGap(18, 18, 18)
                        .addComponent(btnInputMatkul)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKnfrmPmbyrnMhsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKnfrmPmbyrnMhsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKnfrmPmbyrnMhsActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUtama_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInputMatkul;
    private javax.swing.JButton btnKnfrmPmbyrnMhs;
    private javax.swing.JButton btnLogOutAdmin;
    private javax.swing.JButton btnPenjadwalanKls;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblMenuUtamaAdmin;
    // End of variables declaration//GEN-END:variables

    public void setBtnKnfrmPmbyrnMhs(JButton btnKnfrmPmbyrnMhs) {
        this.btnKnfrmPmbyrnMhs = btnKnfrmPmbyrnMhs;
    }

    public void setBtnLogOutAdmin(JButton btnLogOutAdmin) {
        this.btnLogOutAdmin = btnLogOutAdmin;
    }

    public void setBtnPenjadwalanKls(JButton btnPenjadwalanKls) {
        this.btnPenjadwalanKls = btnPenjadwalanKls;
    }

    public void setBtnInputMatkul(JButton btnInputMatkul) {
        this.btnInputMatkul = btnInputMatkul;
    }

    public JButton getBtnKnfrmPmbyrnMhs() {
        return btnKnfrmPmbyrnMhs;
    }

    public JButton getBtnLogOutAdmin() {
        return btnLogOutAdmin;
    }

    public JButton getBtnPenjadwalanKls() {
        return btnPenjadwalanKls;
    }

    public JButton getBtnInputMatkul() {
        return btnInputMatkul;
    }

    public void addListener(ActionListener e){
        btnKnfrmPmbyrnMhs.addActionListener(e);
        btnLogOutAdmin.addActionListener(e);
        btnPenjadwalanKls.addActionListener(e);
        btnInputMatkul.addActionListener(e);
    }
    
    public void showMessage(Component c, String s){
            JOptionPane.showMessageDialog(c,s);
    };
}
