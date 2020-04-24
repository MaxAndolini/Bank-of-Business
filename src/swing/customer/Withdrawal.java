/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.customer;

import library.*;

/**
 *
 * @author ercan
 */
public class Withdrawal extends javax.swing.JPanel {

    final private swing.Home frame;

    /**
     * Creates new form Withdrawal
     *
     * @param home
     */
    public Withdrawal(swing.Home home) {
        initComponents();
        frame = home;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        onehbtn = new java.awt.Button();
        twohbtn = new java.awt.Button();
        fourtybtn = new java.awt.Button();
        twentybtn = new java.awt.Button();
        threehbtn = new java.awt.Button();
        mainlabel = new javax.swing.JLabel();
        onehicon = new javax.swing.JLabel();
        twohicon = new javax.swing.JLabel();
        twentyicon = new javax.swing.JLabel();
        fourtyicon = new javax.swing.JLabel();
        threehicon = new javax.swing.JLabel();
        sixtybtn = new java.awt.Button();
        sixtyicon = new javax.swing.JLabel();
        cancelbtn = new java.awt.Button();
        cancelicon = new javax.swing.JLabel();
        eightybtn = new java.awt.Button();
        eightyicon = new javax.swing.JLabel();
        moneytext = new javax.swing.JTextField();
        infolabel = new javax.swing.JLabel();
        okbtn = new java.awt.Button();
        jPanel1 = new javax.swing.JPanel();
        dolarlabel = new javax.swing.JLabel();
        eurolabel = new javax.swing.JLabel();
        poundlabel = new javax.swing.JLabel();
        turkishliralabel = new javax.swing.JLabel();
        dolaralabel = new javax.swing.JLabel();
        euroalabel = new javax.swing.JLabel();
        poundalabel = new javax.swing.JLabel();
        turkishliraalabel = new javax.swing.JLabel();
        moneytype = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(71, 120, 197));
        setMaximumSize(new java.awt.Dimension(1070, 590));
        setMinimumSize(new java.awt.Dimension(1070, 590));
        setPreferredSize(new java.awt.Dimension(1070, 590));

