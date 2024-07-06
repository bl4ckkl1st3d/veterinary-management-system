package contents;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.sql.*;
import javax.swing.JOptionPane;
import com.fazecast.jSerialComm.SerialPort;

//wewewewe
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.InputStream;
import java.io.OutputStream;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import loa.Admin;
import loa.Cashier;
import loa.Vet;
import softeng.ForgotPassword;
import static softeng.login.sha256;

/**
 *
 * @author Richard Reynald
 */
public class SystemLogin extends javax.swing.JFrame {
    
    private boolean passwordVisible = false;
    
    
    public SystemLogin() {
        initComponents();
        passTxtField.setEchoChar('\u25cf');
    }

    private static final String DATABASE_NAME = "database";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "admin";
    private static final String MYSQL_SERVER_HOSTNAME = "DESKTOP-MVBR3DH"; // Replace with your MySQL server's hostname
    private static final int MYSQL_SERVER_PORT = 3306;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        userTxtfield = new swing.TextField();
        adminButton1 = new swing.AdminButton();
        showBtn = new swing.AdminButton();
        passTxtField = new swing.PasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LOGIN ");

        userTxtfield.setLabelText("Username");

        adminButton1.setText("Confirm");
        adminButton1.setRadius(25);
        adminButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButton1ActionPerformed(evt);
            }
        });

        showBtn.setText("Show");
        showBtn.setRadius(25);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(426, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(adminButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(passTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(showBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(userTxtfield, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)))
                .addContainerGap(426, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(55, 55, 55)
                .addComponent(userTxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(showBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(adminButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(372, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void addLoginAuditLog(int userId) {
        String url = "jdbc:mysql://" + MYSQL_SERVER_HOSTNAME + ":" + MYSQL_SERVER_PORT + "/" + DATABASE_NAME;

        try {
            // Establish the database connection
            Connection connection = DriverManager.getConnection(url, DB_USERNAME, DB_PASSWORD);

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
        String url = "jdbc:mysql://" + MYSQL_SERVER_HOSTNAME + ":" + MYSQL_SERVER_PORT + "/" + DATABASE_NAME;
        String hashedPass = sha256(password);
        try {
            // Establish the database connection
            Connection connection = DriverManager.getConnection(url, DB_USERNAME, DB_PASSWORD);

            // Prepare the SQL query to select the user with the provided credentials
            String query = "SELECT * FROM users WHERE BINARY username = ? AND BINARY password = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, hashedPass);

            // Execute the query
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                // If resultSet has at least one row, username and password exist in the database
                String LOA = resultSet.getString("LOA"); // Retrieve LOA from resultSet
                int userId = resultSet.getInt("userid"); // Retrieve userid from resultSet

                JOptionPane.showMessageDialog(null, "Login successful");
                addLoginAuditLog(userId);
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
                    JOptionPane.showMessageDialog(null, "Too many attempts, redirecting to Forgot Password");
                    new SystemForgotPassword().setVisible(true);
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
    private void adminButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButton1ActionPerformed
        String username = userTxtfield.getText();
        String password = new String(passTxtField.getPassword());
        System.out.println(username);
        System.out.println(password);
        performLogin(username, password);
    }//GEN-LAST:event_adminButton1ActionPerformed

    private void showBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showBtnMouseClicked
       passwordVisible = !passwordVisible; // Toggle the state

        if (passwordVisible) {
            passTxtField.setEchoChar((char) 0);
            showBtn.setText("Hide");
            System.out.println("Password visible");
        } else {
            passTxtField.setEchoChar('\u25cf'); // or use '*'
            showBtn.setText("Show");
            System.out.println("Password hidden");
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

    private void saveDatabase() {
    }

    private void backup() {
        // JDBC connection URL, username, and password
        String url = "jdbc:mysql://127.0.0.1:3306/database";
        String user = "root";
        String password = "admin";

        Connection conn = null;
        FileWriter fileWriter = null;

        try {
            // Establish a connection to the database
            conn = DriverManager.getConnection(url, user, password);

            // Get database metadata
            DatabaseMetaData metaData = conn.getMetaData();
            ResultSet tables = metaData.getTables(null, null, "%", new String[]{"TABLE"});

            // Prepare a file writer
            fileWriter = new FileWriter("database_schema_and_data.txt");

            // Iterate through each table
            while (tables.next()) {
                String tableName = tables.getString("TABLE_NAME");
                fileWriter.write("Table: " + tableName + "\n");

                // Get table columns
                ResultSet columns = metaData.getColumns(null, null, tableName, "%");
                fileWriter.write("Columns:\n");
                while (columns.next()) {
                    String columnName = columns.getString("COLUMN_NAME");
                    String columnType = columns.getString("TYPE_NAME");
                    int columnSize = columns.getInt("COLUMN_SIZE");
                    fileWriter.write("\t" + columnName + " " + columnType + "(" + columnSize + ")\n");
                }

                // Get table data
                fileWriter.write("Data:\n");
                Statement stmt = conn.createStatement();
                ResultSet data = stmt.executeQuery("SELECT * FROM " + tableName);
                ResultSetMetaData dataMetaData = data.getMetaData();
                int columnCount = dataMetaData.getColumnCount();

                while (data.next()) {
                    for (int i = 1; i <= columnCount; i++) {
                        fileWriter.write(data.getString(i) + "\t");
                    }
                    fileWriter.write("\n");
                }
                fileWriter.write("\n");
            }

            fileWriter.flush();
            System.out.println("Schema and data saved successfully.");
            //    System.out.println(fileWriter.getAbsolutePath());
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (SQLException | IOException e) {
                e.printStackTrace();
            }
        }

    }

    private static void sendSms() {
        String contactNumber = "639776720544";
        String vaccineName = "ANTI-SELOS VACCINE";     // Replace with actual vaccine name
        String date = "2024-07-02";          // Replace with actual date

        // Adjust the port name based on the available ports list
        SerialPort comPort = SerialPort.getCommPort("COM5"); // Replace with your port name
        comPort.setBaudRate(9600);
        if (comPort.openPort()) {
            System.out.println("Port is open.");

            try {
                OutputStream out = comPort.getOutputStream();
                InputStream in = comPort.getInputStream();

                if (checkArduinoReady(in, out)) {
                    out.write((contactNumber + "\n").getBytes());
                    Thread.sleep(100); // Add delay
                    System.out.println("Sent contact number.");

                    out.write((vaccineName + "\n").getBytes());
                    Thread.sleep(100); // Add delay
                    System.out.println("Sent vaccine name.");

                    out.write((date + "\n").getBytes());
                    Thread.sleep(100); // Add delay
                    System.out.println("Sent date.");

                    String status = readResponse(in);
                    System.out.println("Response from Arduino: " + status);

                    if (status.contains("SMS SENT")) {
                        System.out.println("SMS was sent successfully.");
                    } else {
                        System.out.println("Failed to send SMS.");
                    }
                } else {
                    System.out.println("Arduino is not ready.");
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    comPort.getOutputStream().close();
                    comPort.getInputStream().close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                comPort.closePort();
                System.out.println("Port is closed.");
            }
        } else {
            System.out.println("Failed to open port.");
        }
    }



    private static boolean checkArduinoReady(InputStream in, OutputStream out) throws Exception {
        Thread.sleep(2000); // Wait for Arduino initialization
        String response = readResponse(in);
        System.out.println("Arduino readiness response: " + response);
        if (response.contains("READY")) {
            out.write("CHECK STATUS\n".getBytes()); // Request status from Arduino
            String statusResponse = readResponse(in);
            System.out.println("SIM and Signal Status: " + statusResponse);
            return true;
        }
        return false;
    }

    private static String readResponse(InputStream in) throws Exception {
        StringBuilder response = new StringBuilder();
        long endTime = System.currentTimeMillis() + 5000;
        while (System.currentTimeMillis() < endTime) {
            while (in.available() > 0) {
                char c = (char) in.read();
                response.append(c);
            }
            if (response.toString().contains("\n")) {
                break;
            }
        }
        return response.toString();
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
            java.util.logging.Logger.getLogger(SystemLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SystemLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SystemLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SystemLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SystemLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.AdminButton adminButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private swing.PasswordField passTxtField;
    private swing.AdminButton showBtn;
    private swing.TextField userTxtfield;
    // End of variables declaration//GEN-END:variables
}
