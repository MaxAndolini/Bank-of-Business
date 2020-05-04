/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.customer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import library.*;

/**
 *
 * @author ercan
 */
public class Transactions extends javax.swing.JPanel {

    final private swing.Home frame;
    Timer timer;

    /**
     * Creates new form Transactions
     *
     * @param home Dynamic panel.
     */
    public Transactions(swing.Home home) {
        initComponents();
        frame = home;

        transactionstable.getTableHeader().setFont(new java.awt.Font("Segoe UI", 0, 18));

        timer = new Timer(2000, new ActionListener() {
            ArrayList<ArrayList<String>> load = null;
            ArrayList<ArrayList<String>> data = null;

            @Override
            public void actionPerformed(ActionEvent e) {
                data = Database.getArrayList("Transactions", "Account", Data.getCustomer().getId().getID());
                if (load == null || (data != null && !load.equals(data))) {
                    DefaultTableModel model = (DefaultTableModel) transactionstable.getModel();
                    if (load != null) {
                        model.setRowCount(0);
                    }
                    load = new ArrayList<>(data);
                    Collections.sort(data, new CustomComparator(7));
                    Integer columns[] = {0, 2, 3, 4, 5, 6, 7};
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainlabel = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        transactionstable = new javax.swing.JTable();
        cancelbtn = new java.awt.Button();
        cancelicon = new javax.swing.JLabel();

        setBackground(new java.awt.Color(71, 120, 197));
        setMaximumSize(new java.awt.Dimension(1070, 590));
        setMinimumSize(new java.awt.Dimension(1070, 590));
        setPreferredSize(new java.awt.Dimension(1070, 590));

        mainlabel.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        mainlabel.setForeground(new java.awt.Color(255, 255, 255));
        mainlabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mainlabel.setText("Transactions");
        mainlabel.setMaximumSize(new java.awt.Dimension(223, 47));
        mainlabel.setMinimumSize(new java.awt.Dimension(223, 47));
        mainlabel.setPreferredSize(new java.awt.Dimension(223, 47));

        transactionstable.setAutoCreateRowSorter(true);
        transactionstable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        transactionstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Transaction", "Type", "Amount", "Transfer To", "Transfer From", "Date & Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        transactionstable.setRowHeight(30);
        transactionstable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        transactionstable.getTableHeader().setReorderingAllowed(false);
        jScrollPane.setViewportView(transactionstable);

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
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mainlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(cancelicon)))
                        .addGap(562, 562, 562)))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(mainlabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        frame.ChangeJPanel("HomeCustomer");
    }//GEN-LAST:event_cancelbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button cancelbtn;
    private javax.swing.JLabel cancelicon;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel mainlabel;
    private javax.swing.JTable transactionstable;
    // End of variables declaration//GEN-END:variables
}
