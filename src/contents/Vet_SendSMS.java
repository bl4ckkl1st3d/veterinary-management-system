/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package contents;

import com.fazecast.jSerialComm.SerialPort;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Richard Reynald
 */
public class Vet_SendSMS extends javax.swing.JPanel {

    private int realUserId;
    public Vet_SendSMS(int realUserId) {
        initComponents();
        this.realUserId = realUserId;
        retrievePatients();
    }
    
    private static final String DATABASE_NAME = "database";
    private static final String dbUsername = "root";
    private static final String dbPassword = "admin";
    private static final String MYSQL_SERVER_HOSTNAME = "DESKTOP-MVBR3DH"; // Replace with your MySQL server's hostname
    private static final int MYSQL_SERVER_PORT = 3306;
    private static final String url = "jdbc:mysql://" + MYSQL_SERVER_HOSTNAME + ":" + MYSQL_SERVER_PORT + "/" + DATABASE_NAME;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        vaccineTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        vetButton1 = new swing.VetButton();
        vetButton2 = new swing.VetButton();
        vetButton3 = new swing.VetButton();

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        vaccineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Patient ID", "Name", "Vaccine Name", "Due Date", "Contact"
            }
        ));
        jScrollPane1.setViewportView(vaccineTable);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("PATIENTS WITH UPCOMING VACCINE SCHEDULE");

        vetButton1.setText("Send SMS");
        vetButton1.setRadius(25);
        vetButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vetButton1ActionPerformed(evt);
            }
        });

        vetButton2.setText("Check Arduino Status");
        vetButton2.setRadius(25);
        vetButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vetButton2ActionPerformed(evt);
            }
        });

        vetButton3.setText("Update List");
        vetButton3.setRadius(25);
        vetButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vetButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(98, 98, 98)
                        .addComponent(vetButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(vetButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(vetButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(vetButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(vetButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(vetButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents
    private void retrievePatients() {
        List<String[]> data = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(url, dbUsername, dbPassword)) {
            String query = "SELECT barcode, vaccine_name, next_due_date FROM vaccine_history "
                    + "WHERE next_due_date >= CURDATE() "
                    + "AND DATEDIFF(next_due_date, CURDATE()) <= 7 "
                    + "AND reminded = 'NO' "
                    + "ORDER BY next_due_date ASC";
            try (Statement stmt1 = connection.createStatement(); ResultSet rs1 = stmt1.executeQuery(query)) {
                while (rs1.next()) {
                    String barcode = rs1.getString("barcode");
                    String vaccineName = rs1.getString("vaccine_name");
                    Date nextDueDate = rs1.getDate("next_due_date");

                    String patientName = getPatientName(connection, barcode);
                    String clientName = getClientName(connection, barcode);
                    String contact = getClientContact(connection, clientName);

                    data.add(new String[]{barcode, patientName, vaccineName, nextDueDate.toString(), contact});
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        populateTable(data);
    }

    private String getClientName(Connection connection, String barcode) throws SQLException {
        String query = "SELECT client_name FROM patient_information WHERE barcode = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, barcode);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getString("client_name");
                }
            }
        }
        return null;
    }

    private String getClientContact(Connection connection, String clientName) throws SQLException {
        String query = "SELECT contact FROM client_information WHERE client_name = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, clientName);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getString("contact");
                }
            }
        }
        return null;
    }

    private void populateTable(List<String[]> data) {
        DefaultTableModel model = (DefaultTableModel) vaccineTable.getModel();
        model.setRowCount(0); // Clear existing data

        for (String[] row : data) {
            model.addRow(row);
        }
    }

    private String getPatientName(Connection connection, String barcode) throws SQLException {
        String query = "SELECT patient_name FROM patient_information WHERE barcode = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, barcode);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getString("patient_name");
                }
            }
        }
        return null;
    }

    private void updatedUser() {
// Get the selected row index
        int selectedRow = vaccineTable.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to edit.", "No Row Selected", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Get the barcode from the selected row (assuming it's stored in the first column)
        String barcode = vaccineTable.getValueAt(selectedRow, 0).toString();

        // Perform SQL update query to set 'reminded' to 'YES' for the selected barcode
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = DriverManager.getConnection(url, dbUsername, dbPassword);

            String updateQuery = "UPDATE vaccine_history SET reminded = 'YES' WHERE barcode = ?";
            pstmt = conn.prepareStatement(updateQuery);
            pstmt.setString(1, barcode);

            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "SMS Sent Succesfully", "Update Successful", JOptionPane.INFORMATION_MESSAGE);

                // Optionally, you can refresh or update the table after successful update
                // Example: refreshTable();
                retrievePatients();
            } else {
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error updating patient reminder status: " + e.getMessage(), "Update Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            // Close resources
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    private boolean checkArduinoReady() {
        try (OutputStream out = comPort.getOutputStream(); InputStream in = comPort.getInputStream()) {
            Thread.sleep(5000); // Wait for Arduino initialization
            String response = readResponse(in);
            System.out.println("Arduino readiness response: " + response);
            if (response.contains("READY")) {
                out.write("CHECK STATUS\n".getBytes()); // Request status from Arduino
                String statusResponse = readResponse(in);
                System.out.println("SIM and Signal Status: " + statusResponse);
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    private void sendSms(String patientName, String contactNumber, String vaccineName, String date) {
        initializePort();
        try (OutputStream out = comPort.getOutputStream(); InputStream in = comPort.getInputStream()) {
            if (checkArduinoReady()) {
                out.write((patientName + "\n").getBytes());
                Thread.sleep(100); // Add delay
                System.out.println(patientName);

                out.write((contactNumber + "\n").getBytes());
                Thread.sleep(100); // Add delay
                System.out.println("Sent contact number.");
                System.out.println(contactNumber);

                out.write((vaccineName + "\n").getBytes());
                Thread.sleep(100); // Add delay
                System.out.println("Sent vaccine name.");
                System.out.println(vaccineName);
                out.write((date + "\n").getBytes());
                Thread.sleep(100); // Add delay
                System.out.println("Sent date.");
                System.out.println(date);
                String status = readResponse(in);

                System.out.println("Response from Arduino: " + status);
                if (status.contains("SMS SENT")) {
                    updatedUser();
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to send SMS.");
                }

            } else {
                JOptionPane.showMessageDialog(this, "Arduino is not ready.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closePort();
        }
    }

    private String readResponse(InputStream in) throws Exception {
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
        System.out.println("Response: " + response.toString());
        return response.toString();
    }

    private void closePort() {
        if (comPort != null && comPort.isOpen()) {
            try {
                comPort.getOutputStream().close();
                comPort.getInputStream().close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            comPort.closePort();
            System.out.println("Port is closed.");
        }
    }
    SerialPort comPort = SerialPort.getCommPort("COM5");

    private void initializePort() {

        comPort.setBaudRate(9600);
        if (comPort.openPort()) {
            System.out.println("Port is open.");
            // sendInitializationCommands();
        } else {
            System.out.println("Failed to open port.");
        }
    }

    private void sendInitializationCommands() {
        try (OutputStream out = comPort.getOutputStream(); InputStream in = comPort.getInputStream()) {
            String[] commands = {
                "AT+CFUN?",
                "AT+CPIN?",
                "AT+CIMI",
                "AT+CREG?",
                "AT+CGREG?",
                "AT+CSQ",
                "AT+COPS?"
            };
            for (String command : commands) {
                out.write((command + "\r").getBytes());
                out.flush();
                System.out.println("Sent: " + command);
                readResponse(in);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void vetButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vetButton1ActionPerformed
        int selectedRow = vaccineTable.getSelectedRow();
        if (selectedRow != -1) {
            String contactNumber = vaccineTable.getValueAt(selectedRow, 4).toString();
            String vaccineName = vaccineTable.getValueAt(selectedRow, 2).toString();
            String date = vaccineTable.getValueAt(selectedRow, 3).toString();
            String patientName = vaccineTable.getValueAt(selectedRow, 1).toString();
            sendSms(patientName, contactNumber, vaccineName, date);

        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to send SMS.");
        }
    }//GEN-LAST:event_vetButton1ActionPerformed

    private void vetButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vetButton2ActionPerformed
        initializePort();

        if (checkArduinoReady()) {
            JOptionPane.showMessageDialog(this, "Arduino is ready for SMS sending.");
        } else {
            JOptionPane.showMessageDialog(this, "Arduino is not ready.");
        }
        closePort();
    }//GEN-LAST:event_vetButton2ActionPerformed

    private void vetButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vetButton3ActionPerformed
        updatedUser();
    }//GEN-LAST:event_vetButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable vaccineTable;
    private swing.VetButton vetButton1;
    private swing.VetButton vetButton2;
    private swing.VetButton vetButton3;
    // End of variables declaration//GEN-END:variables
}
