/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.admin;


import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modal.Customer;
import controller.FileController;
import java.awt.Panel;
import java.awt.event.MouseEvent;

/**
 *
 * @author Nguyen Hai Luyen
 */
public class CustomerManagement extends javax.swing.JFrame {

    /**
     * Creates new form CustomerManagement
     */
    
    public static DefaultTableModel model;
    public static List<Customer> customers= new ArrayList<>();
   
    public CustomerManagement() {
        initComponents();
        model= (DefaultTableModel) tbCustomer.getModel();
        customers = FileController.readCustomerFromFile("customer.txt");
        customers.forEach(a -> {
            model.addRow(new Object[]{
                a.getCustomerId(), a.getCustomerName(), a.getCustomerPhone(), a.getAccumulatePoints()
            });
        });
        inpCustomerId.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        inpCustomerId = new javax.swing.JTextField();
        inpCustomerPhone = new javax.swing.JTextField();
        inpCustomerName = new javax.swing.JTextField();
        inpAccumulatePoints = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbCustomer = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(75, 123, 236));
        jLabel1.setText("QUẢN LÝ KHÁCH HÀNG");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 26, -1, -1));

        jLabel2.setText("Customer ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 99, -1, -1));

        jLabel3.setText("Customer Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 147, -1, -1));

        jLabel4.setText("Customer Phone");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 202, -1, -1));

        jLabel5.setText("Accumulate Points");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 253, -1, -1));

        inpCustomerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inpCustomerIdActionPerformed(evt);
            }
        });
        getContentPane().add(inpCustomerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 90, 220, 32));

        inpCustomerPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inpCustomerPhoneActionPerformed(evt);
            }
        });
        getContentPane().add(inpCustomerPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 193, 220, 32));

        inpCustomerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inpCustomerNameActionPerformed(evt);
            }
        });
        getContentPane().add(inpCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 138, 220, 32));

        inpAccumulatePoints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inpAccumulatePointsActionPerformed(evt);
            }
        });
        getContentPane().add(inpAccumulatePoints, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 244, 220, 32));

        tbCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Customer Name", "Customer Phone", "Accumulate Points"
            }
        ));
        tbCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCustomerMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tbCustomerMouseExited(evt);
            }
        });
        jScrollPane3.setViewportView(tbCustomer);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 73, 399, 253));

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 294, -1, -1));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 294, -1, -1));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 294, -1, -1));

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 362, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inpCustomerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inpCustomerIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inpCustomerIdActionPerformed

    private void inpCustomerPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inpCustomerPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inpCustomerPhoneActionPerformed

    private void inpCustomerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inpCustomerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inpCustomerNameActionPerformed

    private void inpAccumulatePointsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inpAccumulatePointsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inpAccumulatePointsActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        try { 
            Integer id = customers.get(customers.size()-1).getCustomerId() + 1;
            String name = inpCustomerName.getText().trim();
            String phone = inpCustomerPhone.getText().trim();
            Float accPoints= Float.parseFloat(inpAccumulatePoints.getText().trim());
        
            Customer cus= new Customer(id, name, phone, accPoints);
            FileController.writeCustomerToFile("customer.txt", cus);
            model.addRow(new Object[]{
                id, name, phone, accPoints
            });   
            customers.add(cus);

            inpCustomerId.setText("");
            inpCustomerName.setText("");
            inpCustomerPhone.setText("");
            inpAccumulatePoints.setText("");
            JOptionPane.showMessageDialog(rootPane, "Thêm khách hàng mới thành công");
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(rootPane, "Hay nhap du thong tin");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void tbCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCustomerMouseClicked
        // TODO add your handling code here:
        int row = tbCustomer.getSelectedRow();
        Integer id = (Integer)model.getValueAt(row, 0);
        String name = (String) model.getValueAt(row, 1);
        String phone = (String)model.getValueAt(row, 2);
        Float accPoints = (Float) model.getValueAt(row, 3);
        
        inpCustomerId.setText(id+"");
        inpCustomerName.setText(name);
        inpCustomerPhone.setText(phone+"");
        inpAccumulatePoints.setText(accPoints+"");
        
        btnAdd.setEnabled(false);
        btnUpdate.setEnabled(true);
        btnDelete.setEnabled(true);
    }//GEN-LAST:event_tbCustomerMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        Integer id = Integer.parseInt(inpCustomerId.getText().trim());
        String name= inpCustomerName.getText().trim();
        String phone= inpCustomerPhone.getText().trim();
        Float accPoints= Float.parseFloat(inpAccumulatePoints.getText().trim());
        
        int row= tbCustomer.getSelectedRow(); 
        
        customers.set(row, new Customer(id, name, phone, accPoints));
        FileController.writeListCustomerFile("customer.txt", customers);
        
        tbCustomer.setValueAt(id, row, 0);
        tbCustomer.setValueAt(name, row, 1);
        tbCustomer.setValueAt(phone, row, 2);
        tbCustomer.setValueAt(accPoints, row, 3);
        
        inpCustomerId.setText("");
        inpCustomerName.setText("");
        inpCustomerPhone.setText("");
        inpAccumulatePoints.setText("");
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int row= tbCustomer.getSelectedRow();
        //xoa tren giao dien
        model.removeRow(row);
        
        customers.remove(row);
        FileController.writeListCustomerFile("customer.txt", customers);
        
        //set cac o input ve rong
        inpCustomerId.setText("");
        inpCustomerName.setText("");
        inpCustomerPhone.setText("");
        inpAccumulatePoints.setText("");
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void tbCustomerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCustomerMouseExited
        // TODO add your handling code here:
        inpCustomerId.setText("");
        inpCustomerName.setText("");
        inpCustomerPhone.setText("");
        inpAccumulatePoints.setText("");
        
        btnAdd.setEnabled(true);
        btnUpdate.setEnabled(true);
        btnDelete.setEnabled(true);
          
    }//GEN-LAST:event_tbCustomerMouseExited

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CustomerManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTextField inpAccumulatePoints;
    private javax.swing.JTextField inpCustomerId;
    private javax.swing.JTextField inpCustomerName;
    private javax.swing.JTextField inpCustomerPhone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable tbCustomer;
    // End of variables declaration//GEN-END:variables
}
