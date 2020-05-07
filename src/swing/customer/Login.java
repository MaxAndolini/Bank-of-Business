/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.customer;

import java.awt.event.KeyEvent;
import javax.swing.text.AbstractDocument;
import library.*;

/**
 *
 * @author ercan
 */
public class Login extends javax.swing.JPanel implements InterfaceLogin {

    final private swing.Home frame;

    /**
     * Creates new form Login
     *
     * @param home Dynamic panel.
     */
    public Login(swing.Home home) {
        initComponents();
        frame = home;

        ((AbstractDocument) uidcnumbertext.getDocument()).setDocumentFilter(new Filter(1, 16));
        ((AbstractDocument) password.getDocument()).setDocumentFilter(new Filter(0, 15));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainlabel = new javax.swing.JLabel();
        infolabel = new javax.swing.JLabel();
        infolabel2 = new javax.swing.JLabel();
        uidcnumbertext = new javax.swing.JTextField();
        infolabel3 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        loginbtn = new java.awt.Button();
        loginicon = new javax.swing.JLabel();
        exitbtn = new java.awt.Button();
        exiticon = new javax.swing.JLabel();

        setBackground(new java.awt.Color(71, 120, 197));
        setMaximumSize(new java.awt.Dimension(1070, 590));
        setMinimumSize(new java.awt.Dimension(1070, 590));
        setPreferredSize(new java.awt.Dimension(1070, 590));

        mainlabel.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        mainlabel.setForeground(new java.awt.Color(255, 255, 255));
        mainlabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mainlabel.setText("Customer - Login");
        mainlabel.setMaximumSize(new java.awt.Dimension(223, 47));
        mainlabel.setMinimumSize(new java.awt.Dimension(223, 47));
        mainlabel.setPreferredSize(new java.awt.Dimension(223, 47));

        infolabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        infolabel.setForeground(new java.awt.Color(255, 255, 255));
        infolabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        infolabel2.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        infolabel2.setForeground(new java.awt.Color(255, 255, 255));
        infolabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infolabel2.setText("Enter User ID or Card Number");

        uidcnumbertext.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        uidcnumbertext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        uidcnumbertext.setMaximumSize(new java.awt.Dimension(7, 39));
        uidcnumbertext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uidcnumbertextActionPerformed(evt);
            }
        });
        uidcnumbertext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                uidcnumbertextKeyPressed(evt);
            }
        });

        infolabel3.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        infolabel3.setForeground(new java.awt.Color(255, 255, 255));
        infolabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infolabel3.setText("Password");

        password.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password.setMaximumSize(new java.awt.Dimension(7, 39));
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
        });

        loginbtn.setBackground(new java.awt.Color(23, 35, 51));
        loginbtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        loginbtn.setForeground(new java.awt.Color(255, 255, 255));
        loginbtn.setLabel("Login");
        loginbtn.setMinimumSize(new java.awt.Dimension(80, 49));
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });

        loginicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_enter_48px.png"))); // NOI18N

        exitbtn.setBackground(new java.awt.Color(23, 35, 51));
        exitbtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        exitbtn.setForeground(new java.awt.Color(255, 255, 255));
        exitbtn.setLabel("Exit");
        exitbtn.setMinimumSize(new java.awt.Dimension(80, 49));
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });

        exiticon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_exit_48px.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(infolabel, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                    .addComponent(infolabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(infolabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(300, 300, 300))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mainlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(loginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(loginicon)
                                .addGap(538, 538, 538)
                                .addComponent(exiticon)
                                .addGap(10, 10, 10)
                                .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(390, 390, 390)
                        .addComponent(uidcnumbertext, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(390, 390, 390)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(mainlabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(infolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(infolabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(uidcnumbertext, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(infolabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(loginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginicon)))
                    .addComponent(exiticon))
                .addGap(59, 59, 59))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void login() {

        /*
        1) ^ - start of the string
        2) (?=.*[0-9]) - Positive look ahead expression for any number
        3) (?=.*[a-z]) - Positive look ahead expression for lower case letter
        4) (?=.*[A-Z]) - Positive look ahead expression for upper case letter
        5) (?=.*[!@#$%^&*]) - Positive look ahead expression for any special character
        6) (?=\\S+$) - Positive look ahead expression for \S (non-space character)
        7) . – any character
        8) {8,} - minimum 8 characters in length
        9) $ - end of the string
         */
        int type = 0;
        if (uidcnumbertext.getText().length() == 16) {
            type = 1;
        }

        if (!uidcnumbertext.getText().isBlank() && !new String(password.getPassword()).isBlank()) {
            if (Database.exists("Accounts", ((type == 0) ? ("ID") : ("CardNumber")), uidcnumbertext.getText())) {
                if (Database.getInt("Accounts", ((type == 0) ? ("ID") : ("CardNumber")), uidcnumbertext.getText(), "AccountType") == 0) {
                    if (new String(password.getPassword()).matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*])(?=\\S+$).{8,15}$")) {
                        if (new String(password.getPassword()).equals(Database.getString("Accounts", ((type == 0) ? ("ID") : ("CardNumber")), uidcnumbertext.getText(), "Password"))) {
                            String[] load = Database.getArray("Accounts", ((type == 0) ? ("ID") : ("CardNumber")), uidcnumbertext.getText());
                            Customer customer = new Customer();
                            customer.getId().setID(load[0]);
                            customer.setCardNumber(load[2], 0);
                            customer.getId().setFullName(load[3], 0);
                            customer.getId().setDateOfBirth(load[4], 0);
                            customer.setJob(load[5], 0);
                            customer.setPhoneNumber(load[6], 0);
                            customer.setDollar(Database.isBigDecimal(load[7]), 0);
                            customer.setEuro(Database.isBigDecimal(load[8]), 0);
                            customer.setPound(Database.isBigDecimal(load[9]), 0);
                            customer.setTurkishLira(Database.isBigDecimal(load[10]), 0);
                            customer.setHomeAddress(load[11], 0);
                            customer.setPassword(load[12], 0);
                            Data.setCustomer(customer);
                            frame.ChangeJPanel("HomeCustomer");
                        } else {
                            infolabel.setText("The password doesn't match.");
                        }
                    } else {
                        infolabel.setText("The password doesn't follow the rules.");
                    }
                } else {
                    infolabel.setText("The account type is invalid.");
                }
            } else {
                infolabel.setText("The user ID or card number is invalid.");
            }
        } else {
            infolabel.setText("The user ID or card number can't be left blank.");
        }
    }

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
        login();
    }//GEN-LAST:event_loginbtnActionPerformed

    private void uidcnumbertextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uidcnumbertextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uidcnumbertextActionPerformed

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        frame.ChangeJPanel("MainSelect");
    }//GEN-LAST:event_exitbtnActionPerformed

    private void uidcnumbertextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uidcnumbertextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            login();
        }
    }//GEN-LAST:event_uidcnumbertextKeyPressed

    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            login();
        }
    }//GEN-LAST:event_passwordKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button exitbtn;
    private javax.swing.JLabel exiticon;
    private javax.swing.JLabel infolabel;
    private javax.swing.JLabel infolabel2;
    private javax.swing.JLabel infolabel3;
    private java.awt.Button loginbtn;
    private javax.swing.JLabel loginicon;
    private javax.swing.JLabel mainlabel;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField uidcnumbertext;
    // End of variables declaration//GEN-END:variables
}
