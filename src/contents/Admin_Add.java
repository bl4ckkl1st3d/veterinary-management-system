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
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import static softeng.login.sha256;
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
        saveBtn.setVisible(false);
        sp.setVerticalScrollBar(new ScrollBar());
        sp.setHorizontalScrollBar(new ScrollBar());
    }
    private static final String DATABASE_NAME = "database";
    private static final String dbUsername = "root";
    private static final String dbPassword = "admin";
    private static final String MYSQL_SERVER_HOSTNAME = "DESKTOP-MVBR3DH"; // Replace with your MySQL server's hostname
    private static final int MYSQL_SERVER_PORT = 3306;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sp = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        firstNameTxtField = new swing.TextField();
        lastNameTxtField = new swing.TextField();
        addressTxtField = new swing.TextField();
        sexBox = new swing.Combobox();
        contactTxtField = new swing.TextField();
        usernameTxtField = new swing.TextField();
        loaBox = new swing.Combobox();
        secretQuestionBox = new swing.Combobox();
        answerTxtField = new swing.TextField();
        useridTxtField = new swing.TextField();
        editBtn = new swing.AdminButton();
        adminButton1 = new swing.AdminButton();
        addUserBtn = new swing.AdminButton();
        saveBtn = new swing.AdminButton();
        birthDate = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        passTxtField = new swing.PasswordField();

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("PERSONAL INFORMATION");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("ACCOUNT SECTION");

        firstNameTxtField.setLabelText("First Name");
        firstNameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTxtFieldActionPerformed(evt);
            }
        });

        lastNameTxtField.setLabelText("Last Name");

        addressTxtField.setLabelText("Address");

        sexBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MALE", "FEMALE", " " }));
        sexBox.setSelectedIndex(-1);
        sexBox.setLabelText("Sex");

        contactTxtField.setLabelText("Contact No.");

        usernameTxtField.setLabelText("Username");

        loaBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ADMIN", "VETERINARIAN", "CASHIER" }));
        loaBox.setSelectedIndex(-1);
        loaBox.setLabelText("Level of Access");

        secretQuestionBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "What is your mother's maiden name?", "In what city were you born?", "What is the name of your first pet?", "What is your favorite movie?", "What is the name of your first love?" }));
        secretQuestionBox.setSelectedIndex(-1);
        secretQuestionBox.setLabelText("Secret Question");

        answerTxtField.setLabelText("Answer");

        useridTxtField.setLabelText("User ID");
        useridTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useridTxtFieldActionPerformed(evt);
            }
        });

        editBtn.setText("Edit");
        editBtn.setRadius(25);
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        adminButton1.setText("Clear");
        adminButton1.setRadius(25);
        adminButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButton1ActionPerformed(evt);
            }
        });

        addUserBtn.setText("Add User");
        addUserBtn.setRadius(25);
        addUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserBtnActionPerformed(evt);
            }
        });

        saveBtn.setText("Save");
        saveBtn.setRadius(25);
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("BirthDate");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(211, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(usernameTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(loaBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(secretQuestionBox, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(answerTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addUserBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel17))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sexBox, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                            .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(adminButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(useridTxtField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(0, 33, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(contactTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(458, 458, 458))
                                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(birthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(addressTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(firstNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(158, 158, 158)
                                                .addComponent(lastNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addContainerGap(178, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adminButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(useridTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(addressTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sexBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(birthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(contactTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(usernameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(passTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(loaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(secretQuestionBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(answerTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
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

    private void clearAllFields() {
        // Clear all text fields and reset combo boxes
        usernameTxtField.setText("");
        passTxtField.setText("");
        answerTxtField.setText("");
        secretQuestionBox.setSelectedIndex(-1);
        loaBox.setSelectedIndex(-1);
        firstNameTxtField.setText("");
        lastNameTxtField.setText("");
        addressTxtField.setText("");
//        ageTxtField.setText("");
        contactTxtField.setText("");
        useridTxtField.setText("");
        sexBox.setSelectedIndex(-1);
    }

    public void updateUserAuditLog(int userId) {
        String url = "jdbc:mysql://" + MYSQL_SERVER_HOSTNAME + ":" + MYSQL_SERVER_PORT + "/" + DATABASE_NAME;
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
        String url = "jdbc:mysql://" + MYSQL_SERVER_HOSTNAME + ":" + MYSQL_SERVER_PORT + "/" + DATABASE_NAME;
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
        String url = "jdbc:mysql://" + MYSQL_SERVER_HOSTNAME + ":" + MYSQL_SERVER_PORT + "/" + DATABASE_NAME;

        String username = usernameTxtField.getText().trim();
        String password = new String(passTxtField.getPassword());
        String answer = answerTxtField.getText().trim();
        String secretQuestion = (String) secretQuestionBox.getSelectedItem();
        String loaString = (String) loaBox.getSelectedItem();
        String hashed = sha256(password);

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

        String firstName = firstNameTxtField.getText().trim();
        String lastName = lastNameTxtField.getText().trim();
        String address = addressTxtField.getText().trim();
        String contact = contactTxtField.getText().trim();
        String sex = sexBox.getSelectedItem().toString().equals("MALE") ? "M" : "F";

        // Validate that required fields are not empty
        if (username.isEmpty() || firstName.isEmpty() || lastName.isEmpty() || address.isEmpty() || contact.isEmpty() || password.isEmpty() || answer.isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields must be filled out.");
            return;
        }

        // Get the birthdate from JDateChooser
        java.util.Date birthDateValue = birthDate.getDate();
        if (birthDateValue == null) {
            JOptionPane.showMessageDialog(null, "Please enter a valid birthdate.");
            return;
        }

        LocalDate birthDateLocal = birthDateValue.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        // Check if the birthdate is in the future
        if (birthDateLocal.isAfter(LocalDate.now())) {
            JOptionPane.showMessageDialog(null, "Birthdate cannot be in the future.");
            return;
        }

        // Calculate age
        long age = ChronoUnit.YEARS.between(birthDateLocal, LocalDate.now());

        // Convert the birthdate to java.sql.Date
        java.sql.Date sqlBirthDate = java.sql.Date.valueOf(birthDateLocal);

        // Validate contact number length
        if (contact.length() != 11) {
            JOptionPane.showMessageDialog(null, "Contact number must be 11 digits long.");
            return;
        }
        if (!contact.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Contact number must contain only digits.");
            return;
        }

        Connection connection = null;
        PreparedStatement checkUserStmt = null;
        PreparedStatement userStmt = null;
        PreparedStatement infoStmt = null;
        ResultSet generatedKeys = null;
        ResultSet userResult = null;

        try {
            // Establish the database connection
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            connection.setAutoCommit(false); // Start transaction

            // Check if the username is unique
            String checkUserQuery = "SELECT COUNT(*) FROM users WHERE username = ?";
            checkUserStmt = connection.prepareStatement(checkUserQuery);
            checkUserStmt.setString(1, username);
            userResult = checkUserStmt.executeQuery();

            if (userResult.next() && userResult.getInt(1) > 0) {
                JOptionPane.showMessageDialog(null, "Username already exists. Please choose a different username.");
                return;
            }

            // Insert into users table
            String userQuery = "INSERT INTO users (username, password, secret_question, secret_answer, LOA) VALUES (?, ?, ?, ?, ?)";
            userStmt = connection.prepareStatement(userQuery, Statement.RETURN_GENERATED_KEYS);
            userStmt.setString(1, username);
            userStmt.setString(2, hashed);
            userStmt.setString(3, secretQuestion);
            userStmt.setString(4, answer);
            userStmt.setInt(5, loa);

            int rowsAffected = userStmt.executeUpdate();

            if (rowsAffected > 0) {
                generatedKeys = userStmt.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int userId = generatedKeys.getInt(1);

                    // Insert into user_information table
                    String infoQuery = "INSERT INTO user_information (userid, username, first_name, last_name, address, birthdate, age, sex, contact) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
                    infoStmt = connection.prepareStatement(infoQuery);
                    infoStmt.setInt(1, userId);
                    infoStmt.setString(2, username);
                    infoStmt.setString(3, firstName);
                    infoStmt.setString(4, lastName);
                    infoStmt.setString(5, address);
                    infoStmt.setDate(6, sqlBirthDate);
                    infoStmt.setLong(7, age);
                    infoStmt.setString(8, sex);
                    infoStmt.setString(9, contact);

                    rowsAffected = infoStmt.executeUpdate();

                    if (rowsAffected > 0) {
                        connection.commit(); // Commit transaction
                        JOptionPane.showMessageDialog(null, "User added successfully");
                        clearAllFields();
                        addUserAuditLog(userId);
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
            if (checkUserStmt != null) {
                try {
                    checkUserStmt.close();
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


    private void adminButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButton1ActionPerformed
        clearAllFields();
        saveBtn.setVisible(false);
        addUserBtn.setVisible(true);
        birthDate.setDate(null);
    }//GEN-LAST:event_adminButton1ActionPerformed

    private void addUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserBtnActionPerformed
        addUserToDatabase();
    }//GEN-LAST:event_addUserBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // Get data from the text fields
        String user_Id = useridTxtField.getText();
        String firstName = firstNameTxtField.getText();
        String lastName = lastNameTxtField.getText();
        String address = addressTxtField.getText();
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
        String password = new String(passTxtField.getPassword());
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

        // Get the birthdate from JDateChooser
        java.util.Date birthDateValue = birthDate.getDate();
        if (birthDateValue == null) {
            JOptionPane.showMessageDialog(null, "Please enter a valid birthdate.");
            return;
        }

        LocalDate birthDateLocal = birthDateValue.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        // Calculate age
        long age = ChronoUnit.YEARS.between(birthDateLocal, LocalDate.now());

        // Convert the birthdate to java.sql.Date
        java.sql.Date sqlBirthDate = java.sql.Date.valueOf(birthDateLocal);

        // Database connection information
        String url = "jdbc:mysql://127.0.0.1:3306/database";
        String dbUsername = "root";
        String dbPassword = "admin";

        try {
            // Establish the database connection
            Connection connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            connection.setAutoCommit(false); // Start transaction

            // Update the 'users' table
            String updateUsersQuery;
            if (password.isEmpty()) {
                updateUsersQuery = "UPDATE users SET username = ?, secret_question = ?, secret_answer = ?, LOA = ? WHERE userid = ?";
            } else {
                updateUsersQuery = "UPDATE users SET username = ?, password = ?, secret_question = ?, secret_answer = ?, LOA = ? WHERE userid = ?";
            }

            PreparedStatement usersPreparedStatement = connection.prepareStatement(updateUsersQuery);
            usersPreparedStatement.setString(1, username);
            if (!password.isEmpty()) {
                String hashed = sha256(password);
                usersPreparedStatement.setString(2, hashed);
                usersPreparedStatement.setString(3, secretQuestion);
                usersPreparedStatement.setString(4, answer);
                usersPreparedStatement.setInt(5, loa);
                usersPreparedStatement.setInt(6, Integer.parseInt(user_Id));
            } else {
                usersPreparedStatement.setString(2, secretQuestion);
                usersPreparedStatement.setString(3, answer);
                usersPreparedStatement.setInt(4, loa);
                usersPreparedStatement.setInt(5, Integer.parseInt(user_Id));
            }
            int rowsAffectedUsers = usersPreparedStatement.executeUpdate();

            // Update the 'user_information' table
            String updateUserInformationQuery = "UPDATE user_information SET first_name = ?, last_name = ?, address = ?, birthdate = ?, age = ?, contact = ?, sex = ? WHERE userid = ?";
            PreparedStatement userInformationPreparedStatement = connection.prepareStatement(updateUserInformationQuery);
            userInformationPreparedStatement.setString(1, firstName);
            userInformationPreparedStatement.setString(2, lastName);
            userInformationPreparedStatement.setString(3, address);
            userInformationPreparedStatement.setDate(4, sqlBirthDate);
            userInformationPreparedStatement.setLong(5, age);
            userInformationPreparedStatement.setString(6, contact);
            userInformationPreparedStatement.setString(7, sex);
            userInformationPreparedStatement.setInt(8, Integer.parseInt(user_Id));
            int rowsAffectedUserInformation = userInformationPreparedStatement.executeUpdate();

            // Check if updates were successful
            if (rowsAffectedUsers > 0 && rowsAffectedUserInformation > 0) {
                connection.commit(); // Commit transaction
                JOptionPane.showMessageDialog(null, "User information updated successfully.");
                updateUserAuditLog(Integer.parseInt(user_Id));
                clearAllFields();
            } else {
                connection.rollback(); // Rollback transaction
                JOptionPane.showMessageDialog(null, "Failed to update user information.");
            }

            // Close the database connection
            connection.close();
        } catch (SQLException e) {
            // Handle any SQL exceptions
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        String user_Id = useridTxtField.getText();
        String firstName = firstNameTxtField.getText();
        String lastName = lastNameTxtField.getText();
        String address = addressTxtField.getText();
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
        String password = new String(passTxtField.getPassword());
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

        // Get the birthdate from JDateChooser
        java.util.Date birthDateValue = birthDate.getDate();
        if (birthDateValue == null) {
            JOptionPane.showMessageDialog(null, "Please enter a valid birthdate.");
            return;
        }

        LocalDate birthDateLocal = birthDateValue.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        // Calculate age
        long age = ChronoUnit.YEARS.between(birthDateLocal, LocalDate.now());

        // Convert the birthdate to java.sql.Date
        java.sql.Date sqlBirthDate = java.sql.Date.valueOf(birthDateLocal);

        // Database connection information
        String url = "jdbc:mysql://" + MYSQL_SERVER_HOSTNAME + ":" + MYSQL_SERVER_PORT + "/" + DATABASE_NAME;

        try {
            // Establish the database connection
            Connection connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            connection.setAutoCommit(false); // Start transaction

            // Update the 'users' table
            String updateUsersQuery;
            if (password.isEmpty()) {
                updateUsersQuery = "UPDATE users SET username = ?, secret_question = ?, secret_answer = ?, LOA = ? WHERE userid = ?";
            } else {
                updateUsersQuery = "UPDATE users SET username = ?, password = ?, secret_question = ?, secret_answer = ?, LOA = ? WHERE userid = ?";
            }

            PreparedStatement usersPreparedStatement = connection.prepareStatement(updateUsersQuery);
            usersPreparedStatement.setString(1, username);
            if (!password.isEmpty()) {
                String hashed = sha256(password);
                usersPreparedStatement.setString(2, hashed);
                usersPreparedStatement.setString(3, secretQuestion);
                usersPreparedStatement.setString(4, answer);
                usersPreparedStatement.setInt(5, loa);
                usersPreparedStatement.setInt(6, Integer.parseInt(user_Id));
            } else {
                usersPreparedStatement.setString(2, secretQuestion);
                usersPreparedStatement.setString(3, answer);
                usersPreparedStatement.setInt(4, loa);
                usersPreparedStatement.setInt(5, Integer.parseInt(user_Id));
            }
            int rowsAffectedUsers = usersPreparedStatement.executeUpdate();

            // Update the 'user_information' table
            String updateUserInformationQuery = "UPDATE user_information SET first_name = ?, last_name = ?, address = ?, birthdate = ?, age = ?, contact = ?, sex = ? WHERE userid = ?";
            PreparedStatement userInformationPreparedStatement = connection.prepareStatement(updateUserInformationQuery);
            userInformationPreparedStatement.setString(1, firstName);
            userInformationPreparedStatement.setString(2, lastName);
            userInformationPreparedStatement.setString(3, address);
            userInformationPreparedStatement.setDate(4, sqlBirthDate);
            userInformationPreparedStatement.setLong(5, age);
            userInformationPreparedStatement.setString(6, contact);
            userInformationPreparedStatement.setString(7, sex);
            userInformationPreparedStatement.setInt(8, Integer.parseInt(user_Id));
            int rowsAffectedUserInformation = userInformationPreparedStatement.executeUpdate();

            // Check if updates were successful
            if (rowsAffectedUsers > 0 && rowsAffectedUserInformation > 0) {
                connection.commit(); // Commit transaction
                JOptionPane.showMessageDialog(null, "User information updated successfully.");
                updateUserAuditLog(Integer.parseInt(user_Id));
                clearAllFields();
            } else {
                connection.rollback(); // Rollback transaction
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

    private void useridTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useridTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_useridTxtFieldActionPerformed

    private void firstNameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTxtFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.AdminButton addUserBtn;
    private swing.TextField addressTxtField;
    private swing.AdminButton adminButton1;
    private swing.TextField answerTxtField;
    private com.toedter.calendar.JDateChooser birthDate;
    private swing.TextField contactTxtField;
    private swing.AdminButton editBtn;
    private swing.TextField firstNameTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel5;
    private swing.TextField lastNameTxtField;
    private swing.Combobox loaBox;
    private swing.PasswordField passTxtField;
    private swing.AdminButton saveBtn;
    private swing.Combobox secretQuestionBox;
    private swing.Combobox sexBox;
    private javax.swing.JScrollPane sp;
    private swing.TextField useridTxtField;
    private swing.TextField usernameTxtField;
    // End of variables declaration//GEN-END:variables
}
