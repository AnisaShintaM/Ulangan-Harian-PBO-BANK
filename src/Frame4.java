/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Frame4 extends javax.swing.JFrame {

    /**
     * Creates new form Frame4
     */
    public Frame4() {
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

        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        halo = new javax.swing.JLabel();
        jumlahsaldo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btninfosaldo = new javax.swing.JButton();
        keluar1 = new javax.swing.JButton();
        ya1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jLabel5.setIcon(new javax.swing.ImageIcon("K:\\Background\\1332463569169212797vactor flower.png")); // NOI18N
        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Sitka Subheading", 1, 24)); // NOI18N
        jLabel2.setText("BNI SYARIAH CABANG NGAWI");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 10, 340, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Jln. Yos Sudarso No.17 B, Kec.Ngawi, Kab. Ngawi, Jawa Timur");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 30, 380, 20);

        jLabel1.setFont(new java.awt.Font("Century751 No2 BT", 2, 14)); // NOI18N
        jLabel1.setText("BNI Syariah Memberikan Yang Terbaik Sesuai Kaidah");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 50, 350, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("INFORMASI SALDO");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 110, 150, 30);

        halo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        halo.setText("SALDO ANDA :");
        getContentPane().add(halo);
        halo.setBounds(50, 200, 100, 30);
        getContentPane().add(jumlahsaldo);
        jumlahsaldo.setBounds(130, 200, 210, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Apakah Anda ingin melakukan Transaksi Lainnya ?");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(100, 270, 310, 30);

        btninfosaldo.setBackground(new java.awt.Color(255, 0, 204));
        btninfosaldo.setText("TEKAN DISINI");
        btninfosaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninfosaldoActionPerformed(evt);
            }
        });
        getContentPane().add(btninfosaldo);
        btninfosaldo.setBounds(10, 140, 170, 30);

        keluar1.setBackground(new java.awt.Color(255, 0, 204));
        keluar1.setText("TIDAK");
        keluar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluar1ActionPerformed(evt);
            }
        });
        getContentPane().add(keluar1);
        keluar1.setBounds(160, 350, 170, 30);

        ya1.setBackground(new java.awt.Color(255, 0, 204));
        ya1.setText("YA");
        ya1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ya1ActionPerformed(evt);
            }
        });
        getContentPane().add(ya1);
        ya1.setBounds(160, 300, 170, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon("K:\\Background\\1332463569169212797vactor flower.png")); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(-330, 0, 870, 390);

        setBounds(0, 0, 502, 438);
    }// </editor-fold>//GEN-END:initComponents

    private void btninfosaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninfosaldoActionPerformed
        int saldo = 150000;
        jumlahsaldo.setText(""+saldo);// TODO add your handling code here:
    }//GEN-LAST:event_btninfosaldoActionPerformed

    private void keluar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluar1ActionPerformed
         new Framee1().setVisible(true);           
         dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_keluar1ActionPerformed

    private void ya1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ya1ActionPerformed
        new Frame2().setVisible(true);
        dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_ya1ActionPerformed

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
            java.util.logging.Logger.getLogger(Frame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btninfosaldo;
    private javax.swing.JLabel halo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jumlahsaldo;
    private javax.swing.JButton keluar1;
    private javax.swing.JButton ya1;
    // End of variables declaration//GEN-END:variables
}
