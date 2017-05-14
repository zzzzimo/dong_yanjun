/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banksystemprototype.accounts.SavingAccount;

import banksystemprototype.TypeOfAccountAction;
import banksystemprototype.accounts.CustomerHomeFrame;
import banksystemprototype.accounts.Database.DBConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author caidong
 */
public class SavingAccountFrame extends javax.swing.JFrame implements SavingAccountContract.View{
   
    /**
     * Creates new form SavingAccountForm
     */
    private static SavingAccountContract.UserActionListener mActionListener;
    private final CustomerHomeFrame homeFrame;
    private Connection conn;
    private String username;

    
    public SavingAccountFrame(JFrame home) {
        initComponents();
        homeFrame = (CustomerHomeFrame) home;
        mActionListener = new SavingAccountController(this);
        conn = DBConnection.getConnection();
        username = homeFrame.getUsername();
        mActionListener.openAccount(username);
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
        tfTransferAmount = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfDepositAmount = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfWithdrawAmount = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        dialogViewTransaction = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelBalanceValue = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        dialogTransfer.setTitle("Transfer");
        dialogTransfer.setMinimumSize(getPreferredSize());
        dialogTransfer.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                dialogTransferComponentHidden(evt);
            }
        });

        jLabel2.setText("Amount:");

        tfTransferAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTransferAmountActionPerformed(evt);
            }
        });

        btnTransferOK.setText("OK");
        btnTransferOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferOKActionPerformed(evt);
            }
        });

        btnTransferCancel.setText("Cancel");
        btnTransferCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferCancelActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setText("Transfer Money");

        jLabel8.setText("To Account:");

        tfTransferToAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTransferToAccountActionPerformed(evt);
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
                        .addComponent(btnTransferOK)
                        .addGap(31, 31, 31)
                        .addComponent(btnTransferCancel))
                    .addGroup(dialogTransferLayout.createSequentialGroup()
                        .addGroup(dialogTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(dialogTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTransferAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTransferToAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                    .addComponent(tfTransferAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dialogTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTransferToAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(dialogTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTransferOK)
                    .addComponent(btnTransferCancel))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        dialogDeposit.setTitle("Deposit");
        dialogDeposit.setMinimumSize(getPreferredSize());
        dialogDeposit.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                dialogDepositComponentHidden(evt);
            }
        });

        jLabel4.setText("Amount:");

        tfDepositAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDepositAmountActionPerformed(evt);
            }
        });

        btnDepositOK.setText("OK");
        btnDepositOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositOKActionPerformed(evt);
            }
        });

        btnDepositCancel.setText("Cancel");
        btnDepositCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositCancelActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel5.setText("Deposit Money");

        javax.swing.GroupLayout dialogDepositLayout = new javax.swing.GroupLayout(dialogDeposit.getContentPane());
        dialogDeposit.getContentPane().setLayout(dialogDepositLayout);
        dialogDepositLayout.setHorizontalGroup(
            dialogDepositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogDepositLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(dialogDepositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogDepositLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnDepositOK)
                        .addGap(31, 31, 31)
                        .addComponent(btnDepositCancel))
                    .addGroup(dialogDepositLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(tfDepositAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(85, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogDepositLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(126, 126, 126))
        );
        dialogDepositLayout.setVerticalGroup(
            dialogDepositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogDepositLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(dialogDepositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfDepositAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dialogDepositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDepositOK)
                    .addComponent(btnDepositCancel))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        dialogWithdraw.setTitle("Withdraw");
        dialogWithdraw.setMinimumSize(getPreferredSize());
        dialogWithdraw.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                dialogWithdrawComponentHidden(evt);
            }
        });

        jLabel6.setText("Amount:");

        tfWithdrawAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfWithdrawAmountActionPerformed(evt);
            }
        });

        btnWithdrawOK.setText("OK");
        btnWithdrawOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWithdrawOKActionPerformed(evt);
            }
        });

        btnWithdrawCancel.setText("Cancel");
        btnWithdrawCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWithdrawCancelActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel7.setText("Withdraw Money");

        javax.swing.GroupLayout dialogWithdrawLayout = new javax.swing.GroupLayout(dialogWithdraw.getContentPane());
        dialogWithdraw.getContentPane().setLayout(dialogWithdrawLayout);
        dialogWithdrawLayout.setHorizontalGroup(
            dialogWithdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogWithdrawLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(dialogWithdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogWithdrawLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnWithdrawOK)
                        .addGap(31, 31, 31)
                        .addComponent(btnWithdrawCancel))
                    .addGroup(dialogWithdrawLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(tfWithdrawAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(85, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogWithdrawLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(116, 116, 116))
        );
        dialogWithdrawLayout.setVerticalGroup(
            dialogWithdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogWithdrawLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(dialogWithdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfWithdrawAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dialogWithdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnWithdrawOK)
                    .addComponent(btnWithdrawCancel))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        dialogViewTransaction.setTitle("View Transaction");
        dialogViewTransaction.setMinimumSize(getPreferredSize());

        javax.swing.GroupLayout dialogViewTransactionLayout = new javax.swing.GroupLayout(dialogViewTransaction.getContentPane());
        dialogViewTransaction.getContentPane().setLayout(dialogViewTransactionLayout);
        dialogViewTransactionLayout.setHorizontalGroup(
            dialogViewTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 474, Short.MAX_VALUE)
        );
        dialogViewTransactionLayout.setVerticalGroup(
            dialogViewTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 297, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnWithdraw.setText("Withdraw");
        btnWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWithdrawActionPerformed(evt);
            }
        });

        btnDeposit.setText("Deposit");
        btnDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositActionPerformed(evt);
            }
        });

        btnTransfer.setText("Transfer");
        btnTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferActionPerformed(evt);
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
                        .addComponent(btnDeposit, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Balance:");

        labelBalanceValue.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        labelBalanceValue.setText("number");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelBalanceValue, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBack))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBalanceValue)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositActionPerformed
        // TODO add your handling code here:
        dialogDeposit.setVisible(true);
       
    }//GEN-LAST:event_btnDepositActionPerformed

    private void btnWithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWithdrawActionPerformed
        // TODO add your handling code here:
        dialogWithdraw.setVisible(true);
    }//GEN-LAST:event_btnWithdrawActionPerformed

    private void btnTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferActionPerformed
        // TODO add your handling code here:
        dialogTransfer.setVisible(true);
    }//GEN-LAST:event_btnTransferActionPerformed

    private void tfTransferAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTransferAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTransferAmountActionPerformed

    private void dialogTransferComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_dialogTransferComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_dialogTransferComponentHidden

    private void tfDepositAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDepositAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDepositAmountActionPerformed

    private void dialogDepositComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_dialogDepositComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_dialogDepositComponentHidden

    private void tfWithdrawAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfWithdrawAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfWithdrawAmountActionPerformed

    private void dialogWithdrawComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_dialogWithdrawComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_dialogWithdrawComponentHidden

    private void tfTransferToAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTransferToAccountActionPerformed
