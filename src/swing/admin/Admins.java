/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.admin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AbstractDocument;
import library.*;

/**
 *
 * @author ercan
 */
public class Admins extends javax.swing.JPanel {

    final private swing.Home frame;
    Timer timer;
    String text;
    int type;

    /**
     * Creates new form Admins
     *
     * @param home Dynamic panel.
     */
    public Admins(swing.Home home) {
        initComponents();
        frame = home;

        ((AbstractDocument) searchtext.getDocument()).setDocumentFilter(new Filter(0, 32));
        adminstable.getTableHeader().setFont(new java.awt.Font("Segoe UI", 0, 18));

        String[] typename = {"ID", "FullName"};
        timer = new Timer(2000, new ActionListener() {
            ArrayList<ArrayList<String>> load = null;
            ArrayList<ArrayList<String>> data = null;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (text == null) {
                    data = Database.getArrayList("Accounts", "AccountType", 2);
                } else {
                    data = Database.getArrayList("Accounts", "AccountType", 2, typename[type], text);
                }
                if (load == null || (data != null && !load.equals(data))) {
                    DefaultTableModel model = (DefaultTableModel) adminstable.getModel();
                    if (load != null) {
                        model.setRowCount(0);
                    }
                    load = (ArrayList<ArrayList<String>>) data.clone();
                    Collections.sort(data, new CustomComparator(0));
                    Integer columns[] = {0, 3, 4, 6, 11, 13};
                    for (int i = 0; i < data.size(); i++) {
                        int column = 0;
                        String[] row = new String[data.get(i).size()];
                        for (int j = 0; j < data.get(i).size(); j++) {
                            if (Arrays.asList(columns).contains(j)) {
                                row[column] = data.get(i).get(j);
                                column++;
                            }
                        }
                        model.addRow(row);
                    }
                }
            }
        });
        timer.setInitialDelay(0);
        timer.start();
    }

    public void admins() {
        String[] typename = {"ID", "FullName"};
        if (!searchtext.getText().isBlank()) {
            if (Database.exists("Accounts", typename[searchtype.getSelectedIndex()], searchtext.getText())) {
                if (Database.getInt("Accounts", typename[searchtype.getSelectedIndex()], searchtext.getText(), "AccountType") == 2) {
                    text = searchtext.getText();
                    type = searchtype.getSelectedIndex();
                    searchtext.setText(null);
                    searchtype.setSelectedIndex(0);
                    infolabel.setText("The admin was successfully found.");
                } else {
                    infolabel.setText("The account type is invalid.");
                }
            } else {
                infolabel.setText("The admin is invalid.");
            }
        } else {
            infolabel.setText("The field can't be left blank.");
        }
    }

    public void clear() {
        searchtext.setText(null);
        searchtype.setSelectedIndex(0);
        text = null;
        type = 0;
        infolabel.setText("The search was successfully cleared.");
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
        searchtext = new javax.swing.JTextField();
        searchtype = new javax.swing.JComboBox<>();
        okbtn = new java.awt.Button();
        clearbtn = new java.awt.Button();
        jScrollPane = new javax.swing.JScrollPane();
        adminstable = new javax.swing.JTable();
        cancelbtn = new java.awt.Button();
        cancelicon = new javax.swing.JLabel();

        setBackground(new java.awt.Color(71, 120, 197));
        setMaximumSize(new java.awt.Dimension(1070, 590));
        setMinimumSize(new java.awt.Dimension(1070, 590));
        setPreferredSize(new java.awt.Dimension(1070, 590));

        mainlabel.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        mainlabel.setForeground(new java.awt.Color(255, 255, 255));
        mainlabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mainlabel.setText("Admins");
        mainlabel.setMaximumSize(new java.awt.Dimension(223, 47));
        mainlabel.setMinimumSize(new java.awt.Dimension(223, 47));
        mainlabel.setPreferredSize(new java.awt.Dimension(223, 47));

        infolabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        infolabel.setForeground(new java.awt.Color(255, 255, 255));
        infolabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        infolabel2.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        infolabel2.setForeground(new java.awt.Color(255, 255, 255));
        infolabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infolabel2.setText("Search:");

        searchtext.setBackground(new java.awt.Color(23, 35, 51));
        searchtext.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        searchtext.setForeground(new java.awt.Color(255, 255, 255));
        searchtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        searchtext.setMaximumSize(new java.awt.Dimension(7, 39));
        searchtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchtextActionPerformed(evt);
            }
        });
        searchtext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchtextKeyPressed(evt);
            }
        });

        searchtype.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        searchtype.setForeground(new java.awt.Color(23, 35, 51));
        searchtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Full Name" }));
        searchtype.setToolTipText("");

        okbtn.setBackground(new java.awt.Color(23, 35, 51));
        okbtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        okbtn.setForeground(new java.awt.Color(255, 255, 255));
        okbtn.setLabel("OK");
        okbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okbtnActionPerformed(evt);
            }
        });

        clearbtn.setBackground(new java.awt.Color(23, 35, 51));
        clearbtn.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        clearbtn.setForeground(new java.awt.Color(255, 255, 255));
        clearbtn.setLabel("Clear");
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });

        adminstable.setAutoCreateRowSorter(true);
        adminstable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        adminstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Full Name", "Date of Birth", "Phone Number", "Home Address", "Salary"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        adminstable.setRowHeight(30);
        adminstable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        adminstable.getTableHeader().setReorderingAllowed(false);
        jScrollPane.setViewportView(adminstable);

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
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(infolabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(searchtext, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(searchtype, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(okbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(300, 300, 300)
                                .addComponent(infolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mainlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(cancelicon)))))
                        .addGap(290, 290, 290))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane)))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(mainlabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(infolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchtext, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(infolabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchtype, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(okbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelicon))
                .addGap(59, 59, 59))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtnActionPerformed
        if (timer != null) {
            timer.stop();
        }
        frame.ChangeJPanel("HomeAdmin");
    }//GEN-LAST:event_cancelbtnActionPerformed

    private void searchtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchtextActionPerformed

    private void okbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okbtnActionPerformed
        admins();
    }//GEN-LAST:event_okbtnActionPerformed

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
        clear();
    }//GEN-LAST:event_clearbtnActionPerformed

    private void searchtextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            admins();
        }
    }//GEN-LAST:event_searchtextKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable adminstable;
    private java.awt.Button cancelbtn;
    private javax.swing.JLabel cancelicon;
    private java.awt.Button clearbtn;
    private javax.swing.JLabel infolabel;
    private javax.swing.JLabel infolabel2;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel mainlabel;
    private java.awt.Button okbtn;
    private javax.swing.JTextField searchtext;
    private javax.swing.JComboBox<String> searchtype;
    // End of variables declaration//GEN-END:variables
}
