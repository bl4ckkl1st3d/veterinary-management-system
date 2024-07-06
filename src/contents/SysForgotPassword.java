/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package contents;

import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import softeng.login;

/**
 *
 * @author Richard Reynald
 */
public class SysForgotPassword extends javax.swing.JFrame {

    /**
     * Creates new form SysForgotPassword
     */
    public SysForgotPassword() {
        initComponents();
    }
    
    
    private static final String DATABASE_NAME = "database";
    private static final String dbUsername = "root";
    private static final String dbPassword = "admin";
    private static final String MYSQL_SERVER_HOSTNAME = "DESKTOP-MVBR3DH"; // Replace with your MySQL server's hostname
    private static final int MYSQL_SERVER_PORT = 3306;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        secretQuestion = new swing.Combobox();
        userTxtfield = new swing.TextField();
        password1 = new swing.PasswordField();
        answerTxtField = new swing.TextField();
        password2 = new swing.PasswordField();
        confirmBtn = new swing.AdminButton();
        confirmBtn2 = new swing.AdminButton();
        backBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 560));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Forgot Password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 420, 60));

        secretQuestion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "What is your mother's maiden name?", "In what city were you born?", "What is the name of your first pet?", "What is your favorite movie?", "What is the name of your first love?" }));
        secretQuestion.setSelectedIndex(-1);
        secretQuestion.setLabelText("Secret Question");
        jPanel1.add(secretQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 420, -1));

        userTxtfield.setLabelText("Username");
        jPanel1.add(userTxtfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 420, -1));

        password1.setLabelText("New Password");
        jPanel1.add(password1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 420, -1));

        answerTxtField.setLabelText("Answer");
        jPanel1.add(answerTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, 420, -1));

        password2.setLabelText("Repeat New Password");
        jPanel1.add(password2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, 420, -1));

        confirmBtn.setText("Confirm");
        confirmBtn.setRadius(25);
        confirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });
        jPanel1.add(confirmBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 510, 430, 50));

        confirmBtn2.setText("Change Password");
        confirmBtn2.setRadius(25);
        confirmBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtn2ActionPerformed(evt);
            }
        });
        jPanel1.add(confirmBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 510, 420, 50));

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back.png"))); // NOI18N
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtnMouseClicked(evt);
            }
        });
        jPanel1.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private String user1 = "";

    public void verifySecretQuestion(String username, String answer, String secretQuestion1) {
        String url = "jdbc:mysql://" + MYSQL_SERVER_HOSTNAME + ":" + MYSQL_SERVER_PORT + "/" + DATABASE_NAME;
        try {
            // Establish the database connection
            Connection connection = DriverManager.getConnection(url, dbUsername, dbPassword);

            // Prepare the SQL query to retrieve the user's secret question and answer
            String query = "SELECT secret_question, secret_answer FROM users WHERE username = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, username);

            // Execute the query
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                // User found in the database, retrieve the secret question and answer
                String realSecretQuestion = resultSet.getString("secret_question");
                String realAnswer = resultSet.getString("secret_answer");

                // Compare the provided answer with the real answer
                if (realSecretQuestion.equals(secretQuestion1) && realAnswer.equals(answer)) {

                    JOptionPane.showMessageDialog(null, "Secret question and answer are correct.");
                    user1 = username;
                    remix();
                } else {
                    JOptionPane.showMessageDialog(null, "Secret question or answer is wrong.");
                }
            } else {
                // User not found in the database
                JOptionPane.showMessageDialog(null, "User is not in the database.");
            }

            // Close the database connection
            connection.close();
        } catch (SQLException e) {
            // Handle any SQL exceptions
            e.printStackTrace();
        }
    }
    
    public void remix() {
        // Get the positions of jLabel1 and secretQuestion
        int jLabel1X = backBtn.getX();
        int jLabel1Y = backBtn.getY();
        int secretQuestionX = secretQuestion.getX();
        int secretQuestionY = secretQuestion.getY();

        // Set the bounds of jLabel1 and secretQuestion to jLabel4 and answerTxtField, respectively
        //backBtn.setBounds(jLabel6.getX(), jLabel6.getY() + 2000, backBtn.getWidth(), backBtn.getHeight());
        secretQuestion.setBounds(answerTxtField.getX(), answerTxtField.getY() + 2000, secretQuestion.getWidth(), secretQuestion.getHeight());

        // Set the bounds of jLabel4 and answerTxtField to the original bounds of jLabel1 and secretQuestion
        answerTxtField.setBounds(secretQuestionX, secretQuestionY + 1000, answerTxtField.getWidth(), answerTxtField.getHeight());
        password1.setBounds(secretQuestionX, secretQuestionY, answerTxtField.getWidth(), answerTxtField.getHeight());
        password2.setBounds(userTxtfield.getX(), userTxtfield.getY(), answerTxtField.getWidth(), answerTxtField.getHeight());
        userTxtfield.setBounds(userTxtfield.getX(), userTxtfield.getY() + 2000, answerTxtField.getWidth(), answerTxtField.getHeight());
        userTxtfield.setText("");
        answerTxtField.setText("");

        confirmBtn.setBounds(confirmBtn.getX(), confirmBtn.getY() + 2000, confirmBtn.getWidth(), confirmBtn.getHeight());
        backBtn.setBounds(backBtn.getX(), backBtn.getY() + 2000, backBtn.getWidth(), backBtn.getHeight());

    }

    public void addPasswordChangeAuditLog(int userId) {
        String url = "jdbc:mysql://" + MYSQL_SERVER_HOSTNAME + ":" + MYSQL_SERVER_PORT + "/" + DATABASE_NAME;

        try {
            // Establish the database connection
            Connection connection = DriverManager.getConnection(url, dbUsername, dbPassword);

            // Prepare the SQL query to add password change audit log
            String query = "INSERT INTO audit_logs (userid, event, action_type) VALUES (?, 'forgot password', 'password_change')";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, userId);

            // Execute the query
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Password change audit log added successfully.");
            } else {
                System.out.println("Failed to add password change audit log.");
            }

            // Close the database connection
            connection.close();
        } catch (SQLException e) {
            // Handle any SQL exceptions
            e.printStackTrace();
        }
    }

    public int getUserIdByUsername(String username) {
        int userId = -1; // Default value if user ID is not found

        String url = "jdbc:mysql://" + MYSQL_SERVER_HOSTNAME + ":" + MYSQL_SERVER_PORT + "/" + DATABASE_NAME;

        try {
            // Establish the database connection
            Connection connection = DriverManager.getConnection(url, dbUsername, dbPassword);

            // Prepare the SQL query to retrieve user ID by username
            String query = "SELECT userid FROM users WHERE username = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, username);

            // Execute the query
            ResultSet resultSet = preparedStatement.executeQuery();

            // Check if the result set has any rows
            if (resultSet.next()) {
                // Retrieve the user ID from the result set
                userId = resultSet.getInt("userid");
            }

            // Close the result set, statement, and connection
            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            // Handle any SQL exceptions
            e.printStackTrace();
        }

        return userId;
    }
    
    public static String sha256(String input) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(input.getBytes("UTF-8"));
            StringBuilder hexString = new StringBuilder();

            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }

            return hexString.toString();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
    
    private void updatePasswordInDatabase(String username, String newPassword) {
       String url = "jdbc:mysql://" + MYSQL_SERVER_HOSTNAME + ":" + MYSQL_SERVER_PORT + "/" + DATABASE_NAME;

        // SQL query to update the password for the given username
        String query = "UPDATE users SET password = ? WHERE username = ?";

        try (Connection connection = DriverManager.getConnection(url, dbUsername, dbPassword); PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            // Set parameters for the query
            preparedStatement.setString(1, newPassword);
            preparedStatement.setString(2, username);

            // Execute the update statement
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                int userid = getUserIdByUsername(user1);
                addPasswordChangeAuditLog(userid);
                JOptionPane.showMessageDialog(null, "Password updated successfully for user: " + username, "Success", JOptionPane.INFORMATION_MESSAGE);
                new login().setVisible(true);
                setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "User not found or password not updated.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            // Handle any SQL exceptions
            e.printStackTrace();
        }
    }
    private void confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBtnActionPerformed
        String username = userTxtfield.getText();

        // Get the value of answerTxtField
        String answer = answerTxtField.getText();

        // Get the selected item from the secretQuestion combo box
        String secretQuestion1 = (String) secretQuestion.getSelectedItem();

        // Now you can use these variables as needed, such as for further processing or validation
        // For example:
        System.out.println("Username: " + username);
        System.out.println("Answer: " + answer);
        System.out.println("Secret Question: " + secretQuestion1);
        verifySecretQuestion(username, answer, secretQuestion1);
    }//GEN-LAST:event_confirmBtnActionPerformed

    private void confirmBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBtn2ActionPerformed
        String password1Txt = new String(password1.getPassword());
        String password2Txt = new String(password2.getPassword());

        if (password1Txt.equals(password2Txt)) {
            // Passwords match, update the database
            //hashe the password first
            String hashedString = sha256(password1Txt);
            // Call a method to update the database with the new password
            updatePasswordInDatabase(user1, hashedString);
        } else {
            // Passwords don't match, show a message dialog
            JOptionPane.showMessageDialog(null, "Passwords do not match. Please try again.", "Password Mismatch", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_confirmBtn2ActionPerformed

    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked
        new SystemLogin().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_backBtnMouseClicked

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
            java.util.logging.Logger.getLogger(SysForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SysForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SysForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SysForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SysForgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.TextField answerTxtField;
    private javax.swing.JLabel backBtn;
    private swing.AdminButton confirmBtn;
    private swing.AdminButton confirmBtn2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private swing.PasswordField password1;
    private swing.PasswordField password2;
    private swing.Combobox secretQuestion;
    private swing.TextField userTxtfield;
    // End of variables declaration//GEN-END:variables
}
