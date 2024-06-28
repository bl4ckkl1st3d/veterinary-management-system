package contents;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import swing.ScrollBar;

/**
 *
 * @author Richard Reynald
 */
public class Admin_Search extends javax.swing.JPanel {

    /**
     * Creates new form Admin_Search
     */
    public Admin_Search() {
        initComponents();
        setTable();
        displayAllUsers();
        sp.setVerticalScrollBar(new ScrollBar());
        sp.setHorizontalScrollBar(new ScrollBar());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sp = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        userIdTxtField = new swing.TextField();
        nameTxtField = new swing.TextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Name", "Address", "Birthdate", "Age", "Sex", "Contact Number"
            }
        ));
        jScrollPane2.setViewportView(userTable);

        jButton1.setText("REFRESH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        userIdTxtField.setLabelText("User ID");

        nameTxtField.setLabelText("Name");
        nameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 873, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(userIdTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userIdTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );

        sp.setViewportView(jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sp)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sp)
        );
    }// </editor-fold>//GEN-END:initComponents
    private void setTable() {
        DefaultTableModel model = new DefaultTableModel(new String[]{"id", "Full Name", "Address", "Birthdate", "Age", "Sex", "Contact Number"}, 0);
        userTable.setModel(model);
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        displayAllUsers();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtFieldActionPerformed
    private void displayAllUsers() {
        String url = "jdbc:mysql://127.0.0.1:3306/database";
        String dbUsername = "root";
        String dbPassword = "admin";

        try (Connection connection = DriverManager.getConnection(url, dbUsername, dbPassword)) {
            String query = "SELECT CONCAT(first_name, ' ', last_name) AS full_name,userid, address, birthdate, age, sex, contact FROM user_information";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query); ResultSet resultSet = preparedStatement.executeQuery()) {

                DefaultTableModel tableModel = (DefaultTableModel) userTable.getModel();
                tableModel.setRowCount(0); // Clear the table

                while (resultSet.next()) {
                    String fullName = resultSet.getString("full_name");
                    String address = resultSet.getString("address");
                    String userid = resultSet.getString("userid");
                    Date birthdate = resultSet.getDate("birthdate");
                    int age = resultSet.getInt("age");
                    String sex = resultSet.getString("sex");
                    String contact = resultSet.getString("contact");

                    // Add the retrieved data to the table
                    tableModel.addRow(new Object[]{userid, fullName, address, birthdate, age, sex, contact});
                }

                if (tableModel.getRowCount() == 0) {
                    // If no matches found, clear the table
                    tableModel.setRowCount(0);
                }
            }
        } catch (SQLException e) {
            // Handle SQL exception
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private swing.TextField nameTxtField;
    private javax.swing.JScrollPane sp;
    private swing.TextField userIdTxtField;
    private javax.swing.JTable userTable;
    // End of variables declaration//GEN-END:variables
}
