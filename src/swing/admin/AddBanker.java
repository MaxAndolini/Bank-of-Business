/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.admin;

import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import javax.swing.text.AbstractDocument;
import library.*;

/**
 *
 * @author ercan
 */
public class AddBanker extends javax.swing.JPanel {

    final private swing.Home frame;

    /**
     * Creates new form AddBanker
     *
     * @param home Dynamic panel.
     */
    public AddBanker(swing.Home home) {
        initComponents();
        frame = home;

        ((AbstractDocument) fullnametext.getDocument()).setDocumentFilter(new Filter(0, 32));
        ((AbstractDocument) dateofbirthtext.getDocument()).setDocumentFilter(new Filter(0, 10));
        ((AbstractDocument) phonenumbertext.getDocument()).setDocumentFilter(new Filter(1, 11));
        ((AbstractDocument) homeaddresstext.getDocument()).setDocumentFilter(new Filter(0, 32));
        ((AbstractDocument) passwordtext.getDocument()).setDocumentFilter(new Filter(0, 15));
        ((AbstractDocument) salarytext.getDocument()).setDocumentFilter(new Filter(0, 15));
    }

    public void addBanker() {

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
        if (!fullnametext.getText().isBlank() && !dateofbirthtext.getText().isBlank() && !phonenumbertext.getText().isBlank() && !homeaddresstext.getText().isBlank() && !passwordtext.getText().isBlank() && !salarytext.getText().isBlank()) {
            if (Data.dateValidation(dateofbirthtext.getText())) {
                if (passwordtext.getText().matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*])(?=\\S+$).{8,15}$")) {
                    BigDecimal salary = Database.isBigDecimal(salarytext.getText());
                    if (salary.compareTo(BigDecimal.ZERO) > 0 && salary.compareTo(new BigDecimal("-1")) != 0) {
                        String ID = Database.create("Accounts");
                        if (ID != null) {
                            Database.set("Accounts", "ID", ID, "AccountType", 1);
                            Database.set("Accounts", "ID", ID, "FullName", fullnametext.getText());
                            Database.set("Accounts", "ID", ID, "DateofBirth", dateofbirthtext.getText());
                            Database.set("Accounts", "ID", ID, "PhoneNumber", phonenumbertext.getText());
                            Database.set("Accounts", "ID", ID, "HomeAddress", homeaddresstext.getText());
                            Database.set("Accounts", "ID", ID, "Password", passwordtext.getText());
                            Database.set("Accounts", "ID", ID, "Salary", salary);
                            fullnametext.setText(null);
                            dateofbirthtext.setText(null);
                            phonenumbertext.setText(null);
                            homeaddresstext.setText(null);
                            passwordtext.setText(null);
                            salarytext.setText(null);
                            infolabel.setText("The banker was successfully added. [ID: " + ID + "]");
                        } else {
                            infolabel.setText("System error and the banker couldn't be created.");
                        }
                    } else {
                        infolabel.setText("The salary doesn't follow the rules.");
                    }
                } else {
                    infolabel.setText("The password doesn't follow the rules.");
                }
            } else {
                infolabel.setText("The date of birth doesn't follow the rules.");
            }
        } else {
            infolabel.setText("The field can't be left blank.");
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

        mainlabel = new javax.swing.JLabel();
        infolabel = new javax.swing.JLabel();
        infolabel2 = new javax.swing.JLabel();
        fullnametext = new javax.swing.JTextField();
        infolabel3 = new javax.swing.JLabel();
        dateofbirthtext = new javax.swing.JTextField();
        infolabel4 = new javax.swing.JLabel();
        phonenumbertext = new javax.swing.JTextField();
        infolabel5 = new javax.swing.JLabel();
        homeaddresstext = new javax.swing.JTextField();
        infolabel6 = new javax.swing.JLabel();
        passwordtext = new javax.swing.JTextField();
        infolabel7 = new javax.swing.JLabel();
        salarytext = new javax.swing.JTextField();
        addbtn = new java.awt.Button();
        addicon = new javax.swing.JLabel();
        cancelbtn = new java.awt.Button();
        cancelicon = new javax.swing.JLabel();

        setBackground(new java.awt.Color(71, 120, 197));
        setMaximumSize(new java.awt.Dimension(1070, 590));
        setMinimumSize(new java.awt.Dimension(1070, 590));
        setPreferredSize(new java.awt.Dimension(1070, 590));

        mainlabel.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        mainlabel.setForeground(new java.awt.Color(255, 255, 255));
        mainlabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mainlabel.setText("Add Banker");
        mainlabel.setMaximumSize(new java.awt.Dimension(223, 47));
        mainlabel.setMinimumSize(new java.awt.Dimension(223, 47));
        mainlabel.setPreferredSize(new java.awt.Dimension(223, 47));

        infolabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        infolabel.setForeground(new java.awt.Color(255, 255, 255));
        infolabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        infolabel2.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        infolabel2.setForeground(new java.awt.Color(255, 255, 255));
        infolabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infolabel2.setText("Full Name");

        fullnametext.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        fullnametext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fullnametext.setMaximumSize(new java.awt.Dimension(7, 39));
        fullnametext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullnametextActionPerformed(evt);
            }
        });
        fullnametext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fullnametextKeyPressed(evt);
            }
        });

        infolabel3.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        infolabel3.setForeground(new java.awt.Color(255, 255, 255));
        infolabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infolabel3.setText("Date of Birth");

        dateofbirthtext.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        dateofbirthtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dateofbirthtext.setMaximumSize(new java.awt.Dimension(7, 39));
        dateofbirthtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateofbirthtextActionPerformed(evt);
            }
        });
        dateofbirthtext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dateofbirthtextKeyPressed(evt);
            }
        });

        infolabel4.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        infolabel4.setForeground(new java.awt.Color(255, 255, 255));
        infolabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infolabel4.setText("Phone Number");

        phonenumbertext.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        phonenumbertext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        phonenumbertext.setMaximumSize(new java.awt.Dimension(7, 39));
        phonenumbertext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonenumbertextActionPerformed(evt);
            }
        });
        phonenumbertext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                phonenumbertextKeyPressed(evt);
            }
        });

        infolabel5.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        infolabel5.setForeground(new java.awt.Color(255, 255, 255));
        infolabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infolabel5.setText("Home Address");

        homeaddresstext.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        homeaddresstext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        homeaddresstext.setMaximumSize(new java.awt.Dimension(7, 39));
        homeaddresstext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeaddresstextActionPerformed(evt);
            }
        });
        homeaddresstext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                homeaddresstextKeyPressed(evt);
            }
        });

        infolabel6.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        infolabel6.setForeground(new java.awt.Color(255, 255, 255));
        infolabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infolabel6.setText("Password");

        passwordtext.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        passwordtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordtext.setMaximumSize(new java.awt.Dimension(7, 39));
        passwordtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordtextActionPerformed(evt);
            }
        });
        passwordtext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordtextKeyPressed(evt);
            }
        });

        infolabel7.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        infolabel7.setForeground(new java.awt.Color(255, 255, 255));
        infolabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infolabel7.setText("Salary");

        salarytext.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        salarytext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        salarytext.setMaximumSize(new java.awt.Dimension(7, 39));
        salarytext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salarytextActionPerformed(evt);
            }
        });
        salarytext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                salarytextKeyPressed(evt);
            }
        });

        addbtn.setBackground(new java.awt.Color(23, 35, 51));
        addbtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        addbtn.setForeground(new java.awt.Color(255, 255, 255));
        addbtn.setLabel("Add");
        addbtn.setMinimumSize(new java.awt.Dimension(80, 49));
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        addicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_add_property_48px.png"))); // NOI18N

        cancelbtn.setBackground(new java.awt.Color(23, 35, 51));
        cancelbtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        cancelbtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelbtn.setLabel("Cancel");
        cancelbtn.setMinimumSize(new java.awt.Dimension(80, 49));
        cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtnActionPerformed(evt);
            }
        });

        cancelicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_exit_48px.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(infolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(300, 300, 300))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(infolabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(fullnametext, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(infolabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(infolabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(infolabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(infolabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(infolabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateofbirthtext, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordtext, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phonenumbertext, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(salarytext, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mainlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(addicon)
                                .addGap(538, 538, 538)
                                .addComponent(cancelicon)
                                .addGap(10, 10, 10)
                                .addComponent(cancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(homeaddresstext, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infolabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infolabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infolabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fullnametext, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateofbirthtext, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phonenumbertext, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infolabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infolabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infolabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homeaddresstext, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordtext, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salarytext, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addicon)))
                    .addComponent(cancelicon))
                .addGap(59, 59, 59))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        addBanker();
    }//GEN-LAST:event_addbtnActionPerformed

    private void fullnametextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullnametextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullnametextActionPerformed

    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtnActionPerformed
        frame.ChangeJPanel("HomeAdmin");
    }//GEN-LAST:event_cancelbtnActionPerformed

    private void homeaddresstextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeaddresstextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homeaddresstextActionPerformed

    private void dateofbirthtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateofbirthtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateofbirthtextActionPerformed

    private void passwordtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordtextActionPerformed

    private void phonenumbertextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonenumbertextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonenumbertextActionPerformed

    private void salarytextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salarytextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salarytextActionPerformed

    private void fullnametextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fullnametextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            addBanker();
        }
    }//GEN-LAST:event_fullnametextKeyPressed

    private void homeaddresstextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_homeaddresstextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            addBanker();
        }
    }//GEN-LAST:event_homeaddresstextKeyPressed

    private void dateofbirthtextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dateofbirthtextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            addBanker();
        }
    }//GEN-LAST:event_dateofbirthtextKeyPressed

    private void passwordtextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordtextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            addBanker();
        }
    }//GEN-LAST:event_passwordtextKeyPressed

    private void phonenumbertextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phonenumbertextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            addBanker();
        }
    }//GEN-LAST:event_phonenumbertextKeyPressed

    private void salarytextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_salarytextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            addBanker();
        }
    }//GEN-LAST:event_salarytextKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button addbtn;
    private javax.swing.JLabel addicon;
    private java.awt.Button cancelbtn;
    private javax.swing.JLabel cancelicon;
    private javax.swing.JTextField dateofbirthtext;
    private javax.swing.JTextField fullnametext;
    private javax.swing.JTextField homeaddresstext;
    private javax.swing.JLabel infolabel;
    private javax.swing.JLabel infolabel2;
    private javax.swing.JLabel infolabel3;
    private javax.swing.JLabel infolabel4;
    private javax.swing.JLabel infolabel5;
    private javax.swing.JLabel infolabel6;
    private javax.swing.JLabel infolabel7;
    private javax.swing.JLabel mainlabel;
    private javax.swing.JTextField passwordtext;
    private javax.swing.JTextField phonenumbertext;
    private javax.swing.JTextField salarytext;
    // End of variables declaration//GEN-END:variables
}
