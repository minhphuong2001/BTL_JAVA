/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.admin;

import controller.FileController;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.prefs.Preferences;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modal.Account;

/**
 *
 * @author Minh Phuong Do
 */
public class ManagementAccount extends javax.swing.JFrame {

    /**
     * Creates new form ManagementAccount
     */
    static DefaultTableModel tableModal;
    static List<Account> listAcc = new ArrayList<Account>();
    static FileController fileController;

    public void increaseIndex(){
        int lastIndex = listAcc.get(listAcc.size()-1).getId();
        Preferences prefs = Preferences.userRoot().node(this.getClass().getName());

        AtomicInteger autoinc = new AtomicInteger(prefs.getInt("autoincrement", lastIndex));

        idField.setText(""+autoinc.incrementAndGet());
        idField.setEnabled(false);
        prefs.putInt("autoincrement", autoinc.get());
    }

    public ManagementAccount() {
        initComponents();
        tableModal = (DefaultTableModel) accountTable.getModel();
        listAcc = fileController.readAccountFromFile("account.txt");
        for(Account item : listAcc){
            tableModal.addRow(new Object[]{
                item.getId(), item.getUsername(), item.getPassword(), item.getRole()
            });
        }
        editBtn.setEnabled(false);
        deleteBtn.setEnabled(false);
        increaseIndex();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        titleLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JTextField();
        roleLabel = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        roleComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        accountTable = new javax.swing.JTable();
        deleteBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();
        showError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý tài khoản");

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(75, 123, 236));
        titleLabel.setText("QUẢN LÝ TÀI KHOẢN");

        idLabel.setText("ID");

        usernameLabel.setText("Username");

        usernameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usernameFieldKeyReleased(evt);
            }
        });

        passwordLabel.setText("Password");

        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordFieldKeyReleased(evt);
            }
        });

        roleLabel.setText("Role");

        addBtn.setBackground(new java.awt.Color(75, 123, 236));
        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setText("Thêm");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        editBtn.setBackground(new java.awt.Color(102, 255, 102));
        editBtn.setText("Cập nhật");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        roleComboBox.setEditable(true);
        roleComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Employee" }));
        roleComboBox.setMinimumSize(new java.awt.Dimension(64, 40));

        accountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Username", "Password", "Role"
            }
        ));
        accountTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(accountTable);

        deleteBtn.setBackground(new java.awt.Color(255, 0, 0));
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("Xóa");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        closeBtn.setBackground(new java.awt.Color(75, 123, 236));
        closeBtn.setForeground(new java.awt.Color(255, 255, 255));
        closeBtn.setText("Đóng");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        showError.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(editBtn)
                        .addGap(27, 27, 27)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idLabel)
                                    .addComponent(usernameLabel)
                                    .addComponent(passwordLabel))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(passwordField)
                                    .addComponent(idField)
                                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(roleLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(roleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(showError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLabel)
                    .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(355, 355, 355))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(titleLabel)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idLabel)
                            .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usernameLabel)
                            .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordLabel)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(roleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roleLabel))
                        .addGap(18, 18, 18)
                        .addComponent(showError)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(editBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        try {
            Integer id = Integer.parseInt(idField.getText().trim());
            String username = usernameField.getText().trim();
            String password = passwordField.getText().trim();
            String role = roleComboBox.getSelectedItem().toString().toLowerCase().trim();
            
            /**if(username.compareTo("") == 0){
                showError.setText("Vui lòng nhập tên");
                return;
           }
            String regexUsername = "^[a-zA-Z0-9]{0,30}$";
            Pattern pattern = Pattern.compile(regexUsername);
            Matcher match = pattern.matcher(username);

            if(!match.matches()){
                showError.setText("Tên người dùng không bao gồm các kí tự đặc biệt");
                return;
            } **/
            if(username.length() < 6){
                showError.setText("Tên người dùng tối thiểu 6 kí tự");
                return;
            }

            if(password.compareTo("") == 0){
                showError.setText("Vui lòng nhập mật khẩu");
                return;
            }
            if(password.length() < 6){
                showError.setText("Mật khẩu phải lớn hơn hoặc bằng 6 kí tự");
                return;
            }

            if(role.compareTo("") == 0){
                showError.setText("Vui lòng nhập chọn vai trò");
                return;
            }
            showError.setText(null);

            Account account = new Account(id, username, password, role);
            boolean check = false;
            for(Account item : listAcc) {
                if(username.toString().compareTo(item.getUsername().toString()) == 0) {
                    showError.setText("Tên người dùng không được phép trùng");
                    check = true;
                }
            }

            if(check == false) {
                fileController.writeAccountToFile("account.txt", account);
                tableModal.addRow(new Object[]{
                    account.getId(), account.getUsername(), account.getPassword(), account.getRole()
                });
                listAcc.add(account);
                setTextNull("Thêm tài khoản mới thành công", "Thêm mới tài khoản");
                increaseIndex();
                usernameField.requestFocus();
            }
        } catch(NumberFormatException e) {
            showError.setText("Vui lòng lòng nhập đầy đủ thông tin");
        } catch (Exception e) {
            showError.setText("Vui lòng lòng nhập đầy đủ thông tin");
            showError.setText(e.toString());
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
        Integer id = Integer.parseInt(idField.getText().trim());
        String username = usernameField.getText().trim();
        String password = passwordField.getText().trim();
        String role = roleComboBox.getSelectedItem().toString().toLowerCase();
        int row = accountTable.getSelectedRow();

        // update data in file
        Account account = new Account(id, username, password, role);
        listAcc.set(row, account);
        FileController.updateListAccountToFile("account.txt", listAcc);

        //update UI
        accountTable.setValueAt(id, row, 0);
        accountTable.setValueAt(username, row, 1);
        accountTable.setValueAt(password, row, 2);
        accountTable.setValueAt(role, row, 3);

        editBtn.setEnabled(false);
        deleteBtn.setEnabled(false);
        addBtn.setEnabled(true);
        setTextNull("Cập nhật thông tin thành công", "Cập nhật tài khoản");
        increaseIndex();
        usernameField.requestFocus();
    }//GEN-LAST:event_editBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int answer = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn xóa tài khoản này?", "Xác nhận", JOptionPane.YES_NO_OPTION,0);
        if(answer == 0){
            int row = accountTable.getSelectedRow();
            tableModal.removeRow(row);

            listAcc.remove(row);
            fileController.updateListAccountToFile("account.txt", listAcc);

            editBtn.setEnabled(false);
            deleteBtn.setEnabled(false);
            addBtn.setEnabled(true);
            setTextNull("Xóa thành công", "Xóa tài khoản");
            increaseIndex();
            usernameField.requestFocus();
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void accountTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountTableMouseClicked
        // TODO add your handling code here:
        int row = accountTable.getSelectedRow();
        int id = (int) tableModal.getValueAt(row, 0);
        String username = (String) tableModal.getValueAt(row, 1);
        String password = (String) tableModal.getValueAt(row, 2);
        String role = (String) tableModal.getValueAt(row, 3);

        if(role.equals("admin")){
            role = "Admin";
        } else {
            role = "Employee";
        }
        idField.setText("" + id);
        usernameField.setText(username);
        passwordField.setText(password);
        roleComboBox.setSelectedItem(role);

        idField.setEnabled(false);
        addBtn.setEnabled(false);
        editBtn.setEnabled(true);
        deleteBtn.setEnabled(true);
    }//GEN-LAST:event_accountTableMouseClicked

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closeBtnActionPerformed

    private void passwordFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyReleased
        // TODO add your handling code here:
        validateField("password", passwordField.getText().trim());
    }//GEN-LAST:event_passwordFieldKeyReleased

    private void usernameFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameFieldKeyReleased
        validateField("username", usernameField.getText().trim());
    }//GEN-LAST:event_usernameFieldKeyReleased

    private void validateField(String name, String value) {
        switch (name) {
            case "password":
                if(value.compareTo("") == 0){
                    showError.setText("Vui lòng nhập mật khẩu");
                    return;
                }
                if(value.length() < 6){
                    showError.setText("Mật khẩu phải có độ dài lớn hơn 6");
                    return;
                }
                showError.setText(null);
                break;
            case "username": { 
                if(value.compareTo("") == 0){
                    showError.setText("Vui lòng nhập tên người dùng");
                    return;
                }
                String regexUsername = "^[a-zA-Z0-9]{0,30}$";
                Pattern pattern = Pattern.compile(regexUsername);
                Matcher match = pattern.matcher(value);

                if(!match.matches()){
                    showError.setText("Tên người dùng không bao gồm các kí tự đặc biệt");
                    return;
                } 
                if(value.length() < 6){
                    showError.setText("Tên người dùng tối thiểu 6 kí tự");
                    return;
                }
                showError.setText(null);
                break;
            }
            default:
                showError.setText(null);
                break;
    }
}
    private void setTextNull(String title, String subTitle){
        idField.setText("");
        usernameField.setText("");
        passwordField.setText("");
        roleComboBox.setSelectedItem("");
        JOptionPane.showConfirmDialog(null, title, subTitle, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
    }
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
            java.util.logging.Logger.getLogger(ManagementAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagementAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagementAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagementAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagementAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable accountTable;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton closeBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JComboBox<String> roleComboBox;
    private javax.swing.JLabel roleLabel;
    private javax.swing.JLabel showError;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
