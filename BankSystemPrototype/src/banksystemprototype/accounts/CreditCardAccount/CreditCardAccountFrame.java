/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banksystemprototype.accounts.CreditCardAccount;

import banksystemprototype.TypeOfAccountAction;
import banksystemprototype.TypeOfMessageDialog;
import banksystemprototype.Utils.BspConstants;
import banksystemprototype.accounts.CustomerHomeFrame;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author caidong
 */
public class CreditCardAccountFrame extends javax.swing.JFrame implements CreditCardContract.View{

    /**
     * Creates new form SavingAccountForm
     */
    private final CustomerHomeFrame homeFrame;
    private final CreditCardContract.UserActionListener mActionListener;
    
    public CreditCardAccountFrame(JFrame home) {
        initComponents();
        homeFrame = (CustomerHomeFrame) home;
        mActionListener = new CreditCardAccountController(this);
        try {
            mActionListener.openAccount(homeFrame.getUsername());
            this.setVisible(true);
        } catch (Exception ex) {
            showMessageDialog(BspConstants.ACCOUNT_NULL_MSG, TypeOfMessageDialog.PLAIN);
            mActionListener.back();
     
        }
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
        tfTransferAmount = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfWithdrawAmount = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfDepositAmount = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        labelBalance = new javax.swing.JLabel();
        labelDailyPayment = new javax.swing.JLabel();
        labelDailyPaymentLimit = new javax.swing.JLabel();
        labelCreditLimit = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        dialogTransfer.setTitle("Withdraw");
        dialogTransfer.setMinimumSize(new java.awt.Dimension(400, 183));
        dialogTransfer.setSize(new java.awt.Dimension(400, 183));
        dialogTransfer.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                dialogTransferComponentHidden(evt);
            }
        });

        jLabel5.setText("Amount:");

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

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel6.setText("Transfer Money");

        jLabel8.setText("To Account:");

        tfTransferAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTransferAccountActionPerformed(evt);
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
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(dialogTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTransferAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTransferAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogTransferLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(123, 123, 123))
        );
        dialogTransferLayout.setVerticalGroup(
            dialogTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogTransferLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(dialogTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTransferAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dialogTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTransferAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(dialogTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTransferOK)
                    .addComponent(btnTransferCancel))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        dialogWithdraw.setTitle("Transfer");
        dialogWithdraw.setMinimumSize(new java.awt.Dimension(400, 151));
        dialogWithdraw.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                dialogWithdrawComponentHidden(evt);
            }
        });

        jLabel7.setText("Amount:");

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

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel9.setText("Withdraw Money");

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
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(tfWithdrawAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(85, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogWithdrawLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(119, 119, 119))
        );
        dialogWithdrawLayout.setVerticalGroup(
            dialogWithdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogWithdrawLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(dialogWithdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfWithdrawAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dialogWithdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnWithdrawOK)
                    .addComponent(btnWithdrawCancel))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        dialogDeposit.setTitle("Deposit");
        dialogDeposit.setMinimumSize(new java.awt.Dimension(400, 151));
        dialogDeposit.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                dialogDepositComponentHidden(evt);
            }
        });

        jLabel10.setText("Amount:");

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

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel11.setText("Deposit Money");

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
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(tfDepositAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(85, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogDepositLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(126, 126, 126))
        );
        dialogDepositLayout.setVerticalGroup(
            dialogDepositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogDepositLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(dialogDepositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tfDepositAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dialogDepositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDepositOK)
                    .addComponent(btnDepositCancel))
                .addContainerGap(33, Short.MAX_VALUE))
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
                .addComponent(btnTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 51));
        jLabel3.setText("Credit Limit:");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("Balance:");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 51));
        jLabel2.setText("Daily Payment Limit:");

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel12.setText("Daily Payment:");
        jLabel12.setToolTipText("");

        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(41, 41, 41))
        );

        labelBalance.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        labelBalance.setText("0.00");

        labelDailyPayment.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        labelDailyPayment.setText("0.00");

        labelDailyPaymentLimit.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        labelDailyPaymentLimit.setForeground(new java.awt.Color(255, 102, 51));
        labelDailyPaymentLimit.setText("0.00");

        labelCreditLimit.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        labelCreditLimit.setForeground(new java.awt.Color(255, 102, 51));
        labelCreditLimit.setText("0.00");

        jLayeredPane2.setLayer(labelBalance, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(labelDailyPayment, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(labelDailyPaymentLimit, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(labelCreditLimit, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDailyPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDailyPaymentLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCreditLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelBalance)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDailyPayment)
                .addGap(18, 18, 18)
                .addComponent(labelDailyPaymentLimit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCreditLimit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel13.setText("Credit Card Account");

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
                                .addGap(46, 46, 46)
                                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnBack))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(jLabel13)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(13, 13, 13)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(17, 17, 17)
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

    private void tfTransferAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTransferAccountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTransferAccountActionPerformed

    private void dialogTransferComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_dialogTransferComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_dialogTransferComponentHidden

    private void tfWithdrawAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfWithdrawAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfWithdrawAmountActionPerformed

    private void dialogWithdrawComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_dialogWithdrawComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_dialogWithdrawComponentHidden

    private void tfDepositAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDepositAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDepositAmountActionPerformed

    private void dialogDepositComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_dialogDepositComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_dialogDepositComponentHidden

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        mActionListener.back();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnWithdrawOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWithdrawOKActionPerformed
        // TODO add your handling code here:
        mActionListener.newAction(TypeOfAccountAction.WITHDRAW);
    }//GEN-LAST:event_btnWithdrawOKActionPerformed

    private void btnTransferOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferOKActionPerformed
        // TODO add your handling code here:
        mActionListener.newAction(TypeOfAccountAction.TRANSFER);
    }//GEN-LAST:event_btnTransferOKActionPerformed

    private void btnDepositOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositOKActionPerformed
        // TODO add your handling code here:
        mActionListener.newAction(TypeOfAccountAction.DEPOSIT);
    }//GEN-LAST:event_btnDepositOKActionPerformed

    private void btnTransferCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferCancelActionPerformed
        // TODO add your handling code here:
        disposeActionDialog(TypeOfAccountAction.TRANSFER);
    }//GEN-LAST:event_btnTransferCancelActionPerformed

    private void btnWithdrawCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWithdrawCancelActionPerformed
        // TODO add your handling code here:
        disposeActionDialog(TypeOfAccountAction.WITHDRAW);
    }//GEN-LAST:event_btnWithdrawCancelActionPerformed

    private void btnDepositCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositCancelActionPerformed
        // TODO add your handling code here:
        disposeActionDialog(TypeOfAccountAction.DEPOSIT);
    }//GEN-LAST:event_btnDepositCancelActionPerformed


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
    private final javax.swing.JDialog dialogWithdraw = new javax.swing.JDialog();
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelBalance;
    private javax.swing.JLabel labelCreditLimit;
    private javax.swing.JLabel labelDailyPayment;
    private javax.swing.JLabel labelDailyPaymentLimit;
    private javax.swing.JTextField tfDepositAmount;
    private final javax.swing.JTextField tfTransferAccount = new javax.swing.JTextField();
    private javax.swing.JTextField tfTransferAmount;
    private javax.swing.JTextField tfWithdrawAmount;
    // End of variables declaration//GEN-END:variables

    @Override
    public void refreshBalance(String amount) {
        labelBalance.setText(amount);
    }

    @Override
    public double getTransferAmount() {
        return Double.parseDouble(tfTransferAmount.getText());
    }

    @Override
    public double getWithdrawAmount() {
        return Double.parseDouble(tfWithdrawAmount.getText());
    }

    @Override
    public double getDepositAmount() {
        return Double.parseDouble(tfDepositAmount.getText());
    }

    @Override
    public long getTransferId() {
        return Long.parseLong(tfTransferAccount.getText());
    }

    @Override
    public void disposeActionDialog(TypeOfAccountAction action) {
        switch(action) {
            case TRANSFER:
                dialogTransfer.setVisible(false);
                tfTransferAmount.setText("");
                tfTransferAccount.setText("");
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

    @Override
    public void showMessageDialog(String msg, TypeOfMessageDialog type) {
        switch(type) {
            case WARNING: 
                JOptionPane.showMessageDialog(this, msg, type.toString(), JOptionPane.WARNING_MESSAGE);
                break;
            case PLAIN:
                JOptionPane.showMessageDialog(this, msg, type.toString(), JOptionPane.PLAIN_MESSAGE);
                break;
            case ERROR:
                JOptionPane.showMessageDialog(this, msg, type.toString(), JOptionPane.ERROR_MESSAGE);
        }    
    }

    @Override
    public void refreshBalance(double balance) {
        labelBalance.setText(String.valueOf(balance));
    }

    @Override
    public void refreshDailyPayment(double payment) {
        labelDailyPayment.setText(String.valueOf(payment));
    }

    @Override
    public void showDailyPaymentLimit(double limit) {
        labelDailyPaymentLimit.setText(String.valueOf(limit));
    }

    @Override
    public void showLoanLimit(double limit) {
        labelCreditLimit.setText(String.valueOf(limit));
    }

    @Override
    public void close() {
       this.dispose();
            homeFrame.setVisible(true);
    }
}
