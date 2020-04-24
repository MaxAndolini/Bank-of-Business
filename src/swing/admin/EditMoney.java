/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.admin;

import library.*;

/**
 *
 * @author ercan
 */
public class EditMoney extends javax.swing.JPanel {

    final private swing.Home frame;

    /**
     * Creates new form EditMoney
     *
     * @param home
     */
    public EditMoney(swing.Home home) {
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

        mainlabel = new javax.swing.JLabel();
        editbtn = new java.awt.Button();
        dollartext = new javax.swing.JTextField();
        infolabel = new javax.swing.JLabel();
        cancelbtn = new java.awt.Button();
        infolabel2 = new javax.swing.JLabel();
        editicon = new javax.swing.JLabel();
        cancelicon = new javax.swing.JLabel();
        infolabel4 = new javax.swing.JLabel();
        infolabel5 = new javax.swing.JLabel();
        eurotext = new javax.swing.JTextField();
        turkishliratext = new javax.swing.JTextField();
        poundtext = new javax.swing.JTextField();
        infolabel6 = new javax.swing.JLabel();
        searchfullnametext = new javax.swing.JTextField();
        infolabel8 = new javax.swing.JLabel();
        okbtn = new java.awt.Button();

        setBackground(new java.awt.Color(71, 120, 197));
        setMaximumSize(new java.awt.Dimension(1070, 590));
        setMinimumSize(new java.awt.Dimension(1070, 590));
        setPreferredSize(new java.awt.Dimension(1070, 590));

        mainlabel.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        mainlabel.setForeground(new java.awt.Color(255, 255, 255));
        mainlabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mainlabel.setText("Edit Money");

        editbtn.setBackground(new java.awt.Color(23, 35, 51));
        editbtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        editbtn.setForeground(new java.awt.Color(255, 255, 255));
        editbtn.setLabel("Edit");
        editbtn.setMinimumSize(new java.awt.Dimension(80, 49));
        editbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbtnActionPerformed(evt);
            }
        });

        dollartext.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        dollartext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dollartext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dollartextActionPerformed(evt);
            }
        });

        infolabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        infolabel.setForeground(new java.awt.Color(255, 255, 255));
        infolabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

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

        infolabel2.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        infolabel2.setForeground(new java.awt.Color(255, 255, 255));
        infolabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infolabel2.setText("Dollar");

        editicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_change_48px_1.png"))); // NOI18N

        cancelicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_exit_48px.png"))); // NOI18N

        infolabel4.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        infolabel4.setForeground(new java.awt.Color(255, 255, 255));
        infolabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infolabel4.setText("Euro");

        infolabel5.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        infolabel5.setForeground(new java.awt.Color(255, 255, 255));
        infolabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infolabel5.setText("Pound");

        eurotext.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        eurotext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        eurotext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eurotextActionPerformed(evt);
            }
        });

        turkishliratext.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        turkishliratext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        turkishliratext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turkishliratextActionPerformed(evt);
            }
        });

        poundtext.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        poundtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        poundtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poundtextActionPerformed(evt);
            }
        });

        infolabel6.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        infolabel6.setForeground(new java.awt.Color(255, 255, 255));
        infolabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infolabel6.setText("Turkish Lira");

        searchfullnametext.setBackground(new java.awt.Color(23, 35, 51));
        searchfullnametext.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        searchfullnametext.setForeground(new java.awt.Color(255, 255, 255));
        searchfullnametext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        searchfullnametext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchfullnametextActionPerformed(evt);
            }
        });

        infolabel8.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        infolabel8.setForeground(new java.awt.Color(255, 255, 255));
        infolabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        infolabel8.setText("Search Full Name:");

        okbtn.setBackground(new java.awt.Color(23, 35, 51));
        okbtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        okbtn.setForeground(new java.awt.Color(255, 255, 255));
        okbtn.setLabel("OK");
        okbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mainlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(editbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editicon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelicon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(infolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(300, 300, 300))
            .addGroup(layout.createSequentialGroup()
                .addGap(390, 390, 390)
                .addComponent(turkishliratext, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 390, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(dollartext, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(eurotext, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(poundtext, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(infolabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(infolabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(infolabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(infolabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(infolabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchfullnametext, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(okbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(mainlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchfullnametext, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(infolabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(infolabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(infolabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(infolabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(poundtext, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eurotext, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dollartext, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(infolabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(turkishliratext, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(editbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(editicon)))
                            .addComponent(cancelicon)))
                    .addComponent(okbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void editbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbtnActionPerformed
        frame.ChangeJPanel("HomeAdmin");
    }//GEN-LAST:event_editbtnActionPerformed

    private void dollartextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dollartextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dollartextActionPerformed

    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtnActionPerformed
        frame.ChangeJPanel("HomeAdmin");
    }//GEN-LAST:event_cancelbtnActionPerformed

    private void eurotextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eurotextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eurotextActionPerformed

    private void turkishliratextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turkishliratextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_turkishliratextActionPerformed

    private void poundtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poundtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_poundtextActionPerformed

    private void searchfullnametextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchfullnametextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchfullnametextActionPerformed

    private void okbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_okbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button cancelbtn;
    private javax.swing.JLabel cancelicon;
    private javax.swing.JTextField dollartext;
    private java.awt.Button editbtn;
    private javax.swing.JLabel editicon;
    private javax.swing.JTextField eurotext;
    private javax.swing.JLabel infolabel;
    private javax.swing.JLabel infolabel2;
    private javax.swing.JLabel infolabel4;
    private javax.swing.JLabel infolabel5;
    private javax.swing.JLabel infolabel6;
    private javax.swing.JLabel infolabel8;
    private javax.swing.JLabel mainlabel;
    private java.awt.Button okbtn;
    private javax.swing.JTextField poundtext;
    private javax.swing.JTextField searchfullnametext;
    private javax.swing.JTextField turkishliratext;
    // End of variables declaration//GEN-END:variables
}
