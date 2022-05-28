/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.admin;

import controller.FileController;
import java.awt.Color;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modal.Employee;

/**
 *
 * @author DELL
 */
public class EmployeeManagement extends javax.swing.JFrame {
    public static DefaultTableModel table;
    public static List<Employee> employees= new ArrayList<>();
    /**
     * Creates new form EmployeeManagement
     */Integer id;
    public EmployeeManagement() {
        initComponents();
        
        table= (DefaultTableModel) 
        tblEmployee.getModel();
        employees = FileController.readEmployeeFromFile("employee.txt");
        for(Employee item : employees){
            table.addRow(new Object[]{
                item.getEmployeeId(), item.getEmployeeName(), item.getEmployeePhone(), item.getEmployeeAddress()
            });
        }
        idField.setEnabled(false);
        
        if(employees.size()==0){
            id=0;
        }
        else{
            id =employees.get(employees.size()-1).getEmployeeId()+ 1;                
        }
        idField.setText(id.toString());
        
        deleteBtn.setEnabled(false);
        updateBtn.setEnabled(false);
        addBtn.setForeground(Color.white);
        addBtn.setBackground(new Color(51,153,0));
        exitBtn.setForeground(Color.white);
        exitBtn.setBackground(Color.red);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployee = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        addBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        phoneField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        Error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("QUẢN LÝ NHÂN VIÊN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 273, 34));

        tblEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "PHONE", "ADDRESS"
            }
        ));
        tblEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmployeeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmployee);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 370, 220));

        addBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        addBtn.setText("ADD");
        addBtn.setPreferredSize(new java.awt.Dimension(70, 25));
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        updateBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        updateBtn.setText("UPDATE");
        updateBtn.setPreferredSize(new java.awt.Dimension(70, 25));
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        deleteBtn.setText("DELETE");
        deleteBtn.setPreferredSize(new java.awt.Dimension(70, 25));
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        exitBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        exitBtn.setText("EXIT");
        exitBtn.setPreferredSize(new java.awt.Dimension(70, 25));
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 454, 610, 60));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("ID");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 31, -1));
        jPanel2.add(idField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 199, 27));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("NAME");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 81, -1));

        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });
        jPanel2.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 199, 27));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("PHONE");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 81, -1));
        jPanel2.add(phoneField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 199, 27));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("ADDRESS");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 73, -1));
        jPanel2.add(addressField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 199, 27));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 320, 220));

        Error.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Error.setForeground(new java.awt.Color(204, 0, 51));
        getContentPane().add(Error, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 640, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        Integer id = Integer.parseInt(idField.getText().trim());
        String name = nameField.getText();
        String phone= phoneField.getText();
        String address = addressField.getText();
        int row = tblEmployee.getSelectedRow();

        Employee emp = new Employee(id,name, phone, address);
        employees.set(row, emp);
        FileController.updateEmployeeToFile("employee.txt", employees);

        tblEmployee.setValueAt(id, row, 0);
        tblEmployee.setValueAt(name, row, 1);
        tblEmployee.setValueAt(phone, row, 2);
        tblEmployee.setValueAt(address, row, 3);
        JOptionPane.showMessageDialog(null, "Cập nhật thông tin nhân viên thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(rootPane,"Cập nhật thông tin nhân viên thành công");
        updateBtn.setEnabled(false);
        deleteBtn.setEnabled(false);
        addBtn.setEnabled(true);
        idField.setText("");
        nameField.setText("");
        phoneField.setText("");
        addressField.setText("");
        if(employees.size()==0){
            id=0;
        }
        else{
            id =employees.get(employees.size()-1).getEmployeeId()+ 1;
            System.out.println(id);
        }
        idField.setText(id.toString());
       
        
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int answer= JOptionPane.showConfirmDialog(null, "Xóa nhân viên này?", "Xác nhận", JOptionPane.YES_NO_OPTION,0);
        System.out.print(answer);
        
        if(answer==0){
            int row = tblEmployee.getSelectedRow();
            table.removeRow(row);

            employees.remove(row);
            FileController.updateEmployeeToFile("employee.txt",employees);

            updateBtn.setEnabled(false);
            deleteBtn.setEnabled(false);
            addBtn.setEnabled(true);
        
            JOptionPane.showMessageDialog(null, "Xóa nhân viên thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);        
        }


        //JOptionPane.showMessageDialog(rootPane,"Xóa nhân viên thành công");
        idField.setText("");
        nameField.setText("");
        phoneField.setText("");
        addressField.setText("");

        if(employees.size()==0){
            id=0;
        }
        else{
            id =employees.get(employees.size()-1).getEmployeeId()+ 1;
            System.out.println(id);
        }
            idField.setText(id.toString());

    }//GEN-LAST:event_deleteBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        try {
            String name = nameField.getText().trim();
            String phone = phoneField.getText().trim();
            String address = addressField.getText().trim();
            
            String regexName = "^[a-zA-Z]{1,30}$";
            Pattern pattern = Pattern.compile(regexName);
            Matcher match = pattern.matcher(name);            
            if(name.compareTo("") == 0){
                Error.setText("Vui lòng nhập tên");
                return;
           }
            if(!match.matches()){
                Error.setText("Tên không bao gồm số và các kí tự đặc biệt,tối đa 30 kí tự");
                return;
            } 
            
            String regexPhone = "^[0-9]{10,11}$";
            Pattern patternPhone = Pattern.compile(regexPhone);
            Matcher matchPhone = patternPhone.matcher(phone); 
            if(phone.compareTo("") == 0){
                Error.setText("Vui lòng nhập số điện thoại");
                return;
           }
            if(!matchPhone.matches()){
                Error.setText("Số điện thoại chỉ bao gồm số: 10 số hoặc 11 số");
                return;
            } 

            if(address.compareTo("") == 0){
                Error.setText("Vui lòng nhập địa chỉ");
                return;
           }
            Error.setText("");
            Employee emp = new Employee(id,name,phone,address);
            FileController.writeEmployeeToFile("employee.txt",emp);
            table.addRow(new Object[]{
                id,name,phone,address
            });   
            employees.add(emp);
            idField.setText("");
            nameField.setText("");
            phoneField.setText("");
            addressField.setText("");
            JOptionPane.showMessageDialog(null, "Thêm nhân viên mới thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);

            //JOptionPane.showMessageDialog(rootPane,"Thêm nhân viên mới thành công");
            if(employees.size()==0){
                id=0;
            }
            else{
                id =employees.get(employees.size()-1).getEmployeeId()+ 1;
                System.out.println(id);
            }
            idField.setText(id.toString());


        } catch (Exception e) {
            Error.setText("Vui lòng lòng nhập đầy đủ thông tin");
            Error.setText(e.toString());
        }        
    }//GEN-LAST:event_addBtnActionPerformed

    private void tblEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmployeeMouseClicked
        int row = tblEmployee.getSelectedRow();
        Integer id = (Integer)tblEmployee.getValueAt(row,0);
        String name = (String) tblEmployee.getValueAt(row,1);
        String phone = (String) tblEmployee.getValueAt(row,2);
        String address = (String) tblEmployee.getValueAt(row,3);

        idField.setText(id.toString());
        nameField.setText(name);
        phoneField.setText(phone);
        addressField.setText(address);
        Error.setText("");

        idField.setEnabled(false);
        addBtn.setEnabled(false);
        deleteBtn.setEnabled(true);
        updateBtn.setEnabled(true);
        
        updateBtn.setForeground(Color.white);
        updateBtn.setBackground(new Color(51,153,0));
        
        deleteBtn.setForeground(Color.white);
        deleteBtn.setBackground(new Color(51,153,0));

    }//GEN-LAST:event_tblEmployeeMouseClicked

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        this.dispose();//combined into 1 windown 
        AdminHomePage newWindow = new AdminHomePage();
        newWindow.setVisible(true);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        deleteBtn.setEnabled(false);
        updateBtn.setEnabled(false);
        addBtn.setEnabled(true);
        
        idField.setText("");
        nameField.setText("");
        phoneField.setText("");
        addressField.setText("");

        if(employees.size()==0){
            id=0;
        }
        else{
            id =employees.get(employees.size()-1).getEmployeeId()+ 1;
            System.out.println(id);
        }
        idField.setText(id.toString());
        
    }//GEN-LAST:event_formMouseClicked

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
            java.util.logging.Logger.getLogger(EmployeeManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Error;
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField addressField;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField phoneField;
    private javax.swing.JTable tblEmployee;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
