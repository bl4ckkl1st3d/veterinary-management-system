package contents;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.sql.*;
import static softeng.login.sha256;
import swing.ScrollBar;

/**
 *
 * @author Richard Reynald
 */
public class Settings extends javax.swing.JPanel {

    private int realUserId;
    
    public Settings(int realUserId) {
        initComponents();
        this.realUserId = realUserId;
        addPanelToScrollPane();
        currentPwPasswordField.setEchoChar('\u25cf');
        newPwPasswordField.setEchoChar('\u25cf');
        repeatNewPwPasswordField.setEchoChar('\u25cf');
        sp.setVerticalScrollBar(new ScrollBar());
        sp.setHorizontalScrollBar(new ScrollBar());
    }

    private void addPanelToScrollPane() {
        // Remove any existing component in the scroll pane
        sp.setViewportView(null);

        // Add jPanel5 to the scroll pane
        sp.setViewportView(settingsPanel);

        // Refresh the scroll pane to ensure it displays the new content
        sp.revalidate();
        sp.repaint();
    }

    private void nextScreen() {
        // Remove any existing component in the scroll pane
        sp.setViewportView(null);

        // Add jPanel5 to the scroll pane
        sp.setViewportView(changeSecret2);

        // Refresh the scroll pane to ensure it displays the new content
        sp.revalidate();
        sp.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        changePassword = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        currentPwPasswordField = new swing.PasswordField();
        newPwPasswordField = new swing.PasswordField();
        repeatNewPwPasswordField = new swing.PasswordField();
        adminButton3 = new swing.AdminButton();
        showBtn = new swing.AdminButton();
        changeSecret1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        secretQuestionComboBox = new swing.Combobox();
        secretAnswerTextField = new swing.TextField();
        adminButton4 = new swing.AdminButton();
        changeSecret2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        newSecretQuestionComboBox = new swing.Combobox();
        newSecretAnswerTextField = new swing.TextField();
        adminButton5 = new swing.AdminButton();
        sp = new javax.swing.JScrollPane();
        settingsPanel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        adminButton1 = new swing.AdminButton();
        adminButton2 = new swing.AdminButton();

        changePassword.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Change Password");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        currentPwPasswordField.setLabelText("Current Password");

        newPwPasswordField.setLabelText("New Password");

        repeatNewPwPasswordField.setLabelText("Repeat Password");

        adminButton3.setText("Change Password");
        adminButton3.setRadius(25);
        adminButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButton3ActionPerformed(evt);
            }
        });

        showBtn.setText("Show");
        showBtn.setRadius(25);
        showBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout changePasswordLayout = new javax.swing.GroupLayout(changePassword);
        changePassword.setLayout(changePasswordLayout);
        changePasswordLayout.setHorizontalGroup(
            changePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changePasswordLayout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(changePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(changePasswordLayout.createSequentialGroup()
                        .addComponent(currentPwPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(showBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(376, Short.MAX_VALUE))
                    .addGroup(changePasswordLayout.createSequentialGroup()
                        .addGroup(changePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(repeatNewPwPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11)
                            .addComponent(adminButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                            .addComponent(newPwPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        changePasswordLayout.setVerticalGroup(
            changePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, changePasswordLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(changePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel11))
                .addGap(73, 73, 73)
                .addGroup(changePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(showBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(currentPwPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(newPwPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(repeatNewPwPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(adminButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
        );

        changeSecret1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Change Secret Question/Answer");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        secretQuestionComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "What is your mother's maiden name?", "In what city were you born?", "What is the name of your first pet?", "What is your favorite movie?", "What is the name of your first love?" }));
        secretQuestionComboBox.setSelectedIndex(-1);
        secretQuestionComboBox.setLabelText("Old Secret Question");

        secretAnswerTextField.setLabelText("Old Secret Answer");

        adminButton4.setText("Check");
        adminButton4.setRadius(25);
        adminButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout changeSecret1Layout = new javax.swing.GroupLayout(changeSecret1);
        changeSecret1.setLayout(changeSecret1Layout);
        changeSecret1Layout.setHorizontalGroup(
            changeSecret1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changeSecret1Layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(changeSecret1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addGroup(changeSecret1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(adminButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(secretAnswerTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(secretQuestionComboBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)))
                .addContainerGap(246, Short.MAX_VALUE))
        );
        changeSecret1Layout.setVerticalGroup(
            changeSecret1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, changeSecret1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(changeSecret1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel2))
                .addGap(52, 52, 52)
                .addComponent(secretQuestionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(secretAnswerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(adminButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
        );

        changeSecret2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Change Secret Question and Answer");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        newSecretQuestionComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "What is your mother's maiden name?", "In what city were you born?", "What is the name of your first pet?", "What is your favorite movie?", "What is the name of your first love?" }));
        newSecretQuestionComboBox.setSelectedIndex(-1);
        newSecretQuestionComboBox.setLabelText("New Secret Question");

        newSecretAnswerTextField.setLabelText("New Secret Answer");

        adminButton5.setText("Change");
        adminButton5.setRadius(25);
        adminButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout changeSecret2Layout = new javax.swing.GroupLayout(changeSecret2);
        changeSecret2.setLayout(changeSecret2Layout);
        changeSecret2Layout.setHorizontalGroup(
            changeSecret2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changeSecret2Layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(changeSecret2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addGroup(changeSecret2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(newSecretAnswerTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(newSecretQuestionComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                        .addComponent(adminButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(308, 308, 308))
        );
        changeSecret2Layout.setVerticalGroup(
            changeSecret2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, changeSecret2Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(changeSecret2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel17))
                .addGap(33, 33, 33)
                .addComponent(newSecretQuestionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(newSecretAnswerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(adminButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(195, Short.MAX_VALUE))
        );

        settingsPanel.setBackground(new java.awt.Color(255, 255, 255));
        settingsPanel.setPreferredSize(new java.awt.Dimension(1007, 714));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("ACCOUNT SETTINGS");

        adminButton1.setText("Change Password");
        adminButton1.setRadius(50);
        adminButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButton1ActionPerformed(evt);
            }
        });

        adminButton2.setText("Change Secret Question and Answer");
        adminButton2.setRadius(50);
        adminButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout settingsPanelLayout = new javax.swing.GroupLayout(settingsPanel);
        settingsPanel.setLayout(settingsPanelLayout);
        settingsPanelLayout.setHorizontalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingsPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(adminButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adminButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        settingsPanelLayout.setVerticalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingsPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel12)
                .addGap(37, 37, 37)
                .addComponent(adminButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(adminButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(371, Short.MAX_VALUE))
        );

        sp.setViewportView(settingsPanel);

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

    private void adminButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButton1ActionPerformed
        sp.setViewportView(null);

        // Add jPanel5 to the scroll pane
        sp.setViewportView(changePassword);

        // Refresh the scroll pane to ensure it displays the new content
        sp.revalidate();
        sp.repaint();
    }//GEN-LAST:event_adminButton1ActionPerformed

    private void adminButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButton2ActionPerformed
        sp.setViewportView(null);

        // Add jPanel5 to the scroll pane
        sp.setViewportView(changeSecret1);

        // Refresh the scroll pane to ensure it displays the new content
        sp.revalidate();
        sp.repaint();
    }//GEN-LAST:event_adminButton2ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        addPanelToScrollPane();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void adminButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButton3ActionPerformed
        String currentPw = new String(currentPwPasswordField.getPassword());
        String newPw = new String(newPwPasswordField.getPassword());
        String repeatNewPw = new String(repeatNewPwPasswordField.getPassword());

        String hashedCurrentPw = sha256(currentPw);
        if (newPw.length() < 5 || newPw.length() > 10) {
            JOptionPane.showMessageDialog(null, "New password must be between 5 and 10 characters.");
            return;
        }

        String url = "jdbc:mysql://127.0.0.1:3306/database";
        String dbUsername = "root";
        String dbPassword = "admin";

        try (Connection connection = DriverManager.getConnection(url, dbUsername, dbPassword)) {
            // Check if the current password matches the one in the database
            String checkPasswordQuery = "SELECT password FROM users WHERE userid = ?";
            try (PreparedStatement checkPasswordStmt = connection.prepareStatement(checkPasswordQuery)) {
                checkPasswordStmt.setInt(1, realUserId);
                ResultSet resultSet = checkPasswordStmt.executeQuery();

                if (resultSet.next()) {
                    String dbCurrentPw = resultSet.getString("password");

                    if (dbCurrentPw.equals(hashedCurrentPw)) {
                        // Current password matches, now check if new password and repeat new password are the same
                        if (newPw.equals(repeatNewPw)) {
                            // Update the password in the database
                            String hashedPw = sha256(newPw);
                            String updatePasswordQuery = "UPDATE users SET password = ? WHERE userid = ?";
                            try (PreparedStatement updatePasswordStmt = connection.prepareStatement(updatePasswordQuery)) {
                                updatePasswordStmt.setString(1, hashedPw);
                                updatePasswordStmt.setInt(2, realUserId);
                                int rowsAffected = updatePasswordStmt.executeUpdate();

                                if (rowsAffected > 0) {
                                    clearPasswordFields();
                                    JOptionPane.showMessageDialog(null, "Password updated successfully.");
                                    addPasswordChangeAuditLog(realUserId);
                                    addPanelToScrollPane();
                                } else {
                                    JOptionPane.showMessageDialog(null, "Failed to update password.");
                                }
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "New password and repeated new password do not match.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Current password is incorrect.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "User ID not found.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_adminButton3ActionPerformed

    private void showBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showBtnMouseClicked
        if (showBtn.isSelected()) {
            currentPwPasswordField.setEchoChar((char) 0);
            newPwPasswordField.setEchoChar((char) 0);
            repeatNewPwPasswordField.setEchoChar((char) 0);

            showBtn.setText("HIDE");

        } else {
            currentPwPasswordField.setEchoChar('\u25cf');
            newPwPasswordField.setEchoChar('\u25cf');
            repeatNewPwPasswordField.setEchoChar('\u25cf');

            showBtn.setText("Show");
        }
    }//GEN-LAST:event_showBtnMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        addPanelToScrollPane();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void adminButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButton4ActionPerformed
        String secretQuestion = (String) secretQuestionComboBox.getSelectedItem();
        String secretAnswer = secretAnswerTextField.getText();

        String url = "jdbc:mysql://127.0.0.1:3306/database";
        String dbUsername = "root";
        String dbPassword = "admin";

        try (Connection connection = DriverManager.getConnection(url, dbUsername, dbPassword)) {
            String query = "SELECT secret_question, secret_answer FROM users WHERE userid = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setInt(1, realUserId);
                ResultSet resultSet = preparedStatement.executeQuery();

                if (resultSet.next()) {
                    String dbSecretQuestion = resultSet.getString("secret_question");
                    String dbSecretAnswer = resultSet.getString("secret_answer");

                    if (secretQuestion.equals(dbSecretQuestion) && secretAnswer.equals(dbSecretAnswer)) {
                        nextScreen();
                        JOptionPane.showMessageDialog(null, "Incorrect Question or Answer");
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrect Question or Answer");
                        secretAnswerTextField.setText("");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "User ID not found");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_adminButton4ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        addPanelToScrollPane();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void adminButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButton5ActionPerformed
        // Get the new secret question and answer
        String newSecretQuestion = (String) newSecretQuestionComboBox.getSelectedItem();
        String newSecretAnswer = newSecretAnswerTextField.getText();

        String url = "jdbc:mysql://127.0.0.1:3306/database";
        String dbUsername = "root";
        String dbPassword = "admin";

        // Check if the new secret question and answer fields are not empty
        if (newSecretQuestion == null || newSecretQuestion.isEmpty() || newSecretAnswer.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Secret question and answer cannot be empty");
            return;
        }

        try (Connection connection = DriverManager.getConnection(url, dbUsername, dbPassword)) {
            String query = "UPDATE users SET secret_question = ?, secret_answer = ? WHERE userid = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, newSecretQuestion);
                preparedStatement.setString(2, newSecretAnswer);
                preparedStatement.setInt(3, realUserId);

                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Secret question and answer updated successfully");
                    addSecretQuestionChangeAuditLog(realUserId);
                    addPanelToScrollPane();
                } else {
                    JOptionPane.showMessageDialog(null, "User ID not found");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_adminButton5ActionPerformed
    private void clearPasswordFields() {
        currentPwPasswordField.setText("");
        newPwPasswordField.setText("");
        repeatNewPwPasswordField.setText("");
    }

    public void addPasswordChangeAuditLog(int userId) {
        String url = "jdbc:mysql://127.0.0.1:3306/database";
        String dbUsername = "root";
        String dbPassword = "admin";

        try (Connection connection = DriverManager.getConnection(url, dbUsername, dbPassword)) {
            // Prepare the SQL query to add password change audit log
            String query = "INSERT INTO audit_logs (userid, event, action_type) VALUES (?, 'user changed password', 'password_change')";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, userId);

            // Execute the query
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Password change audit log added successfully.");
            } else {
                System.out.println("Failed to add password change audit log.");
            }
        } catch (SQLException e) {
            // Handle any SQL exceptions
            e.printStackTrace();
        }
    }

    public void addSecretQuestionChangeAuditLog(int userId) {
        String url = "jdbc:mysql://127.0.0.1:3306/database";
        String dbUsername = "root";
        String dbPassword = "admin";

        try (Connection connection = DriverManager.getConnection(url, dbUsername, dbPassword)) {
            // Prepare the SQL query to add secret question change audit log
            String query = "INSERT INTO audit_logs (userid, event, action_type) VALUES (?, 'user changed secret question', 'secret_question_change')";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, userId);

            // Execute the query
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Secret question change audit log added successfully.");
            } else {
                System.out.println("Failed to add secret question change audit log.");
            }
        } catch (SQLException e) {
            // Handle any SQL exceptions
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.AdminButton adminButton1;
    private swing.AdminButton adminButton2;
    private swing.AdminButton adminButton3;
    private swing.AdminButton adminButton4;
    private swing.AdminButton adminButton5;
    private javax.swing.JPanel changePassword;
    private javax.swing.JPanel changeSecret1;
    private javax.swing.JPanel changeSecret2;
    private swing.PasswordField currentPwPasswordField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private swing.PasswordField newPwPasswordField;
    private swing.TextField newSecretAnswerTextField;
    private swing.Combobox newSecretQuestionComboBox;
    private swing.PasswordField repeatNewPwPasswordField;
    private swing.TextField secretAnswerTextField;
    private swing.Combobox secretQuestionComboBox;
    private javax.swing.JPanel settingsPanel;
    private swing.AdminButton showBtn;
    private javax.swing.JScrollPane sp;
    // End of variables declaration//GEN-END:variables
}
