/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package contents;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.io.BufferedReader;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.sql.*;
import swing.ScrollBar;

/**
 *
 * @author Richard Reynald
 */
public class Admin_Add extends javax.swing.JPanel {

    private int userIdx;
    
    public Admin_Add(int userIdx) {
        initComponents();
        this.userIdx = userIdx;
        editBtn.setVisible(false);
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
        jPanel5 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        useridTxtField = new swing.TextField();
        firstNameTxtField = new swing.TextField();
        lastNameTxtField = new swing.TextField();
        addressTxtField = new swing.TextField();
        ageTxtField = new swing.TextField();
        sexBox = new swing.Combobox();
        contactTxtField = new swing.TextField();
        usernameTxtField = new swing.TextField();
        passwordTxtField = new swing.TextField();
        loaBox = new swing.Combobox();
        secretQuestionBox = new swing.Combobox();
        answerTxtField = new swing.TextField();

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("PERSONAL INFORMATION");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("ACCOUNT SECTION");

        jButton1.setText("ADD USER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        editBtn.setText("EDIT USER");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        useridTxtField.setLabelText("User ID");
        useridTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                useridTxtFieldKeyReleased(evt);
            }
        });

        firstNameTxtField.setLabelText("First Name");

        lastNameTxtField.setLabelText("Last Name");

        addressTxtField.setLabelText("Address");

        ageTxtField.setLabelText("Age");

        sexBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        sexBox.setSelectedIndex(-1);
        sexBox.setLabelText("Sex");

        contactTxtField.setLabelText("Contact No.");

        usernameTxtField.setLabelText("Username");

        passwordTxtField.setLabelText("Password");

        loaBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ADMIN", "VETERINARIAN", "CASHIER" }));
        loaBox.setSelectedIndex(-1);
        loaBox.setLabelText("Level of Access");

        secretQuestionBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "What is your mother's maiden name?", "In what city were you born?", "What is the name of your first pet?", "What is your favorite movie?", "What is the name of your first love?" }));
        secretQuestionBox.setSelectedIndex(-1);
        secretQuestionBox.setLabelText("Secret Question");

        answerTxtField.setLabelText("Answer");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contactTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(addressTxtField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(firstNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(104, 104, 104)
                                    .addComponent(lastNameTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(ageTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                                    .addComponent(sexBox, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passwordTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(loaBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(secretQuestionBox, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(answerTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(useridTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(useridTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(addressTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(contactTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(usernameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(passwordTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(loaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(secretQuestionBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(answerTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        sp.setViewportView(jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sp, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sp, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private boolean userIdEvent() {
        String url = "jdbc:mysql://127.0.0.1:3306/database";
        String dbUsername = "root";
        String dbPassword = "admin";

        String userIdText = useridTxtField.getText();
        if (userIdText.isEmpty()) {
            clearAllFields(); // Clear all fields if the userIdTextField is empty
            return false;
        }

        int userId;
        try {
            userId = Integer.parseInt(userIdText);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid user ID format");
            clearAllFields();
            return false;
        }

        Connection connection = null;
        PreparedStatement userStmt = null;
        PreparedStatement infoStmt = null;
        ResultSet userResultSet = null;
        ResultSet infoResultSet = null;

        try {
            // Establish the database connection
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);

            // Query to get user data from users table
            String userQuery = "SELECT * FROM users WHERE userid = ?";
            userStmt = connection.prepareStatement(userQuery);
            userStmt.setInt(1, userId);
            userResultSet = userStmt.executeQuery();

            if (userResultSet.next()) {
                String username = userResultSet.getString("username");
                String password = userResultSet.getString("password");
                String secretQuestion = userResultSet.getString("secret_question");
                String answer = userResultSet.getString("secret_answer");
                int loa = userResultSet.getInt("LOA");

                // Set values in the respective text fields and combo boxes
                usernameTxtField.setText(username);
                passwordTxtField.setText(password);
                answerTxtField.setText(answer);
                secretQuestionBox.setSelectedItem(secretQuestion);

                switch (loa) {
                    case 0:
                        loaBox.setSelectedItem("CASHIER");
                        break;
                    case 1:
                        loaBox.setSelectedItem("VETERINARIAN");
                        break;
                    case 2:
                        loaBox.setSelectedItem("ADMMIN");
                        break;
                    default:
                        loaBox.setSelectedItem("Unknown");
                        break;
                }

            } else {
                clearAllFields();

            }

            // Query to get user information from user_information table
            String infoQuery = "SELECT * FROM user_information WHERE userid = ?";
            infoStmt = connection.prepareStatement(infoQuery);
            infoStmt.setInt(1, userId);
            infoResultSet = infoStmt.executeQuery();

            if (infoResultSet.next()) {
                String firstName = infoResultSet.getString("first_name");
                String lastName = infoResultSet.getString("last_name");
                String address = infoResultSet.getString("address");
                int age = infoResultSet.getInt("age");
                String contact = infoResultSet.getString("contact");
                String sex = infoResultSet.getString("sex");

                // Set values in the respective text fields and combo boxes
                firstNameTxtField.setText(firstName);
                lastNameTxtField.setText(lastName);
                addressTxtField.setText(address);
                ageTxtField.setText(String.valueOf(age));
                contactTxtField.setText(contact);
                if ("M".equals(sex)) {
                    sexBox.setSelectedItem("MALE");
                } else if ("F".equals(sex)) {
                    sexBox.setSelectedItem("FEMALE");
                }

                return true;

            } else {

                clearAllFields();
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            clearAllFields();
        } finally {
            if (userResultSet != null) {
                try {
                    userResultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (infoResultSet != null) {
                try {
                    infoResultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (userStmt != null) {
                try {
                    userStmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (infoStmt != null) {
                try {
                    infoStmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }
    
    private void clearAllFields() {
        // Clear all text fields and reset combo boxes
        usernameTxtField.setText("");
        passwordTxtField.setText("");
        answerTxtField.setText("");
        secretQuestionBox.setSelectedIndex(-1);
        loaBox.setSelectedIndex(-1);
        firstNameTxtField.setText("");
        lastNameTxtField.setText("");
        addressTxtField.setText("");
        ageTxtField.setText("");
        contactTxtField.setText("");
        sexBox.setSelectedIndex(-1);
    }
    
    public void updateUserAuditLog(int userId) {
        String url = "jdbc:mysql://127.0.0.1:3306/database";
        String dbUsername = "root";
        String dbPassword = "admin";
        try {
            // Establish the database connection
            Connection connection = DriverManager.getConnection(url, dbUsername, dbPassword);

            // Prepare the SQL query to add login audit log
            String query = "INSERT INTO audit_logs (userid, event, action_type) VALUES (?, 'change user information', 'update user')";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, userId);

            // Execute the query
            int rowsAffected = preparedStatement.executeUpdate();

            // Close the database connection
            connection.close();
        } catch (SQLException e) {
            // Handle any SQL exceptions
            e.printStackTrace();
        }
    }

    public void addUserAuditLog(int userId) {
        String url = "jdbc:mysql://127.0.0.1:3306/database";
        String dbUsername = "root";
        String dbPassword = "admin";
        try {
            // Establish the database connection
            Connection connection = DriverManager.getConnection(url, dbUsername, dbPassword);

            // Prepare the SQL query to add login audit log
            String query = "INSERT INTO audit_logs (userid, event, action_type) VALUES (?, 'add new user', 'add user')";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, userId);

            // Execute the query
            int rowsAffected = preparedStatement.executeUpdate();

            // Close the database connection
            connection.close();
        } catch (SQLException e) {
            // Handle any SQL exceptions
            e.printStackTrace();
        }
    }

    private void addUserToDatabase() {
        String url = "jdbc:mysql://127.0.0.1:3306/database";
        String dbUsername = "root";
        String dbPassword = "admin";

        String username = usernameTxtField.getText();
        String password = new String(passwordTxtField.getText());
        String answer = answerTxtField.getText();
        String secretQuestion = (String) secretQuestionBox.getSelectedItem();
        String loaString = (String) loaBox.getSelectedItem();

        int loa;

        switch (loaString.toLowerCase()) {
            case "cashier":
                loa = 0;
                break;
            case "veterinarian":
                loa = 1;
                break;
            case "admin":
                loa = 2;
                break;
            default:
                throw new IllegalArgumentException("Invalid LOA value");
        }

        String firstName = firstNameTxtField.getText();
        String lastName = lastNameTxtField.getText();
        String address = addressTxtField.getText();
        int age = Integer.parseInt(ageTxtField.getText());
        String contact = contactTxtField.getText();
        String sex = sexBox.getSelectedItem().toString().equals("MALE") ? "M" : "F";

        Connection connection = null;
        PreparedStatement userStmt = null;
        PreparedStatement infoStmt = null;
        ResultSet generatedKeys = null;

        try {
            // Establish the database connection
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            connection.setAutoCommit(false); // Start transaction

            // Insert into users table
            String userQuery = "INSERT INTO users (username, password, secret_question, secret_answer, LOA) VALUES (?, ?, ?, ?, ?)";
            userStmt = connection.prepareStatement(userQuery, Statement.RETURN_GENERATED_KEYS);
            userStmt.setString(1, username);
            userStmt.setString(2, password);
            userStmt.setString(3, secretQuestion);
            userStmt.setString(4, answer);
            userStmt.setInt(5, loa);

            int rowsAffected = userStmt.executeUpdate();

            if (rowsAffected > 0) {
                generatedKeys = userStmt.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int userId = generatedKeys.getInt(1);

                    // Insert into user_information table
                    String infoQuery = "INSERT INTO user_information (userid, username, first_name, last_name, address, age, sex, contact) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                    infoStmt = connection.prepareStatement(infoQuery);
                    infoStmt.setInt(1, userId);
                    infoStmt.setString(2, username);
                    infoStmt.setString(3, firstName);
                    infoStmt.setString(4, lastName);
                    infoStmt.setString(5, address);
                    infoStmt.setInt(6, age);
                    infoStmt.setString(7, sex);
                    infoStmt.setString(8, contact);

                    rowsAffected = infoStmt.executeUpdate();

                    if (rowsAffected > 0) {
                        System.out.println("Second try na xsend");
                        connection.commit(); // Commit transaction
                        JOptionPane.showMessageDialog(null, "User added successfully");
                        clearAllFields();
                        addUserAuditLog(userIdx);
                    } else {
                        connection.rollback(); // Rollback transaction
                        JOptionPane.showMessageDialog(null, "Failed to add user information");
                    }
                }
            } else {
                connection.rollback(); // Rollback transaction
                JOptionPane.showMessageDialog(null, "Failed to add user");
            }
        } catch (SQLException e) {
            if (connection != null) {
                try {
                    connection.rollback(); // Rollback transaction on error
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        } finally {
            if (generatedKeys != null) {
                try {
                    generatedKeys.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (userStmt != null) {
                try {
                    userStmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (infoStmt != null) {
                try {
                    infoStmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        addUserToDatabase();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // Get data from the text fields
        String user_Id = useridTxtField.getText();
        String firstName = firstNameTxtField.getText();
        String lastName = lastNameTxtField.getText();
        String address = addressTxtField.getText();
        String age = ageTxtField.getText();
        String contact = contactTxtField.getText();

        // Get data from the combo box
        String sex = sexBox.getSelectedItem().toString();
        if (sex.equalsIgnoreCase("MALE")) {
            sex = "M";
        } else if (sex.equalsIgnoreCase("FEMALE")) {
            sex = "F";
        }

        // Get data from the remaining text fields
        String username = usernameTxtField.getText();
        String password = passwordTxtField.getText();
        String answer = answerTxtField.getText();
        String secretQuestion = secretQuestionBox.getSelectedItem().toString();

        // Get the LOA and convert it to an integer
        String loaString = loaBox.getSelectedItem().toString();
        int loa = -1;  // default value if LOA is not recognized
        switch (loaString.toLowerCase()) {
            case "cashier":
            loa = 0;
            break;
            case "veterinarian":
            loa = 1;
            break;
            case "admin":
            loa = 2;
            break;
        }

        // Database connection information
        String url = "jdbc:mysql://127.0.0.1:3306/database";
        String dbUsername = "root";
        String dbPassword = "admin";

        try {
            // Establish the database connection
            Connection connection = DriverManager.getConnection(url, dbUsername, dbPassword);

            // Update the 'users' table
            String updateUsersQuery = "UPDATE users SET username = ?, password = ?, secret_question = ?, secret_answer = ?, LOA = ? WHERE userid = ?";
            PreparedStatement usersPreparedStatement = connection.prepareStatement(updateUsersQuery);
            usersPreparedStatement.setString(1, username);
            usersPreparedStatement.setString(2, password);
            usersPreparedStatement.setString(3, secretQuestion);
            usersPreparedStatement.setString(4, answer);
            usersPreparedStatement.setInt(5, loa);
            usersPreparedStatement.setInt(6, Integer.parseInt(user_Id));
            int rowsAffectedUsers = usersPreparedStatement.executeUpdate();

            // Update the 'user_information' table
            String updateUserInformationQuery = "UPDATE user_information SET first_name = ?, last_name = ?, address = ?, age = ?, contact = ?, sex = ? WHERE userid = ?";
            PreparedStatement userInformationPreparedStatement = connection.prepareStatement(updateUserInformationQuery);
            userInformationPreparedStatement.setString(1, firstName);
            userInformationPreparedStatement.setString(2, lastName);
            userInformationPreparedStatement.setString(3, address);
            userInformationPreparedStatement.setString(4, age);
            userInformationPreparedStatement.setString(5, contact);
            userInformationPreparedStatement.setString(6, sex);
            userInformationPreparedStatement.setInt(7, Integer.parseInt(user_Id));
            int rowsAffectedUserInformation = userInformationPreparedStatement.executeUpdate();

            // Check if updates were successful
            if (rowsAffectedUsers > 0 && rowsAffectedUserInformation > 0) {
                JOptionPane.showMessageDialog(null, "User information updated successfully.");
                updateUserAuditLog(userIdx);
            } else {
                JOptionPane.showMessageDialog(null, "Failed to update user information.");
            }

            // Close the database connection
            connection.close();
        } catch (SQLException e) {
            // Handle any SQL exceptions
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_editBtnActionPerformed

    private void useridTxtFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_useridTxtFieldKeyReleased
        System.out.println("bru");

        String userId = useridTxtField.getText();

        Boolean isTrue = userIdEvent();
        if (isTrue) {
            editBtn.setVisible(true);
            jButton1.setVisible(false);
        } else {
            editBtn.setVisible(false);
            jButton1.setVisible(true);
        }
    }//GEN-LAST:event_useridTxtFieldKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.TextField addressTxtField;
    private swing.TextField ageTxtField;
    private swing.TextField answerTxtField;
    private swing.TextField contactTxtField;
    private javax.swing.JButton editBtn;
    private swing.TextField firstNameTxtField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel5;
    private swing.TextField lastNameTxtField;
    private swing.Combobox loaBox;
    private swing.TextField passwordTxtField;
    private swing.Combobox secretQuestionBox;
    private swing.Combobox sexBox;
    private javax.swing.JScrollPane sp;
    private swing.TextField useridTxtField;
    private swing.TextField usernameTxtField;
    // End of variables declaration//GEN-END:variables
}
