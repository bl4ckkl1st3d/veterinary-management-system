/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package softeng;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
import javax.swing.JOptionPane;
import loa.Admin;
import loa.Cashier;
import loa.Vet;

/**
 *
 * @author Kevin NAKA COMMENT PARIN YUNG AUDIT LOG
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        userTxtfield = new javax.swing.JTextField();
        passTxtField = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();
        showBtn = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginPanel.setBackground(new java.awt.Color(255, 153, 153));
        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LOGIN ");
        loginPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 240, 100));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PASSWORD");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 150, 100));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("USERNAME");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 130, 100));
        jPanel2.add(userTxtfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 300, 60));
        jPanel2.add(passTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 300, 60));

        loginBtn.setText("CONFIRM");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        jPanel2.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 150, 40));

        showBtn.setText("SHOW");
        showBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showBtnMouseClicked(evt);
            }
        });
        showBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBtnActionPerformed(evt);
            }
        });
        jPanel2.add(showBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 220, 80, 60));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, 120, 40));

        loginPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 870, 430));

        getContentPane().add(loginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 790));

        setSize(new java.awt.Dimension(1311, 797));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public void addLoginAuditLog(int userId) {
        String url = "jdbc:mysql://127.0.0.1:3306/database";
        String dbUsername = "root";
        String dbPassword = "admin";
        try {
            // Establish the database connection
            Connection connection = DriverManager.getConnection(url, dbUsername, dbPassword);

            // Prepare the SQL query to add login audit log
            String query = "INSERT INTO audit_logs (userid, event, action_type) VALUES (?, 'user logged in', 'login')";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, userId);

            // Execute the query
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Login audit log added successfully.");
            } else {
                System.out.println("Failed to add login audit log.");
            }

            // Close the database connection
            connection.close();
        } catch (SQLException e) {
            // Handle any SQL exceptions
            e.printStackTrace();
        }
    }
    private int errorCount = 0;

    private void performLogin(String username, String password) {
        String url = "jdbc:mysql://127.0.0.1:3306/database";
        String dbUsername = "root";
        String dbPassword = "admin";
        try {
            // Establish the database connection
            Connection connection = DriverManager.getConnection(url, dbUsername, dbPassword);

            // Prepare the SQL query to select the user with the provided credentials
            String query = "SELECT * FROM users WHERE BINARY username = ? AND BINARY password = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            // Execute the query
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                // If resultSet has at least one row, username and password exist in the database
                String LOA = resultSet.getString("LOA"); // Retrieve LOA from resultSet
                int userId = resultSet.getInt("userid"); // Retrieve userid from resultSet

                JOptionPane.showMessageDialog(null, "Login successful");
                //addLoginAuditLog(userId);
                switch (LOA) {
                    case "0":
                        new Cashier(userId).setVisible(true);
                        setVisible(false);
                        break;
                    case "1":
                        new Vet(userId).setVisible(true);
                        setVisible(false);
                        break;

                    case "2":
                        new Admin(userId).setVisible(true);
                        setVisible(false);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Unknown Role, Contact your Administrator");
                        break;
                }

            } else {
                // If resultSet is empty, username and password do not exist in the database
                errorCount++;
                if (errorCount >= 3) {
                    JOptionPane.showMessageDialog(null, "Too much Attempts, going to Forgot Password");
                    new ForgotPassword().setVisible(true);
                    setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Wrong Username or Password");
                    passTxtField.setText("");
                }
            }

            // Close the database connection
            connection.close();
        } catch (SQLException e) {
            // Handle any SQL exceptions
            System.out.println("Login failed: " + e.getMessage());
        }
    }


    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        String username = userTxtfield.getText();
        String password = new String(passTxtField.getPassword());
        System.out.println(username);
        System.out.println(password);
        performLogin(username, password);
    }//GEN-LAST:event_loginBtnActionPerformed

    private void showBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showBtnMouseClicked
        if (showBtn.isSelected()) {
            passTxtField.setEchoChar((char) 0);
            showBtn.setText("HIDE");

        } else {
            passTxtField.setEchoChar('\u25cf');
            showBtn.setText("Show");
        }
    }//GEN-LAST:event_showBtnMouseClicked

    private void showBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showBtnActionPerformed

private void saveSchema() {
    String dbHost = "127.0.0.1";
    String dbPort = "3306";
    String dbName = "database";
    String dbUsername = "root";
    String dbPassword = "admin";
    String savePath = "schema_dump.sql";
    
    // Use the full path to mysqldump
    String mysqldumpPath = "C:\\Program Files\\MySQL\\MySQL Server 8.0\\bin\\mysqldump.exe"; // Update this to the actual path

    String command = String.format(
        "%s --host=%s --port=%s --user=%s --password=%s --no-data %s -r %s",
        mysqldumpPath, dbHost, dbPort, dbUsername, dbPassword, dbName, savePath
    );

    try {
        // Execute the command
        Process process = Runtime.getRuntime().exec(command);

        // Wait for the command to complete
        int processComplete = process.waitFor();

        // Check if the command was successful
        if (processComplete == 0) {
            JOptionPane.showMessageDialog(null, "Schema saved successfully to " + savePath);
        } else {
            JOptionPane.showMessageDialog(null, "Failed to save schema.");
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "An error occurred while saving the schema.");
    }
}
private void restoreSchema() {
    String dbHost = "127.0.0.1";
    String dbPort = "3306";
    String dbName = "database"; // The database to restore the schema into
    String dbUsername = "root";
    String dbPassword = "admin";
    String dumpFilePath = "C:\\path\\to\\your\\schema_dump.sql"; // Update this to the actual path

    // Print out the path being used
    System.out.println("Using dump file path: " + dumpFilePath);

    // Use the full path to mysql
    String mysqlPath = "C:\\Program Files\\MySQL\\MySQL Server 8.0\\bin\\mysql.exe"; // Update this to the actual path

    String command = String.format("%s --host=%s --port=%s --user=%s --password=%s %s -e source %s", 
                                   mysqlPath, dbHost, dbPort, dbUsername, dbPassword, dbName, dumpFilePath);

    try {
        // Execute the command
        Process process = Runtime.getRuntime().exec(command);

        // Handle the output of the process
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }

        // Wait for the command to complete
        int processComplete = process.waitFor();

        // Check if the command was successful
        if (processComplete == 0) {
            JOptionPane.showMessageDialog(null, "Schema restored successfully from " + dumpFilePath);
        } else {
            JOptionPane.showMessageDialog(null, "Failed to restore schema.");
        }

    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "An error occurred while restoring the schema: " + e.getMessage());
    } catch (InterruptedException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "The restore process was interrupted: " + e.getMessage());
    }
}


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        saveSchema();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void login() {
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPasswordField passTxtField;
    private javax.swing.JToggleButton showBtn;
    private javax.swing.JTextField userTxtfield;
    // End of variables declaration//GEN-END:variables
}
