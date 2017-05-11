/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banksystemprototype.accounts.TermDepositAccount;

import banksystemprototype.accounts.SavingAccount.SavingAccountFrame;

/**
 *
 * @author caidong
 */
public class TermDepositAccountFrame extends javax.swing.JFrame {

    /**
     * Creates new form SavingAccountFrame
     */
    public TermDepositAccountFrame() {
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

        jLabel2 = new javax.swing.JLabel();
        tfAmount = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfAmount1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        spTermPeriod = new javax.swing.JSpinner();
        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        spTermDepositWithdraw = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        btnViewTransaction = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labelBalanceValue = new javax.swing.JLabel();

        dialogTransfer.setTitle("Withdraw");
        dialogTransfer.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                dialogTransferComponentHidden(evt);
            }
        });

        jLabel2.setText("Amount:");

        tfAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAmountActionPerformed(evt);
            }
        });

        btnOK.setText("OK");

        btnCancel.setText("Cancel");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setText("Transfer Money");

        jLabel8.setText("To Account:");

        tfToAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfToAccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogTransferLayout = new javax.swing.GroupLayout(dialogTransfer.getContentPane());
        dialogTransfer.getContentPane().setLayout(dialogTransferLayout);
        dialogTransferLayout.setHorizontalGroup(
            dialogTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogTransferLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(dialogTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogTransferLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnOK)
                        .addGap(31, 31, 31)
                        .addComponent(btnCancel))
                    .addGroup(dialogTransferLayout.createSequentialGroup()
                        .addGroup(dialogTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(dialogTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfToAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogTransferLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(126, 126, 126))
        );
        dialogTransferLayout.setVerticalGroup(
            dialogTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogTransferLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dialogTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dialogTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfToAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(dialogTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOK)
                    .addComponent(btnCancel))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        dialogCreateTermDeposit.setTitle("Create Term Deposit");
        dialogCreateTermDeposit.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                dialogCreateTermDepositComponentHidden(evt);
            }
        });

        jLabel4.setText("Amount:");

        tfAmount1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAmount1ActionPerformed(evt);
            }
        });

        btnOK1.setText("OK");

        btnCancel1.setText("Cancel");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel5.setText("Create Term Deposit");

        jLabel9.setText("Starting Date:");

        jLabel10.setText("Term Period:");

        javax.swing.GroupLayout dialogCreateTermDepositLayout = new javax.swing.GroupLayout(dialogCreateTermDeposit.getContentPane());
        dialogCreateTermDeposit.getContentPane().setLayout(dialogCreateTermDepositLayout);
        dialogCreateTermDepositLayout.setHorizontalGroup(
            dialogCreateTermDepositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogCreateTermDepositLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(104, 104, 104))
            .addGroup(dialogCreateTermDepositLayout.createSequentialGroup()
                .addGroup(dialogCreateTermDepositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogCreateTermDepositLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(btnOK1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancel1))
                    .addGroup(dialogCreateTermDepositLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(dialogCreateTermDepositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel4)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(dialogCreateTermDepositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAmount1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(dialogCreateTermDepositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(spTermPeriod, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dateChooserCombo1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        dialogCreateTermDepositLayout.setVerticalGroup(
            dialogCreateTermDepositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogCreateTermDepositLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(dialogCreateTermDepositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfAmount1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dialogCreateTermDepositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(dateChooserCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dialogCreateTermDepositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(spTermPeriod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(dialogCreateTermDepositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOK1)
                    .addComponent(btnCancel1))
                .addGap(16, 16, 16))
        );

        dialogWithdraw.setTitle("Transfer");
        dialogWithdraw.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                dialogWithdrawComponentHidden(evt);
            }
        });

        jLabel6.setText("Term Deposit");

        btnOK2.setText("OK");

        btnCancel2.setText("Cancel");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel7.setText("Withdraw Money");

        javax.swing.GroupLayout dialogWithdrawLayout = new javax.swing.GroupLayout(dialogWithdraw.getContentPane());
        dialogWithdraw.getContentPane().setLayout(dialogWithdrawLayout);
        dialogWithdrawLayout.setHorizontalGroup(
            dialogWithdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogWithdrawLayout.createSequentialGroup()
                .addGroup(dialogWithdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogWithdrawLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(btnOK2)
                        .addGap(31, 31, 31)
                        .addComponent(btnCancel2))
                    .addGroup(dialogWithdrawLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spTermDepositWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(95, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogWithdrawLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(113, 113, 113))
        );
        dialogWithdrawLayout.setVerticalGroup(
            dialogWithdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogWithdrawLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(dialogWithdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(spTermDepositWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dialogWithdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOK2)
                    .addComponent(btnCancel2))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnWithdraw.setText("Withdraw");
        btnWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWithdrawActionPerformed(evt);
            }
        });

        btnCreateTermDeposit.setText("Create Term Deposit");
        btnCreateTermDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateTermDepositActionPerformed(evt);
            }
        });

        btnTransfer.setText("Transfer");
        btnTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferActionPerformed(evt);
            }
        });

        btnViewTransaction.setText("View Transaction");
        btnViewTransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewTransactionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCreateTermDeposit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnViewTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreateTermDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 24, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Balance:");

        labelBalanceValue.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        labelBalanceValue.setText("number");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelBalanceValue, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(labelBalanceValue))
                .addGap(75, 75, 75)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateTermDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateTermDepositActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCreateTermDepositActionPerformed

    private void btnWithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWithdrawActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnWithdrawActionPerformed

    private void btnTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTransferActionPerformed

    private void btnViewTransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewTransactionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewTransactionActionPerformed

    private void tfAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAmountActionPerformed

    private void tfToAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfToAccountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfToAccountActionPerformed

    private void dialogTransferComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_dialogTransferComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_dialogTransferComponentHidden

    private void tfAmount1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAmount1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAmount1ActionPerformed

    private void dialogCreateTermDepositComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_dialogCreateTermDepositComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_dialogCreateTermDepositComponentHidden

    private void dialogWithdrawComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_dialogWithdrawComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_dialogWithdrawComponentHidden

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
            java.util.logging.Logger.getLogger(SavingAccountFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SavingAccountFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SavingAccountFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SavingAccountFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SavingAccountFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private final javax.swing.JButton btnCancel = new javax.swing.JButton();
    private final javax.swing.JButton btnCancel1 = new javax.swing.JButton();
    private final javax.swing.JButton btnCancel2 = new javax.swing.JButton();
    private final javax.swing.JButton btnCreateTermDeposit = new javax.swing.JButton();
    private final javax.swing.JButton btnOK = new javax.swing.JButton();
    private final javax.swing.JButton btnOK1 = new javax.swing.JButton();
    private final javax.swing.JButton btnOK2 = new javax.swing.JButton();
    private final javax.swing.JButton btnTransfer = new javax.swing.JButton();
    private javax.swing.JButton btnViewTransaction;
    private final javax.swing.JButton btnWithdraw = new javax.swing.JButton();
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private final javax.swing.JDialog dialogCreateTermDeposit = new javax.swing.JDialog();
    private final javax.swing.JDialog dialogTransfer = new javax.swing.JDialog();
    private final javax.swing.JDialog dialogWithdraw = new javax.swing.JDialog();
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelBalanceValue;
    private javax.swing.JSpinner spTermDepositWithdraw;
    private javax.swing.JSpinner spTermPeriod;
    private javax.swing.JTextField tfAmount;
    private javax.swing.JTextField tfAmount1;
    private final javax.swing.JTextField tfToAccount = new javax.swing.JTextField();
    // End of variables declaration//GEN-END:variables
}