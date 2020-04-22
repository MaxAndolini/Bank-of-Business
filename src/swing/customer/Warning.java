/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.customer;

/**
 *
 * @author ercan
 */
public class Warning extends javax.swing.JPanel {

    final private swing.Home frame;
    
    /**
     * Creates new form Warning
     * @param home
     */
    public Warning(swing.Home home) {
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

        yesbtn = new java.awt.Button();
        mainlabel = new javax.swing.JLabel();
        yesicon = new javax.swing.JLabel();
        nobtn = new java.awt.Button();
        noicon = new javax.swing.JLabel();
        backbtn = new java.awt.Button();
        backicon = new javax.swing.JLabel();
        mainmenubtn = new java.awt.Button();
        mainmenuicon = new javax.swing.JLabel();
        infolabel = new javax.swing.JLabel();
        infolabel2 = new javax.swing.JLabel();
        infolabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(71, 120, 197));
        setMaximumSize(new java.awt.Dimension(1070, 590));
        setMinimumSize(new java.awt.Dimension(1070, 590));
        setPreferredSize(new java.awt.Dimension(1070, 590));

        yesbtn.setBackground(new java.awt.Color(23, 35, 51));
        yesbtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        yesbtn.setForeground(new java.awt.Color(133, 187, 101));
        yesbtn.setLabel("Yes");
        yesbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesbtnActionPerformed(evt);
            }
        });

        mainlabel.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        mainlabel.setForeground(new java.awt.Color(255, 255, 255));
        mainlabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mainlabel.setText("Warning");

        yesicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_ok_48px.png"))); // NOI18N

        nobtn.setBackground(new java.awt.Color(23, 35, 51));
        nobtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        nobtn.setForeground(new java.awt.Color(133, 187, 101));
        nobtn.setLabel("No");
        nobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nobtnActionPerformed(evt);
            }
        });

        noicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_delete_48px.png"))); // NOI18N

        backbtn.setBackground(new java.awt.Color(23, 35, 51));
        backbtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        backbtn.setForeground(new java.awt.Color(255, 255, 255));
        backbtn.setLabel("Back");
        backbtn.setMinimumSize(new java.awt.Dimension(80, 49));
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        backicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_exit_48px.png"))); // NOI18N

        mainmenubtn.setBackground(new java.awt.Color(23, 35, 51));
        mainmenubtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        mainmenubtn.setForeground(new java.awt.Color(255, 255, 255));
        mainmenubtn.setLabel("Main Menu");
        mainmenubtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainmenubtnActionPerformed(evt);
            }
        });

        mainmenuicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_exit_48px.png"))); // NOI18N

        infolabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        infolabel.setForeground(new java.awt.Color(255, 255, 255));
        infolabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infolabel.setText("Amount entered is unacceptable.");

        infolabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        infolabel2.setForeground(new java.awt.Color(255, 255, 255));
        infolabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infolabel2.setText("Do you wish the continue?");

        infolabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        infolabel3.setForeground(new java.awt.Color(255, 255, 255));
        infolabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infolabel3.setText("Please enter amount in multiple of 10/50/100 only.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(yesbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yesicon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(noicon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(backicon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mainmenuicon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mainmenubtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mainlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(infolabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(infolabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(214, 214, 214))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(mainlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(infolabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(infolabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yesbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nobtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noicon)
                    .addComponent(yesicon, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backicon)
                    .addComponent(mainmenubtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainmenuicon))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void yesbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yesbtnActionPerformed

    private void nobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nobtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nobtnActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backbtnActionPerformed

    private void mainmenubtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainmenubtnActionPerformed
        frame.ChangeJPanel("HomeCustomer");
    }//GEN-LAST:event_mainmenubtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button backbtn;
    private javax.swing.JLabel backicon;
    private javax.swing.JLabel infolabel;
    private javax.swing.JLabel infolabel2;
    private javax.swing.JLabel infolabel3;
    private javax.swing.JLabel mainlabel;
    private java.awt.Button mainmenubtn;
    private javax.swing.JLabel mainmenuicon;
    private java.awt.Button nobtn;
    private javax.swing.JLabel noicon;
    private java.awt.Button yesbtn;
    private javax.swing.JLabel yesicon;
    // End of variables declaration//GEN-END:variables
}
