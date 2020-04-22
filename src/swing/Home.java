/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import library.*;

/**
 *
 * @author ercan
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        DynamicPanel.add(new MainSelect(this), "MainSelect");
        
        // Admin
        DynamicPanel.add(new swing.admin.AddAdmin(this), "AddAdminAdmin");
        DynamicPanel.add(new swing.admin.AddBanker(this), "AddBankerAdmin");
        DynamicPanel.add(new swing.admin.Admins(this), "AdminsAdmin");
        DynamicPanel.add(new swing.admin.Bankers(this), "BankersAdmin");
        DynamicPanel.add(new swing.admin.CurrencyRate(this), "CurrencyRateAdmin");
        DynamicPanel.add(new swing.admin.Customers(this), "CustomersAdmin");
        DynamicPanel.add(new swing.admin.DeleteBanker(this), "DeleteBankerAdmin");
        DynamicPanel.add(new swing.admin.EditBanker(this), "EditBankerAdmin");
        DynamicPanel.add(new swing.admin.EditMoney(this), "EditMoneyAdmin");
        DynamicPanel.add(new swing.admin.Home(this), "HomeAdmin");
        DynamicPanel.add(new swing.admin.Login(this), "LoginAdmin");
        DynamicPanel.add(new swing.admin.Settings(this), "SettingsAdmin");
        
        // Banker
        DynamicPanel.add(new swing.banker.AddCustomer(this), "AddCustomerBanker");
        DynamicPanel.add(new swing.banker.Balance(this), "BalanceBanker");
        DynamicPanel.add(new swing.banker.Bankers(this), "BankersBanker");
        DynamicPanel.add(new swing.banker.Customers(this), "CustomersBanker");
        DynamicPanel.add(new swing.banker.DeleteCustomer(this), "DeleteCustomerBanker");
        DynamicPanel.add(new swing.banker.EditCustomer(this), "EditCustomerBanker");
        DynamicPanel.add(new swing.banker.Home(this), "HomeBanker");
        DynamicPanel.add(new swing.banker.Login(this), "LoginBanker");
        DynamicPanel.add(new swing.banker.Settings(this), "SettingsBanker");
        DynamicPanel.add(new swing.banker.Transactions(this), "TransactionsBanker");
        
        // Customer
        DynamicPanel.add(new swing.customer.Balance(this), "BalanceCustomer");
        DynamicPanel.add(new swing.customer.Deposit(this), "DepositCustomer");
        DynamicPanel.add(new swing.customer.Home(this), "HomeCustomer");
        DynamicPanel.add(new swing.customer.Login(this), "LoginCustomer");
        DynamicPanel.add(new swing.customer.Receipt(this), "ReceiptCustomer");
        DynamicPanel.add(new swing.customer.Settings(this), "SettingsCustomer");
        DynamicPanel.add(new swing.customer.Transactions(this), "TransactionsCustomer");
        DynamicPanel.add(new swing.customer.Transfer(this), "TransferCustomer");
        DynamicPanel.add(new swing.customer.TransferMoney(this), "TransferMoneyCustomer");
        DynamicPanel.add(new swing.customer.Warning(this), "WarningCustomer");
        DynamicPanel.add(new swing.customer.Withdrawal(this), "WithdrawalCustomer");

        setLayout(new BorderLayout());
        add(DynamicPanel);
        ChangeJPanel("MainSelect");
        setLocationRelativeTo(null);
        setVisible(true);
        
        boolean created = Database.fcreate("Users");
        if(created == true) {
            int column = Database.columnExists("Users");
            if(column != 13) Database.createColumn("Users", 0, 13);
            Database.setColumn("Users", 0, "ID");
            Database.setColumn("Users", 1, "CardNumber");
            Database.setColumn("Users", 2, "FullName");
            Database.setColumn("Users", 3, "DateofBirth");
            Database.setColumn("Users", 4, "Job");
            Database.setColumn("Users", 5, "PhoneNumber");
            Database.setColumn("Users", 6, "Dollar");
            Database.setColumn("Users", 7, "Euro");
            Database.setColumn("Users", 8, "Pound");
            Database.setColumn("Users", 9, "TurkishLira");
            Database.setColumn("Users", 10, "HomeAddress");
            Database.setColumn("Users", 11, "Password");
            Database.setColumn("Users", 12, "Salary");
        }
        
        
        /*int id = Database.create("Test");
        System.out.println("Gelsin id " + id);*/
        //Database.delete("Test", "ID", 1);
        /*Database.setColumn("Test", 0, "ID");
        Database.setColumn("Test", 4, "Avni");*/
        
        Database.create("Users", "FullName", 55);
        Database.create("Users", "FullName", "Ekmek");
        Database.create("Users");
        Database.create("Users");
        /*Database.set("Test", "ID", "555", "Denedme", "kaDGFDGssr");
        Database.delete("Test", "ID", "685");
        Database.create("Test");*/
        //Database.get("Test", "ID", 555, "Mehmet");
        //Database.deleteColumn("Test", 4);
    }
    
    public final void ChangeJPanel(String cName) {
        CardLayout cl = (CardLayout) DynamicPanel.getLayout();
        cl.show(DynamicPanel, cName);
        pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        bankicon = new javax.swing.JLabel();
        boblabel = new javax.swing.JLabel();
        closebtn = new javax.swing.JButton();
        minimizebtn = new javax.swing.JButton();
        DynamicPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bank Of Business");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(1070, 590));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(23, 35, 51));
        jPanel2.setAlignmentX(0.0F);
        jPanel2.setAlignmentY(0.0F);
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        bankicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_bank_48px.png"))); // NOI18N

        boblabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        boblabel.setForeground(new java.awt.Color(255, 255, 255));
        boblabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boblabel.setText("Bank of Business");

        closebtn.setForeground(new java.awt.Color(255, 255, 255));
        closebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_close_window_50px_1.png"))); // NOI18N
        closebtn.setContentAreaFilled(false);
        closebtn.setMaximumSize(new java.awt.Dimension(50, 50));
        closebtn.setMinimumSize(new java.awt.Dimension(50, 50));
        closebtn.setPreferredSize(new java.awt.Dimension(50, 50));
        closebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebtnActionPerformed(evt);
            }
        });

        minimizebtn.setForeground(new java.awt.Color(255, 255, 255));
        minimizebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_minimize_window_50px.png"))); // NOI18N
        minimizebtn.setContentAreaFilled(false);
        minimizebtn.setMaximumSize(new java.awt.Dimension(50, 50));
        minimizebtn.setMinimumSize(new java.awt.Dimension(50, 50));
        minimizebtn.setPreferredSize(new java.awt.Dimension(50, 50));
        minimizebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bankicon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boblabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 744, Short.MAX_VALUE)
                .addComponent(minimizebtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(closebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(boblabel)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bankicon)
                .addGap(2, 2, 2))
            .addComponent(closebtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(minimizebtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 50));

        DynamicPanel.setBackground(new java.awt.Color(71, 120, 197));
        DynamicPanel.setPreferredSize(new java.awt.Dimension(1070, 590));
        DynamicPanel.setLayout(new java.awt.CardLayout());
        getContentPane().add(DynamicPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
        //drag this pane
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        // TODO add your handling code here:

        //source to drag
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx,y-xy);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void closebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closebtnActionPerformed

    private void minimizebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizebtnActionPerformed
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizebtnActionPerformed

    int xx,xy;
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }
   
    
    private void setColor(JPanel pane)
    {
        pane.setBackground(new Color(41,57,80));
    }
    
    private void resetColor(JPanel [] pane, JPanel [] indicators)
    {
        for(int i=0;i<pane.length;i++){
           pane[i].setBackground(new Color(23,35,51));
           
        } for(int i=0;i<indicators.length;i++){
           indicators[i].setOpaque(false);           
        }
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DynamicPanel;
    private javax.swing.JLabel bankicon;
    private javax.swing.JLabel boblabel;
    private javax.swing.JButton closebtn;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton minimizebtn;
    // End of variables declaration//GEN-END:variables
}
