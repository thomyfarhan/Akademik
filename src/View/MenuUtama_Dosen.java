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
public class MenuUtama_Dosen extends javax.swing.JFrame {

    /**
     * Creates new form MenuUtama_Dosen
     */
    public MenuUtama_Dosen() {
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

        lblMenuUtamaDosen = new javax.swing.JLabel();
        lblDosen = new javax.swing.JLabel();
        btnInputAbsen = new javax.swing.JButton();
        btnLihatDataMhs = new javax.swing.JButton();
        btnLogOutDosen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(685, 300));

        lblMenuUtamaDosen.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblMenuUtamaDosen.setText("Menu Utama");

        lblDosen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDosen.setText("Dosen");

        btnInputAbsen.setText("Input Absen");
        btnInputAbsen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInputAbsenActionPerformed(evt);
            }
        });

        btnLihatDataMhs.setText("Lihat Data Mahasiswa");

        btnLogOutDosen.setText("Log Out");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnLogOutDosen))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(btnInputAbsen, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLihatDataMhs)
                        .addGap(0, 201, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMenuUtamaDosen)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(lblDosen)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblMenuUtamaDosen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDosen)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInputAbsen)
                    .addComponent(btnLihatDataMhs))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(btnLogOutDosen)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInputAbsenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputAbsenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInputAbsenActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUtama_Dosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama_Dosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama_Dosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama_Dosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama_Dosen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInputAbsen;
    private javax.swing.JButton btnLihatDataMhs;
    private javax.swing.JButton btnLogOutDosen;
    private javax.swing.JLabel lblDosen;
    private javax.swing.JLabel lblMenuUtamaDosen;
    // End of variables declaration//GEN-END:variables

    public void setBtnInputAbsen(JButton btnInputAbsen) {
        this.btnInputAbsen = btnInputAbsen;
    }

    public void setBtnLihatDataMhs(JButton btnLihatDataMhs) {
        this.btnLihatDataMhs = btnLihatDataMhs;
    }

    public void setBtnLogOutDosen(JButton btnLogOutDosen) {
        this.btnLogOutDosen = btnLogOutDosen;
    }

    public JButton getBtnInputAbsen() {
        return btnInputAbsen;
    }

    public JButton getBtnLihatDataMhs() {
        return btnLihatDataMhs;
    }

    public JButton getBtnLogOutDosen() {
        return btnLogOutDosen;
    }


    public void addListener(ActionListener e){
        btnInputAbsen.addActionListener(e);
        btnLihatDataMhs.addActionListener(e);
        btnLogOutDosen.addActionListener(e);
    }
    
    public void showMessage(Component c, String s){
            JOptionPane.showMessageDialog(c,s);
    };

}