        onehbtn.setBackground(new java.awt.Color(23, 35, 51));
        onehbtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        onehbtn.setForeground(new java.awt.Color(133, 187, 101));
        onehbtn.setLabel("$100");
        onehbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onehbtnActionPerformed(evt);
            }
        });

        twohbtn.setBackground(new java.awt.Color(23, 35, 51));
        twohbtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        twohbtn.setForeground(new java.awt.Color(133, 187, 101));
        twohbtn.setLabel("$200");
        twohbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twohbtnActionPerformed(evt);
            }
        });

        fourtybtn.setBackground(new java.awt.Color(23, 35, 51));
        fourtybtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        fourtybtn.setForeground(new java.awt.Color(133, 187, 101));
        fourtybtn.setLabel("$40");
        fourtybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourtybtnActionPerformed(evt);
            }
        });

        twentybtn.setBackground(new java.awt.Color(23, 35, 51));
        twentybtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        twentybtn.setForeground(new java.awt.Color(133, 187, 101));
        twentybtn.setLabel("$20");
        twentybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twentybtnActionPerformed(evt);
            }
        });

        threehbtn.setBackground(new java.awt.Color(23, 35, 51));
        threehbtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        threehbtn.setForeground(new java.awt.Color(133, 187, 101));
        threehbtn.setLabel("$300");
        threehbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threehbtnActionPerformed(evt);
            }
        });

        mainlabel.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        mainlabel.setForeground(new java.awt.Color(255, 255, 255));
        mainlabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mainlabel.setText("Withdrawal");
        mainlabel.setMaximumSize(new java.awt.Dimension(223, 47));
        mainlabel.setMinimumSize(new java.awt.Dimension(223, 47));
        mainlabel.setPreferredSize(new java.awt.Dimension(223, 47));

        onehicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_money_48px.png"))); // NOI18N

        twohicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_money_48px.png"))); // NOI18N

        twentyicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_money_48px.png"))); // NOI18N

        fourtyicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_money_48px.png"))); // NOI18N

        threehicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_money_48px.png"))); // NOI18N

        sixtybtn.setBackground(new java.awt.Color(23, 35, 51));
        sixtybtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        sixtybtn.setForeground(new java.awt.Color(133, 187, 101));
        sixtybtn.setLabel("$60");
        sixtybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixtybtnActionPerformed(evt);
            }
        });

        sixtyicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_money_48px.png"))); // NOI18N

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

        eightybtn.setBackground(new java.awt.Color(23, 35, 51));
        eightybtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        eightybtn.setForeground(new java.awt.Color(133, 187, 101));
        eightybtn.setLabel("$80");
        eightybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightybtnActionPerformed(evt);
            }
        });

        eightyicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_money_48px.png"))); // NOI18N

        moneytext.setBackground(new java.awt.Color(23, 35, 51));
        moneytext.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        moneytext.setForeground(new java.awt.Color(255, 255, 255));
        moneytext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        moneytext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moneytextActionPerformed(evt);
            }
        });

        infolabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        infolabel.setForeground(new java.awt.Color(255, 255, 255));
        infolabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infolabel.setText("Select an amount or enter another amount and press OK.");

        okbtn.setBackground(new java.awt.Color(23, 35, 51));
        okbtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        okbtn.setForeground(new java.awt.Color(255, 255, 255));
        okbtn.setLabel("OK");
        okbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okbtnActionPerformed(evt);
            }
        });

        dolarlabel.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        dolarlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dolarlabel.setText("Dollar:");

        eurolabel.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        eurolabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eurolabel.setText("Euro:");

        poundlabel.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        poundlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        poundlabel.setText("Pound:");

        turkishliralabel.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        turkishliralabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        turkishliralabel.setText("Turkish Lira:");

        dolaralabel.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        dolaralabel.setForeground(new java.awt.Color(133, 187, 101));
        dolaralabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dolaralabel.setText("$500");

        euroalabel.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        euroalabel.setForeground(new java.awt.Color(133, 187, 101));
        euroalabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        euroalabel.setText("€400");

        poundalabel.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        poundalabel.setForeground(new java.awt.Color(133, 187, 101));
        poundalabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        poundalabel.setText("£200");

        turkishliraalabel.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        turkishliraalabel.setForeground(new java.awt.Color(133, 187, 101));
        turkishliraalabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        turkishliraalabel.setText("₺500");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dolarlabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dolaralabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(eurolabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(euroalabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(turkishliralabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(turkishliraalabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(poundlabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(poundalabel, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dolarlabel)
                    .addComponent(dolaralabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eurolabel)
                    .addComponent(euroalabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(poundlabel)
                    .addComponent(poundalabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(turkishliralabel)
                    .addComponent(turkishliraalabel))
                .addContainerGap())
        );

        moneytype.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        moneytype.setForeground(new java.awt.Color(23, 35, 51));
        moneytype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dollar", "Euro", "Pound", "Turkish Lira" }));
        moneytype.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(mainlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelicon)
                        .addGap(220, 220, 220)
                        .addComponent(okbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eightyicon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eightybtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(threehbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(threehicon))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(twohbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(twohicon))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(onehbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(onehicon)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(fourtyicon)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fourtybtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(121, 121, 121)
                                        .addComponent(twentyicon)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(twentybtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(moneytext, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(moneytype, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sixtyicon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sixtybtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(infolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(300, 300, 300))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(mainlabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(twentybtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(twentyicon))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fourtybtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fourtyicon)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(onehbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(onehicon))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(twohbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(twohicon)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(threehbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(threehicon)
                            .addComponent(sixtybtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sixtyicon))
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(moneytext, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(moneytype, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelicon)
                    .addComponent(eightybtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eightyicon)
                    .addComponent(okbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void onehbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onehbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_onehbtnActionPerformed

    private void twohbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twohbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_twohbtnActionPerformed

    private void fourtybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourtybtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fourtybtnActionPerformed

    private void twentybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twentybtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_twentybtnActionPerformed

    private void threehbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threehbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_threehbtnActionPerformed

    private void sixtybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixtybtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sixtybtnActionPerformed

    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtnActionPerformed
        frame.ChangeJPanel("HomeCustomer");
    }//GEN-LAST:event_cancelbtnActionPerformed

    private void eightybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightybtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eightybtnActionPerformed

    private void moneytextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moneytextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_moneytextActionPerformed

    private void okbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_okbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button cancelbtn;
    private javax.swing.JLabel cancelicon;
    private javax.swing.JLabel dolaralabel;
    private javax.swing.JLabel dolarlabel;
    private java.awt.Button eightybtn;
    private javax.swing.JLabel eightyicon;
    private javax.swing.JLabel euroalabel;
    private javax.swing.JLabel eurolabel;
    private java.awt.Button fourtybtn;
    private javax.swing.JLabel fourtyicon;
    private javax.swing.JLabel infolabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mainlabel;
    private javax.swing.JTextField moneytext;
    private javax.swing.JComboBox<String> moneytype;
    private java.awt.Button okbtn;
    private java.awt.Button onehbtn;
    private javax.swing.JLabel onehicon;
    private javax.swing.JLabel poundalabel;
    private javax.swing.JLabel poundlabel;
    private java.awt.Button sixtybtn;
    private javax.swing.JLabel sixtyicon;
    private java.awt.Button threehbtn;
    private javax.swing.JLabel threehicon;
    private javax.swing.JLabel turkishliraalabel;
    private javax.swing.JLabel turkishliralabel;
    private java.awt.Button twentybtn;
    private javax.swing.JLabel twentyicon;
    private java.awt.Button twohbtn;
    private javax.swing.JLabel twohicon;
    // End of variables declaration//GEN-END:variables
}