//        // TODO add your handling code here:
    }//GEN-LAST:event_tfTransferToAccountActionPerformed

    private void btnDepositOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositOKActionPerformed
        // TODO add your handling code here:
//        double amount = Double.parseDouble(tfTransferAmount.getText());
//        mActionListener.deposit(amount);
        mActionListener.newAction(TypeOfAccountAction.DEPOSIT);
    }//GEN-LAST:event_btnDepositOKActionPerformed

    private void btnWithdrawOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWithdrawOKActionPerformed
        // TODO add your handling code here:
        mActionListener.newAction(TypeOfAccountAction.WITHDRAW);
    }//GEN-LAST:event_btnWithdrawOKActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        mActionListener.back();
        this.dispose();
        homeFrame.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnTransferOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferOKActionPerformed
        mActionListener.newAction(TypeOfAccountAction.TRANSFER);
    }//GEN-LAST:event_btnTransferOKActionPerformed

    private void btnTransferCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferCancelActionPerformed
        // TODO add your handling code here:
        disposeActionDialog(TypeOfAccountAction.TRANSFER);
    }//GEN-LAST:event_btnTransferCancelActionPerformed

    private void btnDepositCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositCancelActionPerformed
        // TODO add your handling code here:
        disposeActionDialog(TypeOfAccountAction.DEPOSIT);
    }//GEN-LAST:event_btnDepositCancelActionPerformed

    private void btnWithdrawCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWithdrawCancelActionPerformed
        // TODO add your handling code here:
        disposeActionDialog(TypeOfAccountAction.WITHDRAW);
    }//GEN-LAST:event_btnWithdrawCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private final javax.swing.JButton btnDeposit = new javax.swing.JButton();
    private final javax.swing.JButton btnDepositCancel = new javax.swing.JButton();
    private final javax.swing.JButton btnDepositOK = new javax.swing.JButton();
    private final javax.swing.JButton btnTransfer = new javax.swing.JButton();
    private final javax.swing.JButton btnTransferCancel = new javax.swing.JButton();
    private final javax.swing.JButton btnTransferOK = new javax.swing.JButton();
    private final javax.swing.JButton btnWithdraw = new javax.swing.JButton();
    private final javax.swing.JButton btnWithdrawCancel = new javax.swing.JButton();
    private final javax.swing.JButton btnWithdrawOK = new javax.swing.JButton();
    private final javax.swing.JDialog dialogDeposit = new javax.swing.JDialog();
    private final javax.swing.JDialog dialogTransfer = new javax.swing.JDialog();
    private javax.swing.JDialog dialogViewTransaction;
    private final javax.swing.JDialog dialogWithdraw = new javax.swing.JDialog();
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelBalanceValue;
    private javax.swing.JTextField tfDepositAmount;
    private javax.swing.JTextField tfTransferAmount;
    private final javax.swing.JTextField tfTransferToAccount = new javax.swing.JTextField();
    private javax.swing.JTextField tfWithdrawAmount;
    // End of variables declaration//GEN-END:variables
   @Override
    public double getWithdrawAmount() {
        return Double.parseDouble(tfWithdrawAmount.getText());
    }

    @Override
    public double getDepositAmount() {
        return Double.parseDouble(tfDepositAmount.getText());
    }

    @Override
    public double getTransferAmount() {
        return Double.parseDouble(tfTransferAmount.getText());
    }

    @Override
    public long getTransferAccountId() {
        return Long.parseLong(tfTransferAmount.getText());
    }

    @Override
    public void refreshBalance(String amount) {
        dialogWithdraw.dispose();
        dialogTransfer.dispose();
        dialogDeposit.dispose();
        labelBalanceValue.setText(amount);
    }

    @Override
    public void disposeActionDialog(TypeOfAccountAction action) {
        switch(action) {
            case TRANSFER:
                dialogTransfer.setVisible(false);
                tfTransferAmount.setText("");
                break;
            case WITHDRAW:
                dialogWithdraw.setVisible(false);
                tfWithdrawAmount.setText("");
                break;
            case DEPOSIT:
                dialogDeposit.setVisible(false);
                tfDepositAmount.setText("");
                break;
            default:
                break;
        }
    }
    
     public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SavingAccountFrame view = new SavingAccountFrame(new JFrame());
                view.setVisible(true);
            }
        });
    }
     @Override
     public String getUsername() {
        return username;
     }
}
