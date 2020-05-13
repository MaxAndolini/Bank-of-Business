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

        ((AbstractDocument) searchText.getDocument()).setDocumentFilter(new Filter(1, 16));
        adminsTable.getTableHeader().setFont(new java.awt.Font("Segoe UI", 0, 18));

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
                    DefaultTableModel model = (DefaultTableModel) adminsTable.getModel();
                    if (load != null) {
                        model.setRowCount(0);
                    }
                    load = new ArrayList<>(data);
                    Collections.sort(data, new CustomComparator(15));
                    Integer columns[] = {0, 3, 4, 6, 11, 13, 14, 15};
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

    private void admins() {
        String[] typename = {"ID", "FullName"};
        if (!searchText.getText().isBlank()) {
            if (Database.exists("Accounts", typename[searchType.getSelectedIndex()], searchText.getText())) {
                if (Database.getInt("Accounts", typename[searchType.getSelectedIndex()], searchText.getText(), "AccountType") == 2) {
                    text = searchText.getText();
                    type = searchType.getSelectedIndex();
                    searchText.setText(null);
                    searchType.setSelectedIndex(0);
                    infoLabel.setText("The admin was successfully found.");
                } else {
                    infoLabel.setText("The account type is invalid.");
                }
            } else {
                infoLabel.setText("The admin is invalid.");
            }
        } else {
            infoLabel.setText("The field can't be left blank.");
        }
    }

    private void clear() {
        searchText.setText(null);
        searchType.setSelectedIndex(0);
        text = null;
        type = 0;
        infoLabel.setText("The search was successfully cleared.");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainLabel = new javax.swing.JLabel();
        infoLabel = new javax.swing.JLabel();
        infoLabel2 = new javax.swing.JLabel();
        searchText = new javax.swing.JTextField();
        searchType = new javax.swing.JComboBox<>();
        okButton = new java.awt.Button();
        clearButton = new java.awt.Button();
        jScrollPane = new javax.swing.JScrollPane();
        adminsTable = new javax.swing.JTable();
        cancelButton = new java.awt.Button();
        cancelIcon = new javax.swing.JLabel();

        setBackground(new java.awt.Color(71, 120, 197));
        setMaximumSize(new java.awt.Dimension(1070, 590));
        setMinimumSize(new java.awt.Dimension(1070, 590));
        setPreferredSize(new java.awt.Dimension(1070, 590));

        mainLabel.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        mainLabel.setForeground(new java.awt.Color(255, 255, 255));
        mainLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mainLabel.setText("Admins");
        mainLabel.setMaximumSize(new java.awt.Dimension(223, 47));
        mainLabel.setMinimumSize(new java.awt.Dimension(223, 47));
        mainLabel.setPreferredSize(new java.awt.Dimension(223, 47));

        infoLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        infoLabel.setForeground(new java.awt.Color(255, 255, 255));
        infoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        infoLabel2.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        infoLabel2.setForeground(new java.awt.Color(255, 255, 255));
        infoLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoLabel2.setText("Search:");

        searchText.setBackground(new java.awt.Color(23, 35, 51));
        searchText.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        searchText.setForeground(new java.awt.Color(255, 255, 255));
        searchText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        searchText.setMaximumSize(new java.awt.Dimension(7, 39));
        searchText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextActionPerformed(evt);
            }
        });
        searchText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchTextKeyPressed(evt);
            }
        });

        searchType.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        searchType.setForeground(new java.awt.Color(23, 35, 51));
        searchType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Full Name" }));
        searchType.setToolTipText("");
        searchType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                searchTypeİtemStateChanged(evt);
            }
        });

        okButton.setBackground(new java.awt.Color(23, 35, 51));
        okButton.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        okButton.setForeground(new java.awt.Color(255, 255, 255));
        okButton.setLabel("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        clearButton.setBackground(new java.awt.Color(23, 35, 51));
        clearButton.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        clearButton.setForeground(new java.awt.Color(255, 255, 255));
        clearButton.setLabel("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        adminsTable.setAutoCreateRowSorter(true);
        adminsTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        adminsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Full Name", "Date of Birth", "Phone Number", "Home Address", "Salary", "Created At", "Updated At"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        adminsTable.setRowHeight(30);
        adminsTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        adminsTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane.setViewportView(adminsTable);

        cancelButton.setBackground(new java.awt.Color(23, 35, 51));
        cancelButton.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setLabel("Cancel");
        cancelButton.setMinimumSize(new java.awt.Dimension(80, 49));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        cancelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_exit_48px.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(infoLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(searchType, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(300, 300, 300)
                                .addComponent(infoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mainLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(cancelIcon)))))
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
                .addComponent(mainLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(infoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(infoLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchType, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelIcon))
                .addGap(59, 59, 59))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        if (timer != null) {
            timer.stop();
        }
        frame.ChangeJPanel("HomeAdmin");
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void searchTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTextActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        admins();
    }//GEN-LAST:event_okButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        clear();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void searchTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            admins();
        }
    }//GEN-LAST:event_searchTextKeyPressed

    private void searchTypeİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_searchTypeİtemStateChanged
        switch (evt.getStateChange()) {
            case 0:
                ((AbstractDocument) searchText.getDocument()).setDocumentFilter(new Filter(1, 16));
                searchText.setText(null);
                break;
            case 1:
                ((AbstractDocument) searchText.getDocument()).setDocumentFilter(new Filter(0, 32));
                searchText.setText(null);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_searchTypeİtemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable adminsTable;
    private java.awt.Button cancelButton;
    private javax.swing.JLabel cancelIcon;
    private java.awt.Button clearButton;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JLabel infoLabel2;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel mainLabel;
    private java.awt.Button okButton;
    private javax.swing.JTextField searchText;
    private javax.swing.JComboBox<String> searchType;
    // End of variables declaration//GEN-END:variables
}
