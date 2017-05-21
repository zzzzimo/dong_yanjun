/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banksystemprototype.accounts;

import banksystemprototype.accounts.HomeLoanAccount.HomeLoanAccountFrame;
import banksystemprototype.accounts.CreditCardAccount.CreditCardAccountFrame;
import banksystemprototype.accounts.Database.*;
import banksystemprototype.accounts.SavingAccount.SavingAccountFrame;
import banksystemprototype.accounts.TermDepositAccount.TermDepositAccountFrame;
import banksystemprototype.users.Customer;
import banksystemprototype.users._Customer;
import banksystemprototype.users.LoginFrame;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author caidong
 */
public class CustomerHomeFrame extends javax.swing.JFrame implements AccountContract.View {

    /**
     * Creates new form CustomerHomeFrame
     */
    DefaultTableModel dtm = new DefaultTableModel(new String[]{
    "Transaction No", "Username", "Date", "Current Balance", "Amount", "Account ID","Account Type"}, 0);
    private LoginFrame loginFrame;
    private String username;
    private CustomerAccountController mActionListener;
            
    public CustomerHomeFrame(JFrame login, String username) {
        initComponents();
        loginFrame = (LoginFrame) login;
        mActionListener = new CustomerAccountController(this);
        mActionListener.initialize(username);
        this.username = username;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jSeparator2 = new javax.swing.JSeparator();
        jdViewTransaction = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTransaction = new javax.swing.JTable();
        btnViewTransactionBack = new javax.swing.JButton();
        jdViewProfile = new javax.swing.JDialog();
        jLabel15 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfCreateUsername = new javax.swing.JTextField();
        tfCreateFname = new javax.swing.JTextField();
        tfCreateLname = new javax.swing.JTextField();
        tfCreateEmail = new javax.swing.JTextField();
        tfCreateAddress = new javax.swing.JTextField();
        tfCreatePhone = new javax.swing.JTextField();
        tfCreateIDNo = new javax.swing.JTextField();
        btnOK = new javax.swing.JButton();
        pfCreatePassword = new javax.swing.JPasswordField();
        pfCreatePin = new javax.swing.JPasswordField();
        tfCreateIdType = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnTermDepositAccount = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        labelUsername = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jdViewTransaction.setMinimumSize(new java.awt.Dimension(750, 355));

        tblTransaction.setModel(dtm);
        jScrollPane1.setViewportView(tblTransaction);

        btnViewTransactionBack.setText("Back");
        btnViewTransactionBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewTransactionBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jdViewTransactionLayout = new javax.swing.GroupLayout(jdViewTransaction.getContentPane());
        jdViewTransaction.getContentPane().setLayout(jdViewTransactionLayout);
        jdViewTransactionLayout.setHorizontalGroup(
            jdViewTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdViewTransactionLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdViewTransactionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnViewTransactionBack)
                .addGap(322, 322, 322))
        );
        jdViewTransactionLayout.setVerticalGroup(
            jdViewTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdViewTransactionLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnViewTransactionBack)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jdViewProfile.setMinimumSize(new java.awt.Dimension(466, 550));

        jLabel15.setText("last name");

        jLabel10.setText("ID type");

        jLabel4.setText("email");

        jLabel5.setText("phone number");

        jLabel11.setText("ID Number");

        jLabel12.setText("first name");

        jLabel8.setText("Username");

        jLabel9.setText("Password");

        jLabel6.setText("address");

        jLabel7.setText("PIN");

        tfCreateUsername.setEnabled(false);

        tfCreateFname.setEnabled(false);

        tfCreateLname.setEnabled(false);

        tfCreateEmail.setEnabled(false);

        tfCreateAddress.setEnabled(false);

        tfCreatePhone.setEnabled(false);

        tfCreateIDNo.setEnabled(false);

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        pfCreatePassword.setEnabled(false);
        pfCreatePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfCreatePasswordActionPerformed(evt);
            }
        });

        pfCreatePin.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("View Profile");

        javax.swing.GroupLayout jdViewProfileLayout = new javax.swing.GroupLayout(jdViewProfile.getContentPane());
        jdViewProfile.getContentPane().setLayout(jdViewProfileLayout);
        jdViewProfileLayout.setHorizontalGroup(
            jdViewProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdViewProfileLayout.createSequentialGroup()
                .addGroup(jdViewProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdViewProfileLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jdViewProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jdViewProfileLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12))
                            .addGroup(jdViewProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addGroup(jdViewProfileLayout.createSequentialGroup()
                                    .addGroup(jdViewProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel9))
                                    .addGap(12, 12, 12))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jdViewProfileLayout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(jLabel8))))
                        .addGap(7, 7, 7)
                        .addGroup(jdViewProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCreateIdType, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOK)
                            .addGroup(jdViewProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfCreateUsername)
                                .addComponent(tfCreateFname)
                                .addComponent(tfCreateLname)
                                .addComponent(tfCreateEmail)
                                .addComponent(tfCreateAddress)
                                .addComponent(tfCreatePhone)
                                .addComponent(tfCreateIDNo)
                                .addComponent(pfCreatePassword)
                                .addComponent(pfCreatePin, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jdViewProfileLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel2)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jdViewProfileLayout.setVerticalGroup(
            jdViewProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdViewProfileLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jdViewProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCreateUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jdViewProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(pfCreatePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jdViewProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCreateFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jdViewProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdViewProfileLayout.createSequentialGroup()
                        .addComponent(tfCreateLname, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jdViewProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tfCreateEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jdViewProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tfCreateAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jdViewProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tfCreatePhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jdViewProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(tfCreateIdType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jdViewProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(tfCreateIDNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jdViewProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(pfCreatePin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnOK)
                .addGap(40, 40, 40))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnTermDepositAccount.setText("Term Deposit Account");
        btnTermDepositAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTermDepositAccountActionPerformed(evt);
            }
        });

        btnCreditCardAccount.setText("Credit Card Account");
        btnCreditCardAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreditCardAccountActionPerformed(evt);
            }
        });

        btnSavingAccount.setText("Saving Account");
        btnSavingAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavingAccountActionPerformed(evt);
            }
        });

        btnHomeLoanAccount.setText("Home Loan Account");
        btnHomeLoanAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeLoanAccountActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Welcome Back");

        labelUsername.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        labelUsername.setText("username");

        btnViewTransactions.setText("View Transaction");
        btnViewTransactions.setActionCommand("View Transactions");
        btnViewTransactions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewTransactionsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(labelUsername)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSavingAccount, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnViewTransactions, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCreditCardAccount, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnTermDepositAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHomeLoanAccount, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelUsername)
                .addGap(51, 51, 51)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSavingAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCreditCardAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTermDepositAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHomeLoanAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnViewTransactions, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnViewProfile.setText("View Profile");
        btnViewProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewProfileActionPerformed(evt);
            }
        });

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnLogout)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnViewProfile)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewProfile)
                    .addComponent(btnLogout))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTermDepositAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTermDepositAccountActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new TermDepositAccountFrame(this);
    }//GEN-LAST:event_btnTermDepositAccountActionPerformed

    private void btnCreditCardAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreditCardAccountActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new CreditCardAccountFrame(this);
    }//GEN-LAST:event_btnCreditCardAccountActionPerformed

    private void btnSavingAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavingAccountActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new SavingAccountFrame(this);
    }//GEN-LAST:event_btnSavingAccountActionPerformed

    private void btnHomeLoanAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeLoanAccountActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
         new HomeLoanAccountFrame(this).setVisible(true);
    }//GEN-LAST:event_btnHomeLoanAccountActionPerformed

    private void btnViewProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewProfileActionPerformed
        // TODO add your handling code here:
        mActionListener.viewCustomerProfile();
    }//GEN-LAST:event_btnViewProfileActionPerformed

    
    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        this.dispose();
        showLogout();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnViewTransactionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewTransactionsActionPerformed
       if (dtm.getRowCount() > 0) {
            /* clear the default table model */
            for (int i = dtm.getRowCount() - 1; i > -1; i--) {
                dtm.removeRow(i);
            }
        }

        String condition = " WHERE username = '" + username + "'";
        String table = "S27624366.transaction_log";
        ArrayList<Object[]> rows = DBManager.check(table, condition);
        for(Object[] row: rows) {
             dtm.addRow(row);
        }   
        jdViewTransaction.setVisible(true);
    }//GEN-LAST:event_btnViewTransactionsActionPerformed

    private void btnViewTransactionBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewTransactionBackActionPerformed
        jdViewTransaction.setVisible(false);
    }//GEN-LAST:event_btnViewTransactionBackActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        jdViewProfile.setVisible(false);
    }//GEN-LAST:event_btnOKActionPerformed

    private void pfCreatePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfCreatePasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pfCreatePasswordActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private final javax.swing.JButton btnCreditCardAccount = new javax.swing.JButton();
    private final javax.swing.JButton btnHomeLoanAccount = new javax.swing.JButton();
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnOK;
    private final javax.swing.JButton btnSavingAccount = new javax.swing.JButton();
    private javax.swing.JButton btnTermDepositAccount;
    private final javax.swing.JButton btnViewProfile = new javax.swing.JButton();
    private javax.swing.JButton btnViewTransactionBack;
    private final javax.swing.JButton btnViewTransactions = new javax.swing.JButton();
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JDialog jdViewProfile;
    private javax.swing.JDialog jdViewTransaction;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JPasswordField pfCreatePassword;
    private javax.swing.JPasswordField pfCreatePin;
    private javax.swing.JTable tblTransaction;
    private javax.swing.JTextField tfCreateAddress;
    private javax.swing.JTextField tfCreateEmail;
    private javax.swing.JTextField tfCreateFname;
    private javax.swing.JTextField tfCreateIDNo;
    private javax.swing.JTextField tfCreateIdType;
    private javax.swing.JTextField tfCreateLname;
    private javax.swing.JTextField tfCreatePhone;
    private javax.swing.JTextField tfCreateUsername;
    // End of variables declaration//GEN-END:variables
    
   

    @Override
    public void showLogout() {
        loginFrame.setVisible(true);
        this.dispose();
    }
    
     public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerHomeFrame(new LoginFrame(), "abc").setVisible(true);
            }
        });
    }
     
    public String getUsername(){
        return username;
    }

    @Override
    public void showCustomerProfile(Customer profile) {
        tfCreateAddress.setText(profile.getAddress());
        tfCreateEmail.setText(profile.getEmail());
        tfCreateFname.setText(profile.getFirstName());
        tfCreateIDNo.setText(profile.getIdNubmer());
        tfCreateLname.setText(profile.getLastName());
        tfCreatePhone.setText(String.valueOf(profile.getPhone()));
        tfCreateIdType.setText(profile.getIdType().toString());
        tfCreateUsername.setText(profile.getUsername());
        jdViewProfile.setVisible(true);
    }

    @Override
    public void showUserFullname(String fullname) {
        labelUsername.setText(fullname);
    }
    
    
    private void addTableModel(DefaultTableModel dcbm){
        if (dcbm.getRowCount() > 0) {
            /* clear the default table model */
            for (int i = dcbm.getRowCount() - 1; i > -1; i--) {
                dcbm.removeRow(i);
            }
        }
    }        
}
