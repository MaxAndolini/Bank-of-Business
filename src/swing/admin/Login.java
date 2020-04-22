/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.admin;

/**
 *
 * @author ercan
 */
public class Login extends javax.swing.JPanel {

    final private swing.Home frame;
    
    /**
     * Creates new form Login
     * @param home
     */
    public Login(swing.Home home) {
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
        loginbtn = new java.awt.Button();
        uidtext = new javax.swing.JTextField();
        infolabel = new javax.swing.JLabel();
        exitbtn = new java.awt.Button();
        infolabel2 = new javax.swing.JLabel();
        infolabel3 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        loginicon = new javax.swing.JLabel();
        exiticon = new javax.swing.JLabel();

        setBackground(new java.awt.Color(71, 120, 197));
        setMaximumSize(new java.awt.Dimension(1070, 590));
        setMinimumSize(new java.awt.Dimension(1070, 590));
        setPreferredSize(new java.awt.Dimension(1070, 590));

        mainlabel.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        mainlabel.setForeground(new java.awt.Color(255, 255, 255));
        mainlabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mainlabel.setText("Admin - Login");

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

        uidtext.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        uidtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        uidtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uidtextActionPerformed(evt);
            }
        });

        infolabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        infolabel.setForeground(new java.awt.Color(255, 255, 255));
        infolabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

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

        infolabel2.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        infolabel2.setForeground(new java.awt.Color(255, 255, 255));
        infolabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infolabel2.setText("Enter User ID");

        infolabel3.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        infolabel3.setForeground(new java.awt.Color(255, 255, 255));
        infolabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infolabel3.setText("Password");

        password.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        loginicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_enter_48px.png"))); // NOI18N

        exiticon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_exit_48px.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mainlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(loginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(loginicon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 538, Short.MAX_VALUE)
                                .addComponent(exiticon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(390, 390, 390)
                        .addComponent(uidtext, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(infolabel, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                    .addComponent(infolabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(infolabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(300, 300, 300))
            .addGroup(layout.createSequentialGroup()
                .addGap(390, 390, 390)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(mainlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(infolabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(uidtext, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
        frame.ChangeJPanel("HomeAdmin");
    }//GEN-LAST:event_loginbtnActionPerformed

    private void uidtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uidtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uidtextActionPerformed

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        frame.ChangeJPanel("MainSelect");
    }//GEN-LAST:event_exitbtnActionPerformed


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
    private javax.swing.JTextField uidtext;
    // End of variables declaration//GEN-END:variables
}
